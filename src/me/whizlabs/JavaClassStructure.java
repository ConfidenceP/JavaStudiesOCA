package me.whizlabs;

/**
 * *******************************************************************************************************************
 *
 *                  ********    OBJECTIVE: JAVA BASICS  ********
 * 1)   Define the scope of variables
 * 2)   DEFINE THE STRUCTURE OF A JAVA CLASS
 * 3)   Create executable Java applications with a main method; run a Java program from the command line; produce
 *      console output
 * 4)   Import other Java packages to make them accessible in your code
 * 5)   Compare and contrast the features and components of Java such as platform independence, object orientation,
 *      encapsulation, etc.
 * *******************************************************************************************************************
 *
 *                  ********    CLASS DECLARATION   ********
 *  1)  Modifiers, such as public or private
 *  2)  THE CLASS KEYWORD
 *  3)  THE CLASS NAME, with the initial letter capitalized by convention
 *  4)  The name of the class's parent (superclass), if any, preceded by the keyword extends
 *  5)  A comma-separated list of interfaces implemented by the class, if any, preceded by the keyword implements
 *  6)  THE CLASS BODY, surrounded by a pair of curly braces
 *
 *          ******** NB: Capitalized parts of the class declaration are required    ********
 * *******************************************************************************************************************
 *
 *                  ********    CLASS EXAMPLE   ********
 *  public class MyClass extends MySuperClass implements MyInterface {
 *
 *
 *      //  fields
 *          * Zero or more modifiers, such as public or private
 *          * THE TYPE OF THE FIELD
 *          * The NAME OF THE FIELD
 *
 *      int myField = 0;
 *
 *
 *
 *      //  methods
 *          * Modifiers, such as public or private
 *          * THE RETURN TYPE if the method return a value, or void otherwise
 *          * THE METHOD NAME
 *          * A COMMA-DELIMITED LIST OF INPUT PARAMETERS, preceded by their data types, enclosed by parentheses (); if
 *            there are no parameters, you must use empty parentheses
 *          * An exception list
 *          * THE METHOD BODY, enclosed between curly braces
 *
 *      void myMethod() {
 *          // do something
 *      }
 *
 *
 *
 *      //  constructors
 *          * Constructors are used to create objects from the class blueprint
 *          * Constructor declarations look like method declarations, except that they use the name of the class and
 *            HAVE NO RETURN TYPE
 *              - Modifiers
 *              - THE CLASS NAME
 *              - THE COMMA-DELIMITED LIST OF INPUT PARAMETERS
 *              - An exception list
 *              - THE CONSTRUCTOR BODY
 *
 *       MyClass() {
 *           // do something
 *       }
 *
 *  }
 *
 *          ******** NB: Capitalized parts of the class example are required    ********
 * */

public class JavaClassStructure {
    public static void main(String[] args) {
        System.out.println("We only have notes here!");
    }
}
