
import java.util.Scanner;


public class Contains {

	
	public static void main(String[] args) {
		
		String str;
		String str2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Humpty's Statement");
		str=sc.nextLine();
		System.out.println("Enter Humpty's Statement");
		str2=sc.nextLine();
		
		if(str.contains(str2))
		{
			System.out.println("Found");    
		}
		else{
			System.out.println("Not found");
		}
		
	}
}
