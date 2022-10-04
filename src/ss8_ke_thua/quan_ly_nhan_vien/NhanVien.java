package ss8_ke_thua.quan_ly_nhan_vien;

//NhanVien has a String
//NhanVien has a DiaChi
public class NhanVien {
    private String hoTen;
    private String ngaySinh;
    private String diaChi;
    private DiaChi diaChi2;

    public NhanVien() {
    }

    public NhanVien(String hoTen, String ngaySinh, String diaChi) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }

    public void showInfo() {
        System.out.printf("%s\t%s\t%s", hoTen, ngaySinh, diaChi);
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
}
