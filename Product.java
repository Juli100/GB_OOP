import java.util.Random;
// ; 1. Название
// ; 2. Цена
// ; 3. Количество
// ; 4. Единица измерения

public class Product {

    protected static Random r;
    private String name;
    int price;
    int amount;
    private int unit;


    public Product (String name,  int price, int amount, int unit){
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.unit = unit;
    }

    public String getInfo(){
        return String.format("name: %s , price: %d , amount: %d , unit: %d",
            this.name, this.price, this.amount, this.unit);
    }

}

// private int elixir;
//     private int maxElixir;

//     public Priest() {
//         super(String.format("Hero_Priest #%d", ++Magician.number),
//                 Magician.r.nextInt(100, 200));
//         this.maxElixir = Magician.r.nextInt(50, 150);
//         this.elixir = maxElixir;
//     }

//     public int Attack() {
//         int damage = BaseHero.r.nextInt(20, 30);
//         this.elixir -= (int) (damage * 0.8);
//         if (elixir < 0)
//             return 0;
//         else
//             return damage;
//     }

//     public String getInfo() {
//         return String.format("%s  Elixir: %d", super.getInfo(), this.elixir);
//     }