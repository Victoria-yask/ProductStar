package Block2.lesson1;

public abstract class Person {
    String name;
    int age;
    double height;
    String department;


    public abstract void introduce();

    public void describePerson(){
        System.out.println(
                name + " is " + age + " old and is " + height + " tall. " +
                        "Works in " + department + " department"
        );
    }
}
