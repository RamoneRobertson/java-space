import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String userName;

        do {
            System.out.println("Please enter your name: ");
            userName = scanner.nextLine();
        } while(userName.length() < 2);
    }
}
