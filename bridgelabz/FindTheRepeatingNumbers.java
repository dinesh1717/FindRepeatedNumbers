package com.bridgelabz;


//finding repeating numbers

public class FindTheRepeatingNumbers {
    public static void main(String[] args)
    {

        int A[] = { 79,79,79,45,23,45,45,89,23,23 };
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > max)
                max = A[i];
        }
        int B[] = new int[max + 1];
        for (int i = 0; i < A.length; i++) {


            B[A[i]]++;
        }
        for (int i = 0; i <= max; i++) {

            if (B[i] > 1)
                System.out.println(i + "-" + B[i]);
        }
    }
}



