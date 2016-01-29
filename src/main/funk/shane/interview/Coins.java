package funk.shane.interview;

/**
 * Created by Shane on 1/26/2016.
 */
public class Coins {
    private static final int[] coinFaces = new int[] {100, 50, 25, 10, 5, 1};
    private static final String[] coinNames = new String[] {"dollar", "half dollar", "quarter", "dime", "nickel", "penny"};

    public Coins() {    }

    public int findFewestCoins(final int intValue) {
        int num_of_coins = 0;
        int value = intValue;
        for(int i = 0; i < coinFaces.length; i++) {
            while(value >= coinFaces[i]) {
                num_of_coins++;
                value = value - coinFaces[i];
                System.out.printf("adding a %s, ", coinNames[i]);

                if(value < 1) {
                    break;
                }
            }
        }

        System.out.printf("%nThe minimum coins for %.2f is %d%n%n", (intValue / 100.0), num_of_coins);
        return num_of_coins;
    }

    public static void main(String[] args) {
        Coins c = new Coins();
        c.findFewestCoins(9);
        c.findFewestCoins(10);
        c.findFewestCoins(41);
        c.findFewestCoins(191);
    }
}
