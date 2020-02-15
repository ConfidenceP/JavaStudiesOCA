package me.whizlabs.javaBasics;

import me.whizlabs.operatorsAndDecisionConstructs.StringsObjectsEquality;

/**
 * *******************************************************************************************************************
 *
 *                  ********    OBJECTIVE: JAVA BASICS  ********
 * 1)   Define the scope of variables
 * 2)   Define the structure of a Java class
 * 3)   Create executable Java applications with main method; run a Java program from the command line; produce console
 *      output
 * 4)   Import other Java packages to make them accessible in your code
 * 5)   COMPARE AND CONTRAST THE FEATURES AND COMPONENTS OF JAVA SUCH AS: PLATFORM INDEPENDENCE, OBJECT ORIENTATION,
 *      ENCAPSULATION, ETC.
 * *******************************************************************************************************************
 *
 *                  ********    JAVA BUZZWORDS  ********
 * ✓    Simple
 * ✓    Object oriented
 * ✓    Distributed
 * ✓    Interpreted
 * ✓    Robust
 * ✓    Secure
 * ✓    Architecture neutral
 * ✓    Platform independent (portable)
 * ✓    High Performance
 * ✓    Multithreaded
 * ✓    Dynamic
 * *******************************************************************************************************************
 *
 *                  ********    OBJECT ORIENTED CONCEPTS  ********
 * ✓    Inheritance : A class uses fields and methods of another class
 *
 *      public class SuperClass {
 *          protected String myField;
 *          protected void myMethod() {
 *              // do something
 *          }
 *      }
 *
 *      public class SubClass extends SuperClass {}
 *
 *
 * ✓    Polymorphism : Subclasses of a class can define their own unique behavior, yet share some of the same
 *      functionality of the parent class
 *
 *      public class SuperClass {
 *          public void myMethod() {// do something}
 *      }
 *
 *      public class SubClass1 extends SuperClass {
 *          public void myMethod() {// do something else - defined by SubClass1}
 *      }
 *
 *      public class SubClass2 extends SuperClass {
 *          public void myMethod() {// do something else - defined by SubClass2}
 *      }
 *
 *
 * ✓    Abstraction : Hiding certain details and show only essential features of the object
 *
 *      public abstract class SuperClass {
 *          public void myMethod();
 *      }
 *
 *      public class SubClass extends SuperClass {
 *          public void myMethod() {
 *              // do something
 *          }
 *      }
 *
 *
 * ✓    Encapsulation : Wrapping data and the code that operates on the data into a single entity.
 *
 *      public class MyClass {
 *          private String myField;
 *          public String getMyField() {
 *              return myField;
 *          }
 *          public void setMyField(String myField) {
 *              this.myField = myField;
 *          }
 *      }
 *
 * *******************************************************************************************************************/


public class CompareAndContrastJava extends StringsObjectsEquality {

    public static void main(String[] args) {
        setterReturnTwo(); /** INHERITING METHOD FROM CLASS IN ANOTHER MODULE BUT SAME PACKAGE **/
    }
}
