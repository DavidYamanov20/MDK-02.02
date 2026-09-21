public class Dog extends Pet {
    public Dog() {
        super(4); // у собаки 4 лапки
    }

    @Override
    public String giveVoice() {
        return "Гав-гав!";
    }

    public void bringStick() {
        System.out.println("Принёс палочку, как хороший мальчик!");
    }
}
