package com.cts.java.challenge.marsrover;

import java.util.Arrays;

public class MarsRover {
    private final String[] ORIENTATIONS = new String[] { "N", "E", "S", "W" };

    private Plateau plateau;
    private int currentX = 0;
    private int currentY = 0;
    private int currentOrientation = 0;

    public MarsRover(Plateau plateau) {
        this.plateau = plateau;
    }

    public MarsRover(Plateau plateau, int currentX, int currentY) {
        this(plateau);
        this.currentX = currentX;
        this.currentY = currentY;
    }

    public MarsRover(Plateau plateau, String currentOrientation) {
        this(plateau);
        this.currentOrientation = Arrays.binarySearch(ORIENTATIONS, currentOrientation);
    }

    public MarsRover(Plateau plateau, int currentX, int currentY, String currentOrientation) {
        this(plateau, currentX, currentY);
        this.currentOrientation = Arrays.binarySearch(ORIENTATIONS, currentOrientation);
    }

    public Plateau getPlateu() {
        return plateau;
    }

    public int getCurrentX() {
        return currentX;
    }

    public int getCurrentY() {
        return currentY;
    }

    public String getCurrentOrientation() {
        return ORIENTATIONS[currentOrientation];
    }

    public void runCommands(String commands) {
        for (String command : commands.split("")) {
            if (command.equalsIgnoreCase("R")) {
                turnRight();
            } else if (command.equalsIgnoreCase("L")) {
                turnLeft();
            } else if (command.equalsIgnoreCase("M")) {
                moveForward();
            }
        }
    }

    public void turnRight() {
        currentOrientation = currentOrientation + 1 > 3 ? 0 : currentOrientation + 1;
    }

    public void turnLeft() {
        currentOrientation = currentOrientation - 1 < 0 ? 3 : currentOrientation - 1;
    }

    public void moveForward() {
        if (currentOrientation == 0) {
            currentY = currentY + 1 > plateau.getMaximumY() ? plateau.getMaximumY() : currentY + 1;
        } else if (currentOrientation == 1) {
            currentX = currentX + 1 > plateau.getMaximumX() ? plateau.getMaximumX() : currentX + 1;
        } else if (currentOrientation == 2) {
            currentY = currentY - 1 < 0 ? 0 : currentY - 1;
        } else if (currentOrientation == 3) {
            currentX = currentX - 1 < 0 ? 0 : currentX - 1;
        }
    }

}
