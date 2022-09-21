package kata1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Person {

    private final String name;
    private final Calendar birthdate;
    private final long MILLISECONDS_PER_YEAR = (long) 365.25 * 24 * 60 * 60 * 1000;

    public Person(String name, Calendar birthDate) {
        this.name = name;
        this.birthdate = birthDate;
    }

    public String getName() {
        return this.name;
    }

    public Calendar getBirthdate() {
        return this.birthdate;
    }

    public int getAge() {
        Calendar today = GregorianCalendar.getInstance();
        return (int) this.millisecondsToYear((today.getTimeInMillis() - this.getBirthdate().getTimeInMillis()));
    }

    private int millisecondsToYear(long millies) {
        return (int) (millies / this.MILLISECONDS_PER_YEAR);
    }

}