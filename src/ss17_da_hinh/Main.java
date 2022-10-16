package ss17_da_hinh;

import java.util.ArrayList;
import java.util.List;

/*
Một hành động nhưng có thể thực hiện nhiều cách khác nhau tùy thuộc vào ngữ cảnh
 */
public class Main {
    public static void main(String[] args) {
        List<DongVat> dsDongVat = new ArrayList<>();

        dsDongVat.add(new Meo());
        dsDongVat.add(new Meo());
        dsDongVat.add(new Chim());
        dsDongVat.add(new Chim());
        dsDongVat.add(new Chim());
/*
foreach
Ưu: Duyệt nó nhanh, ngắn gọn
Nhược: Bắt buộc phải duyệt từ đầu đến cuối
 */
        for (DongVat dongVat : dsDongVat) {
            dongVat.chay();
        }

        for (int i = 1; i < dsDongVat.size(); i++) {
            dsDongVat.get(i).chay();
        }

        for (int i = dsDongVat.size() - 1; i >= 0; i--) {
            dsDongVat.get(i).chay();
        }
    }
}
