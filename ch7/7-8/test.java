public class test {
    public static void main(String[] args) {
        double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};
        SelectionSort.selectionSort(list);

        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }
}
