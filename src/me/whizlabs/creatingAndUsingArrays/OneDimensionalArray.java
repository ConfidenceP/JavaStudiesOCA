package me.whizlabs.creatingAndUsingArrays;

/**
 * *******************************************************************************************************************
 *
 *                   ********    OBJECTIVE: CREATING AND USING ARRAYS  ********
 * 1)   DECLARE, INSTANTIATE, INITIALIZE AND USE A ONE-DIMENSIONAL ARRAY
 * 2)   Declare, instantiate, initialize and use a multi-dimensional array
 * *******************************************************************************************************************
 *
 *  **********************************    ONE-DIMENSIONAL ARRAY DECLARATION      ****************************
 *
 *  ✓   An array declaration has two components: the array's type and the array's name
 *  ✓   Examples:
 *          int[] intArray;
 *          String[] stringArray;
 *          MyObject[] objectArray
 *  ✓   You can also place the brackets after the array's name, such as: int intArray[] or String stringArray[];
 *      however this form is discouraged
 *
 *  **********************************    INSTANTIATION AND INITIALIZATION USING THE NEW OPERATOR      ***************
 *
 *  ✓   Instantiation: An array can be instantiated with the new operator, followed by the type of elements and the
 *      array length enclosed within square brackets:
 *          intArray = new int[5];
 *  ✓   Initialization: Array elements are implicitly initialized with default values when the array is created; you
 *      may explicitly do this by assigning values to these elements:
 *          int[] intArray = new int[5];
 *          for (int i = 0; i < 5; i++) {
 *              intArray[i] = i;
 *          }
 *
 *  **********************************    INSTANTIATION AND INITIALIZATION USING ARRAY INITIALIZERS      ***************
 *
 *  ✓   An array can be instantiated and initialized using array initializer
 *  ✓   Examples:
 *          intArray = {1,2,3,4,5};
 *          intArray = new int[] {1,2,3,4,5};
 *
 *  NB: AN ARRAY OF TYPE INT CANNOT BE CAST TO AN ARRAY OF TYPE LONG
 *
 * *******************************************************************************************************************/

public class OneDimensionalArray {
}
