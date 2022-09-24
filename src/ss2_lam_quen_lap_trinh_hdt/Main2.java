package ss2_lam_quen_lap_trinh_hdt;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        //Mảng - Vòng lặp
        int n = 2;

        Student[] students = new Student[n]; //[null, null, null, ...]
        //Nhập thông tin cho toàn bộ học viên
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();// Tạo 1 vùng nhớ để chứa thông tin
            System.out.println("Nhập vào thông tin học sinh thứ " + (i + 1));
            students[i].nhap();
        }

        //Xuất thông tin
        for (int i = 0; i < students.length; i++) {
            System.out.println("Thông tin học sinh thứ " + (i + 1));
            students[i].xuat();
        }
    }
}
