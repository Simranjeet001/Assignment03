/*
 * Student Name: Simranjeet Singh
 * course section:314
 * Professor: Sandra Iroakazi
 * class name: SolutionFour
 */
package assignment03;

import java.io.IOException;

/**
 * SolutionFour is the name of the class. A new superclass exception of type Exception is created
 * in the main method. It also creates a new exception type, IOException, as a subclass.
 * When using try catch to catch the superClass Exception type before the subclass,
 * this class displays a compilation problem.
 */

public class SolutionFour {

    //main method of the class
    public static void main(String[] args) {

        /**
         *  Instantiating a new superclass exception type Exception
         */
        Exception ex = new Exception("This is the Exception Class");

        /**
         *  Instantiating a new subclass exception type Exception
         */
        Exception ex2 = new IOException("This is the IOException class");


        try {
            //throws hte exception ex2 which is of type IOException
            throw ex2;

            /**
             * catching the super class exception before the subclass
             */
        } catch (Exception exception) {
            exception.printStackTrace();// using the print trace to trace the exception of type Exception.

            //catching the subclass exception after super which is resulting into the compilation error
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

    }
}
