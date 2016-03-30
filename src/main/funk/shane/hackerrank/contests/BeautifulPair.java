package funk.shane.hackerrank.contests;

import java.util.Scanner;

public class BeautifulPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        char[] A = sc.nextLine().toCharArray();
        char[] B = sc.nextLine().toCharArray();

        int numBP = 0;
        int numDisjoint = 0;

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if(A[i] == B[j]) {
                    numBP++;
                    break;
                }
                else {
                    numDisjoint++;
                }
            }
        }
    }
}
