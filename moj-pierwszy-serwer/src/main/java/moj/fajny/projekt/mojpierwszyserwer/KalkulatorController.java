package moj.fajny.projekt.mojpierwszyserwer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kalkulator")
public class KalkulatorController {

    // /kalkulator/dodaj/1/2

    @GetMapping("/dodaj/{a}/{b}")
    public int dodaj(@PathVariable int a, @PathVariable int b) {
        return a + b;
    }

    // /kalkulator/odejmij/1/2
    @GetMapping("/odejmij/{a}/{b}")
    public int odejmij(@PathVariable int a, @PathVariable int b) {
        return a - b;
    }

    // /kalkulator/pomonoz/1/2
    @GetMapping("/pomonoz/{a}/{b}")
    public int pomonoz(@PathVariable int a, @PathVariable int b) {
        return a * b;
    }

    // /kalkulator/podziel/1/2
    @GetMapping("/podziel/{a}/{b}")
    public float podziel(@PathVariable int a, @PathVariable int b) {
        return a / (float) b;
    }
}
