package Block2.Lesson1;

abstract class Person {
    String name;
    int age;
    double height;
    String department;


    abstract void introduce();

    void describePerson(){
        System.out.println(
                name + " is " + age + " old and is " + height + " tall. " +
                        "Works in " + department + " department"
        );
    }
}
