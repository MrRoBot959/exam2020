public class Main {
    public static void main(String[] args) throws negatifPrixException{
        Article[] myArticles = new Article[4];

        try {

        myArticles[0]=new Article("doliprane",15);
        myArticles[1]=new Article("milka",3);
        myArticles[2]=new Fragil("f1",100, "hhhhh1");   
        myArticles[3]=new Fragil("f2",200, "hhhhh2");    

        Magasin myMagasin = new Magasin("mosaba9a");
        myMagasin.ajouter(myArticles[0]);
        myMagasin.ajouter(myArticles[1]);
        myMagasin.ajouter(myArticles[2]);

        if(myMagasin.contenir("f2")){
            System.out.println("exist");
        }else{
            System.out.println("article non exist");
        }
        myMagasin.ajouter(myArticles[3]);


        } catch (negatifPrixException e) {
            e.getMessage();
        }
    }
}
