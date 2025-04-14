package data_structures;

import java.util.*;

public class Queues {

    public static void main(String[] args) {

        //  FIFO: First In, First Out
        Queue<String> namesPQ = new PriorityQueue<>(); // Ascending Order (1, 2, 3, "Eric", "Norma")
//        Queue<String> namesReversePQ = new PriorityQueue<>(Collections.reverseOrder());
        Queue<String> namesAD = new ArrayDeque<>();
        Queue<String> namesLL = new LinkedList<>();

        //  Insertion
        namesPQ.offer("John");
        namesPQ.offer("Norma");
        namesPQ.offer("Eric");

        //  Deletion
        String firstIn = namesPQ.poll();

        //  Retrieval

        //  Other Methods
        namesPQ.peek();
        namesPQ.isEmpty();
        namesPQ.size();
        namesPQ.contains("Eric");
    }
}
