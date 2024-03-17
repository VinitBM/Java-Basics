package JavaBasic3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileH {
	
	
		public static void main(String []args) throws IOException
		{
		FileWriter f1=new FileWriter("gunjan.txt",true);
			BufferedWriter b1=new BufferedWriter(f1,2000);
			String s1="Malegaon";
			b1.write(s1);
			b1.close();
		}
	}