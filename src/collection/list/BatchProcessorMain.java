package collection.list;

public class BatchProcessorMain {
    public static void main(String[] args) {
        //MyArrayList list = new MyArrayList();
        MyLinkedList list = new MyLinkedList();

        BatchProcessor batchProcessor = new BatchProcessor(list);
        batchProcessor.logic(50_000);
    }
}
