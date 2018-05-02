package com.test.poi;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author Black
 * @time 2018/5/2.
 */
public class reportPoi {
    @SuppressWarnings("deprecation")
    public static void Report(List<Shelves> ShelvesList, OutputStream os) throws Exception{

        Workbook wb = new XSSFWorkbook();
        CreationHelper createHelper = wb.getCreationHelper();
        Sheet sheet = wb.createSheet("shelves");

        String[] titleArray = new String[]{"货架编号","货架名称","货架地址","商品名称","数量"};

        Row row = sheet.createRow((short)0);

        Font font = wb.createFont();
        //字体高度
        font.setFontHeightInPoints((short) 10);
        //字体
        font.setFontName("黑体");
        font.setBold(true);

        CellStyle cellStyle = wb.createCellStyle();
        //下边框
        cellStyle.setBorderBottom(BorderStyle.THICK);
        //左边框
        cellStyle.setBorderLeft(BorderStyle.THICK);
        //上边框
        cellStyle.setBorderTop(BorderStyle.THICK);
        //右边框
        cellStyle.setBorderRight(BorderStyle.THICK);
        cellStyle.setFont(font);
        //水平布局：居中
        cellStyle.setAlignment(HorizontalAlignment.CENTER);
        //水平布局：居中
        cellStyle.setVerticalAlignment(VerticalAlignment.CENTER);
        cellStyle.setWrapText(true);

        for (int i = 0; i < titleArray.length; i++) {
            Cell rr = row.createCell(i);
            rr.setCellValue(createHelper.createRichTextString(titleArray[i]));
            rr.setCellStyle(cellStyle);
        }

        Map<String,String> map = new HashMap<String,String>();

        Set<String> idSet = map.keySet();
        int startRownum = 1;
        int currentRownum = 1;

        font = wb.createFont();
        //字体高度
        font.setFontHeightInPoints((short) 10);
        //字体
        font.setFontName("黑体");
        font.setBold(false);

        cellStyle = wb.createCellStyle();
        //下边框
        cellStyle.setBorderBottom(BorderStyle.THIN);
        //左边框
        cellStyle.setBorderLeft(BorderStyle.THIN);
        //上边框
        cellStyle.setBorderTop(BorderStyle.THIN);
        //右边框
        cellStyle.setBorderRight(BorderStyle.THIN);
        cellStyle.setFont(font);
        //水平布局：居中
        cellStyle.setAlignment(HorizontalAlignment.CENTER);
        //水平布局：居中
        cellStyle.setVerticalAlignment(VerticalAlignment.CENTER);
        cellStyle.setWrapText(true);

        for (String id : idSet) {
            String  shelves_no = "";
            String  shelvesName = "";
            String  shelvesAddress = "";
            String  goodsName = "";
            Integer goodsNumber =0;
            Row mergeRow = null;

            Cell cc=null;
            cc=mergeRow.createCell(1);
            cc.setCellValue(shelves_no);
            cc.setCellStyle(cellStyle);

            cc=mergeRow.createCell(2);
            cc.setCellValue(shelvesName);
            cc.setCellStyle(cellStyle);

            cc=mergeRow.createCell(3);
            cc.setCellValue(shelvesAddress);
            cc.setCellStyle(cellStyle);

            cc=mergeRow.createCell(4);
            cc.setCellValue(goodsName);
            cc.setCellStyle(cellStyle);

            cc=mergeRow.createCell(5);
            cc.setCellValue(goodsNumber);
            cc.setCellStyle(cellStyle);
        }

        sheet.setColumnWidth(1,13*256);
        sheet.setColumnWidth(2,13*256);
        sheet.setColumnWidth(3,13*256);
        sheet.setColumnWidth(4,13*256);
        sheet.setColumnWidth(5,13*256);

        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:/Shelves.xlsx"));
        wb.write(os);
        wb.write(bos);
        bos.close();
    }
}
