package ss11_static;

public class Student extends Person {
    public int id; // id riêng
    private String ten; // tên khác nhau
    public static String truongHoc = "Bách Khoa"; //Thông tin chung
    public static int countStudent = 0;

    public Student() {
    }

    public Student(int id, String ten) {
        this.id = id;
        this.ten = ten;
        countStudent++;
    }

    public void nonStaticMethod() {
        // staticMethod();//non-static gọi được static
    }

    public static void staticMethod() {
        //nonStaticMethod(); => Không thể gọi non-static
    }

    /**
     * Override
     * phải giống nhau về
     * + Số lượng tham số
     * + Cùng kiểu dữ liệu trả về
     * + Cùng tên phương thức
     *
     * => Định nghĩa lại lớp cha sao cho phù hợp với lớp con
     */
    @Override // Có cũng được mà không có cũng được
    public void run() {
        System.out.println("Student Run");
    }
}
