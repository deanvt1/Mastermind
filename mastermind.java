package mastermind;

import java.util.Scanner;

public class mastermind {
	
	
	
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 

    // Geheime code
    String[] code = {"Rood", "Blauw", "Geel", "Groen"};

    System.out.println("Welkom bij het spel Mastermind! Het spel waar jij de juiste code moet proberen te kraken.");
    System.out.println("De code wordt gekraakt indien de juiste vier kleuren in de goede volgorde worden gezet.");
    System.out.println("Je hebt maximaal 10 pogingen om de code te kraken.\n"); 
  
    int poging = 1;
    boolean goed = false;

    while (poging <= 10 && !goed) {
        System.out.println("Poging " + poging + ":");

        // Invoer van gebruiker
        String[] input = new String[4];
        for (int i = 0; i < 4; i++) {
            System.out.print("Plek en Kleur " + (i + 1) + ": ");
            input[i] = sc.next();
        }

        // Bereken zwarte en witte pionnen
        int zwart = 0;
        int wit = 0;

        boolean[] codeMatched = new boolean[4];
        boolean[] inputMatched = new boolean[4];

        // Zwarte pionnen juiste kleur en juiste plek
        for (int i = 0; i < 4; i++) {
            if (input[i].equalsIgnoreCase(code[i])) {
                zwart++;
                codeMatched[i] = true;
                inputMatched[i] = true;
            }
        }

        // Witte pionnen juiste kleur, verkeerde plek
        for (int i = 0; i < 4; i++) {
            if (!inputMatched[i]) {
                for (int j = 0; j < 4; j++) {
                    if (!codeMatched[j] && input[i].equalsIgnoreCase(code[j])) {
                        wit++;
                        codeMatched[j] = true;
                        break;
                    }
                }
            }
        }

        System.out.println("Uitkomst: (juiste plek en kleur): " + zwart);
        System.out.println("Uitkomst: (juiste kleur, verkeerde plek): " + wit);

        if (zwart == 4) {
            goed = true;
            System.out.println("Gefeliciteerd! Je hebt de code gekraakt");
        } else {
            System.out.println("Helaas is de code nog niet gekraakt. Probeer het nog een keer.\n");
        }

        poging++;
    }

    if (!goed) {
        System.out.println("Je hebt het maximaal aantal pogingen bereikt.");
        System.out.println("De juiste code om te kraken was: Rood Blauw Geel Groen");
    }

    sc.close();                                
}    
}

    

     






