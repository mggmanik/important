import java.util.Scanner;

public class SwitchDemo {

//    default case in switch will print the value when the all the above cases are not true

    public static void main(String[] args) {
        char c;
        int choice;
        do {
            System.out.println("Select from the following:");
            System.out.println("1. Java");
            System.out.println("2. PHP");
            System.out.println("3. JSP");
            System.out.println("Enter your Choice: ");
            Scanner in = new Scanner(System.in);
            choice = in.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.println("You selected Java");
                    break;
                case 2:
                    System.out.println("You selected PHP");
                    break;
                case 3:
                    System.out.println("You selected JSP");
                    break;
                default:
                    System.out.println("Can select from the above given list only!");
            }
            System.out.println("Enter again?(y/n)");
            c = in.next().charAt(0);
        }while (c == 'y');
    }
}
