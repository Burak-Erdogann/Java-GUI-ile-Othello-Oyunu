
package com.mycompany.bp_lab_proje_burak_erdogan;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author thebu
 */
public class Veriler {

    
     //kullanicilarin tutuldugu liste
     public static ArrayList<Kullanici> kullaniciListesi = new ArrayList<Kullanici>() ; 
     public static String kullaniciTxtDosya = "kullaniciListesi.txt"; // bilgisayarda tutulan liste
    
    public static boolean Giris(String kullanici_mail , String kullanici_parola){
        //bu kisimda disardan gelen mail ve psw nin uyusup uyusmadigini kontrol ediyorum
       boolean girisYapildiMi = false ; 
       
       for(Kullanici k : kullaniciListesi){
           
           if(k.kullaniciMail.compareTo(kullanici_mail) == 0 && k.parola.compareTo(kullanici_parola) == 0){
               girisYapildiMi = true ; 
               break ; 
           }
           
       }
        
        return girisYapildiMi ;
    }
    
    public static void kullaniciEkle(Kullanici kullanici) throws Exception{
    // burada ise tek tek kullanicilari listeye ekliyorum    
       boolean eklenildiMi = true ; 
       
       for(Kullanici k : kullaniciListesi){
           
           if(k.kullaniciMail.compareTo(kullanici.kullaniciMail) == 0 ){
               eklenildiMi = false ; 
               
               throw new Exception("Ayni Mail");
               
           }
           
       }
        
       kullaniciListesi.add(kullanici);
        
    }
    
    
    
    
    public static void DosyayaYazdir() throws IOException{
        
        BufferedWriter writer = new BufferedWriter(new FileWriter(kullaniciTxtDosya));
        // bu kisim dosyaya yazdirma kismi
        
        for (Kullanici kullanici : kullaniciListesi) {
            
            String bilgiler = kullanici.ToString();
            writer.append(bilgiler + "\n");
            
        }
        
        writer.close();
        
    }
    
    public static void DosyayıOku() throws IOException{
        // burasi ise dosyayi okuyarak bize geri donus sagliyor
        BufferedReader reader = new BufferedReader(new FileReader(kullaniciTxtDosya));
        String dosya = "";
        
        while((dosya = reader.readLine()) != null ){
           // System.out.println(dosya);
            String[] bilgiler = dosya.split("&");
            Kullanici kullaniciOku = new Kullanici();
            Kullanici kullaniciOku2 = new Kullanici();
            // tek tek bilgileri aliyorum
            kullaniciOku.ad_soyad = bilgiler[0];
            kullaniciOku.kullaniciMail = bilgiler[1];
            kullaniciOku.parola = bilgiler[2];
            kullaniciOku2.ad_soyad = bilgiler[0];
            kullaniciOku2.kullaniciMail = bilgiler[1];
            kullaniciOku2.parola = bilgiler[2];
            kullaniciListesi.add(kullaniciOku);
            kullaniciListesi.add(kullaniciOku2);
            
        }
        
        
        reader.close();
        
    }
    
}
