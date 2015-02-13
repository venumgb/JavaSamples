package main.java.com.madhaviv;

import org.junit.Test;

/**
 * Created by madhavi.venu on 2/11/15.
 */
public class TennisGame {

    private Player player1;
    private Player player2;

    public TennisGame(Player player1, Player player2)
    {
        this.player1 = player1;
        this.player2 = player2;
    }

    public String getScore()
    {
        if(player1.getScore()>=3 && player2.getScore()>=3)
        {
            if(Math.abs(player1.getScore()-player2.getScore())>= 2)
            {
                return getLeadPlayer().getPlayerName()+ "Won";

            }
            else if(player1.getScore() ==  player2.getScore())
            {
                return "Duece";

            }
            else
            {
                return "Advantage " + getLeadPlayer().getPlayerName();

            }
        }
        else
        {
            return player1.getScoreDescription()+ "," + player2.getScoreDescription();
        }
    }

    public Player getLeadPlayer()
    {
        return player1.getScore()> player2.getScore()?player1:player2;
    }



}

