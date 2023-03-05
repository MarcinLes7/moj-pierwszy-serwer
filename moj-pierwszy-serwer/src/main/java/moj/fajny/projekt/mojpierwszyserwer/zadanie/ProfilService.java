package moj.fajny.projekt.mojpierwszyserwer.zadanie;

import java.util.Random;

public class ProfilService {

    private  int newId() {
        return new Random().nextInt();
    }
}
