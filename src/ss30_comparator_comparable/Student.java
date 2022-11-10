package ss30_comparator_comparable;

public class Student implements Comparable<Student> {
    private int id;
    private String name;
    private double score;

    public Student() {
    }

    public Student(int id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
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

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "\nStudent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    /**
     * >= 1: Hoán vị phần tử ở trước với phần tử ở sau
     * 0: Không làm gì cả
     * <= -1: Ứng dụng trong Collections.reverseOrder()
     *
     * this là phần tử ở trước
     * o là phần tử ở sau
     */
    // 1 3 2 4
    // 1 2 3 4

    @Override
    public int compareTo(Student o) {
        if (this.getId() == o.getId()) {
//            if(this.getScore() > o.getScore()) {
//                return 1;
//            }
//
//            if(this.getScore() == o.getScore()) {
//                return 0;
//            }
//
//            return -1;
            return Double.compare(this.getScore(), o.getScore());
        }
        return this.getId() - o.getId();
    }
}
