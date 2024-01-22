public class Main {
    public static void main(String[] args) {

        System.out.println("---------- ПЕРСОН--------- ");
        Person person = new Person("Ayso","Sarieva",18);
        System.out.println(person);
        person.journey();
        person.sleep();
        System.out.println("--------------------------------------------------");

        System.out.println("-----------Student-----------------");
        Student student = new Student("Asan","Sariev",21,"Врач ");
        System.out.println(student);
        student.reading();
        student.write();
        System.out.println("--------------------------------------");

        System.out.println("---------------Employee----------------");
        Employee employee = new Employee("Ayday","Shadieva",23,2);
        System.out.println(employee);
        employee.working();
        System.out.println("---------------------------------------------");

        System.out.println("---------------------User-----------------------");
        User user = new User(" Adilet","Karybekov",25,"пользователь Instagram");
        System.out.println(user);
        user.Instagram();
    }
}