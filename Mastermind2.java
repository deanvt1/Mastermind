package oefeningen;

import java.util.Scanner;


public class Mastermind2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Welkom bij Mastermind!");
        System.out.println("Raad de juiste volgorde van 4 kleuren.");
        System.out.println("Kies uit: rood, blauw, geel, groen, oranje, paars");  
        
        
        
     
        String[] kleurenspeler = {"rood","blauw","paars","groen","oranje","geel"};  
              
         
        for(int i = 0; i < 10; i++) 
        {
        	
        	boolean goed1 = false, goed2 = false, goed3 = false, goed4 = false; 
        	
        System.out.print("kies de eerste kleur:");  
        String kleur1 = sc.next(); 
        
        System.out.print("kies de tweede kleur:");
        String kleur2 = sc.next(); 
        
        System.out.print("kies de derde kleur:");
        String kleur3 = sc.next(); 
        
        System.out.print("kies de vierde kleur:");
        String kleur4 = sc.next();  
        
        if (kleur1.equalsIgnoreCase(kleurenspeler[0])) {  
        	System.out.println("de eerste kleur is goed");
        	goed1= true;
        } else if (kleur2.equalsIgnoreCase(kleurenspeler[0]) || kleur3.equalsIgnoreCase(kleurenspeler[0]) || kleur4.equalsIgnoreCase(kleurenspeler[0])) {
        	System.out.println("de kleur zit er wel in maar op de verkeerde plek"); 
        } else {
        	System.out.println("fout");     
        }
        
        if (kleur2.equalsIgnoreCase(kleurenspeler[1])) {
        	System.out.println("de tweede kleur is goed");
        	goed2 = true;
        } else if (kleur1.equalsIgnoreCase(kleurenspeler[1]) || kleur3.equalsIgnoreCase(kleurenspeler[1]) || kleur4.equalsIgnoreCase(kleurenspeler[1])) {
        	System.out.println("de kleur zit er wel in maar op de verkeerde plek"); 
        } else {
        	System.out.println("fout");      
        }
       
        if (kleur3.equalsIgnoreCase(kleurenspeler[2])) {
        	System.out.println("de derde kleur is goed");
        	goed3 = true;
        } else if (kleur2.equalsIgnoreCase(kleurenspeler[2]) || kleur1.equalsIgnoreCase(kleurenspeler[2]) || kleur4.equalsIgnoreCase(kleurenspeler[2])) {
        	System.out.println("de kleur zit er wel in maar op de verkeerde plek"); 
        } else {
        	System.out.println("fout");     
        }
        
        if (kleur4.equalsIgnoreCase(kleurenspeler[3])) {
        	System.out.println("de vierde kleur is goed");
        	goed4 = true;
        } else if (kleur2.equalsIgnoreCase(kleurenspeler[3]) || kleur3.equalsIgnoreCase(kleurenspeler[3]) || kleur1.equalsIgnoreCase(kleurenspeler[3])) {
        	System.out.println("de kleur zit er wel in maar op de verkeerde plek"); 
        } else {
        	System.out.println("fout");         
        } 
        
        if (goed1 && goed2 && goed3 && goed4) {
        	System.out.println("de code is goed");     
        	break;
        }
        	    
	}
       sc.close();    
        }
        
    }    