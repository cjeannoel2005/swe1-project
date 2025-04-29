import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class inventoryTable {
  @Id
  public String bookId;
  public String title ;
  public String description ;
  public double price;
  public int quantity;
  public boolean inStock ;
  public String picture;

  public inventoryTable(String bookId, String title, String description,
                        double price, int quantity, boolean inStock) {
    this.bookId = bookId;
    this.title = title;
    this.description = description;
    this.price = price;
    this.quantity = quantity;
    this.inStock = inStock;
    this.picture = bookId;
  }

  // put the getters
    public String GetbookId(){return bookId;}
    public String Gettitle(){return title;}
    public String Getdescription(){return description;}
    public double Getprice(){return price;}
    public int Getquantity(){return quantity;}
    public boolean GetinStock(){return inStock;}
    public String Getpicture(){return picture;}

    //put the setters
    // fix this part of the errors
    public void setBookId(String bookId){ this.bookId = bookId; }
    public void setTitle(String title){this.title = title;}
    public void setDescription(String description){this.description = description;}
    public void setPrice(double price){this.price = price;}
    public void setQuantity(int quantity){this.quantity = quantity;}
    public void setInStock(boolean inStock){this.inStock = inStock;}
    public void setPicture(String picture){this.picture = picture;}

}
