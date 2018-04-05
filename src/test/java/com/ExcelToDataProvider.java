package com;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelToDataProvider {

	String excelPath="";
	String sheetName;
	FileInputStream FIS = null;
	public Workbook wb;
	public Sheet sheet;
	public Row row;
	
	@Test(dataProvider="userData")
	public void getData(String uName, String pwd, String dateCreated, String result) {
		System.out.println("UserName: "+uName);
		System.out.println("Password: "+pwd);
		System.out.println("Date created :"+dateCreated );
		System.out.println("Result is :"+result);
	}

	@DataProvider(name="getData")
	public Object[][] userformData() throws IOException {
		Object[][] data= testdata(excelPath, sheetName);
		return data;
	}

	private Object[][] testdata(String excelPath, String sheetName) throws IOException {
		Object[][] excelData=null;
		FIS = new FileInputStream(excelPath);
		wb = new XSSFWorkbook(FIS);
		sheet = wb.getSheet(sheetName);
		
		
		
		return null;
	}
	
	
}
