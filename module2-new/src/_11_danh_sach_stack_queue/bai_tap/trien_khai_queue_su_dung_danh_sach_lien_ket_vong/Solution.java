package _11_danh_sach_stack_queue.bai_tap.trien_khai_queue_su_dung_danh_sach_lien_ket_vong;



public class Solution {
    // tạo hàm enqueue thực hienj chèn phần tử vào queue
    public static void enqueue(Queue queue, int value) {

        // tạo node mới thêm giá trị vào node
        Node temp = new Node();
        temp.data = value;

        // kiểm tra hàng đợi trống hay ko nếu trống thì front=rear=node mơi(temp)
        if (queue.front == null)
            queue.front = temp;

        // nếu false rear = node vừa tạo, và node rear luôn chứa địa chỉ của node front
        else
            queue.rear.link = temp;

        queue.rear = temp;     // rear= node vưa tạo
        queue.rear.link = queue.front;     // node rear chưa địa chỉ front
    }

    // hàm thực hiện lấy ra 1 phần tử
    public static Object dequeue(Queue queue) {
        // kiểm tra queue có trống ko ,front == null thì trả về null
        if (queue.front == null) {
            return null;
        }
        Object value;
        //Kiểm tra Front == Rear hay không. Nếu true gán Front = Rear = null, ( tức chỉ có 1 phàn tử)
        if (queue.front == queue.rear) {
            value = queue.front.data;
            queue.front = null;
            queue.rear = null;
        } else {
            Node temp =  queue.front;
            value = temp.data;
            queue.front =  queue.front.link;
            queue.front.link =  queue.front;
        }
        return value;
    }
    public static void displayQueue(Queue queue){
        Node  temp = queue .front;
        System.out.println("các phần tử trong hàng đợi là");
        while (temp.link != queue .front) {
            System.out.println(temp.data);
            temp = temp.link;
        }
        System.out.println(temp.data);
    }



    public static void main(String[] args) {
        Queue  queue = new Queue();

        //Thêm phần tử vào cuối Queue
        enqueue(queue,100);
        enqueue(queue,99);
        enqueue(queue,11);
        enqueue(queue,15);
        enqueue(queue,77);
        displayQueue(queue);

        //Xóa phần tử đầu của Queue
        System.out.println();
        System.out.print("Giá trị cần xóa = " + dequeue(queue));
       // System.out.println("Giá trị cần xóa = " + dequeue(queue));
    }



}
