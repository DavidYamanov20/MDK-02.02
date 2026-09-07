//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double rubles = 30002.7;
        double rateUSD = 78.5;
        double dollars =rubles/rateUSD;
        System.out.println("У вас на счету " + rubles + " рублей. \n " +
                "В долларах это " + dollars + " долларов.\n" +
                " Так держать!");
    }
}