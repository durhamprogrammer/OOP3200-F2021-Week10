/**
 * @author Tom Tsiliopoulos
 * @studentID 100100100
 * @date November 15, 2021
 */

package ca.durhamcollege;

public class Main
{
    /**
     * Entry point for our application
     * @param args
     */
    public static void main(String[] args)
    {
       Console console = new Console();


        for (int i = 0; i < Config.NUM_OF_STRINGS; i++)
        {
         console.input("Enter your String: ");
        }

        console.printLog();
        System.out.println(); // empty space


        for (int i = 0; i < Config.NUM_OF_INTEGERS; i++)
        {
            console.input("Enter your Integer: ", InputTypes.INTEGER);
        }

        console.printLog(InputTypes.INTEGER);
        System.out.println(); // empty space


        /*for (int i = 0; i < Config.NUM_OF_FLOATS; i++)
        {
            console.input("Enter your Float: ", InputTypes.FLOAT);
        }

        console.printLog(InputTypes.FLOAT);
        System.out.println(); // empty space*/

        console.clearAll();
        console.printLog(InputTypes.INTEGER);
        System.out.println(); // empty space


    }
}
