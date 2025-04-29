import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

@Entity
public class inventoryTable {  // Kept original camelCase naming

  @Id
  private String bookId;

  private String title;
  private String description;
  private double price;
  private int quantity;

  @Column(name = "in_stock")
  private boolean inStock;

  private String picture;

  // No-arg constructor (required by JPA)
  public inventoryTable() {
  }

  // Parameterized constructor
  public inventoryTable(String bookId, String title, String description,
                        double price, int quantity, boolean inStock) {
    this.bookId = bookId;
    this.title = title;
    this.description = description;
    this.price = price;
    this.quantity = quantity;
    this.inStock = inStock;
    this.picture = bookId;  // Default picture to bookId as in original
  }

  // Fixed getters (using proper camelCase)
  public String getBookId() { return bookId; }
  public String getTitle() { return title; }
  public String getDescription() { return description; }
  public double getPrice() { return price; }
  public int getQuantity() { return quantity; }
  public boolean isInStock() { return inStock; }
  public String getPicture() { return picture; }

  // Setters (already correct, kept as-is)
  public void setBookId(String bookId) { this.bookId = bookId; }
  public void setTitle(String title) { this.title = title; }
  public void setDescription(String description) { this.description = description; }
  public void setPrice(double price) { this.price = price; }
  public void setQuantity(int quantity) { this.quantity = quantity; }
  public void setInStock(boolean inStock) { this.inStock = inStock; }
  public void setPicture(String picture) { this.picture = picture; }
}