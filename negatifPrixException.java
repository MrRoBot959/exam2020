public class negatifPrixException extends Exception{
    @Override
    public String getMessage() {
        System.out.println("le prix est negative !!!");
        return "prix negative";
    }
}
