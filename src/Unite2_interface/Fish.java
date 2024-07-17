package Unite2_interface;

public class Fish extends Animal implements Food{

    public void eat(Food food){

    }
    public void shoot(){

    }
    public String getName(){

        return super.getName();
    }
    public Fish(String name){
        super(name);
    }
}
