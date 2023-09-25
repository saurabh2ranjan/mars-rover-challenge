# mars-rover-challenge

**Mars Rover**

Google Code Technical Challenge about creating Mars Rover basic function. You can see the challenge in here. This project is buid using Java 11 and maven 3.6.

**Build**

mvn clean install

**Usage**

After you build this project, you can run it by executing a generated JAR file.

**java -jar libs/mars-rover-challenge-1.0-SNAPSHOT.jar**

Based on the challenge, The first line of input is the upper-right coordinates of the plateau, the lower-left coordinates are assumed to be 0,0.

The rest of the input is information pertaining to the rovers that have been deployed. Each rover has two lines of input. The first line gives the rover's position, and the second line is a series of instructions telling the rover how to explore the plateau.

The position is made up of two integers and a letter separated by spaces, corresponding to the x and y co-ordinates and the rover's orientation.

Below is the example of input that you can use:

**5 5**

**1 2 N**

**LMLMLMLMM**

**3 3 E**

**MMRMMRMRRM**

And you will get the output like this:

**1 3 N**

**5 1 E**
