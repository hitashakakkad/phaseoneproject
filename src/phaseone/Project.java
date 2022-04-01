package phaseone;
    import java.io.File;
    import java.io.IOException;
	import java.util.ArrayList;
	import java.util.Scanner;

	public class Project {
	//create File ....
	public static void generateFile(String fileName,String path) throws IOException
	{
	ArrayList<String> List=new ArrayList<String>();

	String finalname=path+fileName;

	File f=new File(finalname);
	boolean b=f.createNewFile();
	if(b!=true)
	{
	System.out.println("The file "+ fileName + " already exists" );
	}
	else
	{
	List.add(fileName);
	System.out.println("File created");
	System.out.println(List+ " is added");
	}

	}

	//Delete Function
	public static void deleteFile(String fileName,String path) {

	String finalfile=path+fileName;
	File file=new File(finalfile);
	file.delete();
	System.out.println("File deleted");
	}

	//Searching Function

	public static void searchFile(String searchingFileName,String path) {

	File f=new File(path);
	File filename[]=f.listFiles();
	int count=0;
	for(File ff:filename) {

	if(ff.getName().equals(searchingFileName))
	{
	System.out.println("You have "+searchingFileName+" File ");
	return;
	}
	}
	System.out.println("File not found");
	}

	//Display File List...

	public  static void displayFile(String path) {
	File f=new File(path);
	File filename[]=f.listFiles();
	System.out.println("Your File List.......");
	for(File ff:filename) {
	System.out.println(ff.getName());
	}
	}


	//Main method
	public static void main(String[] args) throws IOException {

	String path="C:\\firstproject\\";
	Scanner scanner =new Scanner(System.in);
	boolean c=true;
	//for stop Main menu;
	System.out.println("Welcome to LockedMe");
	System.out.println("Developer Name:Hitashakakkad");

	while(c) {
	System.out.println("\nMAIN MENU - Select anyone option : \n"+
	"1 - To retrieve file names\n"+
	"2 - Business level operations\n"+
	"3 - Exit the Application ");
	System.out.println();
	boolean b=true;
	int x=scanner.nextInt();
	switch (x) {
	case 1:{
	displayFile(path);
	System.out.println();
	break;
	}
	case 2:
	{ int k = 0;
	while(true) {
	System.out.println("To Add File : Press 1 \n"+
	"To Delete File : Press 2\n"+
	"To Search File : Press 3\n"+
	"Return to Main Menu :Press 4");
	System.out.println();
	int i=scanner.nextInt();



	if(i<=0 || i>=5) {
	System.out.println("please Enter valid number  ");
	System.out.println();

	}    else {
	       if(i==1){
	System.out.println("Enter the File Name to Add");

	String FileForCreate=scanner.next();
	generateFile(FileForCreate,path);
	System.out.println();

	}
	else if(i==2) {
	System.out.println("Enter the File Name to Delete");
	String FileForDelete=scanner.next();
	deleteFile(FileForDelete,path);
	System.out.println();
	}
	else if(i== 3) {
	System.out.println("Enter the File Name to Search");
	String FileForSearching=scanner.next();
	searchFile(FileForSearching,path);
	System.out.println();
	}
	else if(i==4) {
	System.out.println("Back to Main menu");
	break;
	}

	}

	}
	break;
	}
	       case 3:{
	       System.out.println("Thank you");
	c=false;
	break;

	  }
	 
	}

	}

	}

	}

