public class test {
    public static void main(String[] args) {
        int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        int i = BinarySearch.binarySearch(list, 2); // Returns 0
        int j = BinarySearch.binarySearch(list, 11); // Return 4
        int k = BinarySearch.binarySearch(list, 12); // Return -6
        int l = BinarySearch.binarySearch(list, 1); // Return -1
        int m = BinarySearch.binarySearch(list, 3); // Return -2

        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(l);
        System.out.println(m);
    }
}
