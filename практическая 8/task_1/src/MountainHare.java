public class MountainHare {
    private int age;
    private double weight;
    private double jumpLength;
    private static String color; // Оставляем private!

    public MountainHare(int age, double weight, double jumpLength) {
        this.age = age;
        this.weight = weight;
        this.jumpLength = jumpLength;
    }

    // Добавляем этот метод, чтобы другие классы могли менять цвет
    public static void setColor(String newColor) {
        color = newColor;
    }

    @Override
    public String toString() {
        return "Заяц-беляк: age=" + age +
                ", weight=" + weight +
                ", jumpLength=" + jumpLength +
                ", color=" + color + '.';
    }
}
