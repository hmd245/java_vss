package d14_thuat_toan;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 5, 8, 0, 3, 27, 50};
        System.out.println("Index: "+ linearSearch(arr1, 8));
    }

    // Hàm tìm kiếm tuần tự
    public static int linearSearch(int[] array, int value) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (value == array[i]){
                index = i;
                System.out.println("Value: " + array[i]);
                break;
            }
        }
        return index;
    }
}
