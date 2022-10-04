package ss8_ke_thua.quan_ly_nhan_vien;

//NVCongNhat is a NhanVien
public class NVCongNhat extends NhanVien {
    private double soNgayCong;

    public NVCongNhat() {
    }

    public NVCongNhat(String hoTen, String ngaySinh, String diaChi, double soNgayCong) {
        super(hoTen, ngaySinh, diaChi);
        this.soNgayCong = soNgayCong;
    }

    public void showInfo() {
        super.showInfo();
        System.out.printf("%s", soNgayCong);
    }

    public double getSoNgayCong() {
        return soNgayCong;
    }

    public void setSoNgayCong(double soNgayCong) {
        this.soNgayCong = soNgayCong;
    }
}
