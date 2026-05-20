package collection.set.problem.ex1;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class UniqueNamesTest2 {
    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};
        Set<Integer> set = new LinkedHashSet<>(List.of(inputArr));

        // 코드 작성
        for (Integer s : set) System.out.println(s);
    }
}
