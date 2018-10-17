package liczby_12;

import java.io.*;
import java.util.*;

public class Liczby {

    public static void main(String[] args) throws IOException {

        File plik = new File("src/liczby_12/PlikZLiczbami.txt");
        Map<Integer, Integer> lista = new TreeMap<>();


        FileReader fr = new FileReader(plik);
        BufferedReader bfr = new BufferedReader(fr);


        String wiersz;
        while ((wiersz = bfr.readLine()) != null) {
            Integer liczba = Integer.parseInt(wiersz);
            if (lista.get(liczba) == null) {
                lista.put(liczba, 1);
            } else {
                int licznik = lista.get(liczba) + 1;
                lista.put(liczba, licznik);
            }
        }


        for (Integer element : lista.keySet()) {
            System.out.println(element + " - liczba wystapień: " + lista.get(element));
        }

    }
}

