package mockLockedMe;

import java.util.*;
import java.io.*;

public class FileSys {
// The second page that has the main menu.
	
	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		//File  so = new File("C:\\\\LockedMeWorkspace");
		FirstPage.first();
		while(true)
		{
			menu rolout = new menu();
			rolout.display();
			System.out.println("Pick one of the options : \n");
			int ch = sc.nextInt();
			
			switch(ch)
			{
			case 1:
				fileOps.viewFile();
				break;
			case 2:
				ThirdPage.third();
				break;
			case 3: 
				System.out.println("Thank you For using the App");
				System.exit(0);
			default: 
				System.out.println("Option does not exist \n");
			}
		}
	}

}
