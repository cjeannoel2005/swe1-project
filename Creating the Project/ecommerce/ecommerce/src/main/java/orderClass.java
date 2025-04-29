import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class orderClass {
    @Id
    public int orderId;
    public int cartId;
    public int userId;
    public String shippingType;
    public String ShippingAddress;
    public int serialNumber;
    public double tax;
    public double subTotal;
    public double grandTotal;

    public orderClass(int orderId, int cartId,int userId,String shippingType, String ShippingAddress,
                      int serialNumber, double tax, double subTotal, double grandTotal){
        this.orderId = orderId;
        this.cartId = cartId;
        this.userId = userId;
        this.shippingType = shippingType;
        this.ShippingAddress = ShippingAddress;
        this.serialNumber = serialNumber;
        this.tax = tax;
        this.subTotal = subTotal;
        this.grandTotal = grandTotal;

    }

    // the setters
    public int getOrderId(){return orderId;}
    public int getCartId(){return cartId;}
    public int getUserId(){return userId;}
    public String getShippingType(){return shippingType;}
    public String getShippingAddress(){return ShippingAddress;}
    public int getSerialNumber(){return serialNumber;}
    public double getTax(){return tax;}
    public double getSubTotal(){return subTotal;}
    public double getGrandTotal(){return grandTotal;}

    // the getters
    public void setOrderId(int orderId){this.orderId = orderId;}
    public void setCartId(int cartId){this.cartId = cartId;}
    public void setUserId(int userId){this.userId = userId;}
    public void setShippingType(String shippingType){this.shippingType = shippingType;}
    public void setShippingAddress(String ShippingAddress){this.ShippingAddress = ShippingAddress;}
    public void setSerialNumber(int serialNumber){this.serialNumber = serialNumber;}
    public void setTax(double tax){this.tax = tax;}
    public void setSubTotal(double subTotal){this.subTotal = subTotal;}
    public void setGrandTotal(double grandTotal){this.grandTotal = grandTotal;}
}
