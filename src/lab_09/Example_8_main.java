package lab_09;

public class Example_8_main {
    public static void main(String[] args) {
        Example_8_List createHead = new Example_8_List();
        createHead.createHead(10);
        System.out.println(createHead);

        Example_8_List createTail = new Example_8_List();
        createTail.createTail(10);
        System.out.println(createTail);

        createHead.addFirst(12);
        System.out.println(createHead.toString());

        createHead.addLast(-3);
        System.out.println(createHead.toString());

        createTail.Insert(5,221);
        System.out.println(createTail.toString());

        createTail.RemoveFirst();
        System.out.println(createTail.toString());

        createTail.RemoveLast();
        System.out.println(createTail.toString());

        createTail.Remove(4);
        System.out.println(createTail.toString());

        Example_8_List CreateHeadRec = new Example_8_List();
        CreateHeadRec.createHeadRec(10);
        System.out.println(CreateHeadRec.toStringRec());

        Example_8_List CreateTailRec = new Example_8_List();
        CreateTailRec.createTailRec(10);
        System.out.println(CreateTailRec.toStringRec());

        System.out.println(CreateTailRec.toStringRec());

    }
}
