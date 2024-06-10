package lab_11;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите вводные данные: ");
        int size = scanner.nextInt();

        int[] arr1 = new int[size];
        int[] arr2 = new int[size];

        Random random = new Random();

        for (int i = 0; i < size; i++) {
            arr1[i] = random.nextInt(200);
            arr2[i] = random.nextInt(200);
        }

        System.out.println("Массив arr1: " + Arrays.toString(arr1));
        System.out.println("Массив arr2: " + Arrays.toString(arr2));

        int[] resultArr = numbersMatches(arr1,arr2);
        System.out.println("Массив resultArr: " + Arrays.toString(resultArr));
    }

    public static int[] numbersMatches(int[] numbersArray1, int[] numbersArray2){
        return Arrays.stream(numbersArray1)
                .filter(x-> Arrays.stream(numbersArray2)
                        .anyMatch(y -> x == y))
                .toArray();
    }
}
