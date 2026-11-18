import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // ключ — название задачи, значение — выполнена эта задача или ещё нет
        Map<String, Boolean> todos = new HashMap<>();

        todos.put("Выучить Java", true);
        todos.put("Найти классную работу", false);
        todos.clear(); // очищаем список задач
        System.out.println("Todo-список пуст? Ответ: " + todos.isEmpty());
    }
}
