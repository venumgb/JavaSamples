package test.java.com.madhaviv;

import main.java.com.madhaviv.Player;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by madhavi.venu on 2/12/15.
 */
public class PlayerTest {

    @Test
    public void createPlayer1Test(String player1)
    {
        Assert.assertEquals("player1", new Player("player1").getPlayerName());
    }

    @Test
    public void testPlayerScore()
    {
        Assert.assertEquals("love",new Player("player2").getScore());
    }



}

