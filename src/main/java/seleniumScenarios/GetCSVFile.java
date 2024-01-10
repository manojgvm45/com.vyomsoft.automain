package seleniumScenarios;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;

public class GetCSVFile {
	
	public void getCsvValues() throws IOException {
		CSVReader readcsv = new CSVReader(new FileReader("./data/TestCSV.csv"));
		String [] nextLine;
		while ((nextLine = readcsv.readNext())!= null) {
			for (String str : nextLine) {
				  System.out.println(str);
				 
			}
		}
	}

	public static void main(String[] args) throws IOException  {
		
		GetCSVFile getCsv = new GetCSVFile();
		
		getCsv.getCsvValues();
	}

}
