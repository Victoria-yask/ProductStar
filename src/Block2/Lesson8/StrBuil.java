package Block2.Lesson8;

public class StrBuil {

    public static void main(String[] args) {

        //Java внутри создает 5 новых объектов String, чтобы склеить их.
        // Если таких операций в программе много, это сильно нагружает память.
        String[] profileData = new String[0];
        String name = "Имя: " + profileData[0];
        String lastName = "Фамилия: " + profileData[1];
        String phone = "Телефон: " + profileData[2];
        String result = name + "\n" + lastName + "\n" + phone;

        //StringBuilder
        String[] profileData1;
        String[] profile = new String[0];

        StringBuilder builder = new StringBuilder()
                .append("Имя: ")
                .append(profile[0])
                .append("\n")
                .append("Фамилия: ")
                .append(profile[1])
                .append("\n")
                .append("Телефон: ")
                .append(profile[2]);

        String result1 = builder.toString();

    }
}
