public class User extends Person {

    private String socialSet;

    public void Instagram() {
        System.out.println(" новый пользователь Instagram ");
    }

    public User(String name, String lastName, int age, String socialSet) {
        super(name, lastName, age);
        this.socialSet = socialSet;
    }

    public User(String socialSet) {
        this.socialSet = socialSet;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + getName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", age=" + getAge() +
                "socialSet="+ socialSet+
                '}';
    }}
