import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

import java.util.TreeSet;
public class TreeSetFunctions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        TreeSet<Integer> intTreeSet = new TreeSet<Integer>();
        // boolean add( element e);  verilen elementi listeye ekler.
        intTreeSet.add(123);
        intTreeSet.add(234);
        intTreeSet.add(456);
        intTreeSet.add(23456);
        intTreeSet.add(2);
        //treeset "doğal" formda içine eklenen değerleri artan sıra ile bir sete dönüştürür.
        System.out.println("Artan sıra ile set"+intTreeSet);
        //1.Fonksiyon; E set descendingSet(); Seti azalan sıra ile verir
        System.out.println("Azalan sıra ile set"+intTreeSet.descendingSet());
        //2.Fonksiyon;E set tailSet(element); Setin aldığı değerden büyük ya da eşit olan kısmını geri döndürür.
        System.out.println("Artan sıra ile setin 300'den büyük kısmı"+intTreeSet.tailSet(300));
        //3.Fonksiyon; E higher(E e); sette aldığı değerden büyük olan en küçük değeri döndürür.
        System.out.println("Sette bulunan 300 den büyük en küçük element:"+intTreeSet.higher(300));
        //4.Fonksiyon; E set headSet(E e); setin aldığı değerden küçük olan kısmını döndürür.
        System.out.println("Artan sıra ile setin 300'den küçük kısmı:"+intTreeSet.headSet(300));
    }
}
