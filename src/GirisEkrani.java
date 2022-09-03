
public class GirisEkrani extends javax.swing.JFrame {
    UrunIslemleri islemler = new UrunIslemleri();
    

    public GirisEkrani() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kullanici_adi_alani = new javax.swing.JTextField();
        parola_alani = new javax.swing.JPasswordField();
        mesaj_yazisi = new javax.swing.JLabel();
        giris = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(400, 200, 0, 0));
        setPreferredSize(new java.awt.Dimension(400, 250));
        getContentPane().setLayout(null);
        getContentPane().add(kullanici_adi_alani);
        kullanici_adi_alani.setBounds(153, 32, 146, 30);
        getContentPane().add(parola_alani);
        parola_alani.setBounds(156, 70, 140, 30);

        mesaj_yazisi.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(mesaj_yazisi);
        mesaj_yazisi.setBounds(30, 98, 269, 24);

        giris.setText("Giriş Yap");
        giris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                girisActionPerformed(evt);
            }
        });
        getContentPane().add(giris);
        giris.setBounds(153, 151, 97, 23);

        jPanel1.setBackground(new java.awt.Color(255, 204, 0));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Kullanıcı Adı :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(24, 35, 100, 15);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/aa.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(-30, -10, 550, 310);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Parola:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 80, 62, 15);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 580, 380);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void girisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_girisActionPerformed
        mesaj_yazisi.setText("");
        
        String kullanici_adi = kullanici_adi_alani.getText();
        String parola = new String(parola_alani.getPassword());
        
        boolean girisbasarili = islemler.girisYap(kullanici_adi,parola);
        
        if (girisbasarili) {
            UrunEkrani calisanEkrani = new UrunEkrani(this,true);
            setVisible(false);
            
            calisanEkrani.setVisible(true);
            System.exit(0);
            
            
        }
        else {
            mesaj_yazisi.setText("Giriş Başarısız...Lütfen tekrar deneyin.");
            
        }
    }//GEN-LAST:event_girisActionPerformed

 
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
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GirisEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton giris;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField kullanici_adi_alani;
    private javax.swing.JLabel mesaj_yazisi;
    private javax.swing.JPasswordField parola_alani;
    // End of variables declaration//GEN-END:variables
}
