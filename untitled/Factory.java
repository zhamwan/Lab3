package untitled;

public class Factory{
    private String holdername;
    public Factory(String holdername){
        this.holdername = holdername;
    }
    public Candy makecandy(String name, boolean fresh){
        System.out.println("factory make " + name );
        Candy candy  = new Candy(name,fresh);
        return candy;
    }
    public void payday(){
        System.out.println(holdername + " payday" );
    }
}