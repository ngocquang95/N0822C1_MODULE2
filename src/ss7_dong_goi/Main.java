package ss7_dong_goi;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Generic
        List<Student> students = new ArrayList<>();

        students.add(new Student(1, "Nguyễn Văn A", 8.0));
        students.add(new Student(2, "Nguyễn Văn B", 8.0));
        students.add(new Student(3, "Nguyễn Văn C", 8.0));

        Student student = students.get(1);//lấy ra sinh viên thứ 2 ở trong danh sánh
        student.setName("Nguyễn Ngọc B");
        student.setScore(100);
        System.out.println("Tên: " + student.getName()) ;
        System.out.println("Điểm: " + student.getScore()) ;
    }
}
