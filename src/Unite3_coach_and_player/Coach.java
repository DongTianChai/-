package Unite3_coach_and_player;

public abstract class Coach extends Person{
    public Coach() {
    }

    public Coach(String name, int age) {
        super(name, age);
    }
    public abstract void teach();
}
