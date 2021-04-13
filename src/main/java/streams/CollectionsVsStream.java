package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionsVsStream {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Unnathi");
        names.add("Unnathi two");

        // names.remove("unnathi two");

        System.out.println(names);

        List<String> listStream = names.stream().collect(Collectors.toList());
        System.out.println(listStream);

    }
}
