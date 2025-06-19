package Arrays;

public class SumandAverage {
    public static void main(String[] args) {
        int[] numArray = ArrayUtility.inputArray();
        long sum = sumArray(numArray);
        int avg = avgArray(numArray);
        System.out.println("The sum of elements is : " + sum);
        System.out.println("The average of elements is : " + avg);

    }

    public static long sumArray(int[] numArray){
        int i = 0;
        int a = 0;
        while (i< numArray.length){
            a += numArray[i];
            i++;
        }
        return a;
    }

    public static int avgArray(int[] numArray){
        int i = 0;
        int a = 0;
        while (i< numArray.length){
            a += numArray[i];
            i++;
        }
        a = a/5;
        return a;
    }
}
