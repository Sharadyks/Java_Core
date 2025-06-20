package Arrays;

public class MaxandMin {
    public static void main(String[] args) {
        System.out.println("Welcome to max and min finder");
        int[] numArray = ArrayUtility.inputArray();
        int max = maxnum(numArray);
        int min = minnum(numArray);
        System.out.println("The maximum number is " + max);
        System.out.println("The minimum number is " + min);
    }

    public static int maxnum(int[] numArray){
        int i = 0;
        int a = 0;
        while (i<numArray.length){
            if (a < numArray[i]) {
                a = numArray[i];
            }
            i++;
        }
        return a;
    }

    public static int minnum(int[] numArray){
        int i = 0;
        int b = maxnum(numArray);
        while (i<numArray.length){
            if (b > numArray[i]) {
                b = numArray[i];
            }
            i++;
        }
        return b;
    }

}
