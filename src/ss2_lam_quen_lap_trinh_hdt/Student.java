package ss2_lam_quen_lap_trinh_hdt;

import java.util.Scanner;

public class Student {
    String name;
    int age;

    void nhap() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào tên: ");
        name = scanner.nextLine();//enter

        System.out.print("Nhập vào tuổi: ");
        age = Integer.parseInt(scanner.nextLine());//12 enter
    }

    void xuat() {
        System.out.println("Tên: " + name);
        System.out.println("Tuổi: " + age);
    }

    void eat() {
        System.out.println(name + " có thể ăn nhanh");
    }
}
