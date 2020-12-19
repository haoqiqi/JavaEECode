import java.util.Arrays;

public class CompoundInterest {
    public static void main(String[] args) {
        final double STARTRATE = 10;
        final int NRATE = 6;
        final int NYEARS = 20;

        double[] interestRate = new double[NRATE];
        for (int j = 0; j < interestRate.length; j++) {
            interestRate[j] = (STARTRATE + j)/100.0;
        }
        System.out.println(Arrays.toString(interestRate));

        double[][] banlaces = new double[NYEARS][NRATE];

        for (int j = 0; j < banlaces[0].length; j++) {
            banlaces[0][j] = 10000;
        }
        System.out.println(Arrays.toString(banlaces[0]));

        for (int i = 1; i < banlaces.length; i++) {
            for (int j = 0; j < banlaces[i].length; j++) {
                double oldBanlances = banlaces[i-1][j];
                double interest = oldBanlances * interestRate[j];
                banlaces[i][j] = oldBanlances + interest;
            }
        }
        for (int i = 0; i < interestRate.length; i++) {
            System.out.printf("%7.0f%%" , 100 * interestRate[i]);
//            System.out.printf("\t");
        }
        System.out.println("");
//        System.out.println(Arrays.deepToString(banlaces));
        for (double[] row:banlaces
             ) {
            for (double b:row
                 ) {
                System.out.printf("%8.0f", b);
            }
            System.out.println("");
        }
    }
}
