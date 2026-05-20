package collection.set;

import java.util.*;

public class JavaSetMain {
    public static void main(String[] args) {
        run(new HashSet<>());
        run(new LinkedHashSet<>());
        run(new TreeSet<>());
    }

    private static void run(Set<String> set) {
        System.out.println("set = " + set.getClass());
        set.add("a");
        set.add("b");
        set.add("1");
        set.add("c");
        set.add("2");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
        System.out.println();

    }
}
