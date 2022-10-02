package ss8_ke_thua.demo;

/*
super: gọi đến phương thức, thuộc tính, constructor của cha
 */
public class Student extends Person {
    private double score;


    public Student() {
    }

    public Student(int id, String name, String color, String gender, String dateOfBirth, double score) {
        super(id, name, color, gender, dateOfBirth);
//        super.setId(id);
//        super.setColor(color);
//        super.setName(name);
//        super.setDateOfBirth(dateOfBirth);
//        super.setGender(getGender());
        this.score = score;
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("score: " + score);
    }
}