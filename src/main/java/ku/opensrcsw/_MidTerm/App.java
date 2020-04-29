package ku.opensrcsw._MidTerm;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/*import jdk.nashorn.internal.parser.JSONParser;*/
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
/**
 * Hello world!
 *
 */
public class App 
{
    @SuppressWarnings("restriction")
	public static void main( String[] args ) throws ParseException, FileNotFoundException
    {
    	
    	
    
    
    	String text=null;
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.println("어떤 파일을 파싱하겠습니까");
    	String inputFileName = sc.next();
        System.out.println( "Enter the keyword you are looking for : ");
        String s = sc.next();
        
        
        FileReader reader = new FileReader(inputFileName);
        Scanner in = new Scanner(reader);
        text=reader.toString();
       
    	
    	
    	
        JSONParser jsonParser = new JSONParser();
        JSONObject jsonObject = (JSONObject) jsonParser.parse(inputFileName);
        JSONArray infoArray = (JSONArray) jsonObject.get("poem");
        
        for(int i=0; i<infoArray.size();i++){
        	int j=0;
        	//data를 받아왔음.
        	String tempString = jsonObject.get("item").toString();
        	String[] tempChar = tempString.split("\\s");
        	for(j=0; j<infoArray.size();j++){
        	   if(s==tempChar[j]){
        	   System.out.println("item"+i+ ":" + jsonObject.get("item"));
        	   }
        	}
        	}

        

    	
        
  
        
    }

}