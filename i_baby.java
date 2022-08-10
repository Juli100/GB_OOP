public class i_baby extends Baby{
    private int minage;
    private int hypoallergenic;

    public i_baby (String name, int price, int amount, int unit, int minage, int hypoallergenic){
        
        super(name, price, amount, unit);
        this.minage = minage;
        this.hypoallergenic = hypoallergenic;
    }
    @Override
    public String getInfo(){
        return String.format("%s  size: %s, minage: %d, hypoallergenic: %s", 
        super.getInfo(), this.minage, this.hypoallergenic);
    }
}
