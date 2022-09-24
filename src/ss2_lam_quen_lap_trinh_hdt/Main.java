package ss2_lam_quen_lap_trinh_hdt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Join";
        s1.age = 12;

        Student s2 = new Student();
        s2.name = "Lyli";
        s2.age = 14;

        System.out.println("Tên: " + s1.name);
        System.out.println("Tuổi: " + s1.age);
        s1.eat();

        System.out.println("Tên: " + s2.name);
        System.out.println("Tuổi: " + s2.age);
        s2.eat();

        //Cho người dùng nhập dữ liệu
        Student student = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();
        Student student5 = new Student();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào thông tin sinh viên");

        System.out.print("Nhập vào tuổi: ");
        student.age = Integer.parseInt(scanner.nextLine());//12 enter

        System.out.print("Nhập vào tên: ");
//        scanner.nextLine();// Xóa bộ nhớ đệm
        student.name = scanner.nextLine();//enter

        System.out.println("Thông tin sau khi nhập");
        System.out.println("Tuổi: " + student.age);
        System.out.println("Tên: " + student.name);


        System.out.println("Nhập vào thông tin sinh viên");
        student2.nhap();

        System.out.println("Thông tin sau khi nhập");
        student2.xuat();


    }
}
