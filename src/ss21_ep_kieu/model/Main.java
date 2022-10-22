package ss21_ep_kieu.model;

public class Main {
    public static void main(String[] args) {
        //runtime => Không thể từ Cha => Con
        HocVien hocVien1 = new SinhVien();
        HocVien hocVien2 = (SinhVien) hocVien1;

        hocVien2.test();
        //compile: hocVien1 => HocVien (Phụ thuộc vào kiểu dữ liệu)
        //runtime: hocVien1 => SinhVien (Phụ thuộc vào kiểu dữ liệu tham chiếu tới)
    }
}
