package lotr;

import java.util.Random;

public class KingAndKnight extends Character {
    public KingAndKnight(int hp_min, int hp_max, int power_min, int power_max) {
        super(new Random().nextInt(hp_max - hp_min + 1) + hp_min,
                new Random().nextInt(power_max - power_min + 1) + power_min);
    }
    public void kick(Character c) {
        c.setHp(c.getHp() - this.getPower());
    }
}
