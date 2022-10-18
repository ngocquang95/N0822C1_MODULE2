package ss19_truu_tuong;

/**
 * Tính trừu tượng
 *
 * - Cho phép ẩn đi những chi tiết, chỉ hiển thị ra tính năng
 *
 * - Để thu được tính trừu tượng ở trong java thì sử dụng
 *  1. abstract class
 *         - Không thể tạo được đối tượng
 *         - Một class có phương thức abstract thì chắc chắc class phải là abstract
 *         - Class abstract có thể chức các phương thức non-abstract
 *         - Không thể đi chung với từ khóa final .....
 *  2. interface
 *      - Không thể tạo được đối tượng
 *      - Tất các các phương thức đều là abstract (Phiên bản trước java 8)
 *      - Trường ở trong interface đều là hằng số (public static final)
 */
public class Main {
    public static void main(String[] args) {
        Animal animal = new Cat(1, "Meo mun");
        Animal animal2 = new Cat(2, "Meo trắng");

        animal.tiengKeu();
    }
}
