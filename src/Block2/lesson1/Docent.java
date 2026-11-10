package Block2.lesson1;

public class Docent extends Person {
    @Override
    public void introduce() {
        System.out.println("Я доцент");
    }

    public void describePerson(){
        System.out.println(
                name + " is " + age + " old and is " + height + " tall. " +
                        "Works in " + department + " department"
        );
    }
}
