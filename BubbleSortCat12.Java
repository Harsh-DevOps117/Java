public class BubbleSortCat12 {

    public static void main(String[] args) {
        int[] p = {1, 257, 234, 5476, 213456, 5436};
        bubbleSort(p);
        System.out.println("Sorted array:");
        for (int num : p) {
            System.out.print(num + " ");
        }
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
