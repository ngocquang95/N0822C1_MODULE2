package ss30_comparator_comparable;

//Comparator & Comparable

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(3, "Nguyễn Văn C", 9.3));
        list.add(new Student(1, "Nguyễn Văn A", 7.2));
        list.add(new Student(2, "Nguyễn Văn B", 9.0));
        list.add(new Student(2, "Nguyễn Văn X", 5.1));
        list.add(new Student(2, "Nguyễn Văn Y", 8.0));
        list.add(new Student(4, "Nguyễn Văn D", 5));
        //Sắp xếp theo id tăng dần, nếu id trùng nhau thì sắp xếp điểm tăng dần

        Collections.sort(list);//Sắp xếp tăng dần
//        Collections.sort(list, Collections.reverseOrder());//Sắp xếp giảm dần
        System.out.println(list);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("========= Menu =========");
            System.out.println("1. Sắp xếp theo id tăng dần, nếu id trùng nhau thì sắp xếp điểm tăng dần");
            System.out.println("2. Sắp xếp theo tên giảm dần");
            System.out.println("3. Sắp xếp theo điểm tăng dần");
            System.out.println("4. Thoát");

            System.out.printf("Nhập vào lựa chọn của bạn: ");
            int chose = scanner.nextInt();

            switch (chose) {
                case 1:
                    Collections.sort(list);//Sắp xếp tăng dần
                    System.out.println(list);
                    break;
                case 2:
                    Collections.sort(list, new NameComparator());
                    System.out.println(list);
                    break;
                case 3:
                    Collections.sort(list, new ScoreComparator());
                    System.out.println(list);
                    break;
                default:
                    return;
            }
        }


    }
}
