public class Smartphone extends MobilePhone {

    public Smartphone(String number) {
        super(number);
    }

    // Перегруженный метод: звонок через стороннее приложение
    public void makeCall(String targetNumber, String appName) {
        System.out.println("Позвоним через приложение " + appName + " по номеру " + targetNumber);
        System.out.println("Привет!");
    }

    // Отправка email
    public void sendEmail(String messageText, String email) {
        System.out.println("Напишем другу сообщение " + messageText + " по email " + email);
    }
}
