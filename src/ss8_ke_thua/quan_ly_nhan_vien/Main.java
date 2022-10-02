package ss8_ke_thua.quan_ly_nhan_vien;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        // Đưa thông tin từ file => List
        Scanner scanner = new Scanner(Paths.get("src/ss8_ke_thua/quan_ly_nhan_vien/data/data.txt"));
        List<NVQuanLy> dsNVQuanLy = new ArrayList<>();
        List<NVCongNhat> dsNVCongNhat = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] info = line.split(",");

            if (info[0].equals("1")) { //Nhân viên quản lý
                dsNVQuanLy.add(new NVQuanLy(info[1], info[2], info[3], Double.parseDouble(info[4]), Double.parseDouble(info[5])));
            } else if (info[0].equals("2")) { //Nhân viên công nhật
                dsNVCongNhat.add(new NVCongNhat(info[1], info[2], info[3], Double.parseDouble(info[4])));
            }
        }
        scanner.close();

        // Từ LIST => show ra màn hình console
//        for (NVQuanLy nvQuanLy : dsNVQuanLy) {
//            nvQuanLy.showInfo();
//            System.out.println();
//        }
        for (int i = 0; i < dsNVQuanLy.size() - 1; i++) {
            for (int j = i + 1; j < dsNVQuanLy.size(); j++) {
                if (dsNVQuanLy.get(i).tinhLuong() > dsNVQuanLy.get(j).tinhLuong() ){
                    NVQuanLy temp = dsNVQuanLy.get(i);
                    dsNVQuanLy.set(i, dsNVQuanLy.get(j)); // a[i] = a[j];
                    dsNVQuanLy.set(j, temp); // a[j] = temp;
                }
            }
        }

        double total = 0;
        System.out.println("\n\n ============= Nhân viên Quản lý ============= ");
        for(int i = 0; i < dsNVQuanLy.size(); i++) {
            System.out.println("Thông tin nhân viên thứ: " + (i + 1));
            dsNVQuanLy.get(i).showInfo();
            System.out.println();
            total += dsNVQuanLy.get(i).tinhLuong();
        }

        System.out.println("\n\n ============= Nhân viên Công nhật ============= ");
        for(int i = 0; i < dsNVCongNhat.size(); i++) {
            System.out.println("Thông tin nhân viên thứ: " + (i + 1));
            dsNVCongNhat.get(i).showInfo();
            System.out.println();
//            total += dsNVCongNhat.get(i).tinhLuong();
        }
    }
}
