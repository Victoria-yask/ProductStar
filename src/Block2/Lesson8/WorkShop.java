package Block2.Lesson8;

public class WorkShop {
    public static void main(String[] args) {

        //len();
        // split();
        //trim();
        //charAt();
        //stringBuilder();
        // checkRegex1();
        //checkRegex2();
        //checkRegex3();
       passwordRegex();
    }

    /**
     * ^ - начало строки
     * [a-zA-Z]* - любое количество латинских букв
     * [0-9]+ - одна или более цифр
     * [a-zA-Z0-9]* - любое количество латинских букв и/или цифр
     * $ - конец строки
     */
    private static void passwordRegex() {
        String regex = "^[[a-zA-Z]+[0-9]*[a-zA-Z0-9]*]{5,8}$";
        String password = "qwerty1";

        boolean result = password.matches(regex);
        print(result);
    }

    //[^a-z] - любой символ, КРОМЕ перечисленных
    private static void checkRegex3() {
        boolean res = "PrdStr".matches("[^a-z]?");
        print(res);
    }

    //[a-zA-Z] — это шаблон, который ищет ровно один символ
    //? — этот знак (квантификатор) - ноль раз или один раз.
    //+ один или более раз
    private static void checkRegex2() {
        boolean res = "PrdStr".matches("[a-zA-Z]?");
        print(res);
    }

    //[] - любой один символ из перечисленных. a-z — это диапазон.
    private static void checkRegex1() {
        boolean res = "q".matches("[a-z]");
        print(res);
    }

    //возвращает символ по указанному индексу (начинается с 0).
    private static void charAt() {
        String str = "Строка";
        print(String.valueOf(str.charAt(0)));
    }

    //StringBuilder позволяет модифицировать текст "на месте",
    // не создавая новых объектов в памяти при каждой операции
    private static void stringBuilder() {
        int value1 = 300;
        double value2 = 3.14;
        short value3 = 5;
        char value4 = 'A';


        StringBuilder builder = new StringBuilder()
                .append(value1)
                .append("\n")
                .append(value2)
                .append("\n")
                .append(value3)
                .append("\n")
                .append(value4);

        String result = builder.toString();

        print(result);
    }

    //возвращает количество символов в строке
    private static void len() {
        String str = "Строка";
        print(str.length());
    }

    //удаляет пробелы в начале и в конце
    private static void trim() {
        String str = "       Строка      ";
        print(str.trim());
    }

    //разбивает строку на массив по разделителю (регулярному выражению)
    //Regex-символ \\s+ - если в тексте между словами будет несколько пробелов подряд
    private static void split() {
        String forSplit = "Нужно   выделить отдельные слова";
        String[] res = forSplit.split("\\s+");
        for (String str : res) {
            print(str);
        }
    }

    private static void print(String text) {
        System.out.println(text);
    }

    private static void print(int number) {
        System.out.println(number);
    }

    private static void print(boolean bool) {
        System.out.println(bool);
    }
}
