import java.util.*;

public class HomeWork1 {

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        String[] arrStr = new String[]{"1", "2", "3", "4", "5", "6", "7"};
        List<Integer> arrList = new ArrayList<>(List.of((arr)));
        swap(arr, 3, 5);
        swap(arrStr, 3, 5);
        listToArr(arrList);
    }

    private static <T> void listToArr(List<T> arrList) {
        Object[] arr = arrList.toArray();
        System.out.println();
        System.out.println(Arrays.toString(arr));
    }

    public static <T> void swap(T[] arr, int indexA, int indexB) {
        T t = arr[indexA];
        arr[indexA] = arr[indexB];
        arr[indexB] = t;
        System.out.println(Arrays.toString(arr));
    }


}
