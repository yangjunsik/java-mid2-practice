package generic.ex1;

public class BoxMain2 {
    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.set(10);
        Integer integer = (Integer) integerBox.get();
        System.out.println(integer);

        ObjectBox stringBox = new ObjectBox();
        stringBox.set("hello");
        String string = (String) stringBox.get();
        System.out.println(string);

        //잘못된 타입의 인수 전달시
        integerBox.set("10");
        Integer integer2 = (Integer) integerBox.get(); // String -> Integer캐스팅
        System.out.println(integer2); //오류 발생
    }
}
