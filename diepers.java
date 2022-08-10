public class diepers extends Baby {
    private int size;
    private int minage;
    private int maxage;
    private String type;

    
    public diepers (String name, int price, int amount, int unit, int size, int minage, int maxage, String type){
        super(name, price, amount, unit);
        this.size = size;
        this.minage = minage;
        this.maxage = maxage;
        this.type = type;
    }
    @Override
    public String getInfo(){
        return String.format("%s  size: %s, minage: %d, maxage: %d, type: %s", 
        super.getInfo(), this.size, this.minage, this.maxage, this.type);
    }
}
