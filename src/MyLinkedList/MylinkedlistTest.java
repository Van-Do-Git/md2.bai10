package MyLinkedList;

public class MylinkedlistTest {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        Mylinkedlist listNums = new Mylinkedlist(10);
        listNums.addFirst(11);
        listNums.addFirst(12);
        listNums.addFirst(13);

        listNums.add(4,9);
        listNums.add(4,9);
        listNums.printList();
    }
}

