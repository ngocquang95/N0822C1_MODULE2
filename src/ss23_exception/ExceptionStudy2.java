package ss23_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Nhập vào số nguyên, nếu như nhập sai => bắt buộc nhập lại
 * <p>
 * - Một số lưu ý khi sử dụng try-catch
 * * Tại một thời điểm chỉ có một ngoại lệ xảy => chỉ một khối catch được gọi
 * * Các khối catch phải được sắp xếp từ chi tiết đến tổng quan (Từ Con -> Cha)
 * ..........
 * finally???? => Tìm hiểu thêm
 */
public class ExceptionStudy2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số nguyên: ");
        int n = 0;
        while (true) {
            try {
                String name = null;
                name.equals("abc");
                n = scanner.nextInt(); //abc enter => Nếu xảy ra lỗi lầm thì rơi xuống khối catch
                break; //Nếu không lỗi lầm thì bay xuống break
            } catch (InputMismatchException e) {
                scanner.nextLine(); // xóa bộ nhớ đệm
                System.out.println("Không phải là số, xin nhập lại: ");
            } catch (NullPointerException e) {
                System.out.println("Bị null rồi");
                e.printStackTrace(); // Giúp lập trình viên xác định được lỗi và nơi xảy ra lỗi
                break;
            } catch (Exception e) {
                System.out.println("Lỗi chung");
                break;
            }
        }

        System.out.println("n = " + n);
        System.out.println("Chương trình kết thúc không lỗi lầm");
    }
}
