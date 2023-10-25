import java.util.List;
import java.util.ArrayList;
public class DVDInventory{
    private int numDVD = 0;
    private double dvdPrice = 0;
    private String dvdGenre;
    private int lengthOfMovie = 0;
    private int inventoryID = 0;
    private static int nextInventoryID = 1;
    private boolean standardOrBlueRay = false;
    

    public DVDInventory(int numDVD, String dvdGenre, int lengthOfMovie, double dvdPrice, int inventoryID, boolean standardOrBlueRay){
        this.numDVD = numDVD;
        this.dvdGenre = dvdGenre;
        this.lengthOfMovie = lengthOfMovie;
        this.inventoryID = nextInventoryID++;
        this.standardOrBlueRay = standardOrBlueRay;
        this.dvdPrice = dvdPrice;
    }

    public int getNumDVD(){
        return numDVD;
    }
    public void setNumDVD(int numDVD){
        if(numDVD < 0){
            System.out.println("Error, please enter a valid number.");
        }
        this.numDVD = numDVD;
    }

    public double getDVDPrice(){
        return dvdPrice;
    }
    
    public void setDVDPrice(double dvdPrice){
        if(dvdPrice < 0){
            System.out.println("Error, please enter a valid number");
        }
        this.dvdPrice = dvdPrice;
    }

    public String getDVDGenre(){
        return dvdGenre;
    }

    public void setDVDGenre(String dvdGenre) {
    if (isNumeric(dvdGenre)) {
        System.out.println("Error, do not enter a number.");
        return;
    }
    this.dvdGenre = dvdGenre;
}

    private boolean isNumeric(String dvdGenre) {
    return dvdGenre.matches("\\d+");  
}

    public int getLengthOfMovie(){
        return lengthOfMovie;
    }
    public void setLengthOfMovie(int lengthOfMovie){
        if(lengthOfMovie < 0){
        System.out.println("Error, please enter a valid number.");
        }
        this.lengthOfMovie = lengthOfMovie;
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

    public void setNextInventoryID(int nextInventoryID){
        this.nextInventoryID = nextInventoryID;
    }

    public boolean isStandardOrBlueRay(){
        return standardOrBlueRay;
    }

    public void setStandardOrBlueRay(boolean standardOrBlueRay){
        this.standardOrBlueRay = standardOrBlueRay;
    }

 @Override
    public String toString() {
    return "DVDInventory { " + "Number of DVDs: " + numDVD + ", DVD Genre: '" + dvdGenre + '\'' + ", Length of Movie: " + lengthOfMovie + " minutes" + ", DVD Price: " + dvdPrice + ", Inventory ID: " + inventoryID + ", Is Blu-ray: " + standardOrBlueRay + " }";
}

}