package qsp;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingMultipledDataWoHardCoding {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		int rowCount=wb.getSheet("InvalidLogin").getLastRowNum();
		short cellCount = wb.getSheet("InvalidLogin").getRow(0).getLastCellNum();
		System.out.println(cellCount);
//		for(int i=1;i<=rowCount;i++)
//		{
//			for(int j=0;j<=cellCount;j++)
//			{
//				String data = wb.getSheet("InalidLogin").getRow(i).getCell(j).getStringCellValue();
//				System.out.println(data);
//			}
		//}
	}

}
