import java.util.prefs.NodeChangeEvent;

public class Fragil extends Article {
    private String embalage ;
    public Fragil(String nom , double prixHT,String embalage) throws negatifPrixException {
        super(nom,prixHT);
        this.embalage=embalage;
    }
    
    @Override
    public double prixTransport() {
        return 2*prixTransport();
    }
    

}
