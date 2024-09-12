public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //tablica
        /*
        tablica musi miec zdefiniowany rozmiar ktorego pozniej nie mozna zmienic
        tablica przechowuje typy proste i zlozone
         */
        int [] tablicaliczbLosowych = new int[6];
        //losujemy z zakresu od 1 do 100 wlacznie
        for (int i = 0; i < tablicaliczbLosowych.length ; i++){
            tablicaliczbLosowych[i] = (int)(Math.random()*100);
        }
        //wypisywanie tablicy na ekranie
        for (int element:tablicaliczbLosowych) {
            System.out.print(element+",");
        }










    }
}