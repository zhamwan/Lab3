package untitled;

public class Photo{
    private Human human;
    private ActionType action;
    private String object;
    public Photo(String object, Human human, ActionType action){
        this.object = object;
        this.human = human;
        this.action = action;
    }
    public String getObject(){
        return object;
    }
    public String getHuman(){
        return human.getname();
    }
    public ActionType getAction(){
        return action;
    }
}