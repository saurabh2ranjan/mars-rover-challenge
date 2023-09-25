package com.cts.java.challenge.marsrover;

import org.junit.Assert;
import org.junit.Test;

public class PlateauTest {

    @Test
    public void constructor_givenMaximumXY_shouldSetMaximumXY() {
        int maximumX = 3;
        int maximumY = 3;
        Plateau plateau = new Plateau(maximumX, maximumY);
        Assert.assertEquals(maximumX, plateau.getMaximumX());
        Assert.assertEquals(maximumY, plateau.getMaximumY());
    }
    
}
