package ss5_constructor;

/**
 * Constructor: hàm tạo => giúp tạo ra được đối tượng
 * + Cùng tên với class
 * + Không có kiểu dữ liệu trả về
 * + Trong một class có thể có nhiều constructor => cơ chế overload (cùng tên nhưng khác nhau về số lượng tham số và kiểu dữ liệu của tham số)
 * + Khi lập trình viên không tạo ra constructor nào thì java sẽ chủ động tạo ra một constructor mặc định
 *
 *
 * Constructor có 2 loại
 * + Mặc định: Không có tham số
 * + Có tham số
 */
public class Student {
    int id; // id là duy nhất
    String name;
    double score;

    public Student(int id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public Student() {
    }
}
