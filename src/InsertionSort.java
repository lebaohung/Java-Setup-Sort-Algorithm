public class InsertionSort {
    int[] a;

    public InsertionSort(int[] a) {
        this.a = a;
    }

    public void sort() {
        for (int i = 1; i < a.length; i++) {
            int temp = a[i];
            for (int j = i - 1; j >= 0; j --) {
                if (temp < a[j]) a[j+1] = a[j];
                else {
                    a[j+1] = temp;
                    break;
                }
            }
        }
    }
}
