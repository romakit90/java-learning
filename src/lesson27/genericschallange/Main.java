package lesson27.genericschallange;

import lesson27.genericschallange.gameitems.Armor;
import lesson27.genericschallange.gameitems.Potion;
import lesson27.genericschallange.gameitems.Weapon;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Weapon> weaponList = new ArrayList<>();
        List<Potion> potionList = new ArrayList<>();
        List<Armor> armorList = new ArrayList<>();

        weaponList.add(new Weapon("Sword", "Rare", 150, "Melee", 35));
        weaponList.add(new Weapon("Sword", "Common", 100, "Melee", 25));
        weaponList.add(new Weapon("Sword", "Epic", 200, "Melee", 45));
        weaponList.add(new Weapon("Bow", "Common", 100, "Ranged", 20));
        weaponList.add(new Weapon("Bow", "Rare", 150, "Ranged", 30));
        weaponList.add(new Weapon("Bow", "Epic", 200, "Ranged", 40));

        potionList.add(new Potion("Health Potion", "Common", 100, "Heal", 12));
        potionList.add(new Potion("Mana Potion", "Rare", 150, "Mana", 15));

        armorList.add(new Armor("Helmet", "Common", 100, "Head", 15));
        armorList.add(new Armor("Chestplate", "Epic", 200, "Body", 35));

        printItems(weaponList);

        List<Potion> rarePotion = Vault.findMatches(potionList, "RARITY", "RARE");
        System.out.println(rarePotion);

        List<Armor> headArmor = Vault.findMatches(armorList, "SLOT", "HEAD");
        System.out.println(headArmor);

        List<Weapon> meleeWeapon = Vault.findMatches(weaponList, "WEAPONTYPE", "MELEE");
        System.out.println(meleeWeapon);

        weaponList.sort(Comparator.comparing(Weapon::getName));
        System.out.println(weaponList);

        armorList.sort(Comparator.comparing(Armor::getDefense));
        System.out.println(armorList);

        swapFirstAndLast(potionList);
        System.out.println(potionList);


    }

    public static void printItems(List<? extends LootItem> items) {

        System.out.println(items);
    }

    public static <U extends LootItem> void swapFirstAndLast(List<U> items) {

        if (items == null || items.size() < 2) return;;

        U first = items.get(0);
        U last = items.get(items.size() - 1);

        items.set(0, last);
        items.set(items.size() - 1, first);
    }

    public static void sortByName(List<? extends LootItem> items) {
        items.sort(Comparator.comparing(LootItem::getName));
    }

    public static void sortByRarityValue(List<? extends GameItem> items) {
        items.sort(Comparator.comparing(LootItem::getRarity)
                .thenComparingInt(i -> ((GameItem) i).getValue()));
    }
}
