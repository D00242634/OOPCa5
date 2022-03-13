package ca5.d00242634;

public class Earring extends Jewellery {

    private String placement;
        private String shape;

    public Earring(double price, String materials, boolean available, String placement,String shape) {
        super(price, materials, available);
        this.placement = placement;
        this.shape = shape;
    }
    
    
    ///////////////////////////START
 
    public String getPlacement() {
        return placement;
    }

    public void setPlacement(String placement) {
        this.placement = placement;
    }
    
    public String getShape(){
        return shape;
    }
    
    public void setShape(String shape){
        this.shape=shape;
    }
    ///////////////////////////END
    
        public boolean equals(Jewellery other) {
        return this.getPrice() == other.getPrice();
    }

    public int compareTo(Jewellery other) {

        if (this.equals(other)) {
            return 0;
        } else if (getPrice() > other.getPrice()) {
            return 1;
        } else {
            return -1;
        }

    }
    
    
    ///////////////////////////START
        @Override
        public String toString()
    {
        return "|Type:Earring"+"\t|price:"+ this.price + "\t|materials:"+materials+ "\t|In Shop=" + available+"\t|placement:"+ this.placement+"\t|shape:"+ this.shape ;
    }
    ///////////////////////////END
}
