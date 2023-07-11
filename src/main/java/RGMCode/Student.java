package RGMCode;

import java.util.Objects;

public abstract class Student implements Citizen {

    private int studentID;
    private String lastName;
    private String firstname;
    private String birthdate;
    private String startYear;
    private String addresse;
    private int identityCardNumber;


    public Student(int studentID, String lastName, String firstname, String birthdate, String startYear, String addresse, int identityCardNumber) {
        this.studentID = studentID;
        this.lastName = lastName;
        this.firstname = firstname;
        this.birthdate = birthdate;
        this.startYear = startYear;
        this.addresse = addresse;
        this.identityCardNumber = identityCardNumber;
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

    public String getAddresse() {
        return addresse;
    }

    public void setAddresse(String addresse) {
        this.addresse = addresse;
    }

    public void setIdentityCardNumber(int identityCardNumber) {
        this.identityCardNumber = identityCardNumber;
    }



    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", lastName='" + lastName + '\'' +
                ", firstname='" + firstname + '\'' +
                ", birthdate='" + birthdate + '\'' +
                ", startYear='" + startYear + '\'' +
                ", addresse='" + addresse + '\'' +
                ", dentityCardNumber=" + identityCardNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentID == student.studentID && identityCardNumber == student.identityCardNumber && Objects.equals(lastName, student.lastName) && Objects.equals(firstname, student.firstname) && Objects.equals(birthdate, student.birthdate) && Objects.equals(startYear, student.startYear) && Objects.equals(addresse, student.addresse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentID, lastName, firstname, birthdate, startYear, addresse, identityCardNumber);
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
