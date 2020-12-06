package untitled;

public class EarthHuman extends Human{
    private String name;
    private int age;
    private String work;
    public EarthHuman(String name, int age, String work){
        super(name, age, work);
        this.name = name;
        this.age = age;
        this.work = work;
    }
    public void landing(EarthHuman earthHuman, City city){
        System.out.println(earthHuman.getname() + " landing on " + city.getNameCity() +" " + city.getPlaceCity() );
    }
}