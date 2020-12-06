package untitled;

public class NewsPaper{
    private String time;
    public NewsPaper(String time){
        this.time = time;
    }
    public void release( Photo photo){
        System.out.println("release " + time + " newspaper " + photo.getHuman() );
    }
}