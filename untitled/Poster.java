package untitled;

public class Poster{
    private String picture;
    public Poster (String picture){
        this.picture = picture;
    }
    public String getPicture(){
        return picture;
    }
    public void promote(Candy candy){
        System.out.println("poster "+ picture + " promote " + candy.getName() );
    }
}