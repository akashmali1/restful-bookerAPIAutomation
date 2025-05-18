package com.restfulbooker.utils;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;

public class ReadTestData {

    // Apache POI, reads test data

    public static Object[][] readTestDataFromExcel(String filepath, String sheetName) throws Exception {
        Object[][] testData = null;

        FileInputStream fis = new FileInputStream(filepath);
        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheet(sheetName);
        int rowCount = sheet.getPhysicalNumberOfRows();
        int columCount = sheet.getRow(0).getLastCellNum();

        testData = new Object[rowCount - 1][columCount];
        for (int i = 1; i < rowCount; i++) {
            for (int j = 0; j < columCount; j++) {
                testData[i - 1][j] = sheet.getRow(i).getCell(j).getStringCellValue();
            }
        }
        return testData;
    }
}