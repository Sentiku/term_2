package lab_11;

import java.util.Arrays;
import java.util.Random;

public class Task_1 {
    public static void main(String[] args) {

        Random random = new Random();
        int[] numbersArray = new int[10];
        System.out.println("\n" + "Массив до: " + "\n");
        for (int i = 0; i < 10; i++) {
            numbersArray[i] = random.nextInt();
            System.out.println(numbersArray[i]);
        }
        int[] arrayAfter = evenNumbers(numbersArray);
        System.out.println("\n" + "Массив после: " + "\n");
        for (int i : arrayAfter) {
            System.out.println(i);
        }
    }

    public static int[] evenNumbers(int[] numbersArray){
        return Arrays.stream(numbersArray).filter(x -> x % 2 == 0).toArray();
    }
}
