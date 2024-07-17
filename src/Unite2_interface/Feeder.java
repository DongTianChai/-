package Unite2_interface;

public class Feeder {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
public Feeder(String name){
        this.name=name;
}
    public void speak(){
        System.out.println("欢迎来到动物园！");
        System.out.println("我是饲养员 "+getName());
    }
    public void feed(Animal a,Food food){
        a.eat(food);
    }

}
