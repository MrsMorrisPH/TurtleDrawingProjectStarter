
/**
 * Filename: Tester.java
 * 
 * Replace this comment with your own description of what this program does.
 *
 * @author (fill in your name here)
 * @version (a version number or a date)
 */
public class Tester
{
    // The line below is magic, you don't have to understand it (yet)
    public static void main(String[] args)
    {
        World turtleWorld = new World();
        Turtle turtle = new Turtle(turtleWorld);
        
        turtle.forward(100);
        turtle.turnLeft();
        
    }
}
