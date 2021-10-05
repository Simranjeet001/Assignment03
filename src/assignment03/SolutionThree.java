/*
 * Student Name: Simranjeet Singh
 * course section:314
 * Professor: Sandra Iroakazi
 * class name: SolutionThree
 */
package assignment03;

/**
 * SolutionThree is the name of the class. This class has two static methods,
 * courseStarting and courseEnding, as well as the main function. Exceptions
 * are thrown by both of these approaches. The exception is initially thrown
 * by the courseEnding, and then it is recalled, caught, and rethrown by the courseStarting.
 * <p>
 * The main function, which calls courseStarting and then catches and rethrows
 * an exception, is caught by Exception.
 */

public class SolutionThree {

    /**
     * This is the courseStarting method of class that initially throws the Exception
     */
    public static void courseStarting() throws Exception {

        try {
            //calling the courseEnding method of the class.
            courseEnding();

            //catching the Exception
        } catch (Exception exception) {
        	//exception.printStackTrace();// use this to show that it is the exception thrown by CourseEnding method.

            /**
             * Now it is the exception which is thrown by the course starting method
             * after tracing the Course ending method's exception.
             */
            throw new Exception("This is the exception rethrown by the CourseStarting method");
        }
    }

    /**
     * This is the courseEnding  method of class that initially throws the Exception
     */
    public static void courseEnding() throws Exception {
        // throws the exception
        throw new Exception("This is the exception thrown by the Course Ending method");
    }

    //main method of the class
    public static void main(String[] args) {

        try {
            // calling the method courseStarting
            courseStarting();
            //catching the rethrown exception by the method courseStarting.
        } catch (Exception exception) {
        	exception.printStackTrace();
        }
    }
}
