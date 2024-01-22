public class Employee extends Person {
    private int experience;

    public void working() {
        System.out.println("быстро работает ");
    }

    public Employee(String name, String lastName, int age, int experience) {
        super(name, lastName, age);
        this.experience = experience;
    }

    public Employee(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + getName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", age=" + getAge() +
                ",  experience= '" + experience+
                '}';
    }}
