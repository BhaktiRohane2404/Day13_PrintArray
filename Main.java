package bridgelabz;

import java.util.Scanner;

public class Main {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the integer array: ");
        int n = sc.nextInt();
        int[] int_arr = new int[n];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++)
        {
            int_arr[i] = sc.nextInt();
        }
        System.out.print("Enter the size String array of array: ");
        int m = sc.nextInt();
        String[] str_arr = new String[m];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < m; i++)
        {
            str_arr[i] = sc.nextLine();
        }
        System.out.print("Enter the size of double array: ");
        int d = sc.nextInt();
        Double[] dbl_arr = new Double[d];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < d; i++)
        {
            dbl_arr[i] = sc.nextDouble();
        }
        System.out.print("Enter the size char of array: ");
        int c = sc.nextInt();
        char[] char_arr = new char[c];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < c; i++)
        {
            char_arr[i] = sc.next().toCharArray()[0];
        }
        printArray(int_arr);
        printArray(char_arr);
        printArray(str_arr);
        printArray(dbl_arr);
    }
    public static void printArray(int[] int_arr)
    {
        System.out.print("\nThe Integer array is: ");
        for (Integer i : int_arr)
            System.out.print(i + " ");
    }
    public static void printArray(char[] arr) {
        System.out.print("\nThe Character array is: ");
        for (Character i : arr)
            System.out.print(i + " ");
    }
    public static void printArray(String[] arr)
    {
        System.out.print("\nThe String array is: ");
        for (String i : arr)
            System.out.print(i + " ");
    }
    public static void printArray(Double[] arr)
    {
        System.out.print("\nThe Double array is: ");
        for (Double i : arr)
            System.out.print(i + " ");
    }
}
