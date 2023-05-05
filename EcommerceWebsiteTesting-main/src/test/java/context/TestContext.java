package context;

import java.io.IOException;

import dataProvider.ReadWriteExcel;
import extentReport.ExtentReport;
import objectManager.DriverManager;
import objectManager.PageObjectManager;
import utils.Action;



public class TestContext 
{
	private PageObjectManager pageObjectManager;
	private Action action;
	private ExtentReport extentReport;
	private ReadWriteExcel readWriteExcel;
	
	
	public TestContext() throws IOException
	{
		pageObjectManager = new PageObjectManager(DriverManager.getDriver());		
		action = new Action();
		extentReport = new ExtentReport();
		readWriteExcel = new ReadWriteExcel();		
	}
	
	//return object of pageObject manager class
	public PageObjectManager getPageObjectManager()
	{
		return pageObjectManager;
	}
	
	//return object of Action class
	public Action getActionObject()
	{
		return action;
	}
	
	//return object of extent report
	public ExtentReport getExtentReport()
	{
		return extentReport;
	}
	
	public ReadWriteExcel getExcelObject()
	{
		return readWriteExcel;
	}
}
