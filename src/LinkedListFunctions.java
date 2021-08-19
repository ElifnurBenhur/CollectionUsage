/*
Odev3- Usage of Collection Class Methods
@author ElifnurBenhur

 */


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkedListFunctions {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        LinkedList<Interns> internsLinkedList = new LinkedList<Interns>();
        //1.Fonksiyon;ListIterator listIterator(int index);
        //Yaratmış olduğumuz internsLinkedList için girilen indexden başlayarak her index için
        //ListIterator elementini döndürür.
        ListIterator<Interns> it=internsLinkedList.listIterator();
        //2.Fonksiyon ; integer push(Element e); aldığı değeri listeye girer listenin son uzunluğunu döndürür.
        internsLinkedList.push(new Interns("Elifnur", "Benhür", 16));
        internsLinkedList.push(new Interns("Elif", "Hacıosmanoglu", 15));
        internsLinkedList.push(new Interns("Arda", "Demir",10));
        internsLinkedList.push(new Interns("Bedirhan", "Akgün", 18));
        internsLinkedList.push(new Interns("Sevinç", "Çınar", 8));
       //3.Fonksiyon; E getFirst(); LIFO yapısından dolayı bu listeye son eklenen elementi döndürür.
        System.out.println("Oluşturulan listedeki son stajyer;"+internsLinkedList.getFirst().getAd()+" "+internsLinkedList.getFirst().getSoyAd());
        //4.Fonksiyon; boolean offerFirst(E e); LIFO yapısından dolayı bu listeye son eklenen elementi değiştirir.
        internsLinkedList.offerFirst(new Interns("Sevim","Can",15));
        System.out.println("Oluşturulan listedeki son stajyer;"+internsLinkedList.getFirst().getAd()+" "+internsLinkedList.getFirst().getSoyAd());


    }


}
