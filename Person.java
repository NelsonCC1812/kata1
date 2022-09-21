package kata1;

import java.time.LocalDate;
import java.time.Period;

public class Person {

    private final String name;
    private final LocalDate birthdate;

    public Person(String name, LocalDate birthDate) {
        this.name = name;
        this.birthdate = birthDate;
    }

    public String getName() {
        return this.name;
    }

    public LocalDate getBirthdate() {
        return this.birthdate;
    }

    public int getAge() {
        LocalDate today = LocalDate.now();
        return Period.between(this.birthdate, today).getYears();
    }
}