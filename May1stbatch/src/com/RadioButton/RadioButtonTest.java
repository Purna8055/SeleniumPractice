package com.RadioButton;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class RadioButtonTest extends BaseTest {
@Test
public void radioButtonTest() throws IOException
{
FileInputStream File = new FileInputStream("./src/com/TestResultFile/RadioButtonResult.xlsx");
XSSFWorkbook workbook= new XSSFWorkbook(File);
XSSFSheet sheet =workbook.getSheet("Sheet1");


WebElement RadioButtonBlock=driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
List<WebElement>Group1_RadioButtonElements=RadioButtonBlock.findElements(By.tagName("input"));
int RadioButtonCount = Group1_RadioButtonElements.size();
System.out.println(RadioButtonCount);
for(int i=0;i<RadioButtonCount;i++)
{
Group1_RadioButtonElements.get(i).click();
Row R = sheet.createRow(i);
for(int j=0; j<RadioButtonCount;j++)
{
System.out.println(Group1_RadioButtonElements.get(j).getAttribute("value")+" "+Group1_RadioButtonElements.get(j).getAttribute("checked"));
R.createCell(j).setCellValue(Group1_RadioButtonElements.get(j).getAttribute("value")+" "+Group1_RadioButtonElements.get(j).getAttribute("checked"));
FileOutputStream file1= new FileOutputStream("./src/com/TestResultFile/RadioButtonResult.xlsx");
workbook.write(file1);
}
System.out.println();
}
workbook.close();
}

}
