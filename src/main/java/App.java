import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int BA = sc.nextInt();
        int HRA = sc.nextInt();
        int DA = sc.nextInt();

        int GS = BA + HRA + DA;
        System.out.print("Gross Salary: " + GS);
        sc.close();
    }
}
