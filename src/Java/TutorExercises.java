package Java;

import java.util.Scanner;

public class TutorExercises {
    public static int reverse(int n) {
        int result = 0;
        while (n > 0) {
            result = result * 10 + n % 10;
            n = n / 10;
        }
        return result;
    }

    public static boolean isPalindrome(int n) {
        return n == reverse(n);
    }

    //psvm
    public static void main(String[] args) {
        /* int[] arr;//declaration
        arr = new int[5];//initialization

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;*/

        int[] arr = {1, 8, 12, 34, 2, 10};

        // System.out.println(arr[2]);

        int max = arr[0];

        int indexOfMaxElement = 0;

        System.out.println("________________");
            /*for (int myNumbers : arr)
            {
            total += arr[myNumbers];
            //System.out.println(myNumbers);
            }*/

        //System.out.println(total);

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];

                indexOfMaxElement = i;

            }


            //total += arr[i];
        }

        System.out.println("The max element is : " + max + " and it's index is : " + indexOfMaxElement);


        // Shallow copying arrays

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int[] positiveNumbers = numbers;

        numbers[0] = 55;

        for (int num : positiveNumbers) {
            System.out.println(num + " ");
        }


        int source[] = {10, 20, 30, 40, 50};

        int destination[] = {3, 5, 7, 9, 11};

            /*int source_array[], sourcePos, destination_array[], destPos, len;

            source_array = source;

            sourcePos = 0;

            destination_array = destination;

            destPos = 0;

            len = 5;*/


        System.out.println("Source array ");

        for (int i = 0; i < source.length; i++) {
            System.out.println(source[i]);
        }

        // System.out.println("Source position : " + sourcePos);


        System.out.println("Destination array ");

        for (int i = 0; i < destination.length; i++) {
            System.out.println(destination[i]);
        }


        // System.out.println("DEstination position : " + destPos);


        System.arraycopy(source, 0, destination, 0, 5);

        System.out.println("Final array : ");

        for (int i = 0; i < destination.length; i++) {
            System.out.println(destination[i]);
        }

        //Write a program that reads an unspecified number of scores and determines how many scores are above or equal to the average
        //and how many scores are below the average. Enter a negative number to signify the end of the input. Assume that the maximum
        //number of scores is 100.

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students : ");
        int numberOfStudents = input.nextInt();
        int[] scores = new int[numberOfStudents];
        System.out.println("Enter " + numberOfStudents + " scores : ");
        int total = 0;
        for (int i = 0; i < scores.length; i++) {
            scores[i] = input.nextInt();
            total += scores[i];
        }
        int average = total / numberOfStudents;
        int count = 0;
        int belowAverage = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= average) {
                count++;
            }
            if (scores[i] < average) {
                belowAverage++;
            }

        }
            System.out.println("The average is : " + average);
            System.out.println("The number of students above or equal to the average is " + count);
            System.out.println("The number of students below the average is " + belowAverage);


        }
        public static void discount()
    }
