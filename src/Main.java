import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //tablica
        /*
        tablica musi miec zdefiniowany rozmiar ktorego pozniej nie mozna zmienic
        tablica przechowuje typy proste i zlozone
         */
        int[] tablicaliczbLosowych = new int[6];
        //losujemy z zakresu od 1 do 100 wlacznie
        for (int i = 0; i < tablicaliczbLosowych.length; i++) {
            tablicaliczbLosowych[i] = (int) (Math.random() * 100);
        }
        //wypisywanie tablicy na ekranie
        for (int element : tablicaliczbLosowych) {
            System.out.print(element + ",");
        }
        //wypelnianie kolekcji wartosciami losowymi
        /*
        kolekcja moze przechowywac tylko typy zlozone np Integer
        kolekcja nie musi miec zdefiniowanego rozmiaru
        rozmiar moze sie zmieniac w trakcie
        list -> Arraylist or Linkedlist
        set -> Hashset
        map
         */
        ArrayList<Integer> listaliczbLosowych = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            int Liczba = (int) (Math.random() * 100);
            listaliczbLosowych.add(Liczba);
        }
        System.out.println("WYlosowana liczba");
        for (Integer element : listaliczbLosowych) {
            System.out.print(element + ",");

        }
        System.out.println(listaliczbLosowych);
        //losowanie do listy bez powtorzen
        ArrayList<Integer> listaliczbLosowychBezPowtorzen = new ArrayList<>();
        int liczba;
        for (int i = 0; i < 6; i++) {
            liczba = (int) (Math.random() * 100 + 1);
            while (listaliczbLosowychBezPowtorzen.contains(liczba)) {
                liczba = (int) (Math.random() * 100 + 1);
            }
            listaliczbLosowychBezPowtorzen.add(liczba);
        }
        System.out.println(listaliczbLosowychBezPowtorzen);
    /* lista:
    indeksowana, uporzadkowana, elementy moga sie powtarzac
    zbior: (zazwyczaj)
    nieindeksowany, nieporzadkowana, elementy unikatowe
     */
        HashSet <Integer> zbiorliczbLosowych = new HashSet<>();
        while (zbiorliczbLosowych.size()<6){
            liczba = (int)(Math.random()*100+1);
            zbiorliczbLosowych.add(liczba);
        }
        System.out.println("Zbior liczb losowych");
        System.out.println(zbiorliczbLosowych);








    }

    private static class integer {
    }
}