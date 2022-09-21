package kata1;

import java.util.Date;

public class Kata1 {
    public static void main(String[] args) {
        Person person = new Person("Alguien", new Date(102, 5, 25));

        System.out.println(person.getName() + ": " + person.getAge());
    }
}
