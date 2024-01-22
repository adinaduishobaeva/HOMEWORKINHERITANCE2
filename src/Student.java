public class Student extends Person {

    private String profession;

    public void reading() {
        System.out.println("любить читать книгу  ");
    }

    public void write() {
        System.out.println("любить писать песни  ");
    }

    public Student(String name, String lastName, int age, String profession) {
        super(name, lastName, age);
        this.profession = profession;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + getName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", age=" + getAge() +
                ",profession=" + profession +
                '}';
    }
}
