package data_structures;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {

    public static void main(String[] args) {

        List<String> languages = new ArrayList<>();

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

    }
}
