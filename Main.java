import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        //int a = scanner.nextInt();
        scanner.close();
		//System.out.println(a);
		
		String s1 = "India";
		String s2 = "BharatIndia";
		
		// if sub-regions of string are equal
		boolean ans = false;
		ans = s1.regionMatches(true,0,s2,6,5);
		System.out.println(ans);
    }
}