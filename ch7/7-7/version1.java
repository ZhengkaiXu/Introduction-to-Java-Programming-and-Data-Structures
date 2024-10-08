public static int binarySearch(int[] list, int key) {
    int low = 0;
    int high = list.length - 1;

    int mid = (low + high) / 2;
    if (key < list[mid]) {
        high = mid - 1;
    } else if (key == list[mid]) {
        return mid;
    } else {
        low = mid + 1;
    }
}
