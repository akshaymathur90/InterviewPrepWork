package InterviewPrepWork.Week5;

import java.util.ArrayList;

/**
 * Created by akshaymathur on 1/22/18.
 */
public class SumOfFibNumbers {

    public int fibsum(int a) {
        if (a == 0)
            return 0;
        if (a < 3)
            return 1;

        ArrayList<Integer> fibs = new ArrayList<Integer>();
        fibs.add(1);
        fibs.add(1);
        while ((int)fibs.get(fibs.size()-1) < a)
            fibs.add(fibs.get(fibs.size()-1) + fibs.get(fibs.size()-2));

        int count = 0;
        while (a != 0) {
            while ((int)fibs.get(fibs.size()-1) > a)
                fibs.remove(fibs.size()-1);
            a -= fibs.get(fibs.size()-1);
            count++;
        }

        return count;
    }
}
