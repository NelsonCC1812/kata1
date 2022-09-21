package kata1;

import java.time.LocalDate;
import java.util.Calendar;

public class Kata1 {
    public static void main(String[] args) {

        LocalDate date = LocalDate.of(1997, 12, 18);

        Person person = new Person("Yo", date);

        System.out.println(String.format("Name: %s\nBirthdate: %d", person.getName(), person.getAge()));
    }
}
