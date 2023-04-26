package com.example.oblig3kino1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class Oblig3Kino1Controller {

    @Autowired
    private Oblig3Kino1Repository rep;

    @PostMapping("/lagre")
    public void lagreBillett(Billett innBillett) {
        rep.lagreBillett(innBillett);
    }

    @GetMapping("/hentAlleBilletter")
    public List<Billett> hentAlle() {
        return rep.hentAlleBilletter();
    }
    @GetMapping("/slettAllebilletter")
    public void slettAlle() {
        rep.slettBilletter();
    }
}