/* *****************************************************************************
 *  Name:              Joanna Xu
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        int i = 1;
        String champion = "";
        // loop with StdIn.isEmpty may happen no termination
        // so try ctr+d at the end if run with command line
        while (!StdIn.isEmpty()) {
            String value = StdIn.readString();
            boolean flag = StdRandom.bernoulli(1.0 / i);
            if (flag) {
                champion = value;
            }
            i++;
        }
        StdOut.println(champion);

    }
}
