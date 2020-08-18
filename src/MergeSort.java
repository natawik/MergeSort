public class MergeSort {
    public static void main(String[] args) {
        int[] array = {5, 2, 4, 6, 1, 3, 2, 6};

        ArrayWillBeSorted arr = new ArrayWillBeSorted(array);

        System.out.println(arr.toString());
        arr.sort(array, 0, array.length - 1);
        System.out.println(arr.toString());
    }
}

