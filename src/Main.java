import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Made by horologium, the code is free to use, however.
 * 
 * @author horo
 *
 */
public class Main {

	public static void main(String[] args) throws IOException {
		System.out.println("==========Prefixer Line Writer==========\n");
		ArrayList<String> contents = new ArrayList<String>();
		String flag = "-true";
		String line = "", fileArg = "", headerText = "";
		if (args.length == 0) {
			System.out.println("Please provide the proper arguments when running this file: \njava -jar example.txt \"Hello World\"\n\n");
		}
		fileArg = args[0];// File arg
		headerText = args[1];// the string to insert
		flag = args[2];
		System.out.println("Each line will be prefixed by " + headerText + "\n");
		BufferedReader fis = null;
		try {
			fis = new BufferedReader(new FileReader(fileArg));
			System.out.println("Read file from " + fileArg +"\n");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("Unable to read file, double check your file path and spelling.");
		}
		while ((line = fis.readLine()) != null && !line.equals("")) {
			contents.add(line);
		}
		fis.close();
		new FileWriter(fileArg, false).close();// Purges the file
		fis = new BufferedReader(new FileReader(fileArg));//Reopens file in new instance
		FileWriter f = new FileWriter(fileArg);
		for (int i = 0; i < contents.size(); i++) {//Writes our text
			if (flag.equals("-true")) {f.write(headerText + " " + contents.get(i) + "\n");}
			else {f.write(headerText + contents.get(i) + "\n");}
		}
		System.out.println("All lines have the prefix applied. You can safely open the file.");
		System.out.println("========================================\n");
		f.close();
		
	}

}
