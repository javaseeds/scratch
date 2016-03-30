package funk.shane.hackerrank.udt;

import java.util.Scanner;

public class ArrayDS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer n = Integer.parseInt(in.nextLine());
        String[] str = in.nextLine().split(" ");
        for(int i = str.length - 1; i >= 0; i--) {
            System.out.printf("%s ", str[i]);
        }
    }
}

