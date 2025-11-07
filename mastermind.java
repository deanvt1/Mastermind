package mastermind;

import java.util.Scanner;

public class mastermind {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String kleur1 = "rood";
        String kleur2 = "blauw";
        String kleur3 = "geel";
        String kleur4 = "groen";

        boolean gewonnen = false;
        int poging = 1;

        System.out.println("Welkom bij Mastermind!");
        System.out.println("Raad de juiste volgorde van 4 kleuren.");
        System.out.println("Kies uit: rood, blauw, geel, groen, oranje, paars");

        while (gewonnen == false && poging <= 10) {

            System.out.println("\nPoging " + poging);

            System.out.print("Kleur 1: ");
            String gok1 = sc.next().toLowerCase();

            System.out.print("Kleur 2: ");
            String gok2 = sc.next().toLowerCase();

            System.out.print("Kleur 3: ");
            String gok3 = sc.next().toLowerCase();

            System.out.print("Kleur 4: ");
            String gok4 = sc.next().toLowerCase();

            int juistePlek = 0;

            
            if (gok1.equals(kleur1)) juistePlek++;
            if (gok2.equals(kleur2)) juistePlek++;
            if (gok3.equals(kleur3)) juistePlek++;
            if (gok4.equals(kleur4)) juistePlek++;

            
            boolean goed1 = gok1.equals(kleur1);
            boolean goed2 = gok2.equals(kleur2);
            boolean goed3 = gok3.equals(kleur3);
            boolean goed4 = gok4.equals(kleur4);

            int juisteKleurVerkeerdePlek = 0;

            
            if (gok1.equals(kleur1) == false) {
                if (goed2 == false) {
                    if (gok1.equals(kleur2)) {
                        juisteKleurVerkeerdePlek++;
                        goed2 = true;
                    }
                } else if (goed3 == false) {
                    if (gok1.equals(kleur3)) {
                        juisteKleurVerkeerdePlek++;
                        goed3 = true;
                    }
                } else if (goed4 == false) {
                    if (gok1.equals(kleur4)) {
                        juisteKleurVerkeerdePlek++;
                        goed4 = true;
                    }
                }
            }

            
            if (gok2.equals(kleur2) == false) {
                if (goed1 == false) {
                    if (gok2.equals(kleur1)) {
                        juisteKleurVerkeerdePlek++;
                        goed1 = true;
                    }
                } else if (goed3 == false) {
                    if (gok2.equals(kleur3)) {
                        juisteKleurVerkeerdePlek++;
                        goed3 = true;
                    }
                } else if (goed4 == false) {
                    if (gok2.equals(kleur4)) {
                        juisteKleurVerkeerdePlek++;
                        goed4 = true;
                    }
                }
            }

            
            if (gok3.equals(kleur3) == false) {
                if (goed1 == false) {
                    if (gok3.equals(kleur1)) {
                        juisteKleurVerkeerdePlek++;
                        goed1 = true;
                    }
                } else if (goed2 == false) {
                    if (gok3.equals(kleur2)) {
                        juisteKleurVerkeerdePlek++;
                        goed2 = true;
                    }
                } else if (goed4 == false) {
                    if (gok3.equals(kleur4)) {
                        juisteKleurVerkeerdePlek++;
                        goed4 = true;
                    }
                }
            }

            
            if (gok4.equals(kleur4) == false) {
                if (goed1 == false) {
                    if (gok4.equals(kleur1)) {
                        juisteKleurVerkeerdePlek++;
                        goed1 = true;
                    }
                } else if (goed2 == false) {
                    if (gok4.equals(kleur2)) {
                        juisteKleurVerkeerdePlek++;
                        goed2 = true;
                    }
                } else if (goed3 == false) {
                    if (gok4.equals(kleur3)) {
                        juisteKleurVerkeerdePlek++;
                        goed3 = true;
                    }
                }
            }

            
            System.out.println("Juiste kleuren op juiste plek: " + juistePlek);
            System.out.println("Juiste kleuren op verkeerde plek: " + juisteKleurVerkeerdePlek);

            if (juistePlek == 4) {
                gewonnen = true;
                System.out.println("\n🎉 Gefeliciteerd! Je hebt de juiste combinatie geraden!");
            } else {
                poging = poging + 1;
            }
        }

        if (gewonnen == false) {
            System.out.println("\nHelaas, je hebt verloren.");
            System.out.println("De juiste code was: " + kleur1 + ", " + kleur2 + ", " + kleur3 + ", " + kleur4);
        }

        sc.close();  
    }
}

    
    
    
    
    
    
    
    
  
   

    

     






