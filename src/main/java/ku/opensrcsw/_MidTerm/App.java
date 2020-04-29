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
 int i;
        for(i=0; i<jsonObject.size(); i++) {
        	JSONObject object = (JSONObject)infoArray.get(i);
        	if(s==object.get("item")) {
        		
        		System.out.println("item"+i+ object.get("item"));
        	}
        	
        }

        

    	
        
  
        
    }

}