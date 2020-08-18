class ArrayWillBeSorted {
    private final int[] array;

    public ArrayWillBeSorted(int[] array) {
        this.array = array;
    }

    public void sort(int[] array, int lowerBound, int upperBound) {
        int[] tempArray = new int[array.length];
        if (lowerBound < upperBound) {
            int mid = (lowerBound + upperBound) / 2;

            sort(tempArray, lowerBound, mid);
            sort(tempArray, mid + 1, upperBound);
            merge(tempArray, lowerBound, mid + 1, upperBound);
        }
    }

    private void merge(int[] tempArray, int low, int high, int upperBound) {
        int i = 0;
        int lowerBound = low;
        int mid = high - 1;
        int j = upperBound - lowerBound + 1;

        while (low <= mid && high <= upperBound) {
            if (array[low] < array[high]) {
                tempArray[i++] = array[low++];
            } else tempArray[i++] = array[high++];
        }

        while (low <= mid) {
            tempArray[i++] = array[low++];
        }

        while (high <= upperBound) {
            tempArray[i++] = array[high++];
        }

        for (i = 0; i < j; i++) {
            array[lowerBound + i] = tempArray[i];
        }

    }

    @Override
    public String toString() {
        StringBuilder arr = new StringBuilder();
        for (int j : array) {
            arr.append(j).append(" ");
        }
        return String.valueOf(arr);
    }
}
