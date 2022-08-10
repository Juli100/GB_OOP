public class i_eggs extends Product {
    private int amountpack;

    public i_eggs (String name, int price, int amount, int unit, int amountpack){
        super(name, price, amount, unit);
        this.amountpack = amountpack;
    }

    @Override
    public String getInfo(){
        return String.format("%s  amountpack: %d", super.getInfo(), this.amountpack);
    }
}