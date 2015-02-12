package test.java.com.madhaviv;

import org.junit.*;
import sun.jvm.hotspot.utilities.Assert;

/**
 * Created by madhavi.venu on 2/11/15.
 */
public class TennisGameTest {
    TennisGame game = new TennisGame();

    @Test
    public void checkLoveScoreForPlayer()
    {
        Assert.assertEquals("love", game.score(0));
    }

    public void checkFifteenScoreForPlayer()
    {
        Assert.assertEquals("Fifteen",game.score(1));
    }
}
