package lotr;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import lombok.SneakyThrows;

public class CharacterFactory {
    @SneakyThrows
    public static Character createCharacter() {
        List<Class<? extends Character>> character = Arrays.asList(Hobbit.class, Elf.class, King.class, Knight.class);
        return character.get(new Random().nextInt(character.size())).newInstance();
    }
}