public class BuddyInfo {

    public String getName() {
        return name;
    }

    public static String name;
    public String address;
    public String number;

    public BuddyInfo(String fullName, String add, String num) {
        name = fullName;
        address = add;
        number = num;
    }

    public void main(String[] args) {
        BuddyInfo name = new BuddyInfo("Razem Shahin", "Carleton", "613");
        System.out.println("Hello " + getName() +  "!");
    }
}
