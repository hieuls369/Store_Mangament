/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Report;

import Main_Store.Main_Screen;
import Product_Management.Product_entity;
import dal.DBcontext;
import java.sql.Date;
import java.util.ArrayList;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author admin
 */
public class Report_Main extends javax.swing.JFrame {

    DefaultTableModel model = new DefaultTableModel();
    Report_entity re = new Report_entity();
    DBcontext db = new DBcontext();
//    ChoosePro n = new ChoosePro();
//    Thread chonsp;
//    boolean visibale = true;
//    Product_entity sp = new Product_entity();

    /**
     * Creates new form Report_Main
     */
    public Report_Main() {
        initComponents();

        loadReport();
//        if (visibale == false) {
//            System.out.println(n.getTen());
//        } 
//        

    }

    private void loadReport() {
        DBcontext db = new DBcontext();
        ArrayList<Report_entity> reports = db.getReports();
        Object[] columnNames = {"Tên sản phẩm", "Số lượng", "Bảo hành", "Giá", "Địa chỉ", "Giao Hàng", "Tổng", "Phương thức"};
        Object[][] data = new Object[reports.size()][columnNames.length];
        for (int i = 0; i < reports.size(); i++) {
            Report_entity p = reports.get(i);
            data[i][0] = p.getTen_sp();
            data[i][1] = p.getSo_luong();
            data[i][2] = p.getBao_hanh();
            data[i][3] = p.getGia_sp();
            data[i][4] = p.getDia_chi();
            data[i][5] = p.getGiao_hang();
            data[i][6] = p.getTong_tien();
            data[i][7] = p.isPhuong_thuc();

        }
        model = new DefaultTableModel(data, columnNames);
        tbThanhToan.setModel(model);
    }

//    public void choosePro(Product_entity p) {
//        sp = p;
//        System.out.println(sp.getTen_sp());
//    }
//
//    public void loadData() {
//
//    }
    private void clear() {
        txtTen.setText("");
        txtSlg.setText("");
        txtBaohanh.setText("");
        txtGia.setText("");
        txaDiaChi.setText("");
        txtThoiGian.setText("");
        txtTong.setText("");
    }

    public void Search(String s) {
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model);
        tbThanhToan.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(txtSearch.getText()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbThanhToan = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        txtSlg = new javax.swing.JTextField();
        txtBaohanh = new javax.swing.JTextField();
        txtGia = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaDiaChi = new javax.swing.JTextArea();
        txtThoiGian = new javax.swing.JTextField();
        txtTong = new javax.swing.JTextField();
        rbCard = new javax.swing.JRadioButton();
        rbSau = new javax.swing.JRadioButton();
        btnRe = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btnEdit = new javax.swing.JButton();
        btnDel = new javax.swing.JButton();
        btnInsert = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbThanhToan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbThanhToan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbThanhToanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbThanhToan);

        jLabel1.setText("Tên sản phẩm");

        jLabel2.setText("Số lượng");

        jLabel3.setText("Thời gian bảo hành");

        jLabel4.setText("Giá (1 sản phẩm)");

        jLabel5.setText("Địa chỉ giao hàng");

        jLabel6.setText("Thời gian giao hàng");

        jLabel7.setText("Thành tiền");

        jLabel8.setText("Phương thức thanh toán");

        txaDiaChi.setColumns(20);
        txaDiaChi.setRows(5);
        jScrollPane2.setViewportView(txaDiaChi);

        buttonGroup2.add(rbCard);
        rbCard.setText("Thẻ tín dụng");
        rbCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCardActionPerformed(evt);
            }
        });

        buttonGroup2.add(rbSau);
        rbSau.setText("Trả sau khi nhận hàng");
        rbSau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSauActionPerformed(evt);
            }
        });

        btnRe.setText("Làm mới");
        btnRe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReActionPerformed(evt);
            }
        });

        txtSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtSearchMouseReleased(evt);
            }
        });
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        btnBack.setText("Quay trở về trang chủ");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Tìm kiếm");

        btnEdit.setText("Sửa");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDel.setText("Xóa");
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });

        btnInsert.setText("Thêm");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel10.setText("Đơn Hàng");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 724, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnRe))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 890, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbSau)
                            .addComponent(rbCard)
                            .addComponent(jLabel8)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(53, 53, 53)
                                    .addComponent(btnDel, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel6))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtBaohanh)
                                        .addComponent(txtGia)
                                        .addComponent(jScrollPane2)
                                        .addComponent(txtThoiGian)
                                        .addComponent(txtTong)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2))
                                    .addGap(47, 47, 47)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtSlg, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                                            .addComponent(txtTen))))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnBack)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtSlg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtBaohanh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtThoiGian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtTong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(rbCard)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbSau)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRe)
                    .addComponent(btnBack)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnReActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReActionPerformed
        loadReport();
    }//GEN-LAST:event_btnReActionPerformed

    private void txtSearchMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSearchMouseReleased

    }//GEN-LAST:event_txtSearchMouseReleased

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        Search(txtSearch.getText());
    }//GEN-LAST:event_txtSearchKeyReleased

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.setVisible(false);
        Main_Store.Main_Screen m = new Main_Screen();
        m.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        re = db.getReport(txtTen.getText());
        re.setSo_luong(Integer.parseInt(txtSlg.getText()));
        re.setBao_hanh(txtBaohanh.getText());
        re.setGia_sp(txtGia.getText());
        re.setDia_chi(txaDiaChi.getText());
        re.setGiao_hang(Date.valueOf(txtThoiGian.getText()));
        re.setTong_tien(txtTong.getText());
        re.setPhuong_thuc(rbCard.isSelected());
        db.update_Re(re);
        loadReport();
        clear();
        btnDel.setEnabled(false);
        btnEdit.setEnabled(false);

    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
        re = db.getReport(txtTen.getText());
        db.delete_Re(re);
        loadReport();
        clear();
    }//GEN-LAST:event_btnDelActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        String ten = txtTen.getText();
        int soluong = Integer.parseInt(txtSlg.getText());
        String baohanh = txtBaohanh.getText();
        String gia = txtGia.getText();
        String diachi = txaDiaChi.getText();
        Date giaohang = Date.valueOf(txtThoiGian.getText());
        String tong = txtTong.getText();
        Boolean phuongthuc;
        while (true) {
            if (rbCard.isSelected()) {
                phuongthuc = false;
                break;
            }
            if (rbSau.isSelected()) {
                phuongthuc = true;
                break;
            }
        }
        Report_entity re = new Report_entity(ten, soluong, baohanh, gia, diachi, giaohang, tong, phuongthuc);
        db.insert_Re(re);
        loadReport();
        clear();
        btnDel.setEnabled(false);
        btnEdit.setEnabled(false);
    }//GEN-LAST:event_btnInsertActionPerformed

    private void rbCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbCardActionPerformed

    private void rbSauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbSauActionPerformed

    private void tbThanhToanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbThanhToanMouseClicked
        int index = tbThanhToan.getSelectedRow();
        if (index != -1) {
            txtTen.setText((String) tbThanhToan.getModel().getValueAt(index, 0));
            txtSlg.setText("" + tbThanhToan.getModel().getValueAt(index, 1));
            txtBaohanh.setText((String) tbThanhToan.getModel().getValueAt(index, 2));
            txtGia.setText((String) tbThanhToan.getModel().getValueAt(index, 3));
            txaDiaChi.setText((String) tbThanhToan.getModel().getValueAt(index, 4));
            txtThoiGian.setText((String) tbThanhToan.getModel().getValueAt(index, 5).toString());
            txtTong.setText((String) tbThanhToan.getModel().getValueAt(index, 6));
            rbCard.setSelected((Boolean) tbThanhToan.getModel().getValueAt(index, 7));
            rbSau.setSelected(!(Boolean) tbThanhToan.getModel().getValueAt(index, 7));
//            txtTen.setEnabled(false);
            btnDel.setEnabled(true);
            btnEdit.setEnabled(true);
        } else {
            clear();
            btnDel.setEnabled(false);
            btnEdit.setEnabled(false);
        }
    }//GEN-LAST:event_tbThanhToanMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Report_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Report_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Report_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Report_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Report_Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnRe;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rbCard;
    private javax.swing.JRadioButton rbSau;
    private javax.swing.JTable tbThanhToan;
    private javax.swing.JTextArea txaDiaChi;
    private javax.swing.JTextField txtBaohanh;
    private javax.swing.JTextField txtGia;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtSlg;
    private javax.swing.JTextField txtTen;
    private javax.swing.JTextField txtThoiGian;
    private javax.swing.JTextField txtTong;
    // End of variables declaration//GEN-END:variables
}