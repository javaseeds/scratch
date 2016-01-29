package funk.shane.interview;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

/**
 * Created by Shane on 1/28/2016.
 */
public class CoinsTest {
    private Coins coins;

    @Before
    public void setup() {
        coins = new Coins();
    }

    @Test
    public void testGetCoins_9cents() {
        assertThat(coins.findFewestCoins(9)).isEqualTo(5);
    }

    @Test
    public void testGetCoins_10cents() {
        assertThat(coins.findFewestCoins(10)).isEqualTo(1);
    }

    @Test
    public void testGetCoins_41cents() {
        assertThat(coins.findFewestCoins(41)).isEqualTo(4);
    }

    @Test
    public void testGetCoins_191cents() {
        assertThat(coins.findFewestCoins(191)).isEqualTo(6);
    }
}