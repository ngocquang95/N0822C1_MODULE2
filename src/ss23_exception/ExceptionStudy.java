package ss23_exception;

/**
 * Ngoại lệ: Nó làm phá vỡ flow(luồng thực thi của chương trình) của chương trình, làm chết chương trình
 * <p>
 * Phần loại exception
 * <p>
 * Checked Exception
 * * Xảy ra tại thời điểm compile => bắt buộc phải xử (try - throw)
 * Một số Exception
 * IOException
 * FileNotFoundException

 ==================================
 * Unchecked Exception
 * Xảy ra tại thời điểm runtime
 * * Một số Exception
 * NullPointerException
 * NumberFormatException
 * ArrayIndexOutOfBoundException
 * <p>
 *
 * *
 */
public class ExceptionStudy {
    public static void main(String[] args) {
        //NullPointerException
//        String name = null;
//        name.equals("Nguyễn Văn A");

        //NumberFormatException
        int a = Integer.parseInt("123a");

        System.out.println("Chương trình kết thúc không lỗi lầm");
    }
}
