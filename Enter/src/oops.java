class pen {
    String color;
    String Type;

    public void write() {
        System.out.println("writing somthing");

    }

    public void printcolor() {
        System.out.println(this.color);
    }

}

class Student {
    String name;
    int age;

    // public void printInfo() {
    // System.out.println(this.name);
    // System.out.println(this.age);

    // }

    // Student(Student s2) {
    // this.name = s2.name;
    // this.age = s2.age;
    // }

    // Student() {

    // }

    public void printInfo(String name) {
        System.out.println(name);
    }

    public void printInfo(int age) {
        System.out.println(age);
    }

    public void printInfo(String name, int age) {
        System.out.println(name + " " + age);
    }
}

public class oops {
    public static void main(String args[]) {
        // pen pen1 = new pen();
        // pen1.color = "blue";
        // pen1.Type = "gel";
        // pen1.printcolor();

        // pen pen2 = new pen();
        // pen2.color = "black";
        // pen2.Type = "ballpen";
        // pen2.printcolor();

        Student s1 = new Student();
        s1.name = "aman";
        s1.age = 24;

        s1.printInfo(s1.name, s1.age);

    }

}
