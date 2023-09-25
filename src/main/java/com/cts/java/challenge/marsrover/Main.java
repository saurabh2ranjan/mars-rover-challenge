package com.cts.java.challenge.marsrover;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Plateau plateau = null;
        List<MarsRover> marsRovers = new ArrayList<>();

        if (scanner.hasNextLine()) {
            String[] lineArray = scanner.nextLine().split(" ");
            plateau = new Plateau(new Integer(lineArray[0]), new Integer(lineArray[1]));
        }

        boolean isFinished = false;
        MarsRover marsRover = null;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.isEmpty())
                break;
            if (!isFinished) {
                String[] lineArray = line.split(" ");
                marsRover = new MarsRover(plateau, new Integer(lineArray[0]), new Integer(lineArray[1]), lineArray[2]);
                isFinished = true;
            } else {
                marsRover.runCommands(line);
                marsRovers.add(marsRover);
                isFinished = false;
            }
        }

        scanner.close();
        for (MarsRover marsRoverResult : marsRovers) {
            System.out.println(marsRoverResult.getCurrentX() + " " + marsRoverResult.getCurrentY() + " "
                    + marsRoverResult.getCurrentOrientation());
        }
    }


}
