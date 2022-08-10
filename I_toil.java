public class I_toil extends HygieneItems {
    private int numblayers;

    public I_toil (String name, int price, int amount, int unit, int numblayers){
        super(name, price, amount, unit);
        this.numblayers = numblayers;
    }

    @Override
    public String getInfo(){
        return String.format("%s  numblayers: %d", super.getInfo(), this.numblayers);
    }

}