/*
 * Student Name: Simranjeet Singh
 * course section:314
 * Professor: Sandra Iroakazi
 * class name: SolutionOne
 */
package assignment03;
/**
 *  What this class do????????
 *
 *  The class name is solution one and this class has three inner classes named ExceptionOne
 *  ExceptionTwo and ExceptionThree and these all the classes are extending the Exception class.
 *  this class also have a main method which has some try catch code to catch the exceptions.
 *  and this class proves that the Subclasses exceptions (ExceptionTwo and ExceptionThree) has
 *  caught in the catch block of type ExceptionOne in addition to the ExceptionOne itself
 *  (means the class Exception one can catch the its own exception and of its subclasses as well
 *
 */
public class SolutionOne {


    //main method of the class
    public static void main(String[] args) {

        // throw the exception three
        try {
            throw new ExceptionThree();

            //catching the ExceptionThree in the ExceptionOne
        } catch (ExceptionOne exceptionOne) {

            System.err.println("ExceptionThree caught in catch block of type ExceptionOne " +exceptionOne+"\n");

            /**
             * we can also use the stack trace it will give us the proper location where we are throwing the exception.
             * ex.printStackTrace();
             */
        }

        // throw the exception two
        try {
            throw new ExceptionTwo();

            //catching the ExceptionTwo in the ExceptionOne
        } catch (ExceptionOne exceptionOne) {

            System.err.println("ExceptionTwo caught in catch block of type ExceptionOne " + exceptionOne +"\n");
        }

        /**
         * this is the extra try catch to show that ExceptionOne can catch itself too i addition with its other subclasses.
         * throw the exception one
         */
        try {

            throw new ExceptionOne();

            //catching the ExceptionOne in the ExceptionOne(in its own)
        } catch (ExceptionOne exceptionOne) {

            System.err.println("ExceptionOne caught in catch block of its own type " + exceptionOne);
            //ex.printStackTrace();
        }

    }

    /**
     * why static ??
     * Ans: if not static then it will give the error (cannot be referenced from a static context)
     * that means we have to change the main method to non static.
     */

    //class ExceptionOne that extends the Exception
    public static class ExceptionOne extends Exception {
    }

    //class ExceptionTwo that extends the ExceptionOne
    public static class ExceptionTwo extends ExceptionOne {
    }

    //class ExceptionThree that extends the ExceptionTwo
    public static class ExceptionThree extends ExceptionTwo {
    }
}
