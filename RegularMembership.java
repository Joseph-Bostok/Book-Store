public class RegularMembership{ 
    private int membershipLength = 0;
    private int memberID = 0;
    private static int nextMemberID = 0;
    private String memberName = null;
    private boolean isActive = false;
    private boolean isRegularMemberFree = false;

    public RegularMembership(int membershipLength, int memberID, String memberName, boolean isRegularMemberFree, boolean isActive){ 
        this.membershipLength = membershipLength;
        this.memberID = nextMemberID++;
        this.memberName = memberName;
        this.isActive = isActive;
        this.isRegularMemberFree = isRegularMemberFree;
    }

    public int getMembershipLength(){
        return membershipLength;
    }

    public void setMembershipLength(int membershipLength){
        if(membershipLength < 0){
            System.out.println("Error, please enter a real number");
        }
        this.membershipLength = membershipLength;
    }

    public int getMemberID(){
        return memberID;
    }

    public void setMemberID(int memberID){
        if(memberID < 0){
            System.out.println("Error, please enter a real number");
        }
        this.memberID = memberID;
    }

    public void getNextMemberID(int nextMemberID){
        this.nextMemberID = nextMemberID;
    }

     public void setNextMemberID(int nextMemberID){
        this.nextMemberID = nextMemberID;
    }
    public String getMemberName() {
    return memberName;
}

public void setMemberName(String memberName) {
    if (memberName == null || memberName.trim().isEmpty()) {
        System.out.println("Error, please provide a valid member name.");
        return;
    }
    this.memberName = memberName;
}


    public boolean isRegularMemberFree(){
        return isRegularMemberFree;
    }
    
    public void setIsRegularMemberFree(boolean isRegularMemberFree){
        this.isRegularMemberFree = isRegularMemberFree; 
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

    @Override
public String toString() {
    return "RegularMembership { " + "Membership Length: " + membershipLength + " months" + ", Member ID: " + memberID + ", Member Name: '" + memberName + '\'' + ", Is Active: " + isActive + ", Is Regular Member Free: " + isRegularMemberFree + " }";
}

    
}