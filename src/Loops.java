import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        int number;
        int total = 0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Sayı Giriniz : ");
            number = input.nextInt();

            if(number % 4 == 0 ) {
                total += number;
            }
        }
        while (number % 2 == 0);

        System.out.println(total);

    }
}
