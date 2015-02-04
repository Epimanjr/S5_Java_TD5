/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Maxime
 */
public class RappelV3 implements Runnable {

    int secondes;

    public RappelV3(int secondes) {
        this.secondes = secondes;
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("Veuillez saisir votre nom : ");
                Thread.sleep(secondes * 1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(RappelV2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    
    public static void main(String[] args) {
        Thread t = new Thread(new RappelV3(2));
        t.start();
        
        Scanner sc = new Scanner(System.in);
        String nom = sc.nextLine();

        System.out.println("Bonjour");
        t.stop();
    }
}
