package lesson27.genericschallange.gameitems;

import lesson27.genericschallange.GameItem;

public class Potion extends GameItem {

    private String effect;
    private int duration;

    public Potion(String name, String rarity, int value, String effect, int duration) {
        super(name, rarity, value);
        this.effect = effect;
        this.duration = duration;
    }

    @Override
    public boolean matches(String field, String value) {
        if (field.equalsIgnoreCase("DAMAGE")) {
            return effect.equalsIgnoreCase(value);
        } else if (field.equalsIgnoreCase("DURATION")) {
            return duration == Integer.parseInt(value);
        } else {
            return super.matches(field, value);
        }
    }

    @Override
    public String toString() {
        return "Potion{" +
                "effect='" + effect + '\'' +
                ", duration=" + duration +
                "} " + super.toString();
    }
}
