package b3.epsi.tp1.models;

/**
 * Created by User on 21/04/2017.
 */

public class RectangleGeo {


    private int longueur;
    private int largeur;



    public RectangleGeo(int longueur, int largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }


    public RectangleGeo() {
        this(10,30);

    }



    public int getLongueur() {
        return longueur;
    }

    public void setLongueur(int longueur) {
        this.longueur = longueur;
    }

    public int getLargeur() {
        return largeur;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }


}
