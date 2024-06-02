package lab_09;
import java.util.Scanner;
public class Example_3 {
        public static int[] arr = new int[5];
        static Scanner in = new Scanner(System.in);
        private static int x = 0;
        private static int c = 0;
        public static int[] Mass(int n) {
            if (x == n) return arr;
            else {
                System.out.print("Введите " + (x + 1) + " элемент массива: ");
                arr[x++] = in.nextInt();
            }
            return Mass(n);
        }

        public static void main(String[] args) {
            int [] out = Mass(5);
            System.out.println(outMass(out));
        }
        public static String outMass(int[] in) {
            if ( c == in.length) {
                return "";
            } else {
                c++;
                System.out.print((in[c-1]) + " ");
                return outMass(in);
            }
        }
}

