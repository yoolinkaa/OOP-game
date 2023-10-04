package lotr;

// Elf class
public class Elf extends Character {
    // @Override
    public Elf() {
        super(10, 10);
    }

    public void kick(Character c) {
        if (c.power < this.power) {
            c.setHp(0);
        } else {
            this.setHp(0);
        }
    }
}
