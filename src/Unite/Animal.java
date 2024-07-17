package Unite;

public interface Animal {
    int ID=1;//全局变量
    String Name="牧羊犬";
    void shoot();
    public void info();
    static int getId(){
        return Animal.ID;
    }

}
interface Action{
    public void eat();
}
class Dog implements Animal,Action{
    @Override
    public void shoot(){
        System.out.println("汪汪汪");
    }
    @Override
    public void info(){
        System.out.println(" ");
    }
    @Override
    public void eat(){
        System.out.println("狗吃骨头");
    }
}