
//queue interface
//1-linked list , 2- priority queue , 3- deque

//fifo

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class java_collections_2 {

    // mimplementing queue

    static void queueExamples() {
        LinkedList<Integer> q = new LinkedList<>();
        q.offer(2);
        q.offer(3);
        q.offer(6);
        q.offer(9);

        System.out.println(q); // [2, 3, 6, 9]
        System.out.println(q.peek()); // 2 first ele

        // removing ele
        System.out.println(q.poll()); // 2
        System.out.println(q); // [3, 6, 9]

        // checking empty
        System.out.println(q.isEmpty()); // false

        // checking size
        int a = q.size();
        System.out.println(a); // 3

    }

    // implimenting priority queue
    // here procrssing based on priority
    // initially priority based on min number
    // min element always comes on the front

    static void MINpriorityQueueExamples() {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(5);
        pq.add(7);

        System.out.println(pq); // [5, 10, 7]

        // peek
        System.out.println(pq.peek()); // 5

        // removing ele
        System.out.println(pq.poll());

        System.out.println(pq);// [7,10 ]
        System.out.println(pq.peek()); // 7

    }

    // min priority queue

    static void MAXpriorityQueueExamples() {

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(10);
        pq.add(5);
        pq.add(7);

        System.out.println(pq); // [10, 5, 7]

        // peek
        System.out.println(pq.peek()); // 10

        // removing ele
        System.out.println(pq.poll()); // 10

        System.out.println(pq);// [7 , 5]
        System.out.println(pq.peek()); // 7

    }

    // implementing deque
    // deque => doubly ended queue
    static void DoublyEndedQueueExamples() {
        Deque<Integer> dq = new ArrayDeque<>();
        dq.addFirst(3);
        dq.addFirst(6);
        System.out.println(dq); // [6, 3]

        dq.addLast(11);

        System.out.println(dq); // [6, 3, 11]

        System.out.println(dq.peekFirst()); // 6
        System.out.println(dq.peekLast()); // 11

        System.out.println(dq.pollFirst()); // 6
        System.out.println(dq); // [3, 11]

        System.out.println(dq.pollLast()); // 11
        System.out.println(dq); // [11]

    }

    public static void main(String[] args) {
        // queueExamples();
        // MINpriorityQueueExamples();
        // MAXpriorityQueueExamples();

        DoublyEndedQueueExamples();

    }

}
