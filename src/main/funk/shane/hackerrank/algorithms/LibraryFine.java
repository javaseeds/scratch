package funk.shane.hackerrank.algorithms;

import java.util.Scanner;

/**
 * Created by Shane on 8/29/2015.
 */
public class LibraryFine {
    private static final int PER_DAY_FINE = 15;
    private static final int PER_MONTH_FINE = 500;
    private static final int PER_YEAR_FINE = 10000;
    private static final int YEAR = 2;
    private static final int MONTH = 1;
    private static final int DAY = 0;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fine = 0;
        int[] returnDate = new int[]{sc.nextInt(), sc.nextInt(), sc.nextInt()};
        int[] dueDate = new int[]{sc.nextInt(), sc.nextInt(), sc.nextInt()};

        if(returnDate[YEAR] < dueDate[YEAR]) {
            fine = 0;
        }
        else if(returnDate[YEAR] > dueDate[YEAR]) {
            fine = (returnDate[YEAR] - dueDate[YEAR]) * PER_YEAR_FINE;
        }
        else if(returnDate[MONTH] < dueDate[MONTH]) {
            fine = 0;
        }
        else if(returnDate[MONTH] > dueDate[MONTH]) {
            fine = (returnDate[MONTH] - dueDate[MONTH]) * PER_MONTH_FINE;
        }
        else if(returnDate[DAY] > dueDate[DAY]) {
            fine = (returnDate[DAY] - dueDate[DAY]) * PER_DAY_FINE;
        }

        System.out.println(fine);
    }
}
