package ss8_ke_thua.quan_ly_nhan_vien;

public class NVQuanLy extends NhanVien {
    private double luongCoBan;
    private double heSoLuong;

    public NVQuanLy() {
    }

    public NVQuanLy(String hoTen, String ngaySinh, String diaChi, double luongCoBan, double heSoLuong) {
        super(hoTen, ngaySinh, diaChi);
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
    }

    public void showInfo() {
        super.showInfo();
        System.out.printf("%s\t%s\t%s", luongCoBan, heSoLuong, tinhLuong());
    }

    public double tinhLuong() {
        return heSoLuong * luongCoBan;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }
}
