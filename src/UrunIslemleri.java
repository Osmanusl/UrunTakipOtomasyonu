
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class UrunIslemleri {
    private Connection con = null;
    
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    
    public ArrayList<Urun> urunleriGetir() {
        
        ArrayList<Urun> cikti = new ArrayList<Urun>();
        
        try {
            statement =  con.createStatement();
            String sorgu =  "Select * From urunler";
            
            ResultSet rs =  statement.executeQuery(sorgu);
            
            while(rs.next()) {
                int id = rs.getInt("id");
                String ad = rs.getString("urunAdi");
                String sayi = rs.getString("urunSayisi");
                
                cikti.add(new Urun(id, ad, sayi));
                
                
            }
            return cikti;
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(UrunIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
            
        }
        
        
        
        
    }
    public void urunGuncelle(int id,String yeni_ad,String yeni_sayi) {
        String sorgu =  "Update urunler set urunAdi = ? , urunSayisi = ? where id = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            
            preparedStatement.setString(1,yeni_ad);
            preparedStatement.setString(2,yeni_sayi);
            
            preparedStatement.setInt(3, id);
            
            preparedStatement.executeUpdate();
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(UrunIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
    }
    public void urunSil(int id) {
        
        String sorgu = "Delete from urunler where id = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1, id);
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(UrunIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
    }
    public void urunEkle(String ad,String sayi) {
        
        String sorgu = "Insert Into urunler (urunAdi,urunSayisi) VALUES(?,?)";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            
            preparedStatement.setString(1, ad);
            preparedStatement.setString(2, sayi);
            
            preparedStatement.executeUpdate();
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(UrunIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
        
    }
    public boolean girisYap(String kullanici_adi,String parola) {
        
        String sorgu =  "Select * From admin where username = ? and password = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            preparedStatement.setString(1,kullanici_adi);
            preparedStatement.setString(2,parola);
            
            ResultSet rs =  preparedStatement.executeQuery();
            
            return rs.next();
            
        } catch (SQLException ex) {
            Logger.getLogger(UrunIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
        
        
        
        
        
        
    }
    public UrunIslemleri() {
        
        String url = "jdbc:mysql://" + Database.host + ":" + Database.port + "/" + Database.db_ismi+ "?useUnicode=true&characterEncoding=utf8";
        
        
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver Bulunamadı....");
        }
        
        
        try {
            con = DriverManager.getConnection(url, Database.kullanici_adi, Database.parola);
            System.out.println("Bağlantı Başarılı...");
            
            
        } catch (SQLException ex) {
            System.out.println("Bağlantı Başarısız...");
            //ex.printStackTrace();
        }
        
        
    }
    
}
