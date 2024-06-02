package lab_09;

public class Example_8_List {
    private Example_8_LinkedList head = null;

    private boolean Empty() {
        return head == null;
    }

    public void createHead(int data) {
        for (int i = 0; i <= data; i++) {
            Example_8_LinkedList temp = new Example_8_LinkedList(i);
            temp.next = head;
            head = temp;
        }
    }

    public void createTail(int data) {
        for (int i = data; i >= 0; i--) {
            Example_8_LinkedList temp = new Example_8_LinkedList(i);
            temp.next = head;
            head = temp;
        }
    }

    public void print() {
        Example_8_LinkedList temp = head;

        while (temp != null) {
            System.out.print("->" + temp.data);
            temp = temp.next;
        }
    }

    public String toString() {
        String emptyHead = "";
        Example_8_LinkedList temp = head;
        while (temp != null) {
            emptyHead = emptyHead + temp.data + " ";
            temp = temp.next;
        }
        return emptyHead;
    }

    public void addFirst(int data) {
        Example_8_LinkedList temp = new Example_8_LinkedList(data);
        temp.next = head;
        head = temp;
    }


    public void addLast(int data) {
        Example_8_LinkedList temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Example_8_LinkedList(data);
    }

    public void Insert(int index, int value) {
        Example_8_LinkedList temp = head;
        for (int i = 0; i <= index - 1; i++) {
            temp = temp.next;
        }
        // создаем промежут. звено - копию текущего
        Example_8_LinkedList current = new Example_8_LinkedList(temp.data);
        current.next = temp.next;
        // меняем значение текущего звена, т.е. замена на требуемое значение.
        temp.data = value;
        temp.next = current;
    }

    public void RemoveFirst() {
        head = head.next;
    }

    public void RemoveLast() {
        Example_8_LinkedList prev = head;
        Example_8_LinkedList temp = head.next;
        while (temp.next != null) {
            prev = prev.next;
            temp = temp.next;
        }
        prev.next = null;
    }

    public void Remove(int index) {
        Example_8_LinkedList temp = head;
        for (int i = 0; i <= index - 1; i++) {
            temp = temp.next;
        }
        temp.data = temp.next.data;
        temp.next = temp.next.next;
    }

    private void createNodesHeadRecursive(Example_8_LinkedList current, int data) {
        if (current.data < data) {
            Example_8_LinkedList next = new Example_8_LinkedList(current.data + 1);
            current.next = next;
            createNodesHeadRecursive(next, data);
        }
    }

    public void createHeadRec(int data) {
        head = new Example_8_LinkedList(0);
        createNodesHeadRecursive(head, data);
    }

    private void createNodesTailRecursive(Example_8_LinkedList prev, int current, int data) {
        if (current <= data) {
            Example_8_LinkedList node = new Example_8_LinkedList(current);
            if (head == null) {
                head = node;
            } else {
                prev.next = node;
            }
            createNodesTailRecursive(node, current + 1, data);
        }
    }

    public void createTailRec(int data) {
        createNodesTailRecursive(head, 0, data);
    }

    private String toStringRecHelper(Example_8_LinkedList node) {
        if (node == null) {
            return "";
        }
        return node.data + " " + toStringRecHelper(node.next);
    }

    public String toStringRec() {
        return toStringRecHelper(head);
    }

}
