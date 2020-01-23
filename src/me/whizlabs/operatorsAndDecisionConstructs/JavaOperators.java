package me.whizlabs.operatorsAndDecisionConstructs;

/**
 * *******************************************************************************************************************
 *
 *                   ********    OBJECTIVE: USING OPERATORS AND DECISION CONSTRUCTORS  ********
 * 1)   USE JAVA OPERATORS; USE PARENTHESES TO OVERRIDE OPERATOR PRECEDENCE
 * 2)   Test equality between Strings and other objects using == and equals()
 * 3)   Create if and if/else and ternary constructs
 * 4)   Use a switch statement
 * *******************************************************************************************************************
 *
 *  #################################################    #############################################################
 *  #    OPERATORS      #   HIGHER PRECEDENCE       #    #  OPERATORS               #   HIGHER PRECEDENCE            #
 *  #################################################    #############################################################
 *  #    Postfix        #   expr++ expr--           #    #  Bitwise AND             #   &                            #
 *  #################################################    #############################################################
 *  #    Unary          #   ++expr --expr           #    #  Bitwise exclusive OR    #   ^                            #
 *  #                   #   +expr -expr~!           #    #############################################################
 *  #################################################    #  Bitwise inclusive OR    #   |                            #
 *  #    Multiplicative #   *'/'%                   #    #############################################################
 *  #################################################    #  Logical AND             #   &&                           #
 *  #    Additive       #   + -                     #    #############################################################
 *  #################################################    #  Logical OR              #   ||                           #
 *  #    Shift          #   <<>> >>>                #    #############################################################
 *  #################################################    #  Ternary                 #   ?:                           #
 *  #    Relational     #   <> <= >= instance of    #    #############################################################
 *  #################################################    #  Assignment              #   = += -= *= /= %= &=          #
 *  #    Equality       #   == !=                   #    #                          #   ^= |= <<= >>= >>>=           #
 *  #################################################    #############################################################
 *
 *  **********************************    OVERRIDING OPERATOR PRECEDENCE      ****************************
 *
 *  ✓   Operator precedence may be overridden using parentheses
 *  ✓   Example 1:
 *          int integer1 = 1 + 2 * 3;
 *          int integer2 = (1 + 2) * 3;
 *          System.out.println(integer1); // 7
 *          System.out.println(integer2); // 9
 *  ✓   Example 2:
 *          boolean boolean1 = true || true && false;
 *          boolean boolean2 = (true || true) && false;
 *          System.out.println(boolean1); // true
 *          System.out.println(boolean2); // false
 *
 * *******************************************************************************************************************/

public class JavaOperators {

    public static void question1() {

        /** Question 1 */
        int i1 = 1, i2 = 2;
        int i = i2 = i1;

        System.out.println(i);
        System.out.println(i2);
    }

    public static void question2() {

        /** Question 2 */
        int i1 = 1, i2 = 2;
        int i = i2 * ++i1 * i1;

        System.out.println(i);
        System.out.println(i2);
    }

    public static void question3() {

        /** Question3 */
        boolean b1 = false, b2 = true;
        boolean b = (!b1 || !b2) && b1;
        System.out.println(b);
    }

    public static void question4() {
        int i = 4 << 4 / 2;
        System.out.println(i);
    }

    public static void main(String[] args) {

        /** Question 1 */
        question1();

        System.out.println();

        /** Question 2 */
        question2();

        System.out.println();

        /** Question 3 */
        question3();

        System.out.println();

        /** Question 4 */
        question4();
    }
}
