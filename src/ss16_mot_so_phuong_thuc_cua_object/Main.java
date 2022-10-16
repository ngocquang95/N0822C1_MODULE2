package ss16_mot_so_phuong_thuc_cua_object;

/*
Class object là cha của tất cả các class có trong java

+ toString(): Trả về chuỗi thông tin của đối tượng
+ equals(): So sánh miền giá trị của 2 đối tượng

Khi lập trình viên tự tạo ra kiểu dữ liệu thì phải override phương thức toString() & equals()
 */
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Nguyễn Văn A", 7.5);
        Student s2 = new Student(2, "Nguyễn Văn B", 6.4);

        // System.out.println(s1.toString()); // không cần .toString()
        //System.out.println(s1);

        System.out.println(s1 == s2); // false
        System.out.println(s1.equals(s2));
    }
}
