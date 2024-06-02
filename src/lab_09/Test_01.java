package lab_09;

public class Test_01 {
    public static void main(String[] args) {
        Example_4_node example4node0 = new Example_4_node(0,null);
        Example_4_node example4node1 = new Example_4_node(1,null);
        Example_4_node example4node2 = new Example_4_node(2,null);
        Example_4_node example4node3 = new Example_4_node(3,null);

        example4node0.next = example4node1;
        example4node1.next = example4node2;
        example4node2.next = example4node3;

        Example_4_node ref = example4node0;
        while (ref != null){
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
    }
}
