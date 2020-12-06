import untitled.*;

public class Main{
    public static void main(String[] args){
        EarthHuman nez = new EarthHuman(" Neznayka", 15, "no work");
        City city = new City(" Davilon", " Loon");
        nez.landing(nez, city);
        NewsPaper news = new NewsPaper(" morning");
        LoonHuman rep = new LoonHuman("-", 15 , " reporter");
        rep.createphoto("space suit ", nez, ActionType.wear, rep);
        rep.createphoto(" car", nez, ActionType.sit, rep);
        rep.createphoto(" car", nez, ActionType.go_out, rep);
        rep.createphoto(" hotel", nez, ActionType.stand, rep);
        Poster poster = new Poster("Candy Zary");
        news.release(rep.createphoto(" poster", nez, ActionType.read, rep));
        LoonHuman people = new LoonHuman(" people ", 100, "work");
        people.interesting(nez);
        Candy candy = new Candy(" Zary", true);
        poster.promote(candy);
        people.buy(candy);
        LoonHuman holder = new LoonHuman(" Holder", 15 , "Holder factory");
        holder.sell(candy);
        Factory factory = new Factory(holder.getname());
        factory.makecandy("Zary", true);
        factory.makecandy("Zary", true);
        factory.makecandy("Zary", true);
        factory.payday();
        factory.payday();
        factory.payday();
    }
}