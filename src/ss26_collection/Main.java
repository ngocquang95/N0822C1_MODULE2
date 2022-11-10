package ss26_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

/**
 * Collection
 *
 * Array
 * - Kích thước cố định
 * - Thêm xóa sửa khó khăn
 * - Chỉ có một thuộc tính length duy nhất
 *
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 4, 4, -100};


        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(99);//capacity = 10, size = 1
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);

        Collections.sort(arrayList, Collections.reverseOrder());

        System.out.println(arrayList);
    }
}
