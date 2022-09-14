package tests;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchDataFromExelSheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
		String path="C:\\Users\\Nitinsing Tomar\\Desktop\\Testing.xlsx";
		
		FileInputStream file=new FileInputStream(path);
		
		RichTextString value=WorkbookFactory.create(file).getSheet("Lucky").getRow(3).getCell(0).getRichStringCellValue();
           
		
		System.out.println(value);
	}

}
