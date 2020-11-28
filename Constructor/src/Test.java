
public class Test {
    public static void main(String[] args) {
        Account ac1 = new Account();
        //şuan özelliklerimiz boş 
        /*
        ac1.setHesapNo("123456");
        ac1.setBakiye(5000);
        ac1.setIsim("@prince");
        ac1.setEmail("halibrahim.kocak@gmail.com");
        ac1.setTelofonNo("555-1-444");
        System.out.println("bakiye "+ac1.getBakiye());
       **** bu işlemlerin daha kolay bir hali var bunlara yapıcı metodlar yada constructor adı veriliyor biz yazmazsak java bunu default şekilde yazıyor.
        
        */
        Account ac2 = new Account("123456789",50000,"@prince(hllbr)","halbirahim.kocak@gmail.com","5522972185");
        ac2.paraYatır(500);
        ac2.paraCekme(75000);
        System.out.println("hesapno = " +ac2.getHesapNo());
    }
    
}
