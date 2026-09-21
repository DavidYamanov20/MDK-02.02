public abstract class Pet {
    private int pawsCount;

    protected Pet(int pawsCount) {
        this.pawsCount = pawsCount;
    }

    public void sleep() {
        System.out.println("Сплю");
    }

    public void play() {
        System.out.println("Играю");
    }

    // Абстрактный метод: каждый питомец сам решает, какой звук издаёт
    public abstract String giveVoice();

    public int getPawsCount() {
        return pawsCount;
    }
}
