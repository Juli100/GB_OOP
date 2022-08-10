// import javax.crypto.spec.DESKeySpec;

public class Program {
    
    public static void main(String[] args) {
        Eat eat_1 = new Eat("Bread", 50, 1, 500);
        System.out.println(eat_1.getInfo());

        Drink drink_1 = new Drink("MILK", 66, 1, 900);
        System.out.println(drink_1.getInfo());

        Baby baby = new Baby("diaper", 2000, 1, 42);
        System.out.println(baby.getInfo());

        HygieneItems hItems = new HygieneItems("toilet paper", 200, 1, 4);
        System.out.println(hItems.getInfo());
        
    }
}