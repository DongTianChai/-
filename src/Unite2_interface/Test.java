package Unite2_interface;

public class Test {
    public static void main(String args[]){
        Animal dog=new Dog("小狗");
        Feeder feeder=new Feeder("小华");
        feeder.speak();
        dog.shoot();
        Food food=new Bone();
        feeder.feed(dog,food);
        Cat cat=new Cat("小猫");
        cat.shoot();
        food=new Fish("黄花鱼");
        feeder.feed(cat,food);
    }
}
