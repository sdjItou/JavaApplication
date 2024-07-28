import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcelExample {
    public static void main(String[] args) {
        String[] columns = {"Name", "Age", "Email"};
        String[][] data = {
            {"John Doe", "30", "john.doe@example.com"},
            {"Jane Smith", "25", "jane.smith@example.com"},
            {"Mike Brown", "35", "mike.brown@example.com"}
        };

        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Persons");

        // ヘッダー行を作成
        Row headerRow = sheet.createRow(0);
        for (int i = 0; i < columns.length; i++) {
            Cell cell = headerRow.createCell(i);
            cell.setCellValue(columns[i]);
        }

        // データ行を作成
        int rowNum = 1;
        for (String[] person : data) {
            Row row = sheet.createRow(rowNum++);
            for (int i = 0; i < person.length; i++) {
                row.createCell(i).setCellValue(person[i]);
            }
        }

        // 列幅を自動調整
        for (int i = 0; i < columns.length; i++) {
            sheet.autoSizeColumn(i);
        }

        // Excelファイルを書き込み
        try (FileOutputStream fileOut = new FileOutputStream("persons.xlsx")) {
            workbook.write(fileOut);
            System.out.println("Excel file written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // リソースを閉じる
        try {
            workbook.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
