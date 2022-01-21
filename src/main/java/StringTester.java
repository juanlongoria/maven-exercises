import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

import java.lang.Object;


public class StringTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Input");
        String userInput = sc.nextLine();
        if (StringUtils.isNumeric(userInput)) {
            System.out.printf("%s is a number%n", userInput);
        } else {
            System.out.printf("%s is not a number%n", userInput);
        }
        String flippedCase = StringUtils.swapCase(userInput);
        System.out.printf("Output: ", userInput, flippedCase);
        String reversedInput = StringUtils.reverse(userInput);
        System.out.printf("Output: ", userInput, reversedInput);

    }
}




