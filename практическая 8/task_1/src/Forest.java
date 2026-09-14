import java.util.ArrayList;
import java.util.ArrayList;

public class Forest {
    private final ArrayList<MountainHare> hares;
    private static String season;

    public Forest(ArrayList<MountainHare> hares) {
        this.hares = hares;
    }

    public static void setSeason(String newSeason) {
        season = newSeason;
        if ("зима".equalsIgnoreCase(newSeason)) {
            MountainHare.setColor("белый"); // Вызываем метод, а не поле
        } else {
            MountainHare.setColor("серо-рыжий"); // Вызываем метод, а не поле
        }
    }


    public void printHares() {
        for (MountainHare hare : hares) {
            System.out.println(hare);
        }
    }
}
