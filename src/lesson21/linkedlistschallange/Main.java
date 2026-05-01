package lesson21.linkedlistschallange;

import java.util.*;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static LinkedList<Town> placesToVisit = new LinkedList<>();



    public static void main(String[] args) {


        placesToVisit = createPlaces();
        placesToVisit.sort(Comparator.comparingInt(Town::getDistance));
        program();

    }

    public static LinkedList<Town> createPlaces() {
        return new LinkedList<>(List.of(
                new Town("Sydney", 0),
                new Town("Adelaide", 1374),
                new Town("Alice Springs", 2771),
                new Town("Brisbane", 917),
                new Town("Darwin", 3972),
                new Town("Melbourne", 877),
                new Town("Perth", 3923)));
    }

    public static void program() {

        ListIterator<Town> iterator = placesToVisit.listIterator(0);
        Town current = iterator.next();
        System.out.println("List of Towns to visit starts from: " + current);

        System.out.println("""
                Available actions (select word or letter):
                (F)orward
                (B)ackward
                (L)ist Places
                (M)enu
                (Q)uit
                Enter Value:""" + " ");

        boolean flag = true;
        while (flag) {
            // code for getting charInput
            String wordInput = scanner.nextLine();
            String wordInputUp = wordInput.toUpperCase();
            if (wordInputUp.isEmpty()) {
                continue;
            }
            char ch = wordInputUp.charAt(0);
            switch (ch) {
                case 'F' -> {
                    if (iterator.hasNext()) {
                        Town nextTown = iterator.next();
                        if (nextTown != current) {
                            System.out.println("Moving forward  from: " + current + " to: " + nextTown);
                            current = nextTown;
                        } else if (iterator.hasNext()) {
                            nextTown = iterator.next();
                            System.out.println("Moving forward  from: " + current + " to: " + nextTown);
                            current = nextTown;
                        } else {
                            System.out.println("Reached the end of list");
                        }

                    } else {
                        System.out.println("Reached the end of list");
                    }
                }
                case 'B' -> {
                    if (iterator.hasPrevious()) {
                        Town prevTown = iterator.previous();
                        if (prevTown != current) {
                            System.out.println("Moving backward  from: " + current + " to: " + prevTown);
                            current = prevTown;
                        } else if (iterator.hasPrevious()) {
                            prevTown = iterator.previous();
                            System.out.println("Moving backward  from: " + current + " to: " + prevTown);
                            current = prevTown;
                        } else  {
                            System.out.println("Reached the start of list");
                        }

                    } else {
                        System.out.println("Reached the start of list");
                    }
                }
                case 'L' -> printList();
                case 'M' -> printMenu();
                case 'Q' -> {
                    System.out.println("Quit");
                    flag = false;
                }


            }
        }
    }

    public static void printList() {
        System.out.println("List of Towns to visit:");
        for (Town town : placesToVisit) {
            System.out.println("- " + town.getName() + " (" + town.getDistance() + "km)");
        }
    }

    public static void printMenu() {
        System.out.println("""
                Available actions (select word or letter):
                (F)orward
                (B)ackward
                (L)ist Places
                (M)enu
                (Q)uit""" + " ");
    }
}

class Town {

    private String name;
    private int distance;

    public Town(String name, int distance) {
        this.name = name;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return name + " " + distance;
    }
}
