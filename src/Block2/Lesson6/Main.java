package Block2.Lesson6;

public class Main {
    public static String accountName = "MyAcc";
    public static int amount = 10000; //сумма на счету

    // Метод для снятия средств
    public static int deduct(String accountToProcess, int amtToCacheOut) throws InsufficientAmountException {
        if (!accountName.equals(accountToProcess)){
            throw new AccessDeniedException("Имя аккаунта не совпадает с именем владельца.");
        }
        if (amount < amtToCacheOut){
            throw new InsufficientAmountException("Недостаточно средств для снятия " + amtToCacheOut);
        }
        amount = amount - amtToCacheOut;
        return amount;
    }

    // Класс для исключения недостатка средств
    public static class InsufficientAmountException extends Exception {
        public InsufficientAmountException(String message) {
                super(message);
            }
    }

    // Класс для исключения доступа (неправильное имя аккаунта)
    public static class AccessDeniedException extends RuntimeException {
        public AccessDeniedException(String message) {
            super(message);
        }
    }


    public static void main(String[] args) {
        try {
            // Успешное снятие средств
            System.out.println("Остаток после снятия: " + deduct("MyAcc", 900));

            // Попытка снять больше, чем есть на счёте
            System.out.println("Остаток после снятия: " + deduct("MyAcc", 11000));
        } catch (InsufficientAmountException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (AccessDeniedException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        try {
            // Попытка снять деньги с чужого аккаунта
            System.out.println("Остаток после снятия: " + deduct("OtherAcc", 100));
        } catch (InsufficientAmountException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (AccessDeniedException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
