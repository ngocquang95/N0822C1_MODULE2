package ss6_bai_tap.bai1;

public class PhanSo {
    int tu;
    int mau;

    public PhanSo() {
        tu = 0;
        mau = 1;
    }

    public PhanSo(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public PhanSo(PhanSo ps) {
        this.tu = ps.tu;
        this.mau = ps.mau;
    }

    void xuat() {
        System.out.printf("%s/%s\n", tu, mau);
    }
}
