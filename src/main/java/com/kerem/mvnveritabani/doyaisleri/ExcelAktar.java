/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kerem.mvnveritabani.doyaisleri;

import java.io.File;
import javax.swing.JTable;
import javax.swing.table.TableModel;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

/**
 *
 * @author MKA
 */
public class ExcelAktar {

    public void fillData(JTable table, File file) {

        try {
            WritableWorkbook calismakitabi1 = Workbook.createWorkbook(file);
            WritableSheet yaprak1 = calismakitabi1.createSheet("İlk Yaprak", 0);
            TableModel model = table.getModel();

            for (int i = 0; i < model.getColumnCount(); i++) {
                Label column = new Label(i, 0, model.getColumnName(i));
                yaprak1.addCell(column);
            }
            int j = 0;
            for (int i = 0; i < model.getRowCount(); i++) {
                for (j = 0; j < model.getColumnCount(); j++) {
                    if (model.getValueAt(i, j) != null) {
                        Label row = new Label(j, i + 1, model.getValueAt(i, j).toString());
                        yaprak1.addCell(row);
                    }
                }
            }
            calismakitabi1.write();
            calismakitabi1.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
