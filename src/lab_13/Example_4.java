package lab_13;

public class Example_4 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("Ошибка");
        } catch (Exception e) {
            System.out.println("1");
        }
        System.out.println("2");
    }
}
