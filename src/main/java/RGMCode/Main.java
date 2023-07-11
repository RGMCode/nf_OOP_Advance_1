package RGMCode;


    /*
    Aufgabe Vererbung:
        1. Lege eine Klasse ComputerScienceStudent und BiologyStudent. Diese erben von deiner Student-Klasse.
        2. Füge deinem ComputerScienceStudent und BiologyStudent eine zusätzliche Eigenschaft hinzu.
        3. Instanziere einen ComputerScienceStudent und BiologyStudent und gib diese aus.
    */

    /*
    Aufgabe: Interface

        1. Erstelle ein Interface Citizen mit den Methoden-Signaturen:
            1.2 String getAddress()
            1.3 int getIdentityCardNumber()
        2. Lasse deine Klassen BiologyStudent und ComputerScienceStudent dieses Interface implementieren.
     */

public class Main {
    public static void main(String[] args) {
        ComputerScienceStudent cssRene = new ComputerScienceStudent(1,"Mengedoth","René","27.10.1989","2023","Münchner Straße 1, 12345 Büsum", 1, "java");
        System.out.println(cssRene);
        cssRene.kannCoden(); //hier habe ich etwas ausprobiert
        cssRene.getAddress();
        cssRene.getIdentityCardNumber();
        System.out.println(cssRene.getAddress());

        BiologyStudent bysSunny = new BiologyStudent(2,"Mengedoth","Sunny","11.04.2023","2023","Büsumer Weg 2, 23456 München", 2, "Mikroskope");
        System.out.println(bysSunny);
        bysSunny.kannSezieren(); //hier habe ich etwas ausprobiert
        bysSunny.getAddress();
        System.out.println(bysSunny.getAddress());
        bysSunny.getIdentityCardNumber();

    }
}