package Block2.Lesson8;

public class Str {

    public Str(Str str) {
    }

    public static void main(String[] args) {

        //всегда создает новый объект в Heap
        String str1 = new String("Строка через конструктр");

        //Литералы ("text") попадают в String Pool
        String str2 =  "Строка черуз литерал";

        //сравнение через ссылки, будет true
        String str3 =  "Строка";
        String str4 =  "Строка";

        //будет false
        String str5 =  "Строка";
        String str6 =  "Строка" + "Старт";

        //будет true
        String str7 =  "ProductStar";
        String str8 =  "Product" + "Star";


        //сравнение через ссылки, если объект будет false
        String str9 = new String("ProductStar");
        System.out.println(str7 == str9);

        //сравнение equals
        System.out.println(str7.equals(str9));


    }

}
