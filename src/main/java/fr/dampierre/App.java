package fr.dampierre;

import java.util.Random;
import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
          Scanner clavier= new Scanner (System.in);
    Random generateur = new Random();
    System.out.println("Bienvenu dans notre jeu, Le but est de parcourir les 20 cases du jeu avec 5 lancers d'un dé. Un dé à 6 faces sera donc lancé 5 fois. On fait toujours les 5 lancers. ");
    clavier.nextLine();
    String message="";
    int i;
    int rest=0;
    int increment=0;
    int nbrTeste=0;
    boolean gagner=false;
    
    do {
        
        increment=0;
        for ( i=1; i<=5; i++){
            
            int nbreAleatoire= generateur.nextInt(6) + 1;
            increment+=nbreAleatoire;
            rest = 20-increment;
            System.out.println("Lancer "+i+" : vous avez fait "+ nbreAleatoire+ ". vous etes sur la case "+increment+ " (encore "+rest +" cases) ");
            
            
        
        }
   
   
        if (rest == 0) {
        gagner=true;
        message="Vous avez gagné";
        System.out.println(message);
    
        }
        else {
        gagner=false;
        message="Vous avez perdu!";
        System.out.println(message);
        } 
        nbrTeste++;
    } while (gagner==false);

    System.out.println("nombre de tentatives: "+ nbrTeste);
    }
    
}
