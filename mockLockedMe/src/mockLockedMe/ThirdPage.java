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
	static Scanner sc = new Scanner(System.in);
	static void third() throws IOException {
		
		String fname;
		Scanner inp = new Scanner(System.in);
		int num = 0;
        String input = "";
        String exit = "exit";
        boolean isStringNumber = true;//If the String is not Number
        
		while(true)
		{
			Scdmenu rolout = new Scdmenu();
			rolout.display2();
			System.out.println("Pick one of the options : \n");
			
			input = inp.nextLine();
			if(input.equalsIgnoreCase(exit)){
				break;
			}
			isStringNumber = input.matches("[0-9]+");//Check if no digits in string
			if(isStringNumber == false){
                System.out.println("\nIncorrect input, try again : " + input);
                continue;
			}else{
                num = Integer.parseInt(input);
			}
			int ch = num;
				
			switch(ch){
				case 1: //adding a file
					System.out.println("Enter the type of file you want to add (Folder or File) ");
					String kind = new String();
					kind = sc.next();
					if(kind.equals("Folder")) {
						System.out.println("Enter the name of the document");
						fname = sc.next();
						fileOps.addFolder(fname);
						break;
					}
					else if(kind.equals("File")) {
						System.out.println("Enter the name of the document");
						fname = sc.next();
						fileOps.addFile(fname);
						break;
					}
						
				case 2: //delete file
					System.out.println("Enter the name of the file you want to delete");
					fname = sc.next();
					fileOps.delFile(fname);
					break;
					
				case 3: //Search for file
					System.out.println("Enter the name of the file you to search");
					fname = sc.next();
					fileOps.searchFile(fname);
					break;
					
				case 4: //back to main menu
					try {
						FileSys.second();
					} catch (Exception e) {
						e.printStackTrace();
					}
					break;
				default: 
					System.out.println("Option does not exist \n");
			}
		}
	}
}
