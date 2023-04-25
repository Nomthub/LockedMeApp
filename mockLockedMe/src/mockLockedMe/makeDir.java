package mockLockedMe;
import java.io.*;
import java.util.*;

public class makeDir {

	static void makedi() {
		// make a folder to keep all the files of the client
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Folder Name to keep all Your documents ");
		String fname = sc.nextLine();
		*/
		
		//File f = new File("C:\\" + fname);
		File f = new File("C:\\LockedMeWorkspace");
		try{
		    if(f.mkdir()) { 
		        System.out.println("Directory Created");
		    } else {
		        System.out.println("Let's Work");
		    }
		} catch(Exception e){
		    e.printStackTrace();
		} 


	}

}
