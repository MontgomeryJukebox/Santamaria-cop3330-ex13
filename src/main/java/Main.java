import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("What is the principal amount?");
        int p = in.nextInt();
        System.out.print("What is the rate?");
        double rr = in.nextDouble();
        double r = rr / 100;
        System.out.print("What is the number of years?");
        int t = in.nextInt();
        System.out.print("What is the number of times the interest is compounded per year?");
        int n = in.nextInt();
        double a = p * Math.pow(1 + (r / n), n * t);
        System.out.printf("$%d invested at %.1f%% for %d years compounded %d times per year is $%.2f",
                p, rr, t, n, a);
    }
}
