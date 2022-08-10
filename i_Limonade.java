public class i_Limonade extends Drink {
    
    private int value;

    public i_Limonade (String name, int price, int amount, int unit, int value ){
        
        super(name, price, amount, unit);
        this.value = value;
    }

    @Override
    public String getInfo(){
        return String.format("%s value: %s", 
            super.getInfo(), this.value);
    }
}