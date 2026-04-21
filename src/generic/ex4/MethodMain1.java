package generic.ex4;

public class MethodMain1 {
    public static void main(String[] args) {
        Integer i = 10;
        Object object = GenericMethod.objMethod(i);

        System.out.println("명시적 타입 인자 전달");
        Integer result = GenericMethod.<Integer>genericMethod(i);
        Integer result2 = GenericMethod.<Integer>genericNumberMethod(i);

        System.out.println("타입 추론");
        Integer result3 = GenericMethod.genericMethod(i);
        Integer result4 = GenericMethod.genericNumberMethod(i);
    }
}
