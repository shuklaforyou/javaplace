
class Student {
    String name;
    static String school;

    public static void changeSchool() {
        school = "newschool";
    }
}

class oops5 {
    public static void main(String args[]) throws Exception {
        Student s1 = new Student();
        s1.name = "abhishek";
        System.out.println(s1.school);

    }
}
