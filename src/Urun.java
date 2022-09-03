
public class Urun {
    
    private int id;
    private String ad;
    private String sayi;

    public Urun(int id, String ad, String sayi) {
        this.id = id;
        this.ad = ad;
        this.sayi = sayi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSayi() {
        return sayi;
    }

    public void setSayi(String sayi) {
        this.sayi = sayi;
    }
    
    
}
