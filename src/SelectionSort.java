public class SelectionSort {
    int[] arr;

    public SelectionSort(int[] arr) {
        this.arr = arr;
    }

    public void sort() {
        for (int i = 0; i < arr.length - 1; i ++) {
            int currenMinIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[currenMinIndex] > arr[j]) {
                    currenMinIndex = j;
                }
            }
            if (currenMinIndex != i) {
                int temp = arr[i];
                arr[i] = arr[currenMinIndex];
                arr[currenMinIndex] = temp;
            }
        }
    }
}
