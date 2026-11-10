package Block2.lesson1;

public class Main {
    static void main(String[] args) {

        Student student = new Student();
        student.age = 18;
        student.name = "Piter";
        student.height = 1.8;
        student.department = "University";
        student.introduce();
        student.describePerson();

        Docent docent = new Docent();
        docent.age = 40;
        docent.name = "Mike";
        docent.height = 1.9;
        docent.department = "University";
        docent.introduce();
        docent.describePerson();
    }
}
