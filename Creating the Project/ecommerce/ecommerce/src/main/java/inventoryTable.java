public class inventoryTable {
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

  // put the setters
    public String GetbookId(){return bookId;}
    public String Gettitle(){return title;}
    public String Getdescription(){return description;}
    public double Getprice(){return price;}
    public int Getquantity(){return quantity;}
    public boolean GetinStock(){return inStock;}
    public String Getpicture(){return picture;}

    //put the getters
    // fix this part of the errors
    public String setBookId(String bookId){this.bookId = bookId;}
    public String setTitle(String title){this.title = title;}
    public String setDescription(String description){this.description = description;}
    public String setPrice(double price){this.price = price;}
    public String setQuantity(int quantity){this.quantity = quantity;}
    public String setInStock(boolean inStock){this.inStock = inStock;}
    public String setPicture(String picture){this.picture = picture;}

}
