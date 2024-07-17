package Unite3_coach_and_player;

public class PingPangPlayer extends Player implements SpeakingEnglish {
    @Override
    public void eat() {
        System.out.println("乒乓球运动员吃牛肉");
    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员学习乒乓球");
    }

    public PingPangPlayer() {
    }

    public PingPangPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void speak() {
        System.out.println("乒乓球运动员讲英语");
    }
}
