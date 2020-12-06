package untitled;

public class LoonHuman extends Human implements Buy, Sell {
    private String name;
    private int age;
    private String work;
    public LoonHuman(String name, int age, String work){
        super(name, age, work);
        this.name = name;
        this.age = age;
        this.work = work;
    }
    public void interesting(EarthHuman earthHuman){
        System.out.println(name + " interesting " + earthHuman.getname() );
    }
    public void eatcandy(Candy candy){
        System.out.println(name + " eat " + candy.getName() );
    }
    public void buy(Candy candy) {
        System.out.println(name + " buy " + candy.getName());
    }
    public void sell(Candy candy) {
        System.out.println(name + " sell " + candy.getName());
    }
}