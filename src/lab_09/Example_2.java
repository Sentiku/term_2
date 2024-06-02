package lab_09;

import java.util.Scanner;

public class Example_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int result = in.nextInt();
        toBinary(result);
    }
    public static void toBinary(int num) {
        int result = num / 2;
        int remainder = num % 2;
        if (result <= 0){
            System.out.println("Введено неверное число");
        }
        if (result >0){
            toBinary(result);
            System.out.print(remainder);
        }

    }
}