import java.util.Scanner;
import java.util.concurrent.ScheduledExecutorService;

public class Greengrocer {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double pear ,apple ,tomato ,banana, eggplant;
        double total;
        double pricePear = 2.14;
        double priceApple = 3.67;
        double priceTomato = 1.11;
        double priceBanana = 0.95;
        double priceEggplant = 5.00;
        System.out.print("How many kg of pears: ");
        pear = inp.nextDouble();
        System.out.print("How many kg of apples: ");
        apple = inp.nextDouble();
        System.out.print("How many kg of tomatos: ");
        tomato = inp.nextDouble();
        System.out.print("How many kg of bananas: ");
        banana = inp.nextDouble();
        System.out.print("How many kg of eggplants: ");
        eggplant = inp.nextDouble();

        total = pear*pricePear + apple*priceApple+tomato*priceTomato+banana*priceBanana+eggplant*priceEggplant;

        System.out.print("Total amount payable : " +total);


    }
}
