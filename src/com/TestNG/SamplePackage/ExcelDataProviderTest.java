package com.TestNG.SamplePackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProviderTest {
		
	@DataProvider(name = "sampledata")
	public Object[][] sampleData(Method m) throws IOException{
		int testIndex = 0;
//		public static void main(String[] args) throws IOException{
		File f = new File("C:\\Users\\vrt999\\Desktop\\abcd.xlsx");		
		FileInputStream fip = new FileInputStream(f);		
		XSSFWorkbook w = new XSSFWorkbook(fip);		
		XSSFSheet sh = w.getSheetAt(0);
		int rowcount = sh.getLastRowNum()+1;// it will be no of rows - 1
		int colcount = sh.getRow(1).getLastCellNum();// it will be correct count				
		List<String> headers = new ArrayList<String>();
		for(int i=0;i<=colcount-1;i++)
		headers.add(sh.getRow(0).getCell(i).getStringCellValue());
		List<List<String>> data = new ArrayList<List<String>>();
		for(int i=1;i<=rowcount-1;i++) {
			List<String> temp = new ArrayList<String>();
			for(int j=0;j<=colcount-1;j++)
				temp.add(sh.getRow(i).getCell(j).getStringCellValue());
			data.add(temp);
		}
		
		for(int a = 0;a<data.size();a++) 
			if((m.getName()).equalsIgnoreCase(data.get(a).get(0)))
				testIndex =a;	
		Map<String,String> k = new HashMap<String,String>();
			for(int j=0;j<=colcount-1;j++) 
				k.put(headers.get(j), data.get(testIndex).get(j));		
		w.close();	
		Object[][] ob = {{k}};		
		return ob;		
		
	}
	
	@Test(dataProvider = "sampledata")
	public void test1(Map<String,String> data) {
		System.out.println("The data from dataprovider: " + data);
	}
	
	@Test(dataProvider = "sampledata")
	public void test2(Map<String,String> data) {
		System.out.println("The data from dataprovider: " + data);
	}
	
	@Test(dataProvider = "sampledata",dependsOnMethods= {"test1"}, ignoreMissingDependencies= true)
	public void test3(Map<String,String> data) {
		System.out.println("The data from dataprovider: " + data);
	}
	
	

}
