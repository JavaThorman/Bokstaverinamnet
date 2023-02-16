import java.util.Scanner;

public class Bokstaver {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String name;
        System.out.println("Hello! Please enter your name!");
        name = input.next();
        int length = 0;
        for (int i = 0; i < name.length(); i++) {
            length++;
        }
        System.out.println("You name is "+ length + " long!");
    }
}
