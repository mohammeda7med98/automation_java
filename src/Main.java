import java.util.Scanner;

public class Main {
    public static void main(String[] args){

//            int automation;
//            automation = 500;
//            int year = 2025;
//            double floating = 12.50;
//            char ne = 'a';
//            boolean isActive = false;
//         double its means floating number.
//            if(isActive) {
//                System.out.println("active");
//            } else {
//                System.out.println("no active");
//            }
//
//            String name = "My Name Is Mohamed Ahmed";
//
//            System.out.print(name);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your name:");
        String name = scanner.nextLine();

        System.out.println("And your age ?");
        int age = scanner.nextInt();

        System.out.print("are you students? ");
        boolean gender = scanner.nextBoolean();


        System.out.println("hello " + name );
        System.out.println("Your Age Is " + age + " years Old");
        System.out.println("IS STD ? " + gender);

        scanner.close();

    }
}

