package _11_danh_sach_stack_queue.ly_thuyet;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {
    public static void main(String[] args) {
        Queue myQueue = new LinkedList();
        myQueue.add(1);
       myQueue.add(2);
        myQueue.add(3);
        myQueue.add(4);
        System.out.println(myQueue.peek());
     //   myQueue.remove();
      //  myQueue.poll();

    //    while (!myQueue.isEmpty()){
    //        System.out.println(myQueue.poll());
    //    }
    }
}