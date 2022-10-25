package ss23_exception;

import ss23_exception.exception.Under18YearsOldException;

/**
 * Xử lý ngoại lệ
 * <p>
 * * Try-catch: Xử lý ngay tại thời điểm xảy ra Exception
 * <p>
 * * throw-throws: Ném ngoại lệ cho method khác xử lý
 */
public class ExceptionStudy3 {
    public static void main(String[] args) {
        try {
            checkOver18YearsOld(15);
        } catch (Under18YearsOldException e) {
            e.printStackTrace();
        }
    }

    public static void checkOver18YearsOld(int age) throws Under18YearsOldException {
        if (age < 18) {
            throw new Under18YearsOldException("Bạn chưa đủ tuổi!!!");
        }
    }
}
