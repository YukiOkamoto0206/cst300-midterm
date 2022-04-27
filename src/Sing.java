public class Sing implements Action {
    Monster singer;

    Sing(Monster m) {
        this.singer = m;
    }

    @Override
    public boolean perform(int mins) {
        if (!(singer instanceof CookieMonster)) {
            System.out.println(singer.getClass() + " isn't the type of Monster that sings (how sad).");
            return false;
        } else {
            if ((mins % 2 == 1) && (mins < 15)) {
                System.out.println(singer.name + " sings C IS FOR COOKIE!! for " + mins + " minutes");
                return true;
            }
        }
        System.out.println(singer.name + " says it is not time for singing. Maybe in " + mins + " minutes");
        return false;
    }
}
