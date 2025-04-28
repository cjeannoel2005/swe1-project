public class shippingClass {
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
      public  String setShippingType(String shippingType){this.shippingType = shippingType;}
     public  String setPrice(double price){this.price = price;}
}
