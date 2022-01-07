import java.util.Scanner;

public class Article implements Exportable {

    private static int derniere_code = 0 ; 
    private int code ;
    private String nom ;
    private double prix ;

    public Article(String nom , double prixHT)throws negatifPrixException {
        if(prixHT<0) 
            throw new negatifPrixException();
        
        prix=prixHT;
        this.nom=nom;
        code = derniere_code++;
    }
    @Override
    public String paysDestination() {
        Scanner input = new Scanner(System.in);
        System.out.println("donnez pays voulu:");
        
        return input.next();
    }

    @Override
    public double prixTransport() {
        return (prix*50)/100 ;
    }

    public void affiche(){
        double prix_total = prixTransport() + prix ;
        System.out.println("nom:"+nom+"code:"+code+"pays:"+paysDestination()+"prix total :"+prix_total);

    }
    public String getNom() {
        return nom;
    }

}
