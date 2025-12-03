package personnages;

public class Commercant extends Humain {

    public Commercant(String nom, int argent) {
        super(nom, "thé", argent);
    }

    public int seFaireExtorquer() {
        int argentExtorque = getArgent();
        perdreArgent(argentExtorque);
        parler("J’ai tout perdu! Le monde est trop injuste...");
        return argentExtorque;
    }

    public void recevoir(int argent) {
        gagnerArgent(argent);
        parler(argent + " sous ! Je te remercie généreux donateur!");
    }

    protected void parler(String texte) {
        System.out.println("(" + getNom() + ") - " + texte);
    }

    protected void gagnerArgent(int gain) {
        super.gagnerArgent(gain);
    }

    protected void perdreArgent(int perte) {
        super.perdreArgent(perte);
    }
}
