package Block1.practicalWork3;
import java.util.ArrayDeque;
import java.util.Deque;

public class HTMLValidator {

    public boolean checkTags(String htmlString) {
        Deque<String> openingTags = new ArrayDeque<>();

        //наличие ошибок
        boolean hasErrors = false;

        for (int i = 0; i < htmlString.length(); i++) {

            //находим открывающий тег, вырезаем тег целиком
            if (htmlString.charAt(i) == '<') {
                int endTag = htmlString.indexOf('>', i);
                String fullTag = htmlString.substring(i, endTag + 1);
                i = endTag;

                //если нет </, добавляем тег в стек
                if (!fullTag.startsWith("</")) {
                    openingTags.push(fullTag);
                }

                //находим закрывающий тег
                if (fullTag.startsWith("</")) {
                    //если стек пуст
                    if (openingTags.isEmpty()) {
                        hasErrors = true;
                        continue;
                    }
                    //достаем последний открытый тег из стека
                    String lastOpeningTag = openingTags.pop();

                    // извлекаем теги
                    String closingTag = fullTag.substring(2, fullTag.length() - 1);
                    String openingTag = lastOpeningTag.substring(1, lastOpeningTag.length() - 1);

                    //сравниваем теги
                    if (!closingTag.equals(openingTag)) {
                        hasErrors = true;
                    }
                }
            }
        }

            // если в стеке остались теги, значит их не закрыли
            if (!openingTags.isEmpty()) {
            hasErrors = true;
            }

            if (!hasErrors) {
                System.out.println("HTML валиден!");
                return true;
            } else {
                System.out.println("HTML не валиден (найдены ошибки).");
                return false;
            }
        }


    public static void main(String[] args) {
        //без ошибок
        String htmlString = """
              <div><p>Текст</p></div>
              <h1>Заголовок</h1>
              <div><span>Текст</span><p>Параграф</p></div>
              """;

        //с ошибками
        String htmlString2 = """
                <div><p>Текст</div></p>
                <div>Текст</p>
                <p><div></p></div>
              """;

        //с ошибками
        String htmlString3 = """
              <div><p>Текст</p></div>
                <div>Текст
              """;

        HTMLValidator htmlValidator = new HTMLValidator();
        htmlValidator.checkTags(htmlString3);
    }

}



