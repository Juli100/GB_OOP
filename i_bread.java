public class i_bread  extends Product{
    private String flourtype;

    public i_bread (String name, int price, int amount, int unit, String flourtype){
        super(name, price, amount, unit);
        this.flourtype = flourtype;
    }

    @Override
    public String getInfo(){
        return String.format("%s  flourtype: %s", super.getInfo(), this.flourtype);
    }

}
