package ss6_bai_tap.bai1;

public class Main {
    public static void main(String[] args) {
        PhanSo a = new PhanSo();
        a.xuat();

        PhanSo b = new PhanSo(1, 2);
        b.xuat();

        PhanSo c = new PhanSo(b);
        c.xuat();
    }
}
