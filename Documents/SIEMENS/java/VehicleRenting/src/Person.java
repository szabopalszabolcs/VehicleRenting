import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Date;

/**
 * Created by Szabi on 26.07.2021.
 */

public class Person {

    public enum Gender{
        MALE,
        FEMALE
    }

    private int pid;
    private String firstName;
    private String lastName;
    private SimpleDateFormat dateOfBirth;
    private Gender gender;
    private int yearOfDrivingLicense;

    public Person(int pid, String firstName, String lastName, SimpleDateFormat dateOfBirth, Gender gender, int yearOfDrivingLicense) {
        this.pid = pid;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.yearOfDrivingLicense = yearOfDrivingLicense;
    }

    public int getPid() {
        return pid;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public SimpleDateFormat getDateOfBirth() {
        return dateOfBirth;
    }

    public Gender getGender() {
        return gender;
    }

    public int getYearOfDrivingLicense() { return yearOfDrivingLicense; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        return getPid() == person.getPid();

    }

    @Override
    public int hashCode() {
        return getPid();
    }

    @Override
    public String toString() {
        return  ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", gender=" + gender +
                ", yearOfDrivingLicense=" + yearOfDrivingLicense;
    }
}
