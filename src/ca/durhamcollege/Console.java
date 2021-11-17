package ca.durhamcollege;

import java.util.ArrayList;
import java.util.Scanner;

public class Console
{
    // private instance variables (members / fields)
    private ArrayList<String> stringLog;
    private ArrayList<Integer> intLog;
    private ArrayList<Float> floatLog;

    // public properties (getters / setters)

    // constructors
    public Console()
    {
        initialize();
    }

    // private methods

    // public methods
    public void initialize()
    {
        // instantiate empty lists of various types
        stringLog = new ArrayList<String>();
        intLog = new ArrayList<Integer>();
        floatLog = new ArrayList<Float>();
    }

    /**
     * This method gets a string from the console
     * @param prompt a friendly message to show the user
     * @param type indicates the Input type to be used
     */
    public void input(String prompt, InputTypes type)
    {
        Scanner console = new Scanner(System.in);
        System.out.print(prompt);

        switch (type)
        {
            case STRING:
                 stringLog.add(console.nextLine());
                 break;
            case INTEGER:
                intLog.add(console.nextInt());
                break;
            case FLOAT:
                floatLog.add(console.nextFloat());
                break;
        }
    }

    /**
     * This function prints a generic array
     * @param type indicates the Log to be printed
     */
    public <T> void printLog(InputTypes type)
    {
        switch (type)
        {
            case STRING:
                for (var line:stringLog)
                {
                    System.out.println(line);
                }
                break;
            case INTEGER:
                for (var line:intLog)
                {
                    System.out.println(line);
                }
                break;
            case FLOAT:
                for (var line:floatLog)
                {
                    System.out.println(line);
                }
                break;
        }
    }

    /**
     * This function adds elements to a generic array
     * @param type indicates the Log to be cleared
     */
    public void clear(InputTypes type)
    {
        switch (type)
        {
            case STRING:
                stringLog.clear();
                break;
            case INTEGER:
                intLog.clear();
                break;
            case FLOAT:
                floatLog.clear();
                break;
        }
    }
}
