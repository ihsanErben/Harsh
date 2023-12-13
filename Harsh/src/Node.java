
public class Node {

    int data;
    String isim;

    Node next;

    public Node(String isim, int data) {
        this.data = data;
        this.isim = isim;
    }

    public Node() {
    }

    public int getData() {
        return data;
    }

    public String getIsim() {
        return isim;
    }
}
