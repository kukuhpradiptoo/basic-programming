import java.util.Scanner;

public class AngkaPrima {
    private static boolean angkaPrima (int number ) {
        int counter = 0;
        for (int i = 1; i <= number; i++) {
                if ( number % i == 0) {
                    counter = +1;
                } else {
                    counter += 0;
                }
            }
        if (counter == 2) {
            return true;
        } else {
            return false;
        }
    }



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        System.out.println(angkaPrima(number));

    }

}
