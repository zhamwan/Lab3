package untitled;

import java.util.Objects;

public abstract class Human{
    private String name;
    private int age;
    private String work;
    Human(String name, int age, String work){
            this.name = name;
            this.age = age;
            this.work = work;
    }
    public String  getname(){
        return name;
    }
    public String  getWork(){
        return work;
    }
    public void read(NewsPaper news_paper){
        System.out.println(name + "  read news paper");
    }
    public Photo createphoto(String object, Human human, ActionType action, Human human1){
        Photo photo = new Photo(object,human,action);
        System.out.println(human1.getWork() + " create photo " + human.getname() + " " + action +" " + object);
        return photo;
    }
    public String tostring(){
        return "Human{" + " name: " + name + ", age: " + age + ", work: " + work +" }";
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return Objects.equals(name, human.name );
    }
    public int hashCode() {
        return Objects.hash(name);
    }
}