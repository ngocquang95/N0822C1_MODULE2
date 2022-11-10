package ss30_comparator_comparable;

import java.util.Comparator;

public class NameComparator implements Comparator<Student> {
    //o1 tương tự với this
    //o2 tương tự với o
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
