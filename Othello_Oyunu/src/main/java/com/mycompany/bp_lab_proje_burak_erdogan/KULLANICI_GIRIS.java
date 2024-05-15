package com.mycompany.bp_lab_proje_burak_erdogan;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author thebu
 */
public class KULLANICI_GIRIS extends javax.swing.JFrame {

    public KULLANICI_GIRIS() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_GirisEkrani_KullaniciAD1 = new javax.swing.JLabel();
        pnl_1 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lbl_GirisEkrani_KullaniciAD = new javax.swing.JLabel();
        txt_kullaniciMAIL_2 = new javax.swing.JTextField();
        lbl_GirisEkrani_Sifre = new javax.swing.JLabel();
        psw_kullaniciSifre_GirisEkran_2 = new javax.swing.JPasswordField();
        btn_Giris = new javax.swing.JButton();
        lbl_oyuncu2 = new javax.swing.JLabel();
        btn_exit = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lbl_GirisEkrani_KullaniciAD_2 = new javax.swing.JLabel();
        lbl_GirisEkrani_Sifre_2 = new javax.swing.JLabel();
        txt_kullaniciMAIL = new javax.swing.JTextField();
        btn_KayitOl = new javax.swing.JButton();
        lbl_oyuncu1 = new javax.swing.JLabel();
        psw_kullaniciSifre_GirisEkran = new javax.swing.JPasswordField();

        lbl_GirisEkrani_KullaniciAD1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lbl_GirisEkrani_KullaniciAD1.setText("Kullanici Mail :");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GİRİS EKRANI");
        setBounds(new java.awt.Rectangle(200, 200, 0, 0));

        pnl_1.setBackground(new java.awt.Color(153, 204, 255));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        lbl_GirisEkrani_KullaniciAD.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lbl_GirisEkrani_KullaniciAD.setText("Kullanici Mail :");

        txt_kullaniciMAIL_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_kullaniciMAIL_2ActionPerformed(evt);
            }
        });

        lbl_GirisEkrani_Sifre.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lbl_GirisEkrani_Sifre.setText("Parola : ");

        btn_Giris.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btn_Giris.setText("Giris");
        btn_Giris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GirisActionPerformed(evt);
            }
        });

        lbl_oyuncu2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lbl_oyuncu2.setText("OYUNCU 2");

        btn_exit.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btn_exit.setText("Exit");
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_oyuncu2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl_GirisEkrani_KullaniciAD, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                                .addGap(36, 36, 36)
                                .addComponent(txt_kullaniciMAIL_2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl_GirisEkrani_Sifre, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(psw_kullaniciSifre_GirisEkran_2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btn_exit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                                        .addComponent(btn_Giris, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGap(70, 70, 70))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lbl_oyuncu2)
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_kullaniciMAIL_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_GirisEkrani_KullaniciAD, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_GirisEkrani_Sifre, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(psw_kullaniciSifre_GirisEkran_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addComponent(btn_Giris)
                .addGap(31, 31, 31)
                .addComponent(btn_exit)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));

        lbl_GirisEkrani_KullaniciAD_2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lbl_GirisEkrani_KullaniciAD_2.setText("Kullanici Mail : ");

        lbl_GirisEkrani_Sifre_2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lbl_GirisEkrani_Sifre_2.setText("Parola : ");

        btn_KayitOl.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btn_KayitOl.setText("Kayit Ol");
        btn_KayitOl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_KayitOlActionPerformed(evt);
            }
        });

        lbl_oyuncu1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lbl_oyuncu1.setText("OYUNCU 1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_oyuncu1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_GirisEkrani_KullaniciAD_2, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                            .addComponent(lbl_GirisEkrani_Sifre_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_KayitOl, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_kullaniciMAIL)
                            .addComponent(psw_kullaniciSifre_GirisEkran, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lbl_oyuncu1)
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_GirisEkrani_KullaniciAD_2)
                    .addComponent(txt_kullaniciMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_GirisEkrani_Sifre_2)
                    .addComponent(psw_kullaniciSifre_GirisEkran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addComponent(btn_KayitOl)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnl_1Layout = new javax.swing.GroupLayout(pnl_1);
        pnl_1.setLayout(pnl_1Layout);
        pnl_1Layout.setHorizontalGroup(
            pnl_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnl_1Layout.setVerticalGroup(
            pnl_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_KayitOlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_KayitOlActionPerformed

        KULLANICI_KAYIT kayit = new KULLANICI_KAYIT();

        kayit.setVisible(true);  //kayit frame i ekrana getirir
        this.dispose();

    }//GEN-LAST:event_btn_KayitOlActionPerformed

    private void btn_GirisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GirisActionPerformed


        try {
            Veriler.DosyayıOku(); // bu kisimda verileri dosyadan okur
        } catch (IOException ex) {
            Logger.getLogger(KULLANICI_GIRIS.class.getName()).log(Level.SEVERE, null, ex);
        }

        String kullaniciMail_2 = this.txt_kullaniciMAIL_2.getText(); //buralarda tek tek kullanicilarin mailini ve şifresini alıyorum
        String kullaniciParola2 = this.psw_kullaniciSifre_GirisEkran_2.getText();
        String kullaniciMail = this.txt_kullaniciMAIL.getText();
        String kullaniciParola = this.psw_kullaniciSifre_GirisEkran.getText();

        if (this.txt_kullaniciMAIL_2.getText().isEmpty() || this.psw_kullaniciSifre_GirisEkran_2.getText().isEmpty() || this.txt_kullaniciMAIL.getText().isEmpty() || this.psw_kullaniciSifre_GirisEkran.getText().isEmpty()) {
            // ilk durumda hicbir alanin bos olup olmadigi kontrolü
            JOptionPane.showMessageDialog(rootPane, " Lutfen Tum Bosluklari Doldurunuz ", "Dikkat!!", JOptionPane.INFORMATION_MESSAGE);

        } else {

            if (this.txt_kullaniciMAIL.getText().equals(this.txt_kullaniciMAIL_2.getText())) {
                JOptionPane.showMessageDialog(rootPane, "Ayni Kullanici 2 Defa Giris Yapamaz!!", "Dikkat!!!", JOptionPane.ERROR_MESSAGE);
            } else {

                // burada ise kullanicilari listeye gönderip kontrol ettiriyorum
                boolean GirisYapildiMi1 = Veriler.Giris(kullaniciMail, kullaniciParola);
                boolean GirisYapildiMi2 = Veriler.Giris(kullaniciMail_2, kullaniciParola2);
                if (GirisYapildiMi1 && GirisYapildiMi2) {

                    KULLANICI_KAYIT k = new KULLANICI_KAYIT();

                    String oyuncu1_kullaniciAdi = k.getLbl_kullaniciadi_1();
                    String oyuncu2_kullaniciAdi = k.getLbl_kullaniciadi_2();

                    OyunEkrani o_ekran = new OyunEkrani();
                    o_ekran.setlbl_oyuncu_1(kullaniciMail); // baska frame deki labeli değistirdim
                    o_ekran.setlbl_oyuncu_2(kullaniciMail_2);

                    o_ekran.setVisible(true);

                    this.dispose();

                } else {
                    if (GirisYapildiMi1 == false) { //oyuncular kayit olmamisa kayit olmasii gerekir
                        JOptionPane.showMessageDialog(rootPane, "Oyuncu 1 Icin Veri Tabaninda Böyle Bir Kullanici Bulunamadi! Lütfen Tekrar Deneyin ", "Dikkat!!", JOptionPane.INFORMATION_MESSAGE);
                        this.txt_kullaniciMAIL.setText("");
                        this.psw_kullaniciSifre_GirisEkran.setText("");
                    } else if (GirisYapildiMi2 == false) {
                        JOptionPane.showMessageDialog(rootPane, "Oyuncu 2 Icin Veri Tabaninda Böyle Bir Kullanici Bulunamadi! Lütfen Tekrar Deneyin ", "Dikkat!!", JOptionPane.INFORMATION_MESSAGE);
                        this.txt_kullaniciMAIL_2.setText("");
                        this.psw_kullaniciSifre_GirisEkran_2.setText("");
                    }
                }

            }

        }
    }//GEN-LAST:event_btn_GirisActionPerformed

    private void txt_kullaniciMAIL_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_kullaniciMAIL_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_kullaniciMAIL_2ActionPerformed

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed

        int soru = JOptionPane.showConfirmDialog(rootPane, "Cikis Yapmak Istediginize Emin Misiniz ? ", "Dikkat", JOptionPane.YES_NO_CANCEL_OPTION);
        // cikis yapma sorusu
        if (soru == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else if (soru == JOptionPane.NO_OPTION) {

        } else {

        }

    }//GEN-LAST:event_btn_exitActionPerformed

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
            java.util.logging.Logger.getLogger(KULLANICI_GIRIS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KULLANICI_GIRIS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KULLANICI_GIRIS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KULLANICI_GIRIS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new KULLANICI_GIRIS().setVisible(true);

            }

        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Giris;
    private javax.swing.JButton btn_KayitOl;
    private javax.swing.JButton btn_exit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_GirisEkrani_KullaniciAD;
    private javax.swing.JLabel lbl_GirisEkrani_KullaniciAD1;
    private javax.swing.JLabel lbl_GirisEkrani_KullaniciAD_2;
    private javax.swing.JLabel lbl_GirisEkrani_Sifre;
    private javax.swing.JLabel lbl_GirisEkrani_Sifre_2;
    private javax.swing.JLabel lbl_oyuncu1;
    private javax.swing.JLabel lbl_oyuncu2;
    private javax.swing.JPanel pnl_1;
    private javax.swing.JPasswordField psw_kullaniciSifre_GirisEkran;
    private javax.swing.JPasswordField psw_kullaniciSifre_GirisEkran_2;
    private javax.swing.JTextField txt_kullaniciMAIL;
    private javax.swing.JTextField txt_kullaniciMAIL_2;
    // End of variables declaration//GEN-END:variables
}
