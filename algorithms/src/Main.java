public class Main {
    public static void main(String[] args) {
        SingleLinkedList<Integer> list = new SingleLinkedList<>();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);

        list.addNodeInside(4, 2);
        list.addNodeInside(5, 10);
        System.out.println(list.delNode(4));
        System.out.println(list.delNode(1));
        list.printAll();
    }
}