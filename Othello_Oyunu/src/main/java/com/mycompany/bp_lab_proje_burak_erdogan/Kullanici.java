package com.mycompany.bp_lab_proje_burak_erdogan;

public class Kullanici {

    public String ad_soyad;
    public String kullaniciMail;
    public String parola;

    
    
    public String getAd_soyad() {
        return ad_soyad;
    }

    public void setAd_soyad(String ad_soyad) {
        this.ad_soyad = ad_soyad;
    }

    public String getKullaniciMail() {
        return kullaniciMail;
    }

    public void setKullaniciMail(String kullaniciMail) {
        this.kullaniciMail = kullaniciMail;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    
    public String ToString() {

        // buradaki bilgileri dosyaya yazdirmak icin aliyorum 
        String bilgiler = "";

        bilgiler += this.ad_soyad + "&";
        bilgiler += this.kullaniciMail + "&";
        bilgiler += this.parola + "&";

        return bilgiler;

    }

}
