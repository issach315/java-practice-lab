import java.util.Scanner;

public class FindLengthOfString {

    public static int findTheLengthHelper(String str) {

        return str.length();
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter String");
        String inputStr = scan.nextLine();

        int resultStr = findTheLengthHelper(inputStr);

        System.out.println("Length of the Given String is =  " + resultStr);

    }
}