package ss19_truu_tuong;

public abstract class Animal {
    private int id;
    private String name;

    public Animal() {
    }

    public Animal(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public abstract void tiengKeu();

    public void tiengKeu2() { // non-abstract
        System.out.println("Body");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
