    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package form;

import form.formDangNhap;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author tth
 */
public class formDangKy extends javax.swing.JFrame {

    /**
     * Creates new form formDangKy
     */
    public formDangKy() {        
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        canceltButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        maNVTextField = new javax.swing.JTextField();
        newUserNameTextField = new javax.swing.JTextField();
        newUserPasswordField1 = new javax.swing.JPasswordField();
        newUserPasswordField2 = new javax.swing.JPasswordField();
        signUpButton = new javax.swing.JButton();
        SignInButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Đăng ký");
        setBounds(new java.awt.Rectangle(0, 0, 2, 2));

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Đăng ký tài khoản nhân viên ");

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel2.setText("Mã nhân viên:");

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel3.setText("Tên đăng nhập:");

        jLabel4.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel4.setText("Mật khẩu:");

        canceltButton.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        canceltButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cancel .png"))); // NOI18N
        canceltButton.setText("Hủy");
        canceltButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                canceltButtonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel5.setText("Nhập lại mật khẩu:");

        maNVTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maNVTextFieldActionPerformed(evt);
            }
        });

        signUpButton.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        signUpButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/SignUp.png"))); // NOI18N
        signUpButton.setText("Đăng ký");
        signUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpButtonActionPerformed(evt);
            }
        });

        SignInButton.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        SignInButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/done.png"))); // NOI18N
        SignInButton.setText("Quay lại đăng nhập");
        SignInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignInButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(canceltButton)
                        .addGap(37, 37, 37)
                        .addComponent(signUpButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(SignInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(newUserPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(newUserPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 56, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel3))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(maNVTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(newUserNameTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maNVTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(newUserNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(newUserPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newUserPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(canceltButton)
                    .addComponent(signUpButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SignInButton)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void canceltButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_canceltButtonActionPerformed
        maNVTextField.setText("");
        newUserNameTextField.setText("");
        newUserPasswordField1.setText("");
        newUserPasswordField2.setText("");

    }//GEN-LAST:event_canceltButtonActionPerformed

    private void signUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpButtonActionPerformed
        String IDUser,MaNhanVien, TenDangNhap, Password, NhapLai;

        MaNhanVien = maNVTextField.getText().trim();
        TenDangNhap = newUserNameTextField.getText();
        Password = String.valueOf(newUserPasswordField1.getPassword()).trim();
        NhapLai = String.valueOf(newUserPasswordField2.getPassword()).trim();
        boolean kt = true;
        
        if (MaNhanVien.equals("")) {
            ThongBao("Mã nhân viên không được để trống", "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
        } else {
            if (TenDangNhap.length() < 6 || TenDangNhap.length() > 10) {
                ThongBao("Tên đăng nhập phải từ 6-10 ký tự", "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
            } else if (Password.length() < 6 || Password.length() > 20) {
                ThongBao("Mật khẩu phải nhập nhiều hơn 6 ký tự và ít hơn 20 ký tự", "Lỗi đăng ký", 2);
            } else if (!KiemTraChuaChuVaSo(Password)) {
                ThongBao("Mật khẩu phải bao gồm chữ IN HOA, chữ thường và số", "Thông báo", 2);
            } else if (!Password.equals(NhapLai)) {
                ThongBao("nhập lại mật khẩu không khớp", "Thông báo", 2);
            } else {

                String cautruyvan = "select * from TaiKhoan where MaNhanVien= '" + MaNhanVien + "'";
                ResultSet rs = Link.LINK.connection.ExcuteQueryGetTable(cautruyvan);
                try {
                    rs.next();
                    if (rs.getString("MaNhanVien").equals(MaNhanVien)) {
                        kt = false;
                        ThongBao("tài khoản  của nhân viên có mã: " + MaNhanVien + " đã  có trong sql yêu cầu tạo tk với tên đăng nhập khác!", "Thông báo", 2);
                    }

                } catch (SQLException ex) {
                    System.out.println("không có trong sql !có thể tạo thêm");
                    kt = true;
                }
                if (kt == true) {
                    String ctv = "insert into Taikhoan(MaNhanVien,TenDangNhap,MatKhau) values(N'" + MaNhanVien
                            + "' ,N'" + TenDangNhap + "' , N'" + Password + "' )";
                    System.out.println(cautruyvan);
                    System.out.println(ctv);
                    Link.LINK.connection.ExcuteQueryUpdateDB(ctv);
                    System.out.println("Đã Thêm Thành Công");
                    ThongBao("Đăng ký thành công", "Xác nhận", 1);
                } else {
                    ThongBao("Không thể Thêm tài Khoản", "lỗi", 2);
                }
            }
        }

    }//GEN-LAST:event_signUpButtonActionPerformed

    private void maNVTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maNVTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maNVTextFieldActionPerformed

    private void SignInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignInButtonActionPerformed
        formDangNhap fDN = new formDangNhap();
        fDN.show();
        this.dispose();
    }//GEN-LAST:event_SignInButtonActionPerformed
    private void ThongBao(String noiDungThongBao, String tieuDeThongBao, int icon) {
        JOptionPane.showMessageDialog(new JFrame(), noiDungThongBao,
                tieuDeThongBao, icon);
    }
//    private boolean KiemTra(String tdn, String mk) {
//        boolean kq = false;
//
//        String cautruyvan = "select * from TaiKhoan where TenDangNhap= '" + tdn + "' and MatKhau= '" + mk + "'";
//        System.out.println(cautruyvan);
//        ResultSet rs = Link.LINK.connection.ExcuteQueryGetTable(cautruyvan);
//
//        try {
//            if (rs.next()) {
//                kq = true;
//                String ten = rs.getString("TenDangNhap");
//            }
//        } catch (SQLException ex) {
//            System.out.println("lỗi đăng nhập");
//        }    
//        return kq;
//    }

    private boolean KiemTraChuaChuVaSo(String chuoi) {
        boolean ketqua = false;
        Pattern p = Pattern.compile("[a-zA-Z][0-9]");
        Matcher m = p.matcher(chuoi);
        if (!(chuoi == chuoi.toLowerCase())) {
            ketqua = m.find();
        }
        return ketqua;
    }

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
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            // If Nimbus is not available, you can set the GUI to another look and feel.
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formDangKy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SignInButton;
    private javax.swing.JButton canceltButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JTextField maNVTextField;
    private javax.swing.JTextField newUserNameTextField;
    private javax.swing.JPasswordField newUserPasswordField1;
    private javax.swing.JPasswordField newUserPasswordField2;
    private javax.swing.JButton signUpButton;
    // End of variables declaration//GEN-END:variables
}