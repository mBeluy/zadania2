import java.util.Scanner;

public class marsWeightBiloivanov {
    static float earthWeightBiloivanov;
    static float marsWeightBiloivanov;
    static double marsWeightBiloivanov_DOUBLE;
    static int marsWeightBiloivanov_INT;
    static char marsWeightBiloivanov_CHAR;
    static int marsWeightBiloivanov_RESULT;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your 'Earth weight': ");
        earthWeightBiloivanov = in.nextFloat();
        System.out.println("Your 'Earth weight' is " + earthWeightBiloivanov);
        in.close();
        marsWeightBiloivanov = earthWeightBiloivanov * 38 / 100;
        System.out.println("Your 'Mars weight' is " + marsWeightBiloivanov);
        marsWeightBiloivanov_DOUBLE = (double)marsWeightBiloivanov;
        System.out.printf("Your DOUBLE 'Mars weight' is %.4f\n", marsWeightBiloivanov_DOUBLE);
        marsWeightBiloivanov_INT = (int)marsWeightBiloivanov_DOUBLE;
        System.out.println("Your INT 'Mars weight' is " + marsWeightBiloivanov_INT);
        marsWeightBiloivanov_CHAR = (char)(marsWeightBiloivanov_INT + '0');
        System.out.println("Your CHAR 'Mars weight' is " + marsWeightBiloivanov_CHAR);
        marsWeightBiloivanov_CHAR += 5;
        System.out.println("Your NEW CHAR 'Mars weight' is " + marsWeightBiloivanov_CHAR);
        marsWeightBiloivanov_RESULT = (int)(marsWeightBiloivanov_CHAR - '0');
        System.out.println("Your RESULT 'Mars weight' is " + marsWeightBiloivanov_RESULT);
    }
}
