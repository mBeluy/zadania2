import java.util.Scanner;

public class zadanie3Biloivanov {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number of operations: ");
        int number = in.nextInt();
        in.close();
        int random_number;
        for(int i = 0; i < number; i++){
            random_number = (int)(Math.random() * 100) + 1;
            if (random_number % 2 == 0){
                System.out.println("Generated number " + random_number + " is paired");
            }
            else{
                System.out.println("Generated number " + random_number + " is unpaired");
            }

        }

    }
}
