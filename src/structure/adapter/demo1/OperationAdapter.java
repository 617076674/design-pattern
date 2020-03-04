package structure.adapter.demo1;

class OperationAdapter implements ScoreOperation {
    private QuickSort sortObj;

    private BinarySearch searchObj;

    public OperationAdapter() {
        sortObj = new QuickSort();
        searchObj = new BinarySearch();
    }

    public int[] sort(int array[]) {
        return sortObj.quickSort(array);
    }

    public int search(int array[], int key) {
        return searchObj.binarySearch(array, key);
    }
}