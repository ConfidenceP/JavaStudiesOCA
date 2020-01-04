package me.whizlabs.javaDataTypes;

/**
 * *******************************************************************************************************************
 *
 *                   ********    OBJECTIVE: WORKING WITH JAVA DATA TYPES  ********
 * 1)   Declare and initialize variables (including casting of primitive data types)
 * 2)   Differentiate between object reference and primitive variables
 * 3)   KNOW HOW TO READ AND WRITE TO OBJECT FIELDS
 * 4)   Explain an object lifecycle (creation, "Dereference by reassignment" and garbage collection)
 * 5)   Develop code that uses wrapper classes such as boolean, double and integer
 * *******************************************************************************************************************
 *
 * **********************************    INSIDE THE OBJECT      ********************************
 *
 * ✓    Statements within an object may access and modify a field of the object using the 'this' keyword
 *
 * public class MyClass {
 *     String myField = "I am an object field";
 *     String getMyField() {
 *         // read a field
 *         return this.myField;
 *     }
 *     void setMyField() {
 *         // write a field
 *         this.myField = "I have been changed";
 *     }
 * }
 *
 * **********************************     OUTSIDE THE OBJECT       ***********************************
 *
 * ✓    A non-private object field can be accessed and modified from outside using an object reference, followed by the
 *      dot (.) operator, followed by the simple field name
 *
 *      public class MyClass {
 *          public String myField = "I am an object field";
 *      }
 *
 * ✓    The myField field may be changed form outside its enclosing object
 *
 *      MyClass myObject = new MyClass();
 *      // read field
 *      String objectField = myObject.myField;
 *      // write a field
 *      myObject.myField = "Change a field from outside";
 * *******************************************************************************************************************/

public class ReadWriteObject {
    public int integer = 0;

    public int getInteger() {
        return integer;
    }

    public void setInteger(int integer) {
        /** System.out.println(this.integer);
        System.out.println(integer); */
        this.integer = integer;
    }

    public static void main(String[] args) {
        ReadWriteObject myObject = new ReadWriteObject();
        myObject.setInteger(1);
        System.out.println(myObject.getInteger());
        myObject.myMethod();
    }

    private int myField = 0;
    public void myMethod() {
        int myField = 1;
        System.out.println(this.myField); /** Result  = 0 */
        System.out.println(myField); /** Result  = 1 */
    }

}
