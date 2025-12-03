package personnages;

public class Ronin extends Humain {
    private int honneur = 1;

    public Ronin(String nom, String boissonFavorite, int argent) {
        super(nom, boissonFavorite, argent);
    }

    public void donner(Commercant beneficiaire) {
        int don = getArgent() / 10;
        parler(beneficiaire.getNom() + " prend ces " + don + " sous.");
        perdreArgent(don);
        beneficiaire.recevoir(don);
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
