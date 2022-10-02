package ss8_ke_thua.demo;

public class Person {
    private int id;
    private String name;
    private String color;
    private String gender;
    private String dateOfBirth;

    public Person() {
    }

    public Person(int id, String name, String color, String gender, String dateOfBirth) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }

    public void showInfo() {
        System.out.println("id: " + id);
        System.out.println("name: " + name);
        System.out.println("color: " + color);
        System.out.println("gender: " + gender);
        System.out.println("dateOfBirth: " + dateOfBirth);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
