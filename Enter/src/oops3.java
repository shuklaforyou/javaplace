
abstract class Animal { // consept work it just exist in word but not in real
    abstract void walk(); // not real work

    Animal() {
        System.out.println("you are creating animal");
    }

    public void eat() {
        System.out.println("Animal eats");
    }
}

class Horse extends Animal {
    Horse() {
        System.out.println("you are creating a Horse");
    }

    public void walk() {
        System.out.print("walks 4 leg");
    }
}

class Chicken extends Animal {
    Chicken() {
        System.out.println("you are creating a new Chicken");
    }

    public void walk() {
        System.out.println("walks on 2 legs");
    }
}

public class oops3 {
    public static void main(String args[]) {
        Horse hores = new Horse();

    }

}
