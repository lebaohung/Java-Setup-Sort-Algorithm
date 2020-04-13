public class BubbleSort {
    int[] a;

    public BubbleSort(int[] a) {
        this.a = a;
    }

    public void sort() {
        boolean needNextPass = true;
        for (int i = a.length - 1; i > 0 && needNextPass; i--) {
            needNextPass = false;
            for (int j = 0; j < i; j++) {
                if (a[j] > a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    needNextPass = true;
                }
            }
        }
    }
}
