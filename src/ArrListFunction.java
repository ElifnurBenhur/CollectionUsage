
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ArrListFunction {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int count=0;
        int index;
        ArrayList<Interns> internsArrayList = new ArrayList<Interns>();
          //1.Fonksiyon; boolean add( element e);  verilen elementi listeye ekler.
        internsArrayList.add(new Interns("Elif", "Benhür", 16));
        internsArrayList.add(new Interns("Elif", "Hacıosmanoglu", 15));
        internsArrayList.add(new Interns("Arda", "Demir",10));
        internsArrayList.add(new Interns("Bedirhan", "Akgün", 18));
        internsArrayList.add(new Interns("Sevinç", "Çınar", 8));

        for(int i=0;i<internsArrayList.size();i++){
            //2.Fonksiyon; Element get(index i); verilen index de bulunan liste elementini döndürür.
            count++;
        System.out.println(count+".Stajerin Bilgileri:\n"+internsArrayList.get(i).getAd()+" "+internsArrayList.get(i).getSoyAd()+" adlı stajyerin "+internsArrayList.get(i).getKalanGun()+" gün stajı kalmış.");
        }

        System.out.println("Lütfen hangi sıradaki stajyeri silmek istediğinizi giriniz:");
        count=in.nextInt();
        index=count-1;
        //3.Fonksiyon; Element remove(int index); verilen indexde bulunan objeji siler.
        System.out.println(count+".sıradaki "+internsArrayList.get(index).getAd()+" "+internsArrayList.get(index).getSoyAd()+" adlı stajyerin  bilgileri silindi.");
        internsArrayList.remove(index);
        count=0;
        //4.Fonksiyon; int size(); listenin uzunluğunu verir.
        for(int i=0;i<internsArrayList.size();i++){
            count++;
            System.out.println(count+".Stajerin Bilgileri:\n"+internsArrayList.get(i).getAd()+" "+internsArrayList.get(i).getSoyAd()+" adlı stajyerin "+internsArrayList.get(i).getKalanGun()+" gün stajı kalmış.");
        }
         count=0;
        //Stream kullanımına örnek;
        // forEach; ile listedeki her bir objenin kalanGun bilgisini 15 olarak değiştirdik.
        internsArrayList.stream().forEach(i->i.setKalanGun(15));
        //filter ;Yeni bir liste yaratıp (Polymorphism) filter ile
        // eski listemizde sadece adı Elif olan stajyerleri yeni listemize aldık.
        List<Interns> intern= internsArrayList.stream().filter(i->i.getAd().equals("Elif")).collect(Collectors.toList());
        //Oluşturulan yeni listeyi yazdırır.
        for(int i=0;i<intern.size();i++){
            count++;
            System.out.println("Adı Elif olan"+count+".Stajerin Bilgileri:\n"+intern.get(i).getAd()+" "+intern.get(i).getSoyAd()+" adlı stajyerin "+intern.get(i).getKalanGun()+" gün stajı kalmış.");
        }
        // any match; yeni listede soy adı "Benhur" olan stajyer varsa true döndürür.
        if(intern.stream().anyMatch(i->i.getSoyAd().equals("Benhür"))){
            System.out.println("Soyadı Benhür olan bir stajyer var!");
        }
        //++5. Fonksiyon; void clear(); Listemizdeki tüm elementleri siler.
        System.out.println("Temizlenmeden önce liste boyutu:"+internsArrayList.size());
        internsArrayList.clear();
        System.out.println("Temizlendikten sonra liste boyutu:"+internsArrayList.size());
    }
}
