package ss19_truu_tuong;

public class Cat extends Animal {
    public Cat(int id, String name) {
        super(id, name);
    }

    @Override
    public void tiengKeu() {
        System.out.println("meo meo");
    }
}
