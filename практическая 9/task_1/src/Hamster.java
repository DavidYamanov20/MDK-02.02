public class Hamster extends Pet {
    public Hamster() {
        super(4); // у хомяка 4 лапки
    }

    @Override
    public String giveVoice() {
        return "Хрум-хрум!";
    }

    public void hideFood() {
        System.out.println("Вся еда — в щёчках!");
    }
}
