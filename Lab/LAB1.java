import java.lang.Math;
import java.util.Scanner;
public class main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        float a = scanner.nextInt();
        scanner.close();
        a *= 10;
        int u = Math.round(a);
        System.out.println(u%10);
    }
}