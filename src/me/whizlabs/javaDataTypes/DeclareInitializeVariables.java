package me.whizlabs.javaDataTypes;

/**
 * *******************************************************************************************************************
 *
 *                   ********    OBJECTIVE: WORKING WITH JAVA DATA TYPES  ********
 * 1)   DECLARE AND INITIALIZE VARIABLES (INCLUDING CASTING OF PRIMITIVE DATA TYPES)
 * 2)   Differentiate between object reference and primitive variables
 * 3)   Know how to read and write to object fields
 * 4)   Explain an object Lifecycle
 * 5)   Develop code that uses wrapper classes
 * *******************************************************************************************************************
 *
 * **********************************    CLASS-LEVEL VARIABLES      ***********************************
 *
 * ✓    Class-level variables are declared and initialized at the same time; if you declare a variable without
 *      initializing it, the compiler will set the variable to a reasonable default value based on its type
 * ✓    Default values for variables of various data types:
 *          ♠   byte, short, int, long  : 0
 *          ♠   float, double           : 0.0
 *          ♠   char                    : '\u0000'
 *          ♠   boolean                 : false
 *          ♠   object                  : null
 * ✓    Class-level variables may be implicitly or explicitly initialized
 *
 * CLASS-LEVEL VARIABLE EXAMPLES
 *
 * public class MyClass {
 *     Object myObject;         (Class-level variable)
 *     static int myInt = 0;    (Class-level variable)
 *     public void myMethod() {
 *         char myChar ='a';
 *         boolean myBoolean = false;
 *         // do something
 *     }
 * }
 *
 * **********************************     LOCAL VARIABLES       ***********************************
 *
 * ✓    Local variables are used to store temporary states within methods or blocks; they must be declared and
 *      explicitly initialized before being used
 *
 * ✓    A local variable may be initialized anywhere after it is declared and before the enclosing method/block ends
 *
 * public class MyClass {
 *     Object myObject;
 *     static int myInt = 0;
 *     public void myMethod() {
 *         char myChar ='a';            (local variable)
 *         boolean myBoolean = false;   (local variable)
 *         // do something
 *     }
 * }
 *
 * **********************************     PRIMITIVE DATA TYPE CASTING      ***********************************
 *
 * ✓    There are two types of casting, i.e. Widening Casting and Narrowing Casting
 *          byte 	→   short 	→   int 	→   long 	→   float 	→   double
 * ✓    Widening Casting : implicitly implemented (Does not require a casting operator)
 *          double 	→   float 	→   long 	→   int 	→   short 	→   byte
 * ✓    Narrowing Casting : explicitly implemented (Requires a casting operator)
 *
 * ✓    Casting to and from char
 *          ♠   Widening casting: from char to int, long, float or double
 *          ♠   Narrowing casting: from char to byte or short; from short, int, long, float or double to char
 * ✓    The magnitude and precision of a value may be lost after being cast
 * ✓    Primitive type casting never results in a runtime exception
 *
 * public class MyClass {
 *     public void myMethod() {
 *         int myInt = 0;
 *
 *         long myLong = myInt;         (widening casting)
 *         byte myByte = (byte) myInt;  (narrowing casting)
 *
 *         // do something
 *     }
 * }
 *
 * *******************************************************************************************************************/

public class DeclareInitializeVariables {
    static double classVar; /** Implicit declaration and initialization */
    static String stringVar;

    public static void main(String[] args) {
        int localVar = 1; /** Explicit declaration and initialization */
        long newVar = localVar + 1; /** Widening Casting */
        byte byteVar = (byte) newVar; /** Narrowing Casting */
        System.out.println(localVar);
        System.out.println(classVar);
        System.out.println(newVar);
        System.out.println(byteVar + 1);

        stringVar = "check 1";
        String locVar = stringVar + " " + "testing";
        System.out.println(locVar);
        System.out.println(stringVar);
        stringVar = locVar;
        System.out.println(stringVar);
    }
}
