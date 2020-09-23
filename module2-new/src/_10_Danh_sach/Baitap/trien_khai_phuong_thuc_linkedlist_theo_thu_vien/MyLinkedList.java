package _10_Danh_sach.Baitap.trien_khai_phuong_thuc_linkedlist_theo_thu_vien;

public class MyLinkedList<E> {
    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }

    }
    // phần tử đầu tiên của danh sách liên kết

    private Node head;
    // số luongj phần tử có trong danh sách
    private int numNode = 0;

    public MyLinkedList() {
    }

    public void addFirst(E element) {
        // khai báo 1 biến là temp tham chiếu đến giá trị của head
        Node temp = head;
        //Biến head sẽ nhận giá trị là 1 node mới
        head = new Node(element);
        //head.next trỏ đến temp
        head.next = temp;
        numNode++;
    }

    public void addlast(E element) {
        // khai bao biến temp trỏ đến head
        Node temp = head;
        // sẽ cho con trỏ chạy đến phàn tử cuối của danh sách
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(element);
        numNode++;
    }

    public void add(int index, E element) {
        // khai báo biến temp trỏ đến head
        Node temp = head;
        // khai báo 1 node là Holder
        Node holder;

        // cho con trỏ chạy đến vị trí index-1

        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        //cho holder tham chiếu đến vị tri  index
        holder = temp.next;
        //Node tại vị trí index-1 sẽ trỏ đến node mới
        temp.next = new Node(element);
        //node mới sẽ trỏ đến holder
        temp.next.next = holder;
        //tăng số lượng trong danh sách lên 1
        numNode++;
    }

    public Object get(int index) {
        // khai báo biến temp trỏ tới head
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    public int size() {
        return numNode;
    }

    public E remove(int index) {
        if (index < 0 || index > numNode) {
            throw new IllegalArgumentException("error index: " + index);
        }
        // khai báo bien temp trỏ đến head
        Node temp = head;
        Object data;
        // neu index = 0 thi sẽ trả về data hientai
        if (index == 0) {
            data = temp.data;
            head = head.next;
            numNode--;
        } else {
            for (int i = 0; i < index - 1 && temp.next != null; i++) {
                temp = temp.next;
            }
            data = temp.next.data;
            temp.next = temp.next.next;
            numNode--;
        }
        return (E) data;
    }

    public boolean remove(E element) {
        // remove đối tượng nếu element head
        if (head.data.equals(element)) {
            remove(0);
            return true;
        } else {
            // khai báo 1 node temp trỏ đến head
            Node temp = head;
            while (temp.next != null) {
                // nếu tồn tại 1 phần tử có ddataa bằng data truyền vào thì node dó sẽ remove
                if (temp.next.data.equals(element)) {
                    temp.next = temp.next.next;
                    numNode--;
                    return true;
                }
                temp = temp.next;
            }
        }
        return false;
    }

    public MyLinkedList<E> clone() {
        // kiem tra linkedlist có phần tử hhay ko
        if (numNode == 0) {
            throw new NullPointerException("linked null");
        }
        //khai báo linkedlist trả về
        MyLinkedList<E> returnLinkedList = new MyLinkedList<>();
        // khai báo 1 temp trỏ đến head
        Node temp = head;
        // add temp vào danh sách trả về để nó làm head
        returnLinkedList.addFirst((E) temp);
        temp = temp.next;
        while (temp != null) {
            returnLinkedList.addlast((E) temp.data);
            temp = temp.next;
        }
        return returnLinkedList;
    }

    public boolean constains(E element) {
        Node temp = head;
        while (temp.next != null) {
            if (temp.data.equals(element)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int indexof(E element) {
        Node temp = head;
        for (int i = 0; i < numNode; i++) {
            if (temp.getData().equals(element)) {
                return 1;
            }
            temp = temp.next;
        }
        return -1;
    }

    public void clear() {
        Node temp;
        temp = head;
        head = null;
        while (temp.next != null) {
            temp.next = null;
        }
        numNode=0;
    }


}
