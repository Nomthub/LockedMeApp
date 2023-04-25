package mockLockedMe;
import java.util.*;
import java.io.*;

class Scdmenu {
	void display2() {
		System.out.println("\nFile Operations Menu\n" + "1. Add a file\n" + "2. Delete a file\n" + "3. Search a file\n" + "4. Go to main menu\n");
	}	
}

public class ThirdPage {
	//functionality of the second menu aka the third page
	static void third() throws IOException {
		Scanner sc = new Scanner(System.in);
		String fname;
		//= sc.nextLine();
		while(true)
		{
			Scdmenu rolout = new Scdmenu();
			rolout.display2();
			System.out.println("Pick one of the options : \n");
			int ch = sc.nextInt();
			
			switch(ch)
			{
			case 1: //adding a file
				System.out.println("Enter the type of file you want to add (Folder or File) ");
				String kind = new String();
				kind = sc.next();
				
				System.out.println("Enter the name of the document");
				fname = sc.next();
				fileOps.addFile(fname);
				break;
			case 2: //delete file
				System.out.println("Enter the name of the file");
				fname = sc.next();
				fileOps.delFile(fname);
				break;
			case 3: //Search for file
				//System.out.println("Thank you For using the App");
				//System.exit(0);
				System.out.println("Enter the name of the file");
				fname = sc.next();
				fileOps.searchFile(fname);
				break;
			case 4: //back to main menu
				FileSys pg1 = new FileSys();
				break;
			default: 
				System.out.println("Option does not exist \n");
			}
		}
	}

}
