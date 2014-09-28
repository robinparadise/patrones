package es.upm.miw.pd.iterator.linkedList;

public class LinkedListHandler {
    public LinkedList list;

    public LinkedListHandler(LinkedList list) {
        assert list != null;
        this.list = list;
    }

    public int size() {
        LinkedList node = list;
        int count = 1;
        while (!node.isLast()) {
            node = node.getNext();
            count++;
        }
        return count;
    }
    
    public int sum(){
        LinkedList node = list;
        int total= node.getValue();
        while (!node.isLast()) {
            node = node.getNext();
            total += node.getValue();
        }
        return total;
    }
}
