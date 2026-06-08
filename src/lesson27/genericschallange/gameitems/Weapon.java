package lesson27.genericschallange.gameitems;

import lesson27.genericschallange.GameItem;

public class Weapon extends GameItem{

    private int damage;
    private String weaponType;

    public Weapon(String name, String rarity, int value, String weaponType, int damage) {
        super(name, rarity, value);
        this.damage = damage;
        this.weaponType = weaponType;
    }


    @Override
    public boolean matches(String field, String value) {
        if (field.equalsIgnoreCase("DAMAGE")) {
            return damage == Integer.parseInt(value);
        } else if (field.equalsIgnoreCase("WEAPONTYPE")) {
            return weaponType.equalsIgnoreCase(value);
        } else {
            return super.matches(field, value);
        }
    }

    @Override
    public String toString() {
        return super.toString() + " " +
                "damage=" + damage +
                ", weaponType='" + weaponType + '\'' +
                ")";
    }
}
