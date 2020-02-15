package me.whizlabs.operatorsAndDecisionConstructs;

/**
 * *******************************************************************************************************************
 *
 *                   ********    OBJECTIVE: USING OPERATORS AND DECISION CONSTRUCTORS  ********
 * 1)   Use java operators; use parentheses to override operator precedence
 * 2)   TEST EQUALITY BETWEEN STRINGS AND OTHER OBJECTS USING == AND EQUALS()
 * 3)   Create if and if/else and ternary constructs
 * 4)   Use a switch statement
 * *******************************************************************************************************************
 *
 *  **********************************    STRING CONSTANT POOL      ****************************
 *
 *  ✓   String constant pool is an area in the heap memory, containing String object
 *  ✓   String created using string literals are returned from the string constant pool; while strings created using
 *      the new operator are returned from outside the pool
 *
 *  **********************************    COMPARISON OF OBJECTS USING == OPERATOR      ****************************
 *
 *  ✓   The operator compares objects by reference; implying that an equality test evaluates to true only if two
 *      objects in the comparison are the same
 *  ✓   Example:
 *          String string1  = new String("Whizlabs");
 *          String string2  = "Whizlabs";
 *          String string3  = "Whizlabs";
 *          System.out.println(string1 == string2); // false
 *          System.out.println(string2 == string3); // true
 *
 *  **********************************    COMPARISON OF OBJECTS USING EQUALS METHOD      ****************************
 *
 *  ✓   The equals method is defined in the Object class, comparing objects based on how it is overridden in these
 *      objects' blueprint classes; if not overridden, it compares objects the same way as the == operator does
 *  ✓   Example - comparison of objects with inherited equals method:
 *          public class Data {
 *              private int value;
 *              public Data(int value) {
 *                  this.value = value;
 *              }
 *          }
 *          Data data1 = new Data(0), data2 = new Data(0);
 *          System.out.println(data1.equals(data2)); // false
 *
 *  ✓   Example - comparison of objects with overridden equals method:
 *          public class Data {
 *              private int value;
 *              public Data(int value) {
 *                  this.value = value;
 *              }
 *              public boolean equals(Object obj) {
 *                  return this.value == ((Data) obj).value;
 *              }
 *          }
 *          Data data1 = new Data(0), data2 = new Data(0);
 *          System.out.println(data1.equals(data2)); // true
 *
 *  **********************************    COMPARISON OF STRINGS USING EQUALS METHOD      ****************************
 *
 *  ✓   The equals method is overridden in the String class, comparing strings based on their contained literal values
 *  ✓   Example:
 *          String string1  = new String("Whizlabs");
 *          String string2  = "Whizlabs";
 *          String string3  = "Whizlabs";
 *          System.out.println(string1 == string2); // true
 *          System.out.println(string2 == string3); // true
 *
 * *******************************************************************************************************************/

public class stringsObjectsEquality {

    public static void main(String[] args) {
        compareObjectsUsingOperator();
        compareObjectsUsingEquals();
        compareStringsUsingEquals();
        setterReturnTwo();
    }

    public static void compareObjectsUsingOperator() {

        String string1 = new String("Whizlabs");
        String string2 = "Whizlabs";
        String string3 = "Whizlabs";

        System.out.println(string1 == string2);
        System.out.println(string2 == string3);
    }

    public static void compareObjectsUsingEquals() {
        Data data1 = new Data(0);
        Data data2 = new Data(0);

        Data data3 = new Data(6.7f);

        System.out.println(data1.equals(data2));
    }

    public static void compareStringsUsingEquals() {

        String string1 = new String("Whizlabs");
        String string2 = new String("Whizlabs");
        String string3 = "Whizlabs";

        System.out.println(string1.equals(string2));
        System.out.println(string2.equals(string3));
    }

    public static void setterReturnTwo() {
        Data checkTwo = new Data();

        checkTwo.setReturningTwo(5);
        System.out.println(checkTwo.getReturningTwo() + " returned!!!");
        System.out.println(checkTwo.justGetTwo() + " I got you!!!");
    }
}
