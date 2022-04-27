public class CookieMonster extends Monster {
    private int monsterNumber;

    public CookieMonster() {
        this("Blue");
    }

    public CookieMonster(String name) {
        super(name);
        Action sing = new Sing(this);
        setAction(sing);
        this.monsterNumber = getMonsterCount();
    }

    @Override
    public boolean performAction(int mins) {
        return action.perform(mins);
    }

    @Override
    public String toString() {
        return "CookieMonster{" +
                "monsterNumber=" + monsterNumber +
                ", name='" + name + '\'' +
                ", action=" + action +
                '}';
    }
}
