package main.java.com.madhaviv;

import java.io.*;

public class FizzBuzz{

    public static String print(int n) {
        if (n % 3 == 0) {
            {
                if (n % 5 == 0)
                    return("FizzBuzz");
            }
            return ("Fizz");
        } else if(n % 5 == 0) {
            return("Buzz");

        }
        return new Integer(n).toString();
    }





}
