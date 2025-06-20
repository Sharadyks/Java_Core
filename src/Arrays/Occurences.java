package Arrays;

import java.util.Scanner;

public class Occurences {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to occurences in java");
        int [] numArray = ArrayUtility.inputArray();
        System.out.println("Enter the number you want to find : ");
        int num = input.nextInt();
        int occ = noOfOccurence(numArray,num);
        System.out.println("Your number is found " + occ + " times in array");

    }

    public static int noOfOccurence(int[] numArray, int num){
        int i = 0;
        int occ = 0;
        while (i<numArray.length){
            if (numArray[i] == num){
                occ++;
            }
            i++;
        }
        return occ;
    }
}
