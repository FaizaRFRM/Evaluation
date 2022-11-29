
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;



public class EvalClass {

	public static void main(String[] args)throws IOException 
	{
		 boolean ex=true;
		 try { 
		boolean exit=true;
		while(exit) {
		Scanner sa=new Scanner(System.in);

	    System.out.println("shoose number from the menu");
	    System.out.println("1-consume ApI");
	    System.out.println("2-Write response  a file");
	    System.out.println("3-search from file");
	    System.out.println("4-Exit");
	    System.out.println("========================================================\n");
	    
	    
	    
	    int option;
	    option=sa.nextInt();
	    switch(option) {
	    case 1:
	    	HttpClient client = HttpClient.newHttpClient();
		    HttpRequest request = HttpRequest.newBuilder()
		    .uri(URI.create("https://ipinfo.io/161.185.160.93/geo"))
		    .build();
		    HttpResponse<String> response = client.send(request,HttpResponse.BodyHandlers.ofString());
              
		    
		    
			String fileF= response.body();
			System.out.println(fileF);
			System.out.println("========================================================\n");
	    	break;
	    	
	    	
	    	
	    case 2:
	    	HttpClient client1 = HttpClient.newHttpClient();
		    HttpRequest request1 = HttpRequest.newBuilder()
		    .uri(URI.create("https://ipinfo.io/161.185.160.93/geo"))
		    .build();
		    HttpResponse<String> response1 = client1.send(request1,HttpResponse.BodyHandlers.ofString());
		    
		    
			String file= response1.body();
			try {
		    	FileWriter writerFile= new FileWriter("C:\\Users\\user16\\eclipse-workspace\\taskFaiza\\MYAPI.txt");
		    	writerFile.write(file);
		    	writerFile.close();
		    }
		    catch(IOException e) {
		    	e.printStackTrace();
		    }
			System.out.println("JSON file was created it iclude:");
			System.out.println("==================================");
			System.out.println(file);
	    	System.out.println("========================================================\n");

	    	try {
		    File read = new File("C:\\Users\\user16\\eclipse-workspace\\taskFaiza\\MYAPI.txt");
   	     Scanner Reader = new Scanner(read);
	    	System.out.println("========================================================");
   	  System.out.println("Reading file");
  	System.out.println("========================================================");
   	     while (Reader.hasNextLine()) {
   	       String details = Reader.nextLine();
   	   
   	       System.out.println(details);
   	     }
   	     Reader.close();
   	   } catch (FileNotFoundException e) {
   	     e.printStackTrace();
   	   }
	    	System.out.println("========================================================\n");
	    	break;
	    	
	    	
	    case 3:
	    	
	    	 File file1 = new File("C:\\Users\\user16\\eclipse-workspace\\taskFaiza\\MYAPI.txt");

	         Scanner sc = new Scanner(System.in);

	        System.out.println("enter words you want to search");
	        String name = sc.next();
	        System.out.println("========================================================");
	        Scanner scanner;
	        try {
	            scanner = new Scanner(file1).useDelimiter( ",");

	            while (scanner.hasNext()) {
	                final String lineFromFile = scanner.nextLine();
	                if (lineFromFile.contains(name)) {
	                    System.out.println("It is Available " + name);
	                    System.out.println("***********************");
	                    break;
	                }
	            }
	        } catch (IOException e) {
	            System.out.println("Not available in the source: " + file1.toString());
	        }
	        
	        
	        
//**********************************************************************	        
//	    	    File file1 = new File("C:\\Users\\user16\\eclipse-workspace\\taskFaiza\\MYAPI.txt");
//	    	    Scanner sc = new Scanner(System.in);
//	    	    System.out.println("enter words you want to search");
//	    	    String name = sc.next();
//	    	    System.out.println("========================================================");
////	    	    for(int i=0;i<name.length();i++) {
//	    	    
//	    	    Scanner scanner;
//	    	    try {
//	    	        scanner = new Scanner(file1).useDelimiter( ",");
//	    	    
//	    	        while (scanner.hasNext()) {
//	    	            final String lineFromFile = scanner.nextLine();
//	    	            if (lineFromFile.contains(name)) {
//	    	                System.out.println("It is Available" + "   "+name);
//	    	                System.out.println("***********************");
//	    	                break;
//	    	                
//	    	            }
////	    	            else {
////	    	            	System.out.println("Not available in the source:" + "   "+file1.toString());
////	    	    	        System.out.println("***********************");
////	    	    	        break;
//	    	            }
////	    	    }
//	    	    } catch (IOException e) {
//	    	    	System.out.println("Not available in the source:" + "   "+file1.toString());
//	    	    }
	    	    
//****************************** ********************************************
//	    	File file = new File("C:\\Users\\user16\\eclipse-workspace\\taskFaiza\\MYAPI.txt");
//	    	System.out.println(" enter words you want to search");
//	    	
//	        Scanner word = new Scanner(System.in);
//	        String[] name = new String [word.nextInt()]; 
//	        word.nextLine();
//	       Scanner scanner;
//	       try {
//	           scanner = new Scanner(file).useDelimiter( ",");
//
//	           while (scanner.hasNext()) {
//	               final String lineFromFile = scanner.nextLine();
//	               lineFromFile.contains(name);
//	                   System.out.println("I found " + name);
//	                   break;
//	           }
//	       } catch (IOException e) {
//	           System.out.println(" cannot write to file " + file.toString());
//	       }
	       
//********************************************************************************	    	
	    	
//	    	File file = new File("C:\\Users\\user16\\eclipse-workspace\\taskFaiza\\MYAPI.txt");
//	    	System.out.println(" enter words you want to search");
//	    	
//	        Scanner sc = new Scanner(System.in);
//	        String[] name = new String [name.nextInt()]; 
//	        name.nextLine();
////	    	String[] words=null;
//		      
//	       Scanner scanner;
//	       FileReader fileReader = new FileReader(file);
//	       try {
//	           scanner = new Scanner(file).useDelimiter( ",");
//
//	           while (scanner.hasNext()) {
//	               final String lineFromFile = scanner.nextLine();
//	               lineFromFile.contains(name);
//	                   System.out.println("I found " + name);
//	                   break;
//	           }
//	       } catch (IOException e) {
//	           System.out.println(" cannot write to file " + file.toString());
//	       }
//	       fileReader.close();
	       
	       
//******************************************************************************	       
	     	
//	       File f1=new File("C:\\Users\\user16\\eclipse-workspace\\taskFaiza\\MYAPI.txt"); //Creation of File Descriptor for input file
//	       String[] words=null;  //Intialize the word Array
//	       FileReader filereader = new FileReader(f1);  //Creation of File Reader object
//	       BufferedReader br = new BufferedReader(words); //Creation of BufferedReader object
//	       String s;     
//	       String input="Java";   // Input word to be searched
//	       int count=0;   //Intialize the word to zero
//	       while((s=bufferReader.readLine())!=null)   //Reading Content from the file
//	       {
//	          words=s.split(" ");  //Split the word using space
//	           for (String word : words) 
//	           {
//	                  if (word.equals(input))   //Search for the given word
//	                  {
//	                    count++;    //If Present increase the count by one
//	                  }
//	           }
//	       }
//	       if(count!=0)  //Check for count not equal to zero
//	       {
//	          System.out.println("The given word is present for "+count+ " Times in the file");
//	       }
//	       else
//	       {
//	          System.out.println("The given word is not present in the file");
//	       }
//	       
//	          fr.close();
//	*************************************************************************       
	       
	    	    
//	       File file = new File("C:\\Users\\user16\\eclipse-workspace\\taskFaiza\\MYAPI.txt");
//
//	       Scanner word = new Scanner(System.in);
//
//	      System.out.println(" enter the content you looking for");
//	      String string = word.next();
//	      Scanner scanner;
//	      try {
//	          scanner = new Scanner(file).useDelimiter( ",");
//
//	          while (scanner.hasNext()) {
//	              final String lineFromFile = scanner.nextLine();
//	              if (lineFromFile.contains(string)) {
//	                  // a match!
//	                  System.out.println("I found " + name);
//	                  break;
//	              }
//	          }
//	      } catch (IOException e) {
//	          System.out.println(" cannot write to file " + file.toString());
//	      }
//****************************************************
	    	break;
	    case 4:
            System.out.println("program is Exit");

	    	System.exit(0);
	    	break;
	    }
		}
	exit=false;
		 }
	catch(Exception e) {
		System.out.println(e);
	   }
	}
}
