public class LinearSearch {
    /** The method for finding a key in the list */
    public static int linearSearch(int[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            if (key == list[i]) {
                return i;
            }
        }

        return -1;
    }


//    public static void main(String[] var0) {
//        int[] var1 = new int[]{1, 4, 4, 2, 5, -3, 6, 2};
//        int var2 = linearSearch(var1, 4);
//        int var3 = linearSearch(var1, -4);
//        int var4 = linearSearch(var1, -3);
//        System.out.println(var2);
//        System.out.println(var3);
//        System.out.println(var4);
//    }
}
