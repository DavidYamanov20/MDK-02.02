public class Cat extends Pet {
    public Cat() {
        super(4); // у кошки 4 лапки
    }

    @Override
    public String giveVoice() {
        return "Мяу";
    }

    public void catchMouse() {
        System.out.println("Поймала мышку!");
    }
}
