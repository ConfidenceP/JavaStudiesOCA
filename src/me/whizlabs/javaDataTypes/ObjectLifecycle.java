package me.whizlabs.javaDataTypes;

/**
 * *******************************************************************************************************************
 *
 *                   ********    OBJECTIVE: WORKING WITH JAVA DATA TYPES  ********
 * 1)   Declare and initialize variables (including casting of primitive data types)
 * 2)   Differentiate between object reference and primitive variables
 * 3)   Know how to read and write to object  fields
 * 4)   EXPLAIN AN OBJECT LIFECYCLE (CREATION, "DEREFERENCE BY REASSIGNMENT" AND GARBAGE COLLECTION)
 * 5)   Develop code that uses wrapper classes such as boolean, double and integer
 * *******************************************************************************************************************
 *
 * **********************************    OBJECT CREATION     ********************************
 *
 * ✓    The creation of an object includes two steps: instantiation and initialization; instantiation is done with the
 *      new operator, while initialization is implemented by constructors
 * ✓    Example:
 *          class MyClass {
 *              int integer;
 *              MyClass(int integer) {
 *                  this.integer = integer;
 *              }
 *          }
 *          MyClass myObject = new MyClass(0);
 *
 * **********************************    OBJECT DESTRUCTION     ***********************************
 *
 * ✓    An object can be destroyed using a technique called dereference by reassignment, making it eligible for garbage
 *      collection.
 *
 * ✓    Example:
 *      class MyClass {
 *          int integer;
 *          MyClass(int integer) {
 *              this.integer = integer;
 *          }
 *      }
 *      MyClass myObject = new MyClass(0);
 *      myObject = null;
 *
 * *******************************************************************************************************************/


public class ObjectLifecycle {

   int x = 10;

//    public ObjectLifecycle() {
//
//        x = 10;
//
//    }

    public static void main(String[] args) {

        ObjectLifecycle test = new ObjectLifecycle();
        System.out.println(test.x);
    }
}
