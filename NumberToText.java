import java.util.Scanner;

public class NumberToText {
    public static void firstDigit(int number) {
        switch (number) {
            case 1:
                System.out.print("one");
                break;
            case 2:
                System.out.print("two");
                break;
            case 3:
                System.out.print("three");
                break;
            case 4:
                System.out.print("four");
                break;
            case 5:
                System.out.print("five");
                break;
            case 6:
                System.out.print("six");
                break;
            case 7:
                System.out.print("seven");
                break;
            case 8:
                System.out.print("eight");
                break;
            case 9:
                System.out.print("nine");
                break;
        }
    }

    public static void secondDigit(int number) {
        switch (number) {
            case 2:
                System.out.print("twenty");
                break;
            case 3:
                System.out.print("thirty");
                break;
            case 4:
                System.out.print("forty");
                break;
            case 5:
                System.out.print("fifty");
                break;
            case 6:
                System.out.print("seventy");
                break;
            case 8:
                System.out.print("eighty");
                break;
            case 9:
                System.out.print("ninety");
                break;
        }
    }

    public static void teenNumber(int number) {
        switch (number) {
            case 11:
                System.out.print("eleven");
                break;
            case 12:
                System.out.print("twelve");
                break;
            case 13:
                System.out.print("thirteen");
                break;
            case 14:
                System.out.print("fourteen");
                break;
            case 15:
                System.out.print("fifteen");
                break;
            case 16:
                System.out.print("sixteen");
                break;
            case 17:
                System.out.print("seventeen");
                break;
            case 18:
                System.out.print("eighteen");
                break;
            case 19:
                System.out.print("nineteen");
                break;
        }
    }

    public static void twoDigitNumber(int number) {
        int firstDigit = number % 10;
        int secondDigit = number / 10;
        secondDigit(secondDigit);
        System.out.print(" and ");
        firstDigit(firstDigit);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number (< 1000): ");
        int number = scanner.nextInt();

        if (number >= 0) {
            if (number < 10) firstDigit(number);
            else {
                if (number < 20) teenNumber(number);
                else {
                    if (number < 100) twoDigitNumber(number);
                    else {
                        int thirdDigit = number / 100;
                        firstDigit(thirdDigit);
                        System.out.print(" hundred and ");
                        twoDigitNumber(number % 100);
                    }
                }
            }
        }
        else System.out.println("cannot spell negative number");
    }
}
