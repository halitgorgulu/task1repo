import java.util.Scanner;

public class Task1 {

    public static void treeWithStars(String input){
        int n = Integer.parseInt(input);
        if(n<=0) {
            System.out.println("That's wrong input!!");
            return;
        }
        System.out.println(n + " layer tree preparing...");

        for (int i=0; i<n; i++)
        {
            for (int j=n-i; j>1; j--)
            {
                System.out.print(" ");// printing spaces
            }

            for (int j=0; j<(2*i+1); j++ )
            {
                System.out.print("*");// printing stars
            }

            System.out.println();
        }
    }




    public static void main(String[] args) {

        while(true) {
            try{

                Scanner myObj = new Scanner(System.in);  // Create a Scanner object
                System.out.println("Enter a positive integer or if u want press q or quit then program terminate.");
                String n = myObj.nextLine();// read user input

                if(n.equals("q") || n.equals("quit")){
                    System.out.print("Program terminating..");
                    break;
                }


                treeWithStars(n);

            } catch (Exception ignored) {
                System.out.println("That's wrong input!!");
            }
        }
    }
}
