import java.util.HashSet;
import java.util.Scanner;


public class HashSetFunctions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        HashSet<String> alışverişHashList = new HashSet<String>();
        // boolean add( element e);  verilen elementi listeye ekler.
        alışverişHashList.add("Yumurta");
        alışverişHashList.add("Bal");
        alışverişHashList.add("Süt");
        alışverişHashList.add("Ekmek");
        alışverişHashList.add("Gazete");

        System.out.println("Alışveriş Listesi:"+alışverişHashList);
        //1.Fonksiyon;boolean contains(Object o); aldığı obje sette varsa true döndürür.
        if(alışverişHashList.contains("Süt")){
            System.out.println("Listede Süt var!");
        }
        else {
            System.out.println("Listede Yok var!");
        }
        //2.Fonksiyon;boolean remove(Object o); aldığı objeyi setten kaldırır.
        alışverişHashList.remove("Süt");
        System.out.println("Yeni alışveriş Listesi:"+alışverişHashList);
        //3.Fonksiyon; int size(); listenin uzunluğunu verir.
        System.out.println("Listede "+alışverişHashList.size()+" adet ürün var.");
        //4.Fonksiyon; void clear(); listeyi boşaltır.
        alışverişHashList.clear();
        //5.Fonksiyon; boolean isEmpty(); eğer liste boşsa true döndürür.
        if(alışverişHashList.isEmpty()){
            System.out.println("Liste Boş");
        }
    }
}
