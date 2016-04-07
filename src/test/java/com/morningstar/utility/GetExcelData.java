package com.morningstar.utility;

/**
 * Created by skelkar on 4/6/16.
 */

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Hashtable;
//  import org.dom4j.DocumentException;


public class GetExcelData {
    int rowIndex = 0, columnIndex = 0;
    Workbook wb;
    Sheet ws;
    Row wr;
    String fileName, sheetName;
    Hashtable<String, String>[] data = null;

    public void open() throws IOException {
        String fileName = "C:\\Workspace\\testData.xlsx";
        File file = new File(fileName);
        //FileReader fileReader = new FileReader(file);
        FileInputStream fs = new FileInputStream(file);
        wb = new XSSFWorkbook(fs);
        ws = (XSSFSheet) wb.getSheet("Loginpage");
    }


    @SuppressWarnings("unchecked")
    public Object[][] getData() throws IOException {
        data = new Hashtable[ws.getPhysicalNumberOfRows()];
        wr = ws.getRow(0);

        for (rowIndex = 1; rowIndex < ws.getPhysicalNumberOfRows(); rowIndex++) {
            data[rowIndex - 1] = new Hashtable<String, String>();

            for (columnIndex = 0; columnIndex < ws.getRow(rowIndex).getPhysicalNumberOfCells(); columnIndex++) {
                data[rowIndex - 1].put(wr.getCell(columnIndex).toString(), ws.getRow(rowIndex).getCell(columnIndex).toString());
            }
        }

        Object[][] obj = new Object[data.length - 1][1];
        for (int i = 0; i < data.length - 1; i++) {
            obj[i][0] = data[i];
        }
        return obj;
    }


    public void close() throws IOException {
        wb = null;
        ws = null;
        wr = null;
        data = null;
    }


}

