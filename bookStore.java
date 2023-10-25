import java.util.List;
import java.util.ArrayList;
public class bookStore{
     //ArrayLists
    ArrayList <bookInventory> bookList = new ArrayList<bookInventory>();
    ArrayList <CDInventory> CDList = new ArrayList<CDInventory>();
    ArrayList <DVDInventory> DVDList = new ArrayList<DVDInventory>();
    ArrayList <RegularMembership> RegularMemberList = new ArrayList<RegularMembership>();
    ArrayList <PremiumMembership> PremiumMembershipList = new ArrayList<PremiumMembership>();

    //Variables
    private int regularMemberID = 0;
    private int premiumMemberID = 0;
    private static int nextInventoryID =0;
    private static int nextRegularMemberID = 0;
    private static int nextPremiumMemberID = 0;
    private double totalSales = 0.0;
    public int inventoryID = 0;

    //holds all class objects
    public bookStore(){
        bookInventory newBook = new bookInventory("Animal Farm", 1, 5.99 ,"Dystpoian", 114, getNextInventoryID(), false);
        bookList.add(newBook);
        incrementNextInventoryID();

        CDInventory newCD = new CDInventory(5.99, 1, "Rock", 52, getNextInventoryID(), false);
        CDList.add(newCD);
        incrementNextInventoryID();

        DVDInventory newDVD = new DVDInventory(1, "Horror", 92, 9.99, getNextInventoryID(), false);
        DVDList.add(newDVD);
        incrementNextInventoryID();
        
        RegularMembership newMember = new RegularMembership(3,getNextRegularMemberID(), "John", false, false);
        RegularMemberList.add(newMember);
        incrementNextRegularMemberID();

        PremiumMembership newPremiumMember = new PremiumMembership("John", 0, false,true);
        PremiumMembershipList.add(newPremiumMember);
        incrementNextPremiumMemberID();


    }
    //parameters of the objects that are needed to make it, sets the ID, and returns the current ID. (temp variable)
    public int addBook(String bookName, int numBooks, double bookPrice, String typeOfBook, int pageNumber, boolean hardCover){

        bookInventory newBookAddition = new bookInventory(bookName, numBooks, bookPrice, typeOfBook, pageNumber, getNextInventoryID(), hardCover);
        bookList.add(newBookAddition);
        int currentBookID = getNextInventoryID();
        incrementNextInventoryID();
        return currentBookID;
    }

    public int addCDInventory(double cdPrice, int numCDs, String typeOfCD, int albumCDLength, boolean includesCDSleeve){
        CDInventory newCDAddition = new CDInventory(cdPrice, numCDs, typeOfCD, albumCDLength, getNextInventoryID(), includesCDSleeve );
        CDList.add(newCDAddition);
        int currentCdID = getNextInventoryID();
        incrementNextInventoryID();
        return currentCdID;

    }

    public int addDVDInventory(int numDVD, String dvdGenre, int lengthOfMovie, double dvdPrice, boolean standardOrBlueRay){
        DVDInventory newDVDAddition = new DVDInventory(numDVD, dvdGenre, lengthOfMovie, dvdPrice, getNextInventoryID(), standardOrBlueRay);
        DVDList.add(newDVDAddition);
        int currentDvdID = getNextInventoryID();
        incrementNextInventoryID();
        return currentDvdID;
    }

    public int addRegularMembers(int membershipLength, String memberName, boolean isRegularMemberFree, boolean isActive){
        RegularMembership newRegularMember = new RegularMembership(membershipLength, getNextRegularMemberID(), memberName, isRegularMemberFree, isActive);
        RegularMemberList.add(newRegularMember);
        int currentMemberID = getNextRegularMemberID();
        incrementNextRegularMemberID();
        return currentMemberID;
    }

    public int addPremiumMembers(String premiumMemberName, double monthlyFee, boolean isPremium, boolean monthlyFeePaid){
    PremiumMembership newPremiumMember = new PremiumMembership(premiumMemberName, monthlyFee, isPremium, monthlyFeePaid);
    PremiumMembershipList.add(newPremiumMember);
    int currentPremiumMemberID = newPremiumMember.getMemberID();
    return currentPremiumMemberID;
    }


    //gets next avaiable inventory ID
    public int getNextInventoryID(){
        return nextInventoryID;
    }
    // increments inventory ID
    public static void incrementNextInventoryID(){
        nextInventoryID++;
    }
    //gets the next available regular member ID
    public int getNextRegularMemberID(){
        return nextRegularMemberID;
    }
    //increments regular member ID
    public static void incrementNextRegularMemberID(){
        nextRegularMemberID++; 
    }
    //gets the next available premium ID
    public int getNextPremiumMemberID(){
        return nextPremiumMemberID;
    }
    //increments premium member ID
    public static void incrementNextPremiumMemberID(){
        nextPremiumMemberID++;
    }

    //gets amount of members currently signed up
    public int currentRegularMembers(){
        return RegularMemberList.size();
    }
    //gets amount of premium members currently singed up
    public int currentPremiumMembers(){
        return PremiumMembershipList.size();
    }
    //gets current book inventory size
    public int currentBookInventory(){
        return bookList.size();
    }
    public ArrayList<bookInventory> getBookList() {
    return bookList;
}
    //gets current CD inventory size
    public int currentCDInventory(){
        return CDList.size();
    }

    public ArrayList<CDInventory> getCDList() {
    return CDList;
}

    //gets current DVD inventory size
    public int currentDVDInventory(){
        return DVDList.size();
    }
    
    public ArrayList<DVDInventory> getDVDList() {
    return DVDList;
}
    
    public double getTotalSales(){
    return totalSales;
}

    //removes books from bookList
    public boolean removeBook(int inventoryID){

        for(int i = 0; i < bookList.size(); i++){

            if(bookList.get(i).getInventoryID() == inventoryID){
                bookList.remove(i);
                return true;
            }
        }
        return false;
    }
    //removes CD's from CDList
    public boolean removeCD(int inventoryID){
        for(int i = 0; i < CDList.size(); i++){

            if(CDList.get(i).getInventoryID() == inventoryID){
                CDList.remove(i);
                return true;
            }
        }
        return false;
    }
    //removes DVD's from DVDList
    public boolean removeDVD(int inventoryID){
        for(int i = 0; i < DVDList.size(); i++){

            if(DVDList.get(i).getInventoryID() == inventoryID){
                DVDList.remove(i);
                return true;
            }
        }
        return false;
    }
    //removes a regular member
    public boolean removeRegularMember(int regularMemberID){
        for(int i = 0; i < RegularMemberList.size(); i++){

            if(RegularMemberList.get(i).getMemberID() == regularMemberID){
            RegularMemberList.remove(i);
            return true;
            }
        }
        return false;
    }
    //removes a premium member
    public boolean removePremiumMember(int premiumMemberID){
        for(int i = 0; i < PremiumMembershipList.size(); i++){
            if(PremiumMembershipList.get(i).getMemberID() == premiumMemberID){
                PremiumMembershipList.remove(i);
                return true;
            }
        }
        return false;
    }

    
}
    