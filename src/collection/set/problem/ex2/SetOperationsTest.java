package collection.set.problem.ex2;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetOperationsTest {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(List.of(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(List.of(3, 4, 5, 6, 7));

        //코드 작성
        Set<Integer> temp1 = new HashSet<>(set1);
        temp1.addAll(set2);

        Set<Integer> temp2 = new HashSet<>(set1);
        temp2.retainAll(set2);

        Set<Integer> temp3 = new HashSet<>(set1);
        temp3.removeAll(set2);

        System.out.println(temp1);
        System.out.println(temp2);
        System.out.println(temp3);

    }
}

