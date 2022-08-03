import java.util.Scanner;

public class Task1 {

    public static String treeWithStars(String input){
        String s = "";
        try{
            if (input.equals("q") || input.equals("quit")) {
                s = "Program terminating..";
                System.out.print(s);
                return s;
            }
            int n = Integer.parseInt(input);
            if (n <= 0) {
                s = "That's wrong input!!";
                System.out.print(s);
                return s;
            }

            for (int i = 0; i < n; i++) {
                for (int j = n - i; j > 1; j--) {
                    s += " ";
                }

                for (int j = 0; j < (2 * i + 1); j++) {
                    s += "*";
                }
                if (i == (n - 1)) {
                    continue;
                }
                s += "\n";
            }
            System.out.print(s);
            return s;
        } catch (Exception ignored) {
            s = "That's wrong input!!";
            System.out.print(s);
            return s;
        }
    }




    public static void main(String[] args) {

        try{
            Scanner myObj = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter a positive integer or if u want press q or quit then program terminate.");
            String n = myObj.nextLine();// read user input

            treeWithStars(n);
        }catch(Exception ignored){
            System.out.print("That's wrong input!!");
        }

    }
}
