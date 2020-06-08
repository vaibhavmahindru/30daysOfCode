import java.util.*;

public class dictionariesAndMaps {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, String> phoneBook = new HashMap<String, String>();
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            String name = in.next();
            String phone = in.next();
            // Write code here
            phoneBook.put(name, phone);// adding them in the map
        }
        while (in.hasNext()) {
            String s = in.next();
            // Write code here
            // get method returns null value if there is an invalid key.
            if (phoneBook.get(s) == null) {
                System.out.println("Not found");
            } else {
                System.out.println(s + "=" + phoneBook.get(s));
            }
        }
        in.close();
    }
}
