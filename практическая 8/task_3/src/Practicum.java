import java.util.ArrayList;


public class Practicum {
    public static void main(String[] args) {
        ArrayList<Task> tasks = new ArrayList<>();
        tasks.add(new Task(TaskPriority.HIGH, "Оплатить интернет."));
        tasks.add(new Task(TaskPriority.LOW, "Сходить в парикмахерскую."));
        tasks.add(new Task(TaskPriority.MEDIUM, "Выбрать подарок подруге на ДР."));
        tasks.add(new Task(TaskPriority.MEDIUM, "Купить билеты в театр."));
        tasks.add(new Task(TaskPriority.HIGH, "Посетить вебинар по английскому языку."));
        tasks.add(new Task(TaskPriority.LOW, "Купить пылесос."));

        System.out.println("Задачи с наивысшим приоритетом на сегодня:");

        // Поиск и вывод задач с приоритетом HIGH
        for (Task task : tasks) {
            if (task.getPriority() == TaskPriority.HIGH) {
                System.out.println("- " + task.getDescription());
            }
        }
    }
}
// Перечисление для хранения приоритетов задач
enum TaskPriority {
    HIGH,
    MEDIUM,
    LOW
}

class Task {
    private TaskPriority priority;
    private String description;

    public Task(TaskPriority priority, String description) {
        this.priority = priority;
        this.description = description;
    }

    // Геттер для приоритета
    public TaskPriority getPriority() {
        return priority;
    }

    // Геттер для описания задачи
    public String getDescription() {
        return description;
    }
}

