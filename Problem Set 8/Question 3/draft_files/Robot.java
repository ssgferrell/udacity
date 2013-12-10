/**
 * Simulates a robot wandering randomly on an infinite plane
 *
 */
import java.awt.Point;
import java.util.Random;

public class Robot {
    // TODO: define other instance variables

    private Random generator;
    private Point startingPoint;
    private int currentX;
    private int currentY;

    /**
     * Constructor for objects of class Robot
     * @param theX the x coordinate
     * @param theY the y coordinate
     */
    public Robot(int theX, int theY) {
        // TODO: Complete the constructor
        startingPoint = new Point(theX, theY);
        currentX = theX;
        currentY = theY;
        generator = new Random();
        generator.setSeed(12345);  //do not change this statement
    }
    
    /**
     * Generates a random number between 0 and 3 (inclusive) and moves the robot in the corresponding direction.
     */
    public void makeRandomMove() {
        int whichDirection = generator.nextInt(4);
        if (whichDirection == 0) {
            currentY--;
        }
        if (whichDirection == 1) {
            currentY++;
        }
        if (whichDirection == 2) {
            currentX++;
        }
        if (whichDirection == 3) {
            currentX--;
        }
        
    }
    
    /**
     * Gets the current location of the robot
     * @returns Returns the x & y coordinates of the robot.
     */
    public Point getLocation() {
        return new Point(currentX, currentY);
    }
    
    /**
     * Calculates the distance from the origin
     * @return 
     */
    public double getDistanceFromStart() {
        double xChange = Math.abs(startingPoint.x - currentX);
        double yChange = Math.abs(startingPoint.y - currentY);
        
        return Math.hypot(xChange, yChange);
    }

}
