import java.text.SimpleDateFormat;

class Person {

    enum Gender{
        MALE,
        FEMALE
    }

    private int pid;
    private String firstName;
    private String lastName;
    private SimpleDateFormat dateOfBirth;
    private Gender gender;
    private int yearOfDrivingLicense;

    Person(int pid, String firstName, String lastName, SimpleDateFormat dateOfBirth, Gender gender, int yearOfDrivingLicense) {
        this.pid = pid;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.yearOfDrivingLicense = yearOfDrivingLicense;
    }

    int getPid() {
        return pid;
    }

    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }

    SimpleDateFormat getDateOfBirth() {
        return dateOfBirth;
    }

    Gender getGender() {
        return gender;
    }

    int getYearOfDrivingLicense() { return yearOfDrivingLicense; }

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
