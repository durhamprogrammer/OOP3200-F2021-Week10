/**
 * @author Tom Tsiliopoulos
 * @studentID 100100100
 * @date November 8, 2021
 */

package ca.durhamcollege;

import java.util.Scanner;

public class Main
{
    /**
     * This method gets a string from the console
     * @param prompt a friendly message to show the user
     * @param object the object type to store the console input
     * @return the value from the console
     */
    public static Object getConsoleInput(String prompt, Object object)
    {
        Scanner console = new Scanner(System.in);
        System.out.print(prompt);

        switch (object.getClass().getSimpleName())
        {
            case "String":
                return console.nextLine();
            case "Integer":
                return console.nextInt();
            case "Float":
                return console.nextFloat();
            default:
                return console.nextLine();
        }
    }

    /**
     * This method prints the log to the console
     * @param log string array of input lines
     */
    public static void printLog(String[] log)
    {
        for (var line:log)
        {
            System.out.println(line);
        }
    }

    /**
     * Entry point for our application
     * @param args
     */
    public static void main(String[] args)
    {
       int intNumber = 0;
       float floatNumber = 0.0f;
       String stringInput = "";

       stringInput = (String) getConsoleInput("Enter a String: ", stringInput);

       System.out.println("Our String is: " + stringInput);

        stringInput = (String) getConsoleInput("Enter a second String: ", stringInput);

        System.out.println("Our second String is: " + stringInput);


       intNumber = (int) getConsoleInput("Enter an Integer: ", intNumber);

       System.out.println("Our Integer is: " + intNumber);



        floatNumber = (float) getConsoleInput("Enter an Float: ", floatNumber);

        System.out.println("Our Float is: " + floatNumber);




    }
}
