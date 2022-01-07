import java.util.ArrayList;

public class Magasin {
    private String nom ;
    ArrayList<Article> articles = new ArrayList<Article>();

    public Magasin (String nom){
        this.nom=nom;
    }

    public int ajouter(Article myArticle){
        articles.add(myArticle);
        return 0;
    }

    public boolean contenir(String nom) {

        for(int i=0;i<articles.size();i++){
            if(articles.get(i).getNom().equals(nom))
                return true ;

        }
        return false;
    }



}