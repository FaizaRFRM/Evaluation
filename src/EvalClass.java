import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.Reader;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;



public class EvalClass {
static void ext(){
	    
	    System.out.println("Exit");
}
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
	    System.out.println("========================================================\n\n");
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
			System.out.println("========================================================\n\n");
	    	break;
	    case 2:
	    	HttpClient client1 = HttpClient.newHttpClient();
		    HttpRequest request1 = HttpRequest.newBuilder()
		    .uri(URI.create("https://ipinfo.io/161.185.160.93/geo"))
		    .build();
		    HttpResponse<String> response1 = client1.send(request1,HttpResponse.BodyHandlers.ofString());
		    
		    
			String fileA= response1.body();
//			System.out.println(fileA);
			try {
		    	FileWriter writerFile= new FileWriter("C:\\Users\\user16\\eclipse-workspace\\taskFaiza\\MYAPI.txt");
		    	writerFile.write(fileA);
		    	writerFile.close();
		    }
		    catch(IOException e) {
		    	e.printStackTrace();
		    }
			System.out.println("JSON file was created it iclude:");
			System.out.println("==================================");
			System.out.println(fileA);
	    	System.out.println("========================================================\n\n");

	    	try {
		    File myObj = new File("C:\\Users\\user16\\eclipse-workspace\\taskFaiza\\MYAPI.txt");
   	     Scanner myReader = new Scanner(myObj);
	    	System.out.println("========================================================");
   	  System.out.println("Reading file");
  	System.out.println("========================================================");
   	     while (myReader.hasNextLine()) {
   	       String data = myReader.nextLine();
   	   
   	       System.out.println(data);
   	     }
   	     myReader.close();
   	   } catch (FileNotFoundException e) {
   	     e.printStackTrace();
   	   }
	    	System.out.println("========================================================\n\n");
	    	break;
	    case 3:
	    	
	    	File file = new File("C:\\Users\\user16\\eclipse-workspace\\taskFaiza\\MYAPI.txt");
	    	System.out.println(" enter the content you looking for");
	    	
	        Scanner word = new Scanner(System.in);
	        String[] name = new String [word.nextInt()]; 
	        word.nextLine();
	       Scanner scanner;
	       try {
	           scanner = new Scanner(file).useDelimiter( ",");

	           while (scanner.hasNext()) {
//	               final String lineFromFile = scanner.nextLine();
//	               lineFromFile.contains(name);
	                   System.out.println("I found " + name);
	                   break;
	           }
	       } catch (IOException e) {
	           System.out.println(" cannot write to file " + file.toString());
	       }
	       
	       
	       
	       
	       
	       
	       
//	       File file = new File("C:\\Users\\user16\\eclipse-workspace\\taskFaiza\\MYAPI.txt");
//
//	       Scanner kb = new Scanner(System.in);
//
//	      System.out.println(" enter the content you looking for");
//	      String name = kb.next();
//	      Scanner scanner;
//	      try {
//	          scanner = new Scanner(file).useDelimiter( ",");
//
//	          while (scanner.hasNext()) {
//	              final String lineFromFile = scanner.nextLine();
//	              if (lineFromFile.contains(name)) {
//	                  // a match!
//	                  System.out.println("I found " + name);
//	                  break;
//	              }
//	          }
//	      } catch (IOException e) {
//	          System.out.println(" cannot write to file " + file.toString());
//	      }
	    	break;
	    case 4:
	    	ext();
            ex = false;
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
