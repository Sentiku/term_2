package lab_13;

public class Example_10 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new NullPointerException("Ошибка");
        } catch (NullPointerException e) {
            System.out.println("1");
        } finally {
            System.out.println("2");
        }
        System.out.println("3");
    }
}
