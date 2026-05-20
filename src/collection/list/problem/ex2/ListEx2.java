package collection.list.problem.ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> integerList = new ArrayList<>();

        System.out.println("n개의 정수를 입력하세요 (종료 0)");
        while (true) {
            int temp = sc.nextInt();
            if (temp == 0)
                break;

            integerList.add(temp);
        }

        System.out.println("출력");
        for (int i : integerList) {
            if (i == integerList.getLast())
                System.out.print(i);
            else
                System.out.print(i + ", ");

        }

    }
}
