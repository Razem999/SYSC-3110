public class BuddyInfo {

    public static String getName() {
        return name;
    }

    private static String name;
    private String address;
    private String number;

    public BuddyInfo(String fullName, String add, String num) {
        name = fullName;
        address = add;
        number = num;
    }

    public static void main(String[] args) {
        BuddyInfo name = new BuddyInfo("Razem Shahin", "Carleton", "613");
        System.out.println("Hello " + getName() +  "!");
    }
}
