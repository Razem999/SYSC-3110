import java.util.*;

public class AddressBook {

    private List<BuddyInfo> budInf;
    public AddressBook() {
        budInf = new ArrayList<>();
    }

    //Method to add more buddies!
    private void addBuddy(BuddyInfo BI ) {
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

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(0);
        System.out.println("Address Book");
    }
}
