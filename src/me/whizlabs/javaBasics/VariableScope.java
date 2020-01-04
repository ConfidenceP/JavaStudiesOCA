package me.whizlabs.javaBasics;

/**
 * *******************************************************************************************************************
 *
 *                   ********    OBJECTIVE: JAVA BASICS  ********
 * 1)   DEFINE SCOPE OF VARIABLES
 * 2)   Define the structure of a Java class
 * 3)   Create executable Java applications with main method; run a Java program from the command line; produce console
 *      output
 * 4)   Import other Java packages to make them accessible in your code
 * 5)   Compare and contrast the features and components of Java such as: platform independence, object orientation,
 *      encapsulation, etc.
 * *******************************************************************************************************************
 *
 * **********************************     SCOPE OF VARIABLES      ***********************************
 *
 * The scope of a variable is the section of the program in which the variable is visible
 *
 * Variable identifiers are statically scoped, i.e. the scope of a variable is determined at compile
 * time.
 *
 * **********************************     CLASS-LEVEL SCOPE       ***********************************
 *
 * Class-level variables, also known as fields, are declared inside a class and outside any methods.
 *
 * A class-level variable is accessible from anywhere within the class and maybe from the outside
 * provided a suitable modifier is in place.
 *
 * ##################################################################################################
 * #    MODIFIER    #       CLASS       #       PACKAGE     #       SUBCLASS    #       WORLD       #
 * ##################################################################################################
 * #    Public      #           Y       #           Y       #           Y       #           Y       #
 * ##################################################################################################
 * #    Protected   #           Y       #           Y       #           Y       #           N       #
 * ##################################################################################################
 * #    No modifier #           Y       #           Y       #           N       #           N       #
 * ##################################################################################################
 * #    Private     #           Y       #           N       #           N       #           N       #
 * ##################################################################################################
 *
 * class MyClass {
 *     int number1 = 0; // This variable, number1, is a class-level scoped variable
 *     void myMethod() {
 *         int number2 = 0;
 *         {
 *             int number3 = 0;
 *         }
 *     }
 * }
 *
 * **********************************     METHOD-LEVEL SCOPE       ***********************************
 *
 * Variables are declared inside a method, also known as local variable, are scoped to the 'enclosing'
 * method (and cannot be accessed from the outside) and visible since their declarations until the
 * method returns.
 *
 * Method parameters are no different from local variables, except that instead of being declared and
 * initialized within the body, they are declared as part of the method signature and initialized when
 * the method gets invoked.
 *
 * class MyClass {
 *       int number1 = 0;
 *       void myMethod(int param) { // Method parameter example (int param)
 *           int number2 = 0; // This variable, number2, is a class-level scoped variable
 *           {
 *               int number3 = 0;
 *           }
 *      }
 *  }
 *
 * **********************************     BLOCK-LEVEL SCOPE       ***********************************
 *
 * A block-level scope is defined by a pair of curly brackets.
 *
 * A variable can only be accessed since its declaration until the closing bracket and inaccessible to
 * the code outside the block.
 *
 * class MyClass {
 *     int number1 = 0;
 *     void myMethod() {
 *         int number2 = 0;
 *         {
 *             int number3 = 0; // This variable, number3, is a block-level scoped variable
 *         }
 *     }
 * }
 *
 * *******************************************************************************************************************/

public class VariableScope {

    protected static int number1 = 0; /** number1 IS A CLASS-LEVEL SCOPE VARIABLE **/

    public static int testMethod() {
        int testResult = getNumber1(); /** testResult IS A METHOD-LEVEL SCOPE VARIABLE (AKA LOCAL VARIABLE) **/
        System.out.println("testResult = " + testResult);
        return testResult;
    }

    public static void main(String[] args) {
	// write your code here
        int doSomething; /** doSomething IS A METHOD-LEVEL SCOPE VARIABLE (AKA LOCAL VARIABLE) **/
        {
            number1 = 5;
            doSomething = 0;
            String blockVariable = "I'm the block level variable"; /** blockVariable IS A BLOCK-LEVEL SCOPE VARIABLE **/
            int numberBlock = 16;
            System.out.println("++doSomething = " + ++doSomething);
            System.out.println("numberBlock = " + numberBlock);
            System.out.println("blockVariable = " + blockVariable);
            System.out.println("number1 = " + number1);
        }
        System.out.println("++doSomething again = " + ++doSomething);
        System.out.println("testMethod = " + testMethod());

    }

    public static int getNumber1() {
        return number1;
    }

    public static void setNumber1(int number1) {
        VariableScope.number1 = number1;
    }
}
