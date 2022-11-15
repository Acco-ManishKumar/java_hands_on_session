package javaprog1;

import java.io.*;

// main driver method
public class readingfiles {                             
	   public static void main(String [] args) throws Exception {
	        File f1=new File("C:\\Users\\poushali.banik\\eclipse-workspace\\javaprog1\\src\\main\\java\\javaprog1\\file1.txt");
	        File f2=new File("C:\\Users\\poushali.banik\\eclipse-workspace\\javaprog1\\src\\main\\java\\javaprog1\\file2.txt");
	        File f3=new File("C:\\Users\\poushali.banik\\eclipse-workspace\\javaprog1\\src\\main\\java\\javaprog1\\file3.txt");
	        BufferedReader brA=new BufferedReader(new FileReader(f1));
	        BufferedReader brB=new BufferedReader(new FileReader(f2));
	        BufferedWriter brC=new BufferedWriter(new FileWriter(f3));
	        String sa="",sb="";
	        while((sa= brA.readLine())!=null && (sb=brB.readLine())!=null)
	        {
	            brC.write(sa);
	            brC.write("\n");
	            brC.write(sb);
	            brC.write("\n");
	        }
	        if(sb==null)
	        {
	            do
	            {
	                brC.write(sa);
	                brC.write("\n");
	            }while((sa= brA.readLine())!=null);
	        }
	        else if(sa==null)
	        {
	            while((sb= brB.readLine())!=null)
	            {
	                brC.write(sb);
	                brC.write("\n");
	            }
	        }
	        brC.close();
	    }
	}