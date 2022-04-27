public class Flap implements Action {
    Monster flapper;

    public Flap(Monster m) {
        this.flapper = m;
    }

    @Override
    public boolean perform(int flaps) {
        if (!(flapper instanceof Dragon)) {
            System.out.println(flapper.getClass() + " isn't the type of monster that flaps.");
            return false;
        } else {
            if ((flaps % 2 == 0) || (flaps < 20)) {
                System.out.println(flapper.name + " flaps it's tiny wings " + flaps + " times");
                return true;
            }
        }
        System.out.println(flapper.name + " can't even.");
        return false;
    }
}
