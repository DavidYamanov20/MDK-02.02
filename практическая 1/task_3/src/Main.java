import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Сколько у вас яиц?");
        int eggs= in.nextInt();
        if (eggs >= 3){
            System.out.println("Рекомендую приготовить омлет");
        } else{
            System.out.println("Рекомендую позавтракать бутербродами");
        }
        System.out.println("Приятного аппетита!");
    }
}