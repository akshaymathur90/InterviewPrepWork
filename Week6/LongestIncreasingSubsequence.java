package InterviewPrepWork.Week6;

import java.util.List;

/**
 * Created by akshaymathur on 1/28/18.
 */
public class LongestIncreasingSubsequence {

    public int lis(final List<Integer> A){
        // Base case
        if(A.size() <= 1)
            return A.size();

        // This will be our array to track longest sequence length
        int T[] = new int[A.size()];

        // Fill each position with value 1 in the array
        for(int i=0; i < A.size(); i++)
            T[i] = 1;


        // Mark one pointer at i. For each i, start from j=0.
        for(int i=1; i < A.size(); i++)
        {
            for(int j=0; j < i; j++)
            {
                // It means next number contributes to increasing sequence.
                if(A.get(j) < A.get(i))
                {
                    // But increase the value only if it results in a larger value of the sequence than T[i]
                    // It is possible that T[i] already has larger value from some previous j'th iteration
                    if(T[j] + 1 > T[i])
                    {
                        T[i] = T[j] + 1;
                    }
                }
            }
        }

        // Find the maximum length from the array that we just generated
        int longest = 0;
        for(int i=0; i < T.length; i++)
            longest = Math.max(longest, T[i]);

        return longest;
    }
}
