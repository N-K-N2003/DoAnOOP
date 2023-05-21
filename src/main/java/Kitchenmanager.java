/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author FM39hz
 */
public class Kitchenmanager extends JFrame {

    /**
     * Creates new form Kitchenmanager
     */
    public Kitchenmanager() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        ScrollBar = new javax.swing.JScrollBar();
        Menu = new javax.swing.JMenuBar();
        File = new javax.swing.JMenu();
        ExportCsv = new javax.swing.JMenuItem();
        ImportCsv = new javax.swing.JMenuItem();
        Help = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kitchen Manager");
        setMinimumSize(new java.awt.Dimension(1280, 720));

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
                MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING,
                                javax.swing.GroupLayout.DEFAULT_SIZE, 1001, Short.MAX_VALUE));
        MainPanelLayout.setVerticalGroup(
                MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING,
                                javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE));

        ScrollBar.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                ScrollBarMouseWheelMoved(evt);
            }
        });

        Menu.setMaximumSize(new java.awt.Dimension(70, 23));

        File.setText("File");
        File.setToolTipText("Xuất nhập dữ liệu dưới dạng file");

        ExportCsv.setText("Export Csv");
        ExportCsv.setToolTipText("Xuất file dưới dạng csv");
        ExportCsv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExportCsvActionPerformed(evt);
            }
        });
        File.add(ExportCsv);

        ImportCsv.setText("ImportCsv");
        ImportCsv.setToolTipText("Nhập file dưới dạng csv");
        ImportCsv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImportCsvActionPerformed(evt);
            }
        });
        File.add(ImportCsv);

        Menu.add(File);

        Help.setText("Help");
        Menu.add(Help);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ScrollBar, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                        .addComponent(ScrollBar, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExportCsvActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_ExportCsvActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_ExportCsvActionPerformed

    private void ImportCsvActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_ImportCsvActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_ImportCsvActionPerformed

    private void ScrollBarMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {// GEN-FIRST:event_ScrollBarMouseWheelMoved
        // TODO add your handling code here:
    }// GEN-LAST:event_ScrollBarMouseWheelMoved

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            UIManager.setLookAndFeel(new FlatMacDarkLaf());
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        // </editor-fold>

        /* Create and display the form */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kitchenmanager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ExportCsv;
    private javax.swing.JMenu File;
    private javax.swing.JMenu Help;
    private javax.swing.JMenuItem ImportCsv;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JMenuBar Menu;
    private javax.swing.JScrollBar ScrollBar;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
