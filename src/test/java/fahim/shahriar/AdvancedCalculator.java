package fahim.shahriar;

import java.util.Scanner;

public class AdvancedCalculator {
    public static void main(String[] args) {
        menu();

        while (true) {
            Scanner input = new Scanner(System.in);
            String choice = input.nextLine();

            switch (choice) {
                case "+":
                    addition();
                    break;
                case "-":
                    subtraction();
                    break;
                case "*":
                    multiplication();
                    break;
                case "/":
                    division();
                    break;
                case "%":
                    modulus();
                    break;
                case "^":
                    power();
                    break;
                case "s":
                    squareRoot();
                    break;
                case "a":
                    absValue();
                    break;
                case "f":
                    factorial();
                    break;
                case "i":
                    sine();
                    break;
                case "c":
                    cosine();
                    break;
                case "t":
                    tan();
                    break;
                case "l":
                    log();
                    break;
                case "q":
                    System.out.println("Goodbye");
                    return;
                default:
                    System.out.println("Invalid input. Please try again.");
            }
        }

    }
    public static void menu() {
        System.out.println("\nWelcome to Advanced Calculator");
        System.out.println("Available Operations:");
        System.out.println("1. + : Addition");
        System.out.println("2. - : Subtraction");
        System.out.println("3. * : Multiplication");
        System.out.println("4. / : Division");
        System.out.println("5. % : Modulus");
        System.out.println("6. ^ : Power");
        System.out.println("7. s : Square Root (uses first number only)");
        System.out.println("8. a : Absolute Value (uses first number only)");
        System.out.println("9. f : Factorial (uses first number only)");
        System.out.println("10. i : Sine (uses first number only, in degrees)");
        System.out.println("11. c : Cosine (uses first number only, in degrees)");
        System.out.println("12. t : Tangent (uses first number only, in degrees)");
        System.out.println("13. l : Natural Logarithm (uses first number only)");
        System.out.println("Enter 'q' to quit");
        System.out.println("Enter your choice: ");
    }

    public static void addition(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double a = input.nextDouble();
        System.out.println("Enter second number: ");
        double b = input.nextDouble();
        double sum = a+b;
        System.out.printf("%.2f + %.2f = %.2f\n",a,b,sum );
    }

    public static void subtraction(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double a = input.nextDouble();
        System.out.println("Enter second number: ");
        double b = input.nextDouble();
        double sub;
        if (a>b){
            sub = a - b;
            System.out.printf("%.2f - %.2f = %.2f\n",a,b,sub );
        }else {
            sub = b - a;
            System.out.printf("%.2f - %.2f = %.2f\n",b,a,sub );
        }
    }

    public static void multiplication(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double a = input.nextDouble();
        System.out.println("Enter second number: ");
        double b = input.nextDouble();
        double mul = a+b;
        System.out.printf("%.2f * %.2f = %.2f\n",a,b,mul );
    }

    public static void division(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double a = input.nextDouble();
        System.out.println("Divided by: ");
        double b = input.nextDouble();
        if (b!=0){
            double div = a/b;
            System.out.printf("%.2f / %.2f = %.2f\n",a,b,div );
        }else{
            System.out.println("Error: Division by zero");
        }
    }

    public static void modulus(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double a = input.nextDouble();
        System.out.println("Enter second number: ");
        double b = input.nextDouble();

        double mod = a%b;

        System.out.printf("%.2f %% %.2f = %.2f\n",a,b,mod );
    }

    public static void power(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter base: ");
        double a = input.nextDouble();
        System.out.println("Enter exponent: ");
        double b = input.nextDouble();

        double pow = Math.pow(a,b);
        System.out.printf("%.2f ^ %.2f = %.2f\n",a,b,pow );
    }

    public static void squareRoot(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        double a = input.nextDouble();
        double s = Math.sqrt(a);
        System.out.printf("√%.2f = %.2f\n",a,s );
    }

    public static void absValue(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        double n = input.nextDouble();
        double a= Math.abs(n);
        System.out.printf("|%.2f| = %.2f\n",n,a );
    }

    public static void factorial(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = input.nextInt();
        int f = 1;
        for (int i = n ; i>=1;i--){
            f *= i;
        }
        System.out.printf("%d! = %d\n", n, f);
    }

    public static void sine(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        double n = input.nextDouble();
        double radians = Math.toRadians(n);
        double s = Math.sin(radians);
        System.out.printf("sin(%.2f°) = %.2f", n, s);
    }

    public static void cosine(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        double n = input.nextDouble();
        double radians = Math.toRadians(n);
        double c= Math.cos(radians);
        System.out.printf("cos(%.2f°) = %.2f", n, c);
    }

    public static void tan(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        double n = input.nextDouble();
        double radians = Math.toRadians(n);
        double t = Math.tan(radians);
        System.out.printf("tan(%.2f°) = %.2f", n, t);
    }

    public static void log(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        double n = input.nextDouble();
        double l = Math.log(n);
        System.out.printf("ln(%.2f) = %.2f", n, l);
    }
}
