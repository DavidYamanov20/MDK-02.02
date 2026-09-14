import java.util.Scanner;

public class Practicum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Пожалуйста, введите сумму перевода в рублях.");
        double amount = scanner.nextDouble();

        boolean isValid = TransactionValidator.isValidAmount(amount);

        if (isValid) {
            System.out.println("Спасибо! Ваш перевод на сумму " + amount + " р. успешно выполнен.");
        } else {
            System.out.println("Минимальная сумма перевода: " + TransactionValidator.MIN_AMOUNT + " р. Попробуйте ещё раз!");
            System.out.println("Максимальная сумма перевода: " + TransactionValidator.MAX_AMOUNT + " р. Попробуйте ещё раз!");
        }

        scanner.close();
    }
}
