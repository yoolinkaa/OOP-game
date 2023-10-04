package kick;
import lotr.Character;

public class CryKick implements kickSterategy{
    @Override
    public void kick(Character whoKick, Character whoisKicked) {
        System.out.println("🥴🥴🥴");
    }
}
