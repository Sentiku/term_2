package lab_13;

public class Example_5 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new NullPointerException("Ошибка");
        } catch (ArithmeticException e) {
            System.out.println("1");
        } catch (RuntimeException e) {
            System.out.println("3");
        } catch (Exception e){
            System.out.println("2");
        }
        System.out.println("4");
    }
}
