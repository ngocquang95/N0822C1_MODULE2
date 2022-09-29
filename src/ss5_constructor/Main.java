package ss5_constructor;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(1, "Nguyễn Văn A", 8.2);
        Student student2 = new Student();

        System.out.println("Mã: " + student.id);
        System.out.println("Tên: " + student.name);
        System.out.println("Điểm: " + student.score);
    }
}
