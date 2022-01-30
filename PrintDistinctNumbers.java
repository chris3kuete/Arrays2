/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printdistinctnumbers;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author sa
 */
public class PrintDistinctNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] arr = new int[10];
        //int[] numDis1 = new int[10];

        System.out.println("Enter 10 numbers");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();

        }
        int m = numberOfDistinct(arr);
        System.out.println("There are " + m + " Distinct numbers");
        distinctNumbers(arr);
       
    }

    public static int numberOfDistinct(int[] numbers) {

        int count = 0;

        for (int i = 0; i < numbers.length; i++) {

            int j = 0;

            for (j = 0; j < i; j++) {
                if (numbers[i] == numbers[j]) {
                    break;

                }
            }
            if (i == j) {
                count++;
            }

        }

        return count;

    }

    public static void distinctNumbers(int[] numbers) {
        

        for (int i = 0; i < numbers.length; i++) {
            int j;
            for ( j = 0; j < i; j++) {

                if (numbers[i] == numbers[j]) {
                    break;
                }

            }
            if(i==j){
                System.out.println(numbers[i]+"");
            }

        }
       

    }


}
