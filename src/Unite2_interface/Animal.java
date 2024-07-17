package Unite2_interface;

public abstract class Animal {
    private String name;

    public String getName() {
        return name;
    }

   void setName(String name) {
        this.name = name;
    }
    public Animal(String name){
        this.name=name;
    }
    public abstract void eat(Food food);

    public abstract void shoot();//抽象方法abstract
}
