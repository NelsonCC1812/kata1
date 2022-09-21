package kata1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Kata1 {
    public static void main(String[] args) {

        Calendar date;

        date = GregorianCalendar.getInstance();
        date.set(1997, 12, 18);

        Person person = new Person("Yo", date);

        System.out.println(String.format("Name: %s\nBirthdate: %d", person.getName(), person.getAge()));
    }
}
