package ss11_static;

/**
 * ======= Overload =======
 * Xảy ra trong 1 class
 * Giống tên phương thức nhưng khác nhau về số lượng tham số và kiểu dữ liệu của tham số
 */
public class TinhToan {
    public int tinhTong(int a, int b) {
        return a + b;
    }

    public double tinhTong(double a, double b) {
        return a + b;
    }

    public int tinhTong(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        TinhToan tinhToan = new TinhToan();
        tinhToan.tinhTong(1, 2, 3);
    }
}
