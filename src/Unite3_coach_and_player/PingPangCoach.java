package Unite3_coach_and_player;

public class PingPangCoach extends Coach implements SpeakingEnglish{
    @Override
    public void teach() {
        System.out.println("乒乓球教练教乒乓");
    }

    @Override
    public void eat() {
        System.out.println("乒乓球教练吃狗肉");
    }

    public PingPangCoach() {
    }

    public PingPangCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void speak() {
        System.out.println("乒乓球运动员说英语");
    }
}
