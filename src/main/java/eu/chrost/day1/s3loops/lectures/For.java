package eu.chrost.day1.s3loops.lectures;

public class For {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        for (int j = 0; j < 5;) {
            System.out.println(j);
            j++;
        }

        for (int k = 0; ;) {
            if (k >= 5) {
                break;
            }
            System.out.println(k);
            k++;
        }

        int m = 0;
        for (; ;) {
            if (m >= 5) {
                break;
            }
            System.out.println(m);
            m++;
        }
    }
}
