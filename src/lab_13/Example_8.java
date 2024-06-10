package lab_13;

public class Example_8 {
    public static int m() {
        try {
            System.out.println("0");
            return 55;    // выход и метода
        } finally {
            System.out.println("1");
        }
    }

    public static void main(String[] args) {
        System.out.println(m());
    }
}
