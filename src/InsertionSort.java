public class InsertionSort {
    int[] a;

    public InsertionSort(int[] a) {
        this.a = a;
    }

    public void sort() {
        for (int i = 1; i < a.length; i++) {
            int temp = a[i];
            int j;
            for (j = i - 1; j >= 0 && temp < a[j]; j --) {
                a[j + 1] = a[j];
            }
            a[j+1] = temp;
        }
    }
}
