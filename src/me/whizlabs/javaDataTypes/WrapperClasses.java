package me.whizlabs.javaDataTypes;

/**
 * *******************************************************************************************************************
 *
 *                   ********    OBJECTIVE: WORKING WITH JAVA DATA TYPES  ********
 * 1)   Declare and initialize variables (including casting of primitive data types)
 * 2)   Differentiate between object reference and primitive variables
 * 3)   Know how to read and write to object  fields
 * 4)   Explain an object lifecycle (creation, "Dereference by reassignment" and garbage collection)
 * 5)   DEVELOP CODE THAT USES WRAPPER CLASSES SUCH AS BOOLEAN, DOUBLE AND INTEGER
 * *******************************************************************************************************************
 *
 * **********************************    INTRODUCTION     ********************************
 *
 * ✓    The Java platform provides wrapper classes for primitive data types
 * ✓    Eight wrapper classes:
 *          ♠   Boolean
 *          ♠   Byte
 *          ♠   Short
 *          ♠   Integer
 *          ♠   Long
 *          ♠   Float
 *          ♠   Double
 *          ♠   Character
 *
 * **********************************    BOOLEAN WRAPPER CLASS    ***********************************
 *
 * ✓    The boolean class wraps a value of the primitive type boolean in an object
 * ✓    Example:
 *          Boolean bool = Boolean.logicalAnd(false, true);
 *          int compare = bool.compareTo(false);
 *          // print out number 0
 *          System.out.println(compare);
 *
 * **********************************    INTEGRAL NUMERIC WRAPPER CLASS    ***********************************
 *
 * ✓    Four integral numeric wrapper classes are: Byte, Short, Integer and Long; they have fields and methods with
 *      similar names and 'functionalities'
 * ✓    Example:
 *          int sum = Integer.sum(1,2);
 *          // print out number 3
 *          System.out.println(sum);
 *
 * **********************************    FLOATING-POINT NUMERIC WRAPPER CLASS    ***********************************
 *
 * ✓    Two floating-point numeric warpper classes are: Float and Double; they have fields and methods with similar
 *      names and 'functionalities'
 * ✓    Example:
 *          double max = Double.max(1.9, 2.1);
 *          // print out number 2.1
 *          System.out.println(max);
 *
 * **********************************    CHARACTER WRAPPER CLASS    ***********************************
 *
 * ✓    The Character class wraps a value of the primitive type char in an object
 * ✓    Example:
 *          int codePoint = Character.codePoint("OCAJP8", 2);
 *          // print out number 65
 *          System.out.println(codePoint);
 *
 * *******************************************************************************************************************/


public class WrapperClasses {

    public static void main(String[] args) {
        booleanExample();
        integralExample();
        floatingPointExample();
        characterExample();
        mixedExample();
    }

    public static void booleanExample() {
        Boolean bool = Boolean.logicalAnd(Boolean.logicalOr(true, false), true);
        int compare = bool.compareTo(false);
        System.out.println(compare);

        boolean defined = Character.isDefined('@');
        System.out.println(defined);
    }

    public static void integralExample() {
        int sum = Integer.sum(6, 8);
        System.out.println(sum);
    }

    public static void floatingPointExample() {
        double max = Double.max(1.9, 2.1);
        System.out.println(max);
    }

    public static void characterExample() {
        int codeP = Character.codePointAt("OCAJP8", 2);
        System.out.println(codeP);
    }

    public static void mixedExample() {
        Double wrapper = new Double(1.5);
        long primitive = wrapper.intValue();
        System.out.println(primitive);
    }

}
