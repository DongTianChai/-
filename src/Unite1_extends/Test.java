package Unite1_extends;

public class Test {
    public static void main(String args[]){
        Cat c=new Cat("狸花猫",6,"花白");
        System.out.println(c.info());
        c.shout();
    }

}
class Animal {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public Animal(String name,int age){
        this.age=age;
        this.name=name;
    }
    public String info(){
        return "姓名："+this.name+"\t"+"年龄："+this.age;
    }
    void shout(){
        System.out.println("动物叫出声");
    }

}
class Cat extends Animal {
    public Cat(String name, int age, String color) {
        super(name, age);
        this.color=color;
    }

    @Override
    public String info(){

        return super.info()+"颜色"+this.color;
    }
    @Override
    void shout(){
        super.shout();
        System.out.println("喵喵喵");
    }
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}