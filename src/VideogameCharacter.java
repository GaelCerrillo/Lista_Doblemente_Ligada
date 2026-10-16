import java.util.Objects;

public class VideogameCharacter {
    private final String name;
    private final String game;

    public VideogameCharacter(String name, String game) {
        this.name = name;
        this.game = game;
    }

    @Override
    public String toString() {
        return name + " (" + game + ")";
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        VideogameCharacter other = (VideogameCharacter) o;
        return Objects.equals(name, other.name) && Objects.equals(game, other.game);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, game);
    }
}