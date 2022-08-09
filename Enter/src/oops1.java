// inhertance important Alert part 1

class tStudent {
    String color;
    static String school;
}

// class Triangle extends Shape {

// }

public class oops1 {
    public static void main(String args[]) {
        tStudent.school = "may flower";
        tStudent t1 = new tStudent();
        t1.color = "red";

        System.out.println(tStudent.school);
    }
}
