package ss21_ep_kieu.model;

public class Main {
    public static void main(String[] args) {
        //runtime => Không thể từ Cha => Con
        HocVien hocVien1 = new ChuyenVien();
        HocVien hocVien2 = (NVChinhThuc) hocVien1;
        ChuyenVien hocVien3 = (ChuyenVien) hocVien2;
        NVChinhThuc hocVien4 = hocVien3;
        HocVien hocVien5 = hocVien3;

        //compile: hocVien1 => HocVien (Phụ thuộc vào kiểu dữ liệu)
        //runtime: hocVien1 => SinhVien (Phụ thuộc vào kiểu dữ liệu tham chiếu tới)
    }
}
