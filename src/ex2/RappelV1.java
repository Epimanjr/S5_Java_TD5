/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Maxime BLAISE
 */
public class RappelV1 {

    Timer minuteur = new Timer();
    public RappelV1(int secondes) {
        
        Tache t = new Tache();
        minuteur.schedule(t, secondes * 1000, secondes * 1000);
    }

    class Tache extends TimerTask {

        @Override
        public void run() {
            // Instruction à exécuter toutes les XX secondes
            System.out.println("Veuillez saisir votre nom : ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir votre nom : ");
        RappelV1 rappelV1 = new RappelV1(2);
        String nom = sc.nextLine();

        System.out.println("Bonjour");
        rappelV1.minuteur.cancel();
    }
}
