package maxheap;

public class MaxHeap {

    public static void main(String[] args) {
        Heap heap = new Heap();
        for (int i = 1; i <= 3; i++) {
            heap.maxHeapInsert(i);
        }
        heap.printInOrder(heap.root);
        heap.printPreOrder(heap.root);
        heap.printPostOrder(heap.root);

    }

}
