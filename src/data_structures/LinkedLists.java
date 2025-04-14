package data_structures;

import java.util.LinkedList;
import java.util.List;

public class LinkedLists {

    public static void main(String[] args) {

        List<String> languages = new LinkedList<>();

        //  Insertion
        languages.add("HTML");
        languages.add("CSS");
        languages.add("JS");

        //  Deletion
        languages.remove(0);
        languages.remove("JS");

        //  Retrieval
        languages.get(0);

        //  Other Methods
        languages.indexOf("Java");

        //  LinkedList Implementations
        LinkedList<String> jobsLL = new LinkedList<>();
        //  Stack
        jobsLL.push("Web Developer");
        jobsLL.pop();
        //  Queue
        jobsLL.offer("Web Developer");
        jobsLL.poll();

//        jobsLL.addFirst("Software Developer");
//        jobsLL.addLast("Mobile Developer");
//        jobsLL.getFirst();
//        jobsLL.getLast();
//        jobsLL.offerFirst("Software Developer");
//        jobsLL.offerLast("Mobile Developer");
//        jobsLL.peekFirst();
//        jobsLL.peekLast();
    }
}
