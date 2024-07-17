package Unite2_interface;

class Dog extends Animal{

    public void shoot() {
        System.out.print("汪汪汪~~~");
    }
    public void eat(Food food){
        System.out.println(super.getName()+"正在啃着香喷喷的"+food.getName());
    }
    public Dog(String name){
        super(name);
    }
}
