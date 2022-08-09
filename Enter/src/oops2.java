
// inhertance part 2 Alert

import bank.*;

class Shape {
    public void area() {
        System.out.println("display area");
    }
}

class Triangle extends Shape {
    public void area(int l, int h) {
        System.out.println(l / 2 * l * h);
    }
}

// class EquilateralTrinagle extends Triangle {
// public void area(int l, int h) {
// System.out.println(l / 2 * l * h);
// }
// }

class circle {
    public void area(int r) {
        System.out.println((3.14) * r * r);
    }
}

public class oops2 {
    public static void main(String args[]) {
        bank account1 = new bank();
        account1.name = "coustomr1";
    }
}
