package Window_Handling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class buffer_writer {
		/* It makes the performance fast. The buffering characters are used for providing the efficient writing of single arrays, characters, and strings.
		 *  OR
		 *  it creates separate file for the written text   */	
			public static void main(String args[]){
				try{//it creates new k file 
					BufferedWriter out =new BufferedWriter(new FileWriter("D:\\Class notes.html)"));
					out.write("created by harika");
					out.close();
					System.out.println("file created succeess");
				}
				catch(IOException e){
					System.out.println(e);
					}
			}

		}
