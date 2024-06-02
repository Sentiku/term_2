package lab_09;

public class Example_5 {
    public static void main(String[] args) {
        Example_4_node head = null;
        for (int i=9; i >= 0; i--){
            head = new Example_4_node(i,head);
        }
        Example_4_node ref = head;
        while (ref != null){
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
    }
}
