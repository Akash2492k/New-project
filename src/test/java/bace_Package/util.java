package bace_Package;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class util {
	
	public static String getExcelData(String path,String sheet,int r,int c)
	{
		String value="";
		try
		{
			Workbook wb = WorkbookFactory.create(new FileInputStream(path));
			value=wb.getSheet(sheet).getRow(r).getCell(c).toString();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return value;
	}

}
