package collection.set.hash;

public class HashStart1 {
    public static void main(String[] args) {
        Integer[] arr = new Integer[4];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 5;
        arr[3] = 8;

        int searchValue = 8;
        for (int inputValue : arr) {
            if (inputValue == searchValue) {
                System.out.println(inputValue);
            }
        }
    }
}
