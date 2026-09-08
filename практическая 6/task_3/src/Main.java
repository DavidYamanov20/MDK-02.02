//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Bird bird = new Bird();
        Mouse mouse = new Mouse();
        Cow cow = new Cow();
        Frog frog = new Frog();
        Elephant elephant = new Elephant();
        Ducks ducks = new Ducks();
        Fish fish = new Fish();
        Seal seal = new Seal();
        System.out.println("Dog goes " + dog.say());
        System.out.println("Cat goes " + cat.say());
        System.out.println("Bird goes " + bird.say());
        System.out.println("And mouse goes " + mouse.say());
        System.out.println("Cow goes " + cow.say());
        System.out.println("Frog goes " + frog.say());
        System.out.println("And the elephant goes " + elephant.say());
        System.out.println("Ducks say " + ducks.say());
        System.out.println("And fish go " + fish.say());
        System.out.println("And the seal goes " + seal.say());
    }
}

/*Dog goes woof
Cat goes meow
Bird goes tweet
And mouse goes squeek
Cow goes moo
Frog goes croak
And the elephant goes toot
Ducks say quack
And fish go blub
And the seal goes ow ow ow*/