public class Dragon extends Monster {
    private int monsterNumber;

    public Dragon() {
        this("trogdor");
    }

    public Dragon(String name) {
        super(name);
        Action flap = new Flap(this);
        setAction(flap);
        this.monsterNumber = getMonsterCount();
    }

    @Override
    public boolean performAction(int value) {
        return action.perform(value);
    }

    @Override
    public String toString() {
        return "Dragon{" +
                "monsterNumber=" + monsterNumber +
                ", name='" + name + '\'' +
                ", action=" + action +
                '}';
    }
}
