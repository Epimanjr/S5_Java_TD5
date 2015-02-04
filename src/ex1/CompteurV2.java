package ex1;


import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Maxime BLAISE
 */
public class CompteurV2 implements Runnable {
    
    /**
     * Nom du compteur, par exemple toto.
     */
    private String nom;
    
    /**
     * Nombre jusqu'auquel il doit compter.
     */
    private int n;

    /**
     * Construit un compteur à partir d'un nom.
     * 
     * @param nom le nom du compteur, par exemple toto.
     * @param n nombre
     */
    public CompteurV2(String nom, int n) {
        this.nom = nom;
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    
    

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public void run() {
        // Parcours pour compter
        for(int i=0;i<n;i++) {
            // Affichage du nombre
            System.out.println(nom + ": "+i);
            
            // Pause aléatoire
            int alea = (int) (Math.random() * 5000);
            
            try {
                Thread.sleep(alea);
            } catch (InterruptedException ex) {
                Logger.getLogger(CompteurV2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        // Fin du comptage
        System.out.println("*** " + nom + " a fini de compter jusqu'à " + n + " ***");
    }
    
    
    public static void main(String[] args) {
        // Création de plusieurs compteur
        Thread t1 = new Thread(new CompteurV2("toto", 15));
        Thread t2 = new Thread(new CompteurV2("titi", 15));
        Thread t3 = new Thread(new CompteurV2("tata", 15));
        
        // Lancement
        t1.start();
        t2.start();
        t3.start();
    }
    
}
