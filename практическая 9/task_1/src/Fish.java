public class Fish extends Pet {
    public Fish() {
        super(0); // у рыбы нет лапок
    }

    @Override
    public String giveVoice() {
        return "Буль-буль!";
    }
}
