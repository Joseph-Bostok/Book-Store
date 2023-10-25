import java.util.List;
import java.util.ArrayList;
public class bookInventory{
    
    private double bookPrice;
    private String bookName;
    private int numBooks = 0;
    private String typeOfBook;
    private int pageNumber = 0;
    private int inventoryID = 0;
    private static int nextInventoryID = 0;
    private boolean hardCover = false;

    public bookInventory(String bookName, int numBooks, double bookPrice, String typeOfBook, int pageNumber, int inventoryID, boolean hardCover){
        this.numBooks = numBooks;
        this.bookPrice = bookPrice;
        this.typeOfBook = typeOfBook;
        this.pageNumber = pageNumber;
        this.bookName = bookName;
        this.inventoryID = nextInventoryID++;

    }
    public int getNumBooks(){ 
        return numBooks;
    }
    public String getBookName() {
        return bookName;
    }
    public void setNumBooks(int numBooks){
        if(numBooks < 0){
            System.out.println("Error, please enter a real number.");
            return;
        }
        this.numBooks = numBooks;
    }

    public double getBookPrice(){
        return bookPrice;
    }

    public void setBookPrice(double bookPrice){
        if(bookPrice < 0){
            System.out.println("Error, please enter a real number.");
            return;
        }
        this.bookPrice = bookPrice;
    }
    
    public String getTypeOfBook(){
        return typeOfBook;
    }

   public void setTypeOfBook(String typeOfBook) {
    if (isNumeric(typeOfBook)) {
        System.out.println("Error, do not enter a number.");
        return;
    }
    this.typeOfBook = typeOfBook;
}

private boolean isNumeric(String typeOfBook) {
    return typeOfBook.matches("\\d+");  
}
    public int getPageNumber(){
        return pageNumber;
    }

    public void setPageNumber(int pageNumber){
        if(pageNumber < 0){
            System.out.println("Error, please enter a real number.");
            return;
        }
        this.pageNumber = pageNumber;
    }
    
    public int getInventoryID(){
        return inventoryID;
    }

    public void setInventoryID(int inventoryID){
        if(inventoryID < 0){
            System.out.println("Error, please enter a real number.");
            return;
        }
        this.inventoryID = inventoryID;
    }

    public boolean isBookHardCover(){
        return hardCover;
    }
    
    public void setBookHardCover(boolean hardCover){
        this.hardCover = hardCover;
    }

    public void setNextInventoryID(int NextInventoryID){
        this.nextInventoryID = nextInventoryID;
    }
 @Override
    public String toString() {
    return "bookInventory { " + "Book Name: '" + bookName + '\'' + ", Number of Books: " + numBooks +  ", Book Price: " + bookPrice + ", Type of Book: '" + typeOfBook + '\'' + ", Page Number: " + pageNumber + ", Inventory ID: " + inventoryID + ", Is Hard Cover: " + hardCover + " }";
}

}