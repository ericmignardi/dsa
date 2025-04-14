package data_structures;

import java.util.Stack;

public class Stacks {

    public static void main(String[] args) {

        //  LIFO: Last In, First Out
        Stack<String> cats = new Stack<>();

        //  Insertion
        cats.push("Bubs");
        cats.push("Tadoe");
        cats.push("Leon");

        //  Deletion
        String lastIn = cats.pop();

        //  Retrieval

        // Other Methods
        cats.peek();
        cats.search("Tadoe");
        cats.empty();
    }
}
