import java.util.ArrayList;
import java.util.Scanner;

public class Practicum {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        // Добавим стартовый набор животных (как в прошлой версии)
        animals.add("Шиншилла");
        animals.add("Крокодил");
        animals.add("Лев");
        animals.add("Медведь");
        animals.add("Слон");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("--- Меню зоопарка ---");
            System.out.println("1. Показать список всех животных");
            System.out.println("2. Добавить животное");
            System.out.println("3. Удалить животное");
            System.out.println("4. Очистить список");
            System.out.println("5. Проверить, есть ли животное в зоопарке");
            System.out.println("0. Выход");
            System.out.print("Выберите команду: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // чтобы убрать остаток строки после числа

            if (choice == 1) {
                System.out.println("В зоопарке живут " + animals.size() + " животных:");
                for (String animal : animals) {
                    System.out.println("- " + animal);
                }
            } else if (choice == 2) {
                System.out.print("Введите название животного для добавления: ");
                String newAnimal = scanner.nextLine();
                animals.add(newAnimal);
                System.out.println(newAnimal + " добавлен в список.");
            } else if (choice == 3) {
                if (!animals.isEmpty()) {
                    System.out.print("Введите название животного для удаления: ");
                    String animalToRemove = scanner.nextLine();
                    if (animals.remove(animalToRemove)) {
                        System.out.println(animalToRemove + " удалён из списка.");
                    } else {
                        System.out.println("Такого животного нет в списке.");
                    }
                } else {
                    System.out.println("Список животных пуст, удалять нечего.");
                }
            } else if (choice == 4) {
                if (!animals.isEmpty()) {
                    animals.clear();
                    System.out.println("Список животных очищен.");
                } else {
                    System.out.println("Список уже пуст.");
                }
            } else if (choice == 5) {
                System.out.print("Какое животное хотите проверить? ");
                String animalToCheck = scanner.nextLine();
                if (animals.contains(animalToCheck)) {
                    System.out.println("Да, " + animalToCheck + " живёт в зоопарке.");
                } else {
                    System.out.println("Нет, " + animalToCheck + " в зоопарке нет.");
                }
            } else if (choice == 0) {
                System.out.println("До свидания!");
                break;
            } else {
                System.out.println("Неверная команда");
            }
        }
    }
}
