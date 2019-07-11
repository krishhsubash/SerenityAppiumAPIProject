package serenity.utils;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelUtils {
    String fileName = "Locators.xlsx";
    File file = new File(System.getProperty("user.dir")+"//src//test/resources//"+fileName);
    FileInputStream fis;

    {
        try {
            fis = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    Workbook wb = null;
    String fileExtensionName = null;



    public Workbook getWorkbook() throws IOException {
        fileExtensionName = fileName.substring(fileName.indexOf("."));
        if(fileExtensionName.equals(".xlsx")) {
            wb = new XSSFWorkbook(fis);
        }
        else if(fileExtensionName.equals(".xls")) {
            wb = new HSSFWorkbook(fis);
        }
        return wb;
    }


    public String elementByXpath(String sheetName, String pageName,String elementName) {
        String xpath=null;
        int xpathHeader = 0;
        Sheet excelSheet = wb.getSheet(sheetName);
        int rowCount = excelSheet.getLastRowNum()-excelSheet.getFirstRowNum();
        for(int i =1;i<rowCount+1;i++) {
            Row row = excelSheet.getRow(i);
            if(row.getCell(0).getStringCellValue().equals(pageName)) {
                for(int j=i;j<rowCount;j++) {
                    if(row.getCell(j).getStringCellValue().equals(pageName) || row.getCell(j).getStringCellValue().isEmpty()) {
                        for(int k=0;k<row.getLastCellNum();k++) {
                           if(excelSheet.getRow(0).getCell(k).getStringCellValue().equals("XPATH")) {
                               xpathHeader = k;
                           }
                            xpath = row.getCell(xpathHeader).getStringCellValue();
                        }
                    }
                    else {
                        break;
                    }

                }
            }
        }
        return xpath;
    }

    public void elementByXpath(String sheetName, WebElement xpath) {


    }

    public void elementByCssSelector() {

    }

    public void readExcel() {

    }

    public void elementByID() {

    }

    public void elementByName() {

    }

    public void elementByVisibleText() {

    }

}
