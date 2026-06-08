package lesson27.genericschallange.gameitems;

import lesson27.genericschallange.GameItem;

public class Armor extends GameItem {

    private int defense;
    private String slot;

    public Armor(String name, String rarity, int value, String slot, int defense) {
        super(name, rarity, value);
        this.slot = slot;
        this.defense = defense;
    }

    public String getSlot() {
        return slot;
    }

    public int getDefense() {
        return defense;
    }

    @Override
    public boolean matches(String field, String value) {
        if (field.equalsIgnoreCase("DEFENSE")) {
            return defense == Integer.parseInt(value);
        } else if (field.equalsIgnoreCase("SLOT")) {
            return slot.equalsIgnoreCase(value);
        } else {
            return super.matches(field, value);
        }
    }

    @Override
    public String toString() {
        return "Armor{" +
                "defense=" + defense +
                ", slot='" + slot + '\'' +
                "} " + super.toString();
    }
}
