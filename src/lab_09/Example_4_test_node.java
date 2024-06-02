package lab_09;

public class Example_4_test_node {
    public static void main(String[] args) {
        Example_4_node head = null;
        for (int i = 9; i >= 0; i--){
            head = new Example_4_node(i, head);
        }
        Example_4_node ref = head;
        while (ref != null){
            System.out.println(" " + ref.value);
            ref = ref.next;
        }

        Example_4_node newExample4node = new Example_4_node(44,null);
        ref = head;
        int k = 1;
        while (ref.next != null && (k<2)){
            ref = ref.next;
            k++;
        }
        newExample4node.next = ref.next.next;
        ref.next = newExample4node;
    }
}
