package ss30_comparator_comparable;

//Comparator & Comparable

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(-10);
        list.add(50);
        list.add(-55);
        list.add(100);

        // Collections.sort(list);//Sắp xếp tăng dần
        Collections.sort(list, Collections.reverseOrder());//Sắp xếp giảm dần
        System.out.println(list);
    }
}
