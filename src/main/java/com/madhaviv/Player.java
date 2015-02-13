package main.java.com.madhaviv;

import java.util.Arrays;
import java.util.List;

/**
 * Created by madhavi.venu on 2/12/15.
 */
public class Player
{
    public static final List<String> ScoreDescriptions = Arrays.asList("love","fifteen","thirty","forty");

    private int score;
    String name ;


    public Player(String name)
    {
        this.name = name;
    }
    public String getPlayerName()
    {
        return this.name;
    }

    public int getScore()
    {
        return score;
    }

    public void winBall()
    {
        this.score+= 1;
    }

    public String getScoreDescription()
    {
        return ScoreDescriptions.get(score);
    }
}