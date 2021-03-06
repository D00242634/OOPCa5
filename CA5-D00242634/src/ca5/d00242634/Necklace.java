package ca5.d00242634;

public class Necklace extends Jewellery {

    private double length;
        private double thickness;

    public Necklace(double price, String materials, boolean available, double length,double thickness) {
        super(price, materials, available);
        this.length = length;
        this.thickness= thickness;
    }
    
    
    ///////////////////////////START
 
    public double getSize() {
        return length;
    }

    public void setSize(double length) {
        this.length = length;
    }
    
        public double getThickness() {
        return thickness;
    }

    public void setThickness(double thickness) {
        this.thickness = thickness;
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
        return "|Type:Necklace"+"\t|price:"+ this.price + "\t|materials:"+materials+ "\t|In Shop=" + available+"\t|length:"+ this.length +"\t|thickness:"+ this.thickness ;
    }
    ///////////////////////////END
}
