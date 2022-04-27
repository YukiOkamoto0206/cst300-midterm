import java.util.HashMap;
import java.util.Objects;

public abstract class Monster {
    private static int monsterCount;
    protected String name;
    protected Action action;

    Monster() {
        this("MonsterFace");
    }

    Monster(String name) {
        this.name = name;
        addMonster();
    }


    public static void addMonster(HashMap<Integer, Monster> monsters, Monster m) {
        if (m == null) return;
        int key = monsters.size() + 1;
        monsters.put(key, m);
    }

    public abstract boolean performAction(int value);

    private static void addMonster() {
        monsterCount++;
    }

    public final boolean eat(String food) {
        if (this instanceof Dragon) {
            if (food.equals("peasants")) {
                System.out.println("Burna-licious!");
                return true;
            } else {
                System.out.println("Dragons don't eat " + food);
                return false;
            }
        } else if (this instanceof CookieMonster) {
            if (food.equals("cookie")) {
                System.out.println("OM NOM NOM");
                return true;
            } else {
                System.out.println("C is for cookie, not " + food);
                return false;
            }
        } else {
            System.out.println("I don't know what creature this is");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", action=" + action +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Monster)) return false;
        Monster monster = (Monster) o;
        return Objects.equals(getName(), monster.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAction());
    }

    public static int getMonsterCount() {
        return monsterCount;
    }

    public static void setMonsterCount(int monsterCount) {
        Monster.monsterCount = monsterCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }
}
