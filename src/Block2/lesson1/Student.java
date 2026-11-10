package Block2.lesson1;

public class Student extends Person {
    @Override
    public void introduce() {
        System.out.println("Я студент");
    }

    public void describePerson(){
        System.out.println(
                name + " is " + age + " old and is " + height + " tall. " +
                        "Studys in " + department + " department"
        );
    }

}
