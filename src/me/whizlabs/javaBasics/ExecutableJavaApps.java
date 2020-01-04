package me.whizlabs.javaBasics;

/**
 * *******************************************************************************************************************
 *
 *                  ********    OBJECTIVE: JAVA BASICS  ********
 * 1)   Define the scope of variables
 * 2)   Define the structure of a Java class
 * 3)   CREATE EXECUTABLE JAVA APPLICATIONS WITH MAIN METHOD; RUN A JAVA PROGRAM FROM THE COMMAND LINE; PRODUCE CONSOLE
 *      OUTPUT
 * 4)   Import other Java packages to make them accessible in your code
 * 5)   Compare and contrast the features and components of Java such as: platform independence, object orientation,
 *      encapsulation, etc.
 * *******************************************************************************************************************
 *
 *                  ********    REQUIREMENTS  ********
 * 1)   A class with the public scope modifier
 * 2)   A method in the form:
 *      public static void main(String[] args) {
 *          //  Code goes here
 *      }
 * *******************************************************************************************************************
 *
 *                 ********    COMPILATION AND EXECUTION  ********
 * 1)   Name the file containing source code after the public class name
 * 2)   Compile the source file into a Java class file using a Java compiler
 * 3)   Execute the application using a Java application launcher tool
 *
 * *******************************************************************************************************************/

public class ExecutableJavaApps {
    public static void main(String[] args) {
        for (String arg : args) {
            System.out.println(arg.toUpperCase() + " ");
        }
    }
}
