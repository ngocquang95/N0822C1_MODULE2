package ss3_pham_vi_truy_cap.model;

/**
 * Có 4 phạm vi truy cập nhưng chỉ có 3 từ khóa
 */
public class Person {
    private int id;
    String name;
    protected String color;
    public double score;

    void test() {
        id = 1;
        name = "abc";
        color = "red";
        score = 10;
    }
}
