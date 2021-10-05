/*
 * Student Name: Simranjeet Singh
 * course section:314
 * Professor: Sandra Iroakazi
 * class name: SolutionTwo
 */
package assignment03;

import java.io.IOException;

/**
 * The name of this class is SolutionTwo. This class has the main method and it has some
 * try catch code that throes the exceptions of type ExceptionBlue, ExceptionYellow,
 * NullPointerException and IOException.
 * In this the ExceptionBlue and ExceptionYellow can be catch in the Exception as well
 * as in the ExceptionBlue. ExceptionBlue can catch ExceptionYellow but reverse is not true.
 * the NullPointerException and IOException is catch by the Exception.
 */
public class SolutionTwo {

    //main method of the class
    public static void main(String[] args) {


        /**
         * throw the ExceptionBlue
         */
        try {

            throw new ExceptionBlue();

            //catching the ExceptionBlue in the Exception
        } catch (Exception ex) {

            System.err.println("ExceptionBlue caught in catch block of type Exception " +ex+ "\n");
            //ex.printStackTrace();
        }


        /**
         * throw the ExceptionYellow which is caught in the type Exception
         */
        try {

            throw new ExceptionYellow();

            //catching the ExceptionYellow in the Exception
        } catch (Exception exception) {

            System.err.println("ExceptionYellow caught in catch block of type Exception "+ exception + "\n");
        }


        /**
         * throw the NullPointerException
         */
        try {
            throw new NullPointerException();

            //catching the NullPointerException in the Exception
        } catch (Exception exception) {

            System.err.println("NullPointerException caught in catch block of type Exception "+ exception+"\n");
        }


        // throw the IOException
        try {
            throw new IOException();

            //catching the IOException in the Exception
        } catch (Exception exception) {

            System.err.println("IOException caught in catch block of type Exception "+ exception);
        }

    }

    /**
     * Class ExceptionBlue that extends the Exception
     */
    public static class ExceptionBlue extends Exception {
    }

    /**
     * Class ExceptionYellow that extends the ExceptionBlue
     */
    public static class ExceptionYellow extends ExceptionBlue {
    }

}
