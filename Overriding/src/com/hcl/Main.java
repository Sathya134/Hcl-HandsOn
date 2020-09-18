/*package com.hcl;

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		int noOfStall,noOfShow,noOfSeatsPerShow;
		String name,details,ownerName;
		
		Event e1 = new Exhibition(); 
		Event e2 = new StageEvents();
		
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the name of the Event");
		name=input.nextLine();
		System.out.println("Enter the detail of the Event");
		details=input.nextLine();
		System.out.println("Enter the owner name of the Event");
		ownerName=input.nextLine();
	
		
		int type=input.nextInt();
		
		if(type==1){
			System.out.println("Enter the number of stalls");
			noOfStall=input.nextInt();
			((Exhibition)e1).setNoOfStall(noOfStall);
			e1.projectedRevenue();
			}
		else if(type==2){
			System.out.println("Enter the number of shows");
			noOfShow=input.nextInt();
			noOfSeatsPerShow=input.nextInt();
			((StageEvents)e2).setNoOfShow(noOfShow);
			((StageEvents)e2).setNoOfSeatsPerShow(noOfSeatsPerShow);
			e2.projectedRevenue();
			
			
		}
	}

}*/

package com.hcl;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {

		int type;
		int noOfStall, noOfShow, noOfSeatsPerShow;

		Scanner input = new Scanner(System.in);
		Event e1 = new Exhibition();
		Event e2 = new StageEvents();
		System.out.println("Enter the name of the event");
		e1.name = input.nextLine();
		System.out.println("Enter the detail of the event");
		e1.details = input.nextLine();
		System.out.println("Enter the owner name of the event");
		e1.ownerName = input.nextLine();
		System.out.println("Enter the type of event:");
		System.out.println("1.Exhibition\n2.Stage Event");
		type = input.nextInt();
		if (type == 1) {
			System.out.println("Enter the number of stalls");
			noOfStall = input.nextInt();
			((Exhibition) e1).setNoOfStall(noOfStall);
			e1.projectedRevenue();
		} else if (type == 2)

		{
			System.out.println("Enter the number of shows");
			noOfShow = input.nextInt();
			noOfSeatsPerShow = input.nextInt();
			((StageEvents) e2).setNoOfShow(noOfShow);
			((StageEvents) e2).setNoOfSeatsPerShow(noOfSeatsPerShow);
			e2.projectedRevenue();

		}
	}
}
