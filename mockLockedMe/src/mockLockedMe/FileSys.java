package mockLockedMe;

import java.util.*;
import java.io.*;

public class FileSys {
// The second page that has the main menu.
	static Scanner sc = new Scanner(System.in);
	static void second() throws IOException {
		
		int num = 0;
        String input = "";
        String exit = "exit";
        boolean isStringNumber = true;//If the String is not Number
        
		while(true)
		{
			menu rolout = new menu();
			rolout.display();
			System.out.println("Pick one of the options : \n");
			
			input = sc.nextLine();
			if(input.equalsIgnoreCase(exit)){break;}
			isStringNumber = input.matches("[0-9]+");//Check if no digits in string
			if(isStringNumber == false){
				System.out.println("\nIncorrect input, try again : " + input);
                continue;
			}else{
				num = Integer.parseInt(input);
			}
			//int ch = sc.nextInt();
			int ch = num;				
			switch(ch){
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
	
	public static void main(String[] args) throws Exception {
		FirstPage.first();
		second();
	}

}
