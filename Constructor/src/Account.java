/*
Constructors with basic banking system project
*/
public class Account {
    //property area
    
    private String hesapNo;
    private double bakiye;
    private String isim;
    private String email;
    private String telofonNo;
    //constructor yazımı 
    public Account(){
        System.out.println("Kendi Yazdığımız Constructor...");
        
        /*
        classın ismi ile aynı belirlememiz çok kritik bir öneme sahip 
        aynı isimde değilse bu bir costructor olmayacak 
        Constructor biz bir obje oluşturduğumuzda ilk çağrılan foksiyonumuz 
        Python'da bu def init,C,C++'TA ise Pointer ....
        buraya deger vererek obje oluşturabilir miyiz? 
        evet oluşturabiliriz.
        burada birden fazla constructor yazabiliriz bu metodoverloading olur.
        
        */
    }
    public Account(String hesapNo,double bakiye,String isim,String email,String telefonNo){
        this.hesapNo = hesapNo;
        this.bakiye = bakiye;
        this.isim =isim;
        this.email = email;
        this.telofonNo = telefonNo;
    }
            
    public void paraYatır(double miktar){
        bakiye +=miktar;
        System.out.println("Yeni bakiye = "+bakiye);//this kullanabiliriz ama gerek yok başka herhangi bir bakiye ile karışmadığı için ihtiyaç duymadık...
        
        
    }
    public void paraCekme(double miktar){
        if(miktar>1500){
            System.out.println("Günlük olarak 1500 Türk Lirasından fazla çekmeniz mümkün değildir. ");
        }
        if((bakiye-miktar)<0){
            System.out.println("Yterli bakiye yok...");
            System.out.println("Bakiyeniz : " +bakiye);
        }else{
            bakiye-=miktar;
            System.out.println("Yeni bakiye : " +bakiye);
        }
    }

    /**
     * @return the hesapNo
     */
    public String getHesapNo() {
        return hesapNo;
    }

    /**
     * @param hesapNo the hesapNo to set
     */
    public void setHesapNo(String hesapNo) {
        this.hesapNo = hesapNo;
    }

    /**
     * @return the bakiye
     */
    public double getBakiye() {
        return bakiye;
    }

    /**
     * @param bakiye the bakiye to set
     */
    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    /**
     * @return the isim
     */
    public String getIsim() {
        return isim;
    }

    /**
     * @param isim the isim to set
     */
    public void setIsim(String isim) {
        this.isim = isim;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the telofonNo
     */
    public String getTelofonNo() {
        return telofonNo;
    }

    /**
     * @param telofonNo the telofonNo to set
     */
    public void setTelofonNo(String telofonNo) {
        this.telofonNo = telofonNo;
    }
    
}
