public class Practicum {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.catchMouse();
        System.out.println(cat.giveVoice());

        Dog dog = new Dog();
        dog.bringStick();
        dog.play();

        Hamster hamster = new Hamster();
        hamster.hideFood();
        hamster.sleep();

        Fish fish = new Fish();
        fish.sleep();
        System.out.println(fish.giveVoice());

        Spider spider = new Spider();
        System.out.println("У паука " + spider.getPawsCount() + " лапок.");
        System.out.println(spider.giveVoice());
    }
}
