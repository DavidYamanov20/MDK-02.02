import java.util.ArrayList;
import java.util.List;

public class LostAndFoundOffice {
    // создайте список things
    ArrayList<Object> things = new ArrayList<>();

    // реализуйте метод put()
    public List<Object> put(Object object) {
        things.add(object);
        return things;
    }

    // реализуйте метод check()
    public boolean check(Object object) {
        // Если список пуст или null (хотя мы его инициализировали), ищем не в чем
        if (things == null || things.isEmpty()) {
            return false;
        }

        for (Object thing : things) {
            if (thing == null && object == null) {
                return true;
            }

            // 2. Если элемент не null, используем его метод equals для сравнения
            if (thing != null && thing.equals(object)) {
                return true;
            }
        }

        return false;
    }
}