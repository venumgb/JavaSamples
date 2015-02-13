package test.java.com.madhaviv;

import main.java.com.madhaviv.Player;
import main.java.com.madhaviv.TennisGame;
import org.junit.*;
import sun.jvm.hotspot.utilities.Assert;

import static org.junit.Assert.assertThat;

/**
 * Created by madhavi.venu on 2/11/15.
 */
public class TennisGameTest {

    Player ankit;
    Player archit;
    TennisGame game ;

    @Before
    public void beforeGameTest()
    {
        ankit = new Player("Ankit");
        archit = new Player("Archit");
        game = new TennisGame(ankit,archit);
    }

    @Test
    public void checkLoveScoreForPlayer()
    {
        TennisGame game = new TennisGame(ankit,archit);
        org.junit.Assert.assertEquals("love,love",game.getScore());
    }

    @Test
    public void checkFifteenScoreForPlayer()
    {
        archit.winBall();
        org.junit.Assert.assertEquals("love,fifteen", game.getScore());
    }
    @Test
    public void checkThirtyScoreForPlayer()
    {
        archit.winBall();
        archit.winBall();
        ankit.winBall();
        org.junit.Assert.assertEquals("fifteen,thirty", game.getScore());
    }
    @Test
    public void checkFortyScoreForPlayer()
    {
        archit.winBall();
        archit.winBall();
        archit.winBall();
        ankit.winBall();
        ankit.winBall();
        ankit.winBall();
        org.junit.Assert.assertEquals("Duece", game.getScore());
    }
}
