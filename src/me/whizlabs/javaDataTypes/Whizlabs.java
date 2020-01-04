package me.whizlabs.javaDataTypes;

public class Whizlabs {
    public static void main(String[] args) {
        ReadWriteObject myObject = new ReadWriteObject();
        myObject.integer = 2;
        int number = myObject.integer;
        System.out.println(number);
    }
}
