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
     * @param <T> the generic type
     * @return
     */
    public static <T> T getConsoleInput(String prompt, T object)
    {
        Scanner console = new Scanner(System.in);
        System.out.print(prompt);

        switch (object.getClass().getSimpleName())
        {
            case "String":
                return (T) console.nextLine();
            case "Integer":
                return (T) ((Integer) console.nextInt());
            case "Float":
                return (T) ((Float)console.nextFloat());
            default:
                return (T) console.nextLine();
        }
    }

    /**
     * This function prints a generic array
     * @param log the array to print
     * @param <T> the generic type
     */
    public static <T> void printLog(T[] log)
    {
        for (var line:log)
        {
            System.out.println(line);
        }
    }

    /**
     * This function adds elements to a generic array
     * @param log the array to add elments to
     * @param <T> the generic type
     * @throws Exception
     */
    public static <T> void buildLog(T[] log) throws Exception
    {
        int capacity = 0;
        String prompt = "";

        if(log instanceof  String[])
        {
            capacity = Config.NUM_OF_STRINGS;
            prompt = "Enter your String: ";
        }
        else if (log instanceof Integer[])
        {
            capacity = Config.NUM_OF_INTEGERS;
            prompt = "Enter your Integer: ";
        }
        else if (log instanceof Float[])
        {
            capacity = Config.NUM_OF_FLOATS;
            prompt = "Enter your Float: ";
        }
        else
        {
            throw new Exception("Exception message");
        }

        for (int i = 0; i < capacity; i++)
        {
            if(log instanceof  String[])
            {
                log[i] = (T)"";
            }
            else if (log instanceof Integer[])
            {
                log[i] = (T) new Integer(0);
            }
            else if (log instanceof Float[])
            {
                log[i] = (T) new Float(0.0f);
            }

            log[i] = (T) getConsoleInput(prompt, log[i]);
        }
    }


    /**
     * Entry point for our application
     * @param args
     */
    public static void main(String[] args)
    {
       String[] Log = new String[Config.NUM_OF_STRINGS];
       Integer[] intLog = new Integer[Config.NUM_OF_INTEGERS];
       Float[] floatLog = new Float[Config.NUM_OF_FLOATS];

        try
        {
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
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }


    }
}
