package lab_13;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        int sum = 0;
        int count = 0;

        for (int i = 0; i < size; i++) {
            int num = i+1;
            System.out.print("Введите " + num + " элемент массива: ");
            try {
                array[i] = scanner.nextInt();
                if (array[i] > 0) {
                    sum += array[i];
                    count++;
                }
            } catch (Exception e) {
                System.out.println("Вычисление прервалось. Начните заполнение снова с другими числами");
                scanner.next();
                i--;
            }
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Среднее арифметическое из введённых элементов: " + average);
        } else {
            System.out.println("Вычисление неудачно.");
        }

        scanner.close();
    }
}
