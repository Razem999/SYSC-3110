//author *Razem Shahin
import java.util.*;

public class AddressBook {

    private List<BuddyInfo> budInf;
    public AddressBook() {
        budInf = new ArrayList<>();
    }

    //Method to add more buddies!
    public void addBuddy(BuddyInfo BI ) {
        if(BI != null) {
            budInf.add(BI);
        }
    }

    //Method to remove buddies :(
    public BuddyInfo removeBuddy(int index) {
        if(index >= 0 && index < budInf.size()) {
            return budInf.remove(index);
        }
        return null;
    }

    private void listBuddies() {
        for (BuddyInfo buddyInfo : budInf) {
            System.out.println(buddyInfo.getName());
        }
    }

    //Main method
    public static void main(String[] args) {
        BuddyInfo buddy1 = new BuddyInfo("Tom", "Carleton", "613");
        //BuddyInfo buddy2 = new BuddyInfo("Jerry", "uOttawa", "620");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy1);
        //addressBook.addBuddy(buddy2);
        addressBook.listBuddies();
        addressBook.removeBuddy(0);
        System.out.println("Address Book");
    }
}
