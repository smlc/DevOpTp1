package friendsofmine;

/**
 * Created by walid on 19/10/2016.
 */
public class Activite {

    private String titre;
    private String descriptif;

    public String getTitre() {
        return this.titre;
    }

    public void setTitre (String t) {
        if ((t == null) || (t == "")) {
            this.titre = "unTitre";
        } else {
            this.titre = t;
        }
    }

}
