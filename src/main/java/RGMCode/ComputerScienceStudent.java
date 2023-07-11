package RGMCode;

import java.util.Objects;

public class ComputerScienceStudent extends Student{

    private String programmingLanguage;

    public ComputerScienceStudent(int studentID, String lastName, String firstname, String birthdate, String startJahr, String programmingLanguage) {
        super(studentID, lastName, firstname, birthdate, startJahr);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public String toString() {
        return "ComputerScienceStudent{" +
                "programmingLanguage='" + programmingLanguage + '\'' +
                ", " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ComputerScienceStudent that = (ComputerScienceStudent) o;
        return Objects.equals(programmingLanguage, that.programmingLanguage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), programmingLanguage);
    }
}
