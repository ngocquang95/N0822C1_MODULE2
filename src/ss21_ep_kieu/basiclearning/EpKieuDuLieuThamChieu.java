package ss21_ep_kieu.basiclearning;

public class EpKieuDuLieuThamChieu {
    public static void main(String[] args) {
        //Con luôn luôn >= Cha
        Cha cha = new Con_();// Nhầm định
        cha.an();

        Con_ con = (Con_) cha; //Tường minh
        con.an();
        con.chay();

        /*
        compile: Chương trình chưa chạy
        runtime: Chương trình đang chạy
         */
    }
}
