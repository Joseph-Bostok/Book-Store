import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        bookStore store = new bookStore();
        Scanner keyboard = new Scanner(System.in);
        int inventoryNum;
        int regularMemberNum;
        int premiumMembernum;
        int choice;
        
    do {
    System.out.println("Welcome to the Book Store Inventory System");
    System.out.println("Please select from the following choices");
    System.out.println("\t 1.) Check current Inventory");
    System.out.println("\t 2.) Input new item in Inventory");
    System.out.println("\t 3.) add Regular Member");
    System.out.println("\t 4.) add premium Member");
    System.out.println("\t 5.) Check out / remove item");
    System.out.println("\t 6.) Exit");

    choice = keyboard.nextInt();
    keyboard.nextLine();
    switch(choice) {
        case 1: //checks inventory
            System.out.println("What would you like to check?");
            System.out.println("\t 1.) Book Inventory");
            System.out.println("\t 2.) CD Inventory");
            System.out.println("\t 3.) DVD Inventory");
            int inventoryChoice;
            inventoryChoice = keyboard.nextInt();
            
            switch(inventoryChoice){
            case 1: //choose what inventory you want
                System.out.println("Current Book inventory: " + store.currentBookInventory());

                break;

            case 2:
            System.out.println("Current CD inventory: " + store.currentCDInventory());

                break;

            case 3:
            System.out.println("Current DVD inventory: " + store.currentDVDInventory());

            break;

            default:
            System.out.println("Invalid choice. Please try again.");

            break;
            }

            break;
        case 2: //adds new items to inventory
        System.out.println("What kind of item would you like to add?");
        System.out.println("\t 1.) add Book");
        System.out.println("\t 2.) add CD");
        System.out.println("\t 3.) add DVD");

            int addInventoryChoice;
            addInventoryChoice = keyboard.nextInt();


                switch(addInventoryChoice){

                 case 1: //adds new book
                 
                System.out.println("\t adding a new book: Please enter the name: ");
                String bookName = keyboard.nextLine();
                keyboard.nextLine();  

                System.out.println("\t how many copies of this book do you have?: ");
                int numBooks = keyboard.nextInt();
                keyboard.nextLine();  
    
                System.out.println("\t Book price: ");
                double bookPrice = keyboard.nextDouble();
                keyboard.nextLine();  
    
                System.out.println("\t What is the Genre of the book?");
                String typeOfBook = keyboard.nextLine();
    
                System.out.println("\t How many pages are in the book?");
                int pageNumber = keyboard.nextInt();
                keyboard.nextLine();  
    
                System.out.println("\t Is is a hard cover book? (y/n)");
                char letterHardCover = keyboard.next().charAt(0);
                boolean hardCover = false;
                if(letterHardCover == 'Y' || letterHardCover == 'y') {
                hardCover = true;
                }
                inventoryNum = store.addBook(bookName, numBooks, bookPrice, typeOfBook, pageNumber, hardCover);
                System.out.println("Thanks, your book inventory number is " + inventoryNum);

                break;

                case 2: // add new CD

                System.out.println("\t adding a new CD: Please enter the price: ");
                double cdPrice = keyboard.nextDouble();
                 keyboard.nextLine();  

                System.out.println("\t how many copies of this CD do you have?: ");
                int numCDs = keyboard.nextInt();
                keyboard.nextLine();  
    
                System.out.println("\t What is the Genre of this CD? ");
                String typeOfCD = keyboard.nextLine(); 

                System.out.println("\t How long is the CD?");
                int albumCDLength = keyboard.nextInt();
                keyboard.nextLine();  
    
                System.out.println("\t Does it include a sleeve? (y/n)");
                char letterHasSleeve = keyboard.next().charAt(0);

                boolean includesCDSleeve = false;
                if(letterHasSleeve == 'Y' || letterHasSleeve == 'y') {
                includesCDSleeve = true;
                }
                inventoryNum = store.addCDInventory(cdPrice, numCDs, typeOfCD, albumCDLength, includesCDSleeve);
                System.out.println("Thanks, your book inventory number is " + inventoryNum);

                break;

                case 3: //add new DVD
                System.out.println("\t adding a new DVD: Please enter the number of DVD's: ");
                int numDVD = keyboard.nextInt();
                keyboard.nextLine();  

                System.out.println("\t What is the Genre of this DVD?: ");
                String dvdGenre = keyboard.nextLine(); 
    
                System.out.println("\t What is the length of this DVD? ");
                int lengthOfMovie = keyboard.nextInt();
                keyboard.nextLine();  

                System.out.println("\t How much is the DVD price?");
                double dvdPrice = keyboard.nextDouble(); 
                keyboard.nextLine();  

                System.out.println("\t is this DVD Blueray? (y/n)");
                char letterisBlueray = keyboard.next().charAt(0);

                boolean standardOrBlueRay = false;
                if(letterisBlueray == 'Y' || letterisBlueray == 'y') {
                standardOrBlueRay = true;
                }
                inventoryNum = store.addDVDInventory(numDVD, dvdGenre, lengthOfMovie, dvdPrice, standardOrBlueRay);
                System.out.println("\t Thanks, your book inventory number is " + inventoryNum);
                }

            break;

            

            
        case 3: // add regular member
            System.out.println("\t Become a new Regular member: ");

            System.out.println("\t How long would you like to be a member? (time in months): ");
            int membershipLength = keyboard.nextInt();
            keyboard.nextLine();

            System.out.println("\t What is your name?: ");
            String memberName = keyboard.nextLine();

            System.out.println("\t this membership is free, please input y. ");
            char letterIsMember = keyboard.next().charAt(0);
            boolean isRegularMemberFree = false;
            if(letterIsMember == 'Y' || letterIsMember == 'y') {
                isRegularMemberFree = true;
                }

            System.out.println("\t you are now an active member, please input y. ");
            char letterIsActive = keyboard.next().charAt(0);
            boolean isActive = true;
            if(letterIsActive == 'Y' || letterIsActive == 'y') {
                isActive = true;
                }
                 regularMemberNum = store.addRegularMembers(membershipLength, memberName, isRegularMemberFree, isActive);
                System.out.println("\t Thanks, your member number ID is " + regularMemberNum);

            break;

        case 4: // become a premium member
            System.out.println("\t Become a new Premium Member: ");

            System.out.println("\t What is your name?");
            String premiumMemberName = keyboard.nextLine();

            System.out.println("\t The monthly fee is 5.99, please type 599 to confirm.");
            double monthlyFee = keyboard.nextInt();

            System.out.println("\t you are now a premium member, type y to confirm. ");
            char letterIsPremium = keyboard.next().charAt(0);
            boolean isPremium = true;
            if(letterIsPremium == 'Y' || letterIsPremium == 'y') {
                isPremium = true;
            }

            System.out.println("type y to continue");
            char letterMonthlyFeePaid = keyboard.next().charAt(0);
            boolean monthlyFeePaid = true;
            if(letterMonthlyFeePaid == 'Y' || letterMonthlyFeePaid == 'y') {
                monthlyFeePaid = true;
            }

            premiumMembernum = store.addPremiumMembers(premiumMemberName, monthlyFee, isPremium, monthlyFeePaid);
            System.out.println("\t Thanks, your member number ID is " + premiumMembernum);

            break;    
    

        case 5: //checkout
    System.out.println("What would you like to remove?");
    System.out.println("\t 1.) Book");
    System.out.println("\t 2.) CD");
    System.out.println("\t 3.) DVD");

    int purchaseChoice = keyboard.nextInt();
    keyboard.nextLine();

    switch(purchaseChoice) {
        case 1: //book gets purchased and removed from inventory
        
        System.out.println("\t input the book inventory ID you want to check out"); 
        for (bookInventory book : store.getBookList()) {
        System.out.println(book);
        }

        inventoryNum = keyboard.nextInt();
        store.removeBook(inventoryNum);
            System.out.println("\t you have removed this book!");
            break;

        case 2: //buy a CD
        System.out.println("\t input the CD inventory ID you want to remove"); 
        for (CDInventory cd : store.getCDList()) {
            System.out.println(cd);
        }

        inventoryNum = keyboard.nextInt();
        store.removeCD(inventoryNum);
        System.out.println("\t you have removed this CD!");

            break;

        case 3: //buy a DVD
        System.out.println("\t input the DVD inventory ID you want to remove"); 
        for (DVDInventory dvd : store.getDVDList()) {
        System.out.println(dvd);
}

        inventoryNum = keyboard.nextInt();
        store.removeDVD(inventoryNum);
        System.out.println("\t you have removed this DVD!");
        break;
    }

        case 6:
            System.out.println("Exiting...");
            break;

        default:
            System.out.println("Invalid choice. Please try again.");
            break;
    }
        }while (choice != 6);
    }
}