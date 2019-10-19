package edu.cscc;

import org.junit.Assert;
import org.junit.Test;

public class RPSLSpockTest {

    @Test
    public void isValidPick() {
        Assert.assertTrue(RPSLSpock.isValidPick("rock"));
        Assert.assertTrue(RPSLSpock.isValidPick("paper"));
        Assert.assertTrue(RPSLSpock.isValidPick("scissors"));
        Assert.assertTrue(RPSLSpock.isValidPick("lizard"));
        Assert.assertTrue(RPSLSpock.isValidPick("spock"));
        Assert.assertFalse(RPSLSpock.isValidPick("Salah"));
    }
    @Test
    public void generatePick() {
        for (int i=0; i < 1000000; i++){
            String pick = RPSLSpock.generatePick();
            Assert.assertTrue(RPSLSpock.isValidPick(pick));
            Assert.assertTrue(pick != null);
        }
    }
    @Test
    public void isComputerWin() {
        Assert.assertTrue(RPSLSpock.isComputerWin("rock","Scissors"));
        Assert.assertTrue(RPSLSpock.isComputerWin("rock","Lizard"));
        Assert.assertTrue(RPSLSpock.isComputerWin("paper","Spock"));
        Assert.assertTrue(RPSLSpock.isComputerWin("paper","Spock"));
        Assert.assertTrue(RPSLSpock.isComputerWin("scissors","Paper"));
        Assert.assertTrue(RPSLSpock.isComputerWin("scissors","Lizard"));
        Assert.assertTrue(RPSLSpock.isComputerWin("lizard","Paper"));
        Assert.assertTrue(RPSLSpock.isComputerWin("lizard","Spock"));
        Assert.assertTrue(RPSLSpock.isComputerWin("spock","Rock"));
        Assert.assertTrue(RPSLSpock.isComputerWin("spock","Scissors"));
        Assert.assertFalse(RPSLSpock.isComputerWin("scissors","Rock"));
    }
}