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
    private Date dateOfBirth;
    private Gender gender;
    private Year yearOfDrivingLicense;

    public Person(int pid, String firstName, String lastName, Date dateOfBirth, Gender gender, Year yearOfDrivingLicense) {
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

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public Gender getGender() {
        return gender;
    }

    public Year getYearOfDrivingLicense() {
        return yearOfDrivingLicense;
    }

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

}
