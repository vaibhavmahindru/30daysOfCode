import java.util.*;

public class review {
    public void print(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (i == 0 || (i % 2) == 0)
                System.out.print(s.charAt(i));
        }
        System.out.print(" ");
        for (int i = 0; i < s.length(); i++) {
            if ((i % 2) != 0)
                System.out.print(s.charAt(i));
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        for (int i = 0; i < n; i++) {
            String s = in.nextLine();
            review ob = new review();
            ob.print(s);
        }
        in.close();
    }
}
