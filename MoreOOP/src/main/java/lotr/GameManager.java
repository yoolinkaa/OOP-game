package lotr;

public class GameManager {
    public void fight(Character c1, Character c2) {
        int round = 1;
        System.out.println("FIGHTERS: \n" + c1 + "\nVS \n" + c2);
        while (c1.isAlive() && c2.isAlive() && round < 10) {
            System.out.println("Round" + round);
            System.out.println(c1.getClass().getSimpleName() + " attacks " + c2.getClass().getSimpleName());
            c1.kick(c2);
            if (!c2.isAlive()) {
                System.out.println(c2.getClass().getSimpleName() + " is defeated!");
                System.out.println(c1.getClass().getSimpleName() + " wins!");
                break;
            }
            System.out.println(c2.getClass().getSimpleName() + " attacks " + c1.getClass().getSimpleName());
            c2.kick(c1);

            if (!c1.isAlive()) {
                System.out.println(c1.getClass().getSimpleName() + " is defeated!");
                System.out.println(c2.getClass().getSimpleName() + " wins!");
                break;
            }
            round++;
            System.out.println("Current status:");
            System.out.println(c1.getClass().getSimpleName() + ": " + "HP=" + c1.getHp() + ", Power=" + c1.getPower());
            System.out.println(c2.getClass().getSimpleName() + ": " + "HP=" + c2.getHp() + ", Power=" + c2.getPower());
            System.out.println("------------------------------");
        }
    }

    public static void main(String[] args) {
        CharacterFactory characterFactory = new CharacterFactory();
        GameManager gameManager = new GameManager();

        Character player1 = characterFactory.createCharacter();
        Character player2 = characterFactory.createCharacter();

        gameManager.fight(player1, player2);

    }
}
