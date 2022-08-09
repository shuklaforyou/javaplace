interface Animal {
    int eyes = 2;

    void walk();
}

// multipule interface
interface Herbivore {

}

class Horse implements Animal, Herbivore {
    public void walk() {
        System.out.println("walk on 4 leg");
    }
}

public class oops4 {
    public static void main(String args[]) {
        Horse horse = new Horse();
        horse.walk();
    }
}
