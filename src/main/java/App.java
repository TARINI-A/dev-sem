import java.util.Scanner;
public class Main{
  public static void main(Strings[] args){
    Scanner sc = new Scanner(System.in);
    int BA = sc.nextInt();
    int HRA = sc.nextInt();
    int DA = sc.nextInt();
    int GS = BA + HRA + DA;
    System.out.print("Gross Salary: " + GS);
    sc.close();
  }
}
