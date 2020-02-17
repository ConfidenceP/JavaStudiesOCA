package me.whizlabs.javaBasics;

import notme.example.InheritanceCheck;

public class HowToInherit extends InheritanceCheck {
    public static void main(String[] args) {
        InheritanceCheck.setChecking("Just Checking");
        absolutelyNothingSpecial(); /** HERE CLASS INHERITS FROM A DIFFERENT PACKAGE (PACKAGE IMPORTED) */
        System.out.println(getChecking());
    }
}
