import java.util.Locale;
import java.util.Scanner;

//Comment
/*
Multi Line Comment
 */
public class Main{
    static void myFunction(){
        System.out.println("Hello");
    }
    public static void main(String[] args){
        String name = "John";
        System.out.println(name);
        System.out.println((int)(Math.random()*101));
        System.out.println(name.length()==4);
        System.out.println(name.toUpperCase());
        myFunction();
        System.out.println("User Input");
        Scanner scanner = new Scanner(System.in);
        int sample = scanner.nextInt();
        String c = scanner.nextLine();
        scanner.close();
        System.out.println(sample);
    }
}
