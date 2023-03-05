package moj.fajny.projekt.mojpierwszyserwer;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kalkulator20")
public class Kalkulator20Kontroller {

    /*
    *  POST /kalkulator20/policz
    *
    * {
    *   "a" : 123
    *   "b" : 90
    *   "operacja" : "DODAJ" // DODAJ, ODEJMIJ, PODZIEL, POTEGA
    * }
    *
    * */

    enum Operacja {
        DODAJ,
        ODEJMIJ,
        POMNOZ,
        PODZIEL,
        POTEGA
    }

    public static class Dzialania {
        private int a;
        private int b;
        private Operacja operacja;

        public int getA() {
            return a;
        }

        public void setA(int a) {
            this.a = a;
        }

        public int getB() {
            return b;
        }

        public void setB(int b) {
            this.b = b;
        }

        public Operacja getOperacja() {
            return operacja;
        }

        public void setOperacja(Operacja operacja) {
            this.operacja = operacja;
        }
    }

    @PostMapping("/policz")
    public int policz(@RequestBody Dzialania dzialania) {
       switch (dzialania.operacja) {
           case DODAJ:
               return dzialania.a + dzialania.b;

           case ODEJMIJ:
               return dzialania.a - dzialania.b;
           case POMNOZ:
               return dzialania.a * dzialania.b;
           case PODZIEL:
               return dzialania.a / dzialania.b;
           case POTEGA:
           return (int) Math.pow(dzialania.a, dzialania.b);
           default:
               return 0;

       }
    }



    }
