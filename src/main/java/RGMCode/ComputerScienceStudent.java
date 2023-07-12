package RGMCode;

import javax.sound.midi.Soundbank;
import java.util.Objects;

public class ComputerScienceStudent extends Student implements Citizen {

    private String programmingLanguage;

    public ComputerScienceStudent(int studentID, String lastName, String firstname, String birthdate, String startYear, String addresse, int dentityCardNumber, String programmingLanguage) {
        super(studentID, lastName, firstname, birthdate, startYear, addresse, dentityCardNumber);
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

    public void kannCoden(){
        System.out.println("Der ComputerScienceStudent sollte gut coden können!");
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

    @Override
    public String getAddress() {
        String street = "Berlinerring 1, 12345 Berlin";
        System.out.println(street);
        return street;
    }

    @Override
    public int getIdentityCardNumber() {
        int idCardNo = 12345;
        System.out.println(idCardNo);
        return idCardNo;
    }

    @Override
    public String codingProject() {
        return "Ich liebe coding <3";
    }

}

