package ss3_pham_vi_truy_cap;

import ss3_pham_vi_truy_cap.model.Person;

/**
 * 4 phạm vi truy cập
 * private => Trong class
 * default => trong package
 * protected => ngoài package nhưng phải trong kết thừa
 * public => Khắp mọi nơi
 */
public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.score = 10;
    }
}
