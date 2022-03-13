package ca5.d00242634;

public class Ring extends Jewellery {

    private double size;

    public Ring(double price, String materials, boolean available, double size) {
        super(price, materials, available);
        this.size = size;
    }

    ///////////////////////////START
 
    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
    ///////////////////////////END
    
        public boolean equals(Jewellery other) {
        return this.getPrice() == other.getPrice();
    }

    
    
    ///////////////////////////START

    
        @Override
        public String toString()
    {
        return "|Type:Ring"+"\t|price:"+ this.price + "\t|materials:"+materials+ "\t|In Shop=" + available+"\t|size:"+ this.size ;
    }
    ///////////////////////////END
}
