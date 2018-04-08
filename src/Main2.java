import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main2 {

	public static void readwrite() throws IOException 
	{
	    // Reading data from file
	    File f1=new File("C:\\Users\\mulamba\\Desktop\\Overage Alerts\\usage_oneCompany.csv");
	    FileReader fr=new FileReader(f1);
	    BufferedReader br=new BufferedReader(fr);

	    String s = br.readLine();

	    // Writing data
	    File f2=new File("C:\\Users\\mulamba\\Desktop\\Overage Alerts\\usage_oneCompany2.csv");
	    FileWriter fw=new FileWriter(f2);
	    BufferedWriter bw=new BufferedWriter(fw);
	    while(s!=null)
	    {
	    	System.out.print("\ns:"+s);
	    	if(!s.contains("Multiple_RSID|"))
	        {
	    		bw.write(s);
		        bw.newLine();
		        s=br.readLine();
	        }
	    	else
	    	{
	    		break;	
	    	}
	    }
	    bw.flush();
	    bw.close();
	    br.close();
	}
	
    public static void main(String[] args) throws IOException {
    		readwrite();
    }

}