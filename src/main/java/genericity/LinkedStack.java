package genericity;

public class LinkedStack<T> {

    public static class Node<U> {
        U item;
        Node<U> next;

        public Node() {
            item = null;
            next = null;
        }

        public Node(U item, Node<U> next) {
            this.item = item;
            this.next = next;
        }

        boolean end() {
            return item == null && next == null;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "item=" + item +
                    ", next=" + next +
                    '}';
        }
    }

    private Node<T> top = new Node<T>();
    public void push(T item) {
        top = new Node<T>(item, top);
    }

    public T pop() {
        T result = top.item;
        if (!top.end()) {
            top = top.next;
        }
        return result;
    }

    @Override
    public String toString() {
        return "LinkedStack{" +
                "top=" + top +
                '}';
    }

    public static void main(String[] args) {
        LinkedStack<String> lss = new LinkedStack<>();
        String[] s1 = "phasers on stun!".split(" ");
        for (String s : s1) {
            lss.push(s);


        }
        System.out.println(lss);
        String pop = lss.pop();
        System.out.println(pop);
        System.out.println(lss);
    }
}

class demo {
    public static void main(String[] args) {
        LinkedStack.Node<String> stringNode = new LinkedStack.Node<>();
        stringNode.item = "qqqqq";
        System.out.println(stringNode);
    }
}
