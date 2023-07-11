package RGMCode;

import java.util.Objects;

public class Student implements Citizen {

    private int studentID;
    private String lastName;
    private String firstname;
    private String birthdate;
    private String startYear;



    public Student(int studentID, String lastName, String firstname, String birthdate, String startJahr) {
        this.studentID = studentID;
        this.lastName = lastName;
        this.firstname = firstname;
        this.birthdate = birthdate;
        this.startYear = startJahr;
    }



    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getStartYear() {
        return startYear;
    }

    public void setStartYear(String startYear) {
        this.startYear = startYear;
    }

    @Override
    public String toString() {
        return  "studentID=" + studentID +
                ", lastName='" + lastName + '\'' +
                ", firstname='" + firstname + '\'' +
                ", birthdate='" + birthdate + '\'' +
                ", startJahr='" + startYear + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentID == student.studentID && Objects.equals(lastName, student.lastName) && Objects.equals(firstname, student.firstname) && Objects.equals(birthdate, student.birthdate) && Objects.equals(startYear, student.startYear);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentID, lastName, firstname, birthdate, startYear);
    }

    @Override
    public String getAddress() {
        return null;
    }

    @Override
    public int getIdentityCardNumber() {
        return 0;
    }
}
