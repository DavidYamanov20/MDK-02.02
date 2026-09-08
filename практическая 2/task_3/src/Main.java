//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String pixelKcalDay = "43";      // калории до похода к бабушке
        String beefKcal = "30.2";        // говядина
        String chickenKcal = "23.8";     // курица
        String creamKcal = "32.1";       // сливки
        String milkKcal = "13.5";        // молоко

        float pixelChoice = getMinKcalsSum(beefKcal, chickenKcal, creamKcal, milkKcal);
        float totalKcal = Float.parseFloat(pixelKcalDay) + pixelChoice;
        checkKcal(totalKcal);
    }

    private static float getMinKcalsSum(String firstDishKcal, String secondDishKcal,
                                        String firstDesert, String secondDesert) {
        float dish1 = Float.parseFloat(firstDishKcal);
        float dish2 = Float.parseFloat(secondDishKcal);
        float desert1 = Float.parseFloat(firstDesert);
        float desert2 = Float.parseFloat(secondDesert);

        float minDishKcal = Math.min(dish1, dish2);      // наименее калорийное основное блюдо
        float minDesertKcal = Math.min(desert1, desert2); // наименее калорийный десерт

        return minDishKcal + minDesertKcal;
    }

    private static void checkKcal(float catKcal) {
        System.out.println("Калорийность рациона Пикселя за день: " + catKcal);
        if (catKcal > 100) {
            System.out.println("Пиксель сегодня не уложился в норму.");
        } else {
            System.out.println("Лимит не превышен!");
        }
    }
}
