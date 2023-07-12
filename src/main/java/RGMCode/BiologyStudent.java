package RGMCode;

import java.util.Objects;

public class BiologyStudent extends Student implements Citizen {

    private String tool;

    public BiologyStudent(int studentID, String lastName, String firstname, String birthdate, String startYear, String addresse, int dentityCardNumber, String tool) {
        super(studentID, lastName, firstname, birthdate, startYear, addresse, dentityCardNumber);
        this.tool = tool;
    }

    public String getTool() {
        return tool;
    }

    public void setTool(String tool) {
        this.tool = tool;
    }

    @Override
    public String toString() {
        return "BiologyStudent{" +
                "tool='" + tool + '\'' +
                ", " + super.toString();
    }

    public void kannSezieren(){
        System.out.println("BiolodyStudent können Schweineherzen sezieren, ohne das ihm schlecht wird!");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        BiologyStudent that = (BiologyStudent) o;
        return Objects.equals(tool, that.tool);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), tool);
    }

    @Override
    public String getAddress() {
        String street = "Hamburgerstraße 123, 54321 München";
        System.out.println(street);
        return street;
    }

    @Override
    public int getIdentityCardNumber() {
        int idCardNo = 54321;
        System.out.println(idCardNo);
        return idCardNo;
    }

    @Override
    public String codingProject() {
        return null;
    }


}
