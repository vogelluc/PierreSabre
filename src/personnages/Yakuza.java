package personnages;

public class Yakuza extends Humain {
    private String clan;
    private int reputation = 4;

    public Yakuza(String nom, String boissonFavorite, int argent, String clan) {
        super(nom, boissonFavorite, argent);
        this.clan = clan;
    }

    public int getReputation() {
        return reputation;
    }

    public int perdre() {
        int argentPerdu = getArgent();
        perdreArgent(argentPerdu);
        reputation--;
        parler("J’ai perdu mon duel et mes " + argentPerdu + " sous, snif... J'ai déshonoré le clan de " + clan + ".");
        return argentPerdu;
    }

    public void gagner(int gain) {
        gagnerArgent(gain);
        reputation++;
        parler("Ce ronin pensait vraiment me battre ? Je l'ai dépouillé de ses " + gain + " sous.");
    }

    public void extorquer(Commercant victime) {
        parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
        parler(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
        int argentVole = victime.seFaireExtorquer();
        gagnerArgent(argentVole);
        reputation++;
        parler("J’ai piqué les " + argentVole + " sous de " + victime.getNom()
                + ", ce qui me fait " + getArgent() + " sous dans ma poche. Hi ! Hi !");
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
