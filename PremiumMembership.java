public class PremiumMembership {

    // Fields
    private int memberID = 0;
    private String premiumMemberName;
    private double monthlyFee = 5.99;
    private boolean isActive = false;
    private boolean isPremium = false;
    private boolean monthlyFeePaid; //if they paid the monthly fee
    private static int nextMemberID = 1;

    // Constructor
    public PremiumMembership(String premiumMemberName, double monthlyFee, boolean isPremium, boolean monthlyFeePaid) {
        this.memberID = nextMemberID++;
        this.premiumMemberName = premiumMemberName;
        this.monthlyFee = monthlyFee;
        this.isActive = false; 
        this.isPremium = isPremium;
        this.monthlyFeePaid = false;

    }

    // Getters and setters
    public int getMemberID() {
        return memberID;
    }

    public String getPremiumMemberName() {
        return premiumMemberName;
    }

    public void setPremiumMemberName(String premiumMemberName) {
        this.premiumMemberName = premiumMemberName;
    }

    public double getMonthlyFee() {
        return monthlyFee;
    }

    public void setMonthlyFee(double monthlyFee) {
        this.monthlyFee = monthlyFee;
    }

    public boolean isActive() {
        return isActive;
    }

    public void activate() {
        this.isActive = true;
    }

    public void deactivate() {
        this.isActive = false;
    }

    public boolean isPremium() {
        return isPremium;
    }

    public void setPremium(boolean isPremium) {
        this.isPremium = isPremium;
    }

    public int getPremiunmMemberID(){
        return memberID;
    }

     public void setNextPremiumMemberID(int nextMemberID){
        this.nextMemberID = nextMemberID;
    }
    
    public boolean isMonthlyFeePaid() {
        return monthlyFeePaid;
    }

    public void payMonthlyFee() {
        this.monthlyFeePaid = true;
    }

    public void resetMonthlyFee() {
        this.monthlyFeePaid = false;
    }
    

    @Override
public String toString() {
    return "PremiumMembership {" + "memberID=" + memberID + ", premiumMemberName='" + premiumMemberName + "'" + ", monthlyFee=" + monthlyFee + ", isActive=" + isActive + ", isPremium=" + isPremium + ", monthlyFeePaid=" + monthlyFeePaid + '}';
}

}
