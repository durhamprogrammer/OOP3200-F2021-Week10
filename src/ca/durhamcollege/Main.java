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

    public static void printLog(String[] log)
    {
        for (var line:log)
        {
            System.out.println(line);
        }
    }

    public static void printLog(int[] log)
    {
        for (var line:log)
        {
            System.out.println(line);
        }
    }

    public static void printLog(float[] log)
    {
        for (var line:log)
        {
            System.out.println(line);
        }
    }

    public static void buildLog(String[] log)
    {
        for (int i = 0; i < Config.NUM_OF_STRINGS; i++)
        {
            String prompt = "Enter your String: ";
            log[i] = "";
            log[i] = (String) getConsoleInput(prompt, log[i]);
        }
    }

    public static void buildLog(int[] log)
    {
        for (int i = 0; i < Config.NUM_OF_INTEGERS; i++)
        {
            String prompt = "Enter your Integer: ";
            log[i] = (int) getConsoleInput(prompt, log[i]);
        }
    }

    public static void buildLog(float[] log)
    {
        for (int i = 0; i < Config.NUM_OF_FLOATS; i++)
        {
            String prompt = "Enter your Float: ";
            log[i] = (float) getConsoleInput(prompt, log[i]);
        }
    }



    /**
     * Entry point for our application
     * @param args
     */
    public static void main(String[] args)
    {
        String[] Log = new String[Config.NUM_OF_STRINGS];
       int[] intLog = new int[Config.NUM_OF_INTEGERS];
       float[] floatLog = new float[Config.NUM_OF_FLOATS];


        buildLog(Log);
        printLog(Log);
        System.out.println(); // empty space


        buildLog(intLog);
        printLog(intLog);
        System.out.println(); // empty space

        buildLog(floatLog);
        printLog(floatLog);
        System.out.println(); // empty space



    }
}
