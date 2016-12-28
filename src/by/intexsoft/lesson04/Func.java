/**
 * 
 */
package by.intexsoft.lesson04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Func
{
    public static final int RADIUS = 1;
    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException
    {
        double x = getDouble();
        double y = getDouble();
        
        if (upperXAxis(x, y) && inCircle(x, y, RADIUS) && notUpperHiperbolic(x, y))
        {
            System.out.println("Hit");
        }
        else
        {
            System.out.println("Not hit");
        }

    }

    private static boolean notUpperHiperbolic(double x, double y)
    {
        return !upperHiperbolic(x, y);
    }

    private static double getDouble() throws IOException
    {
        String tmp = getString();
        return Double.parseDouble(tmp);
    }

    private static String getString() throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String str = br.readLine();
        return str;
    }

    private static boolean inCircle(double x, double y, int r)
    {
        boolean bool = (x * x + y * y) <= (r * r);
        
        System.out.println("In Circle " + bool);
        return bool;
    }

    private static boolean upperXAxis(double x, double y)
    {
        boolean bool = y >= 0;
        System.out.println("UpperXAxis " + bool);
        return bool;
    }
    
    private static boolean upperHiperbolic(double x, double y)
    {
        boolean bool = y > x * x;
        System.out.println("UpperHiperbolic " + bool);
        return bool;
    }

}
