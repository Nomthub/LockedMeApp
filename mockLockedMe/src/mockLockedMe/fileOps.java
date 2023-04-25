package mockLockedMe;
import java.io.File;
import java.io.IOException;

public class fileOps {
	static void addFile(String nme) throws IOException {
		String kind = new String();
		File fileObj = new File("C:\\LockedMeWorkspace\\" + nme);
		
		if(kind.equals("Folder")) {
			
			
			if(fileObj.exists())
				System.out.println("Folder already exists");
			else
			{
				fileObj.mkdir();
				System.out.println("Folder Created");
			}
		}
		else if(kind.equals("File")) {
			//File fileOb = new File("C:\\LockedMeWorkspace\\" + nme);
			if(fileObj.exists()) {
				System.out.println("File already existed");
			}
			else
			{
				fileObj.createNewFile();
				System.out.println("File Created");
			}
		}
		
	}
	
	static String delFile(String nme) {
		File fileObj = new File("C:\\LockedMeWorkspace\\" + nme);
		
		if(fileObj.exists())
		{
			fileObj.delete();
			System.out.println("File is Deleted");
			return "File is Deleted";
		}
		else
		{
			System.out.println("File not Found");
			return "File not Found";
		}
	}
	
	static String searchFile(String nme) {
		File fileObj = new File("C:\\LockedMeWorkspace\\" + nme);
		
		if(fileObj.exists()) {
			System.out.println("File is here: " + nme);
			return "Folder exist";
		}
		else
		{
			System.out.println("File not Found");
			return "File not Found";
		}
	}
	
	static void viewFile() {
		File fileObj = new File("C:\\LockedMeWorkspace");
		String filenames[] = fileObj.list();
		
		for(String fname :filenames)
		{
			System.out.println(fname);
			File temp = new File("C:\\LockedMeWorkspace\\" + fname);
			
			if(temp.isFile()) {
				//String finames[] = temp.list();
				System.out.println("Files in Workspace\n" + temp);
			}
			if(temp.isDirectory()) {
				//String folnames[] = temp.list();
				System.out.println("Folders in Workspace\n" + temp);
			}
		}
		if (filenames.length == 0) {
			System.out.println("Workspace is empty\n");
		}
	}
	
}
