package ca5.d00242634;

public abstract class Jewellery {
    
    double price;
    String materials;
    boolean available;
      
    ///////////////////////////START
    public Jewellery(
    double price,
    String materials,
    boolean available){

    this.price=price;
    this.materials=materials;
    this.available=available;
    }  
    ///////////////////////////END
    
    
    
    ///////////////////////////START
    public double getPrice()
    {
        return price;
    }
    public void setPrice(int price)
    {
        this.price = price;
    }

    public String getMaterials() {
        return materials;
    }

    public void setMaterials(String materials) {
        this.materials = materials;
    }

    public boolean getAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
    ///////////////////////////END

    public boolean equals(Jewellery other) {
        return this.getPrice() == other.getPrice();
    }

    public int compareTo (Jewellery other) {

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
        return "|\tprice:"+ this.price + "|\tmaterials:"+materials+ "|\tIn Shop=" + available;
    }
    ///////////////////////////END
    
    
}
