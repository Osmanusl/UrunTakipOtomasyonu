
import java.util.ArrayList;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class UrunEkrani extends javax.swing.JDialog {
    DefaultTableModel model;
    UrunIslemleri islemler =  new UrunIslemleri();
    

    public UrunEkrani(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        model = (DefaultTableModel) urun_tablosu.getModel();
        urunGoruntule();
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ad_alani = new javax.swing.JTextField();
        sayi_alani = new javax.swing.JTextField();
        mesaj_yazisi = new javax.swing.JLabel();
        urunEkle = new javax.swing.JButton();
        guncelle = new javax.swing.JButton();
        sil = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        urun_tablosu = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        arama_cubugu = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(550, 550));
        getContentPane().setLayout(null);
        getContentPane().add(ad_alani);
        ad_alani.setBounds(94, 17, 213, 30);
        getContentPane().add(sayi_alani);
        sayi_alani.setBounds(92, 54, 215, 30);

        mesaj_yazisi.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(mesaj_yazisi);
        mesaj_yazisi.setBounds(553, 296, 385, 0);

        urunEkle.setText("Yeni Ürün Ekle");
        urunEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                urunEkleActionPerformed(evt);
            }
        });
        getContentPane().add(urunEkle);
        urunEkle.setBounds(346, 18, 177, 23);

        guncelle.setText("Ürün Güncelle");
        guncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guncelleActionPerformed(evt);
            }
        });
        getContentPane().add(guncelle);
        guncelle.setBounds(346, 57, 177, 23);

        sil.setText("Ürün Sil");
        sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                silActionPerformed(evt);
            }
        });
        getContentPane().add(sil);
        sil.setBounds(346, 88, 177, 23);

        urun_tablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Ürün Adı", "Ürün Sayısı"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        urun_tablosu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                urun_tablosuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(urun_tablosu);
        if (urun_tablosu.getColumnModel().getColumnCount() > 0) {
            urun_tablosu.getColumnModel().getColumn(0).setResizable(false);
            urun_tablosu.getColumnModel().getColumn(1).setResizable(false);
            urun_tablosu.getColumnModel().getColumn(2).setResizable(false);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(19, 136, 504, 219);

        jPanel1.setBackground(new java.awt.Color(255, 204, 0));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ss.png"))); // NOI18N

        arama_cubugu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                arama_cubuguKeyReleased(evt);
            }
        });

        jLabel3.setText("Ürün Ara :");

        jLabel2.setText("Ürün Sayısı :");

        jLabel1.setText("Ürün Adı :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(arama_cubugu, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel1)))
                .addContainerGap(773, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(arama_cubugu, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(237, 237, 237)
                .addComponent(jLabel4)
                .addContainerGap(367, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1080, 860);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void dinamikAra(String ara){
        
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        
        
        urun_tablosu.setRowSorter(tr);
        
        
        tr.setRowFilter(RowFilter.regexFilter(ara));
        
        
    }
    private void arama_cubuguKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_arama_cubuguKeyReleased
        String ara = arama_cubugu.getText();
        
        dinamikAra(ara);
        
        
        
    }//GEN-LAST:event_arama_cubuguKeyReleased

    private void urunEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_urunEkleActionPerformed
        mesaj_yazisi.setText("");
        
        String ad  =  ad_alani.getText();
        String sayi = sayi_alani.getText();
        
        islemler.urunEkle(ad,sayi);
        
        urunGoruntule();
        
        mesaj_yazisi.setText("Yeni Ürün Başarıyla Eklendi...");
        
        
        
        
    }//GEN-LAST:event_urunEkleActionPerformed

    private void urun_tablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_urun_tablosuMouseClicked
      
        int selectedrow = urun_tablosu.getSelectedRow();
        
        ad_alani.setText(model.getValueAt(selectedrow,1).toString());
        sayi_alani.setText(model.getValueAt(selectedrow,2).toString());
        
        
        
    }//GEN-LAST:event_urun_tablosuMouseClicked

    private void guncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guncelleActionPerformed
        
        
        String ad = ad_alani.getText();
        String sayi = sayi_alani.getText();
        
        int selectedrow = urun_tablosu.getSelectedRow();
        
        if (selectedrow == -1) {
            
            if (model.getRowCount() == 0) {
                mesaj_yazisi.setText("Ürün Tablosu şu anda boş. ");
            }
            else {
                mesaj_yazisi.setText("Lütfen güncellenecek bir ürün seçin.");
            }
        }
        else {
            
            
            
            
            int id = (int)model.getValueAt(selectedrow,0);
            
            
            
            islemler.urunGuncelle(id,ad,sayi);
            
            urunGoruntule();
            
            mesaj_yazisi.setText("Ürün başarıyla güncellendi...");
        }
        
        
        
    }//GEN-LAST:event_guncelleActionPerformed

    private void silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_silActionPerformed
       mesaj_yazisi.setText("");
       
       
       int selectedrow = urun_tablosu.getSelectedRow();
       
       if (selectedrow == -1) {
           if (model.getRowCount() == 0 ) {
               mesaj_yazisi.setText("Ürün tablosu şu anda boş...");
           }
           else {
               mesaj_yazisi.setText("Lütfen silinecek bir ürün seçin...");
           }
      
       }
       else {
           int id = (int)model.getValueAt(selectedrow,0);
           
           islemler.urunSil(id);
           
           urunGoruntule();
           
           mesaj_yazisi.setText("Ürün başarıyla silindi...");
           
           
           
           
       }
        
        
    }//GEN-LAST:event_silActionPerformed

   
    
    public void urunGoruntule() {
        
        model.setRowCount(0);
        
        ArrayList<Urun> calisanlar = new ArrayList<Urun>();
        
        
        calisanlar = islemler.urunleriGetir();
        
        if (calisanlar != null ) {
            
            for (Urun calisan : calisanlar) {
                Object[] eklenecek = {calisan.getId(),calisan.getAd(),calisan.getSayi()};
                
                model.addRow(eklenecek);
                
                
                
            }
            
        }
        
        
    }
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
            java.util.logging.Logger.getLogger(UrunEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UrunEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UrunEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UrunEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                UrunEkrani dialog = new UrunEkrani(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ad_alani;
    private javax.swing.JTextField arama_cubugu;
    private javax.swing.JButton guncelle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mesaj_yazisi;
    private javax.swing.JTextField sayi_alani;
    private javax.swing.JButton sil;
    private javax.swing.JButton urunEkle;
    private javax.swing.JTable urun_tablosu;
    // End of variables declaration//GEN-END:variables
}
