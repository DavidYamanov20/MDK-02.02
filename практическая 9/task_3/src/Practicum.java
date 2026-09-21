import java.util.Scanner;

public class Practicum {

    public static void main(String[] args) {
        System.out.println("Вас приветствует виртуальная АТС!");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваш номер телефона:");
        String number = scanner.next();
        System.out.println("Введите номер пользователя, которому хотите позвонить:");
        String friendNumber = scanner.next();
        System.out.println("Выберите модель телефона собеседника, 1 - стационарный телефон, 2 - мобильный телефон, 3 - смартфон:");
        int type = scanner.nextInt();

        if (type < 1 || type > 3) {
            System.out.println("Введена неверная модель телефона");
            return;
        }
        Phone phone = getPhone(type, number);
        phone.makeCall(friendNumber);

        if (phone instanceof MobilePhone) {
            MobilePhone mobile = (MobilePhone) phone;
            String sampleMessage = "Привет, как дела?";
            mobile.sendSms(sampleMessage, friendNumber);
        }

        if (phone instanceof Smartphone) {
            Smartphone smartphone = (Smartphone) phone;
            smartphone.makeCall(friendNumber, "SuperCall");
            String email = friendNumber + "@example.com";
            String emailMessage = "Это тестовое письмо через смартфон.";
            smartphone.sendEmail(emailMessage, email);
        }
    }

    public static Phone getPhone(int type, String number) {
        if (type == 1) {
            return new LandlinePhone(number);
        } else if (type == 2) {
            return new MobilePhone(number);
        } else {
            return new Smartphone(number);
        }
    }
}

