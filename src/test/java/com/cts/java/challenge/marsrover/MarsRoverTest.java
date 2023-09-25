package com.cts.java.challenge.marsrover;

import org.junit.Assert;
import org.junit.Test;

public class MarsRoverTest {

    @Test
    public void constructor_givenPlateauAndRoverCurrentXY_shouldSetCurrentXY() {
        int maximumX = 3;
        int maximumY = 3;
        int currentX = 2;
        int currentY = 2;
        Plateau plateau = new Plateau(maximumX, maximumY);
        MarsRover marsRover = new MarsRover(plateau, currentX, currentY);
        Assert.assertEquals(currentX, marsRover.getCurrentX());
        Assert.assertEquals(currentY, marsRover.getCurrentY());
    }

    @Test
    public void runCommands_givenRCommand_shouldSetCurrentOrientationToE() {
        int maximumX = 3;
        int maximumY = 3;
        Plateau plateau = new Plateau(maximumX, maximumY);
        MarsRover marsRover = new MarsRover(plateau);
        marsRover.runCommands("R");
        Assert.assertEquals("E", marsRover.getCurrentOrientation());
    }

    @Test
    public void runCommands_givenLCommand_shouldSetCurrentOrientationToW() {
        int maximumX = 3;
        int maximumY = 3;
        Plateau plateau = new Plateau(maximumX, maximumY);
        MarsRover marsRover = new MarsRover(plateau);
        marsRover.runCommands("L");
        Assert.assertEquals("W", marsRover.getCurrentOrientation());
    }

    @Test
    public void runCommands_givenMCommandAndCurrentOrientationN_shouldAddOneToCurrentY() {
        int maximumX = 3;
        int maximumY = 3;
        int currentX = 2;
        int currentY = 2;
        Plateau plateau = new Plateau(maximumX, maximumY);
        MarsRover marsRover = new MarsRover(plateau, currentX, currentY);
        marsRover.runCommands("M");
        Assert.assertEquals(currentY + 1, marsRover.getCurrentY());
    }

    @Test
    public void runCommands_givenMCommandAndCurrentOrientationE_shouldAddOneToCurrentX() {
        int maximumX = 3;
        int maximumY = 3;
        int currentX = 2;
        int currentY = 2;
        Plateau plateau = new Plateau(maximumX, maximumY);
        MarsRover marsRover = new MarsRover(plateau, currentX, currentY, "E");
        marsRover.runCommands("M");
        Assert.assertEquals(currentX + 1, marsRover.getCurrentX());
    }

    @Test
    public void runCommands_givenLMLMLMLMMCommands_shouldSetCurrentXCurrentYCurrentOrientationTo13N() {
        int maximumX = 5;
        int maximumY = 5;
        int currentX = 1;
        int currentY = 2;
        Plateau plateau = new Plateau(maximumX, maximumY);
        MarsRover marsRover = new MarsRover(plateau, currentX, currentY, "N");
        marsRover.runCommands("LMLMLMLMM");
        Assert.assertEquals(1, marsRover.getCurrentX());
        Assert.assertEquals(3, marsRover.getCurrentY());
        Assert.assertEquals("N", marsRover.getCurrentOrientation());
    }

    @Test
    public void runCommands_givenMMRMMRMRRMCommands_shouldSetCurrentXCurrentYCurrentOrientationTo51E() {
        int maximumX = 5;
        int maximumY = 5;
        int currentX = 3;
        int currentY = 3;
        Plateau plateau = new Plateau(maximumX, maximumY);
        MarsRover marsRover = new MarsRover(plateau, currentX, currentY, "E");
        marsRover.runCommands("MMRMMRMRRM");
        Assert.assertEquals(5, marsRover.getCurrentX());
        Assert.assertEquals(1, marsRover.getCurrentY());
        Assert.assertEquals("E", marsRover.getCurrentOrientation());
    }

}
