package me.javatpoint.examples.array;

//Java Program to illustrate the jagged array

public class TestJaggedArray {

//    public static void main(String[] args){
//
//        //declaring a 2D array with odd columns
//
//        int arr[][] = new int[3][];
//        arr[0] = new int[3];
//        arr[1] = new int[4];
//        arr[2] = new int[2];
//
//        //initializing a jagged array
//
//        int count = 0;
//        for (int i=0; i<arr.length; i++)
//            for(int j=0; j<arr[i].length; j++)
//                arr[i][j] = count++;
//
//        //printing the data of a jagged array
//
//        for (int i=0; i<arr.length; i++){
//            for (int j=0; j<arr[i].length; j++){
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();//new line
//        }
//    }
public static void main(String[] args) {
    //declaring a source array
    char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',
            'i', 'n', 'a', 't', 'e', 'd' };
    //declaring a destination array
    char[] copyTo = new char[20];
    //copying array using System.arraycopy() method
    System.arraycopy(copyFrom, 0, copyTo, 7, 12);
    //printing the destination array
    System.out.println(String.valueOf(copyTo));
}
}
