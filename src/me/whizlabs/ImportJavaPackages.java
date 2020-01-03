package me.whizlabs;

import java.util.ArrayList;
import java.util.List;

/**
 * *******************************************************************************************************************
 *
 *                  ********    OBJECTIVE: JAVA BASICS  ********
 * 1)   Define the scope of variables
 * 2)   Define the structure of a Java class
 * 3)   Create executable Java applications with main method; run a Java program from the command line; produce console
 *      output
 * 4)   IMPORT OTHER JAVA PACKAGES TO MAKE THEM ACCESSIBLE IN YOUR CODE
 * 5)   Compare and contrast the features and components of Java such as: platform independence, object orientation,
 *      encapsulation, etc.
 * *******************************************************************************************************************
 *
 *                  ********    USING FULLY QUALIFIED NAMES  ********
 * ✓    Without the import statement, types from other packages must be referred to by their fully qualified names
 * ✓    Examples
 *          java.util.List
 *          java.util.Map
 * *******************************************************************************************************************
 *
 *                  ********    IMPORTING INDIVIDUAL TYPES  ********
 * ✓    Using import statements allows a source file to refer to types from other packages by their simple names
 * ✓    Examples
 *           import java.util.List;
 *           import java.util.Map;
 * ✓    Import statements must be put at the beginning of a file, just after the package statement, if any
 * *******************************************************************************************************************
 *
 *                  ********    IMPORTING ENTIRE PACKAGES  ********
 * ✓    All types from a package may be imported with a single statement by using the asterisk (*) wildcard character
 * ✓    Examples
 *           import java.util.*;
 * ✓    The java.lang package is automatically imported
 * *******************************************************************************************************************
 * */

public class ImportJavaPackages {
    public static void main(String[] args) {
        /** java.util.List<Integer> noImport = new java.util.ArrayList<>();  Without import */
        List<Integer> withImport = new ArrayList<>(); /** With Import */
        withImport.add(25);
        System.out.println(withImport.size());
        System.out.println(withImport);
        withImport.add(44);
        System.out.println(withImport.size());
        System.out.println(withImport);
        withImport.add(72);
        System.out.println(withImport.size());
        System.out.println(withImport);
        withImport.remove(0);
        System.out.println(withImport.size());
        System.out.println(withImport);
    }
}
