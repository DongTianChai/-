package Unite3_coach_and_player;

public class BasketbaallPlayer extends Player {
    @Override
    public void eat() {
        System.out.println("篮球运动员吃蛋");
    }

    @Override
    public void study() {
        System.out.println("篮球运动员学习篮球");
    }

    public BasketbaallPlayer() {
    }

    public BasketbaallPlayer(String name, int age) {
        super(name, age);
    }
}
