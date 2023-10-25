import java.util.List;
import java.util.ArrayList;
public class CDInventory{

    private double cdPrice = 0;
    private int numCDs = 0;
    private String typeOfCD;
    private int albumCDLength = 0;
    private int inventoryID = 0;
    private static int nextInventoryID = 1;
    private boolean includeCDSleeve = false;


    public CDInventory(double cdPrice, int numCDs, String typeOfCD, int albumCDLength, int inventoryID, boolean includeCDSleeve){
        this.cdPrice = cdPrice;
        this.numCDs = numCDs;
        this.typeOfCD = typeOfCD;
        this.albumCDLength = albumCDLength;
        this.inventoryID = nextInventoryID++;
        this.includeCDSleeve = includeCDSleeve;

    }
    public double getCDPrice(){
        return cdPrice;
    }
    
    public void setCDPrice(double cdPrice){
        if(cdPrice < 0){
            System.out.println("Error, please enter a valid number");
        }
        this.cdPrice = cdPrice;
    }

    public int getNumCDs(){
        return numCDs;
    }
    public void setNumCDs(int numCDs){
        if(numCDs < 0){
             System.out.println("Error, please enter a valid number");
        }
        this.numCDs = numCDs;
    }

    public String getTypeOfCD(){
        return typeOfCD;
    }
    public void setTypeOfCD(String typeOfCD) {
    if (isNumeric(typeOfCD)) {
        System.out.println("Error, do not enter a number.");
        return;
    }
    this.typeOfCD = typeOfCD;
}

private boolean isNumeric(String typeOfCD) {
    return typeOfCD.matches("\\d+");  
}
    
    public int getAlbumCDLength(){
        return albumCDLength;
    }
    public void setAlbumCDLength(int albumCDLength){
        if(albumCDLength < 0){
            System.out.println("Error, please enter a valid number");
        }
        this.albumCDLength = albumCDLength;
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

    public boolean doesIncludeCDsleeve(){
        return includeCDSleeve;
    }
    
    public void setDoesIncludeSleeve(boolean includeCDSleeve){
        this.includeCDSleeve = includeCDSleeve;
    }
    

@Override
    public String toString() {  
    return "CDInventory { " + "CD Price: " + cdPrice + ", Number of CDs: " + numCDs + ", Type of CD: '" + typeOfCD + '\'' + ", Album CD Length: " + albumCDLength + ", Inventory ID: " + inventoryID +", Includes CD Sleeve: " + includeCDSleeve + " }";
}

}