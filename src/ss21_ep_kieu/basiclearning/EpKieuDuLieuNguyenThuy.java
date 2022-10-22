package ss21_ep_kieu.basiclearning;

/**
 * Nguyên thủy
 * + Tường minh     => Lập trình viên chủ động ép kiểu
 * => Chuyển tử kiểu dữ liệu lớn xuống kiểu dữ liệu nhỏ => Lớn => Nhỏ
 * + Nhầm định => Do java tự ép về, lập trình viên không cần ép kiểu
 * => Chuyển tử kiểu dữ liệu nhỏ sang kiểu dữ liệu Lớn => Nhỏ => Lớn
 * <p>
 * <p>
 * Tham Chiếu
 * + Upcasting: tương ứng với ngầm định => Con => Cha
 * + Downcasting: tương ứng với tường minh => Cha => Con
 */
public class EpKieuDuLieuNguyenThuy {
    public static void main(String[] args) {
        int a = 2; //4 byte
        long b = a; //8 byte => Ép kiểu ngầm định

        int c = (int) b; // Ép kiểu tường minh => Có khả năng bị sai sót


        //Số thập phân: 10 con số biểu diễn 0->9
        // Số nhị phân: 2 con số để biểu diễn 0,1
        int x = 500;
        byte y = (byte) x;//1byte => 8bit
        System.out.println(y);
    }
}
