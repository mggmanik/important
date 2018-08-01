package isahasa;

public class Student extends Person {

    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Manik");
        p.setAge(22);

        System.out.println(p.getName());
        System.out.println(p.getAge());
    }
}
