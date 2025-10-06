package introductie;

import java.util.Scanner;

public class mastermind {
	
	
	
	String rood = "Rood";
	String blauw = "Blauw";
	String geel = "Geel";
	String paars = "Paars";
	String oranje = "Oranje";
	String groen = "Groen";
	

	String wit = "Wit";
	String zwart = "Zwart";
	
	String codeVakje1;
	String codeVakje2;
	String codeVakje3;
	String codeVakje4;
	
	String codekrakerPogingInput1;
	String Input_1;
	String Input_2;
	String Input_3;
	
	String control1_1;
	String control1_2;
	String control1_3;
	String control1_4;
	
	boolean inmput1_1Zwart;
	boolean inmput1_1Wit;
	boolean inmput1_1Blauw;
	boolean inmput1_1Geel;
	boolean inmput1_1Paars;
	boolean inmput1_1Oranje;
	boolean inmput1_1Groen;
	
	

	boolean inmput2_2Zwart;
	boolean inmput2_2Wit;
	boolean inmput2_2Blauw;
	boolean inmput2_2Geel;
	boolean inmput2_2Paars;
	boolean inmput2_2Oranje;
	boolean inmput2_2Groen;
     public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // code
            String code1 = "Rood";
            String code2 = "Blauw";
            String code3 = "Geel";
            String code4 = "Groen";

            // Invoer van gebruiker
            System.out.print("Kleur 1: ");
            String input1 = sc.next();

            System.out.print("Kleur 2: ");
            String input2 = sc.next();

            System.out.print("Kleur 3: ");
            String input3 = sc.next();

            System.out.print("Kleur 4: ");
            String input4 = sc.next();

            // Feedback
            int zwart = 0;
            if (input1.equals(code1)) zwart++;
            if (input2.equals(code2)) zwart++;
            if (input3.equals(code3)) zwart++;
            if (input4.equals(code4)) zwart++;

            // Resultaat
            System.out.println("gok");
            System.out.println(input1  + input2  + input3 + input4);

            System.out.println("Feedback");
            System.out.println(zwart + " kleuren staan op de juiste plek ");

            if (zwart == 4) {
                System.out.println("De code is goed");
            } else {
                System.out.println("De code is niet goed.");
                System.out.println("De code was:  Rood   Blauw  Geel   Groen");
            }

            sc.close();            
        }
    }





