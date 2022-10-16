package ss11_static;

/**
 * static thuộc về class chứ không phải thuộc về đối tượng
 * <p>
 * Tiết kiệm bộ nhớ
 * Xây dựng những phương thức tiện ích
 * <p>
 * Truy xuất thông qua tên class
 * <p>
 * Lưu ý khi sử dụng static
 * + Phương thức static sẽ gọi được thuộc tính và phương thức static
 * Phương thức non-static sẽ gọi được thuộc tính và phương thức static
 */

/**
 * Final được sử dụng trong rất nhiều ngữ cảnh
 * 1. Nếu là biến => Hằng số
 * 2. Nếu đi với phương thức => Không cho con override
 * 3. Nếu đi với class => Không cho con kết thừa (Vô sinh)
 */
public class Main {
    public static void main(String[] args) {
        Student.staticMethod();

        Student s1 = new Student(1, "Nguyễn Văn A");
        Student s2 = new Student(2, "Nguyễn Văn B");
        Student s3 = new Student(3, "Nguyễn Văn C");
        Student s4 = new Student(4, "Nguyễn Văn D");

        System.out.println("Số đối tượng được tạo ra: " + Student.countStudent);

        System.out.println(Student.truongHoc);
        System.out.println(s1.id);

        System.out.println(Math.PI);
        System.out.println(Math.sqrt(10.0));


        Person person = new Student();
        person.run();

        final int MAX_STUDENT = 100;
    }
}
