package RGMCode;


    /*
    Aufgabe Vererbung:
        1. Lege eine Klasse ComputerScienceStudent und BiologyStudent. Diese erben von deiner Student-Klasse.
        2. Füge deinem ComputerScienceStudent und BiologyStudent eine zusätzliche Eigenschaft hinzu.
        3. Instanziere einen ComputerScienceStudent und BiologyStudent und gib diese aus.
    */

public class Main {
    public static void main(String[] args) {
        ComputerScienceStudent cssRene = new ComputerScienceStudent(1,"Mengedoth","René","27.10.1989","2023","Java");
        System.out.println(cssRene);
        cssRene.kannCoden();

        BiologyStudent bysSunny = new BiologyStudent(2,"Mengedoth","Sunny","11.04.2023","2023","Mikroskope");
        System.out.println(bysSunny);
        bysSunny.kannSezieren();
    }
}