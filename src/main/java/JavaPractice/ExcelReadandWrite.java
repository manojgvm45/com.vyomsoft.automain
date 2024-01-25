package JavaPractice;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelReadandWrite {
	public void readExcelValue() throws IOException {

	 try {

         FileInputStream file = new FileInputStream(new File("./data/WriteExcel.xlsx"));

         XSSFWorkbook workbook = new XSSFWorkbook(file);
         XSSFSheet sheet = workbook.getSheetAt(0);
         Cell cell = null;

         //Update the value of cell
         cell = sheet.getRow(0).getCell(0);
         cell.setCellValue(cell.getStringCellValue());
         cell = sheet.getRow(0).getCell(1);
         cell.setCellValue(cell.getStringCellValue());
         Row row = sheet.getRow(0);
         row.createCell(2).setCellValue("Value 2");
         workbook.createSheet().createRow(0).createCell(0).setCellValue(cell.getStringCellValue());

         file.close();

         FileOutputStream outFile =new FileOutputStream(new File("./data/WriteExcel.xlsx"));
         workbook.write(outFile);
         outFile.close();

     } catch (FileNotFoundException e) {
         e.printStackTrace();
     } 

	}
	public static void main(String[] args) throws IOException {
		
		ExcelReadandWrite readWrite = new ExcelReadandWrite();
		readWrite.readExcelValue();
		
	

	}
}

