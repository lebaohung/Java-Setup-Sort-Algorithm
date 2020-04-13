public class Main {
    public static void main(String[] args) {
        int[] arr1 = {12, 78, 56, 54, 27, 86, 53, 49, 50};
        int[] arr2 = {12, 78, 56, 54, 27, 86, 53, 49, 50};
        int[] arr3 = {12, 78, 56, 54, 27, 86, 53, 49, 50};
        SelectionSort test1 = new SelectionSort(arr1);
        BubbleSort test2 = new BubbleSort(arr2);
        InsertionSort test3 = new InsertionSort(arr3);
        test1.sort();
        test2.sort();
        test3.sort();
        for (int i : arr1) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : arr2) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : arr3) {
            System.out.print(i + " ");
        }
    }
}
