import jakarta.persistence.Entity;

@Entity

public class shippingClass {
    @Id
     public String shippingType;
     public double price;

      public shippingClass(String shippingType, double price) {
           this.shippingType = shippingType;
           this.price = price;
      }
     /// put the setters
     public String getShippingType(){return shippingType;}
     public double getPrice(){return price;}

     // the getters
      public  void setShippingType(String shippingType){this.shippingType = shippingType;}
     public  void setPrice(double price){this.price = price;}
}
