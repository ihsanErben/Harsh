
public class Harsh {

    int size;
    Node[] dizi;

    public Harsh(int size) {
        this.size = size;
        dizi = new Node[size];
        for (int i = 0; i < size; i++) {
            dizi[i] = new Node();
        }
    }

    public void add(String isim, int data) {
        Node newNode = new Node(isim, data);
        int index = (data % size);
        Node tmp = dizi[index];
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        tmp.next = newNode;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            Node tmp = dizi[i];
            tmp = tmp.next;
            while (tmp != null) {
                System.out.print(tmp.isim + ", " + tmp.data + " ///// ");
                tmp = tmp.next;
            }
            System.out.println("");
        }
    }
    
    public void remove(int data){
        int index = (data % size);
        Node tmp = dizi[index];
        Node tmp2 = dizi[index];
       
        while(tmp != null){
            if(data == tmp.data){
                tmp2.next = tmp2.next.next;
                return;
            }
            tmp2 = tmp;
            tmp = tmp.next;
        }
        System.out.println("There is no avaliable " + data);
    }
}
