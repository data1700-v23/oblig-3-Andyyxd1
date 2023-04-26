package com.example.oblig3kino1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class Oblig3Kino1Repository {

    Logger logger = LoggerFactory.getLogger(Oblig3Kino1Repository.class);
    @Autowired
    private JdbcTemplate db;

    public boolean lagreBillett(Billett billett) {
        String sql = "INSERT INTO Kino (Telefon, Film, Antall, Fornavn, Etternavn, Epostadresse) VALUES (?,?,?,?,?,?)";
        try {
            db.update(sql, billett.getTelefon(), billett.getFilm(), billett.getAntall(), billett.getFornavn(), billett.getEtternavn(), billett.getEpostadresse());
        } catch(Exception e) {
            logger.error("Det er noe feil i lagrebillett()");
        }
        return true;
    }

    public List<Billett> hentAlleBilletter() {
        String sql = "SELECT * FROM Kino ORDER BY Etternavn ASC";
        try {
            List<Billett> alleBilletter = db.query(sql, new BeanPropertyRowMapper(Billett.class));
            return alleBilletter;
        } catch (Exception e) {
            logger.error("Det er noe feil i henting av lista hentAlleBilletter()");
            return null;
        }
    }

    public void slettEnBillett(String etternavn) {
        String sql = "DELETE FROM Kino WHERE Etternavn=?";
        db.update(sql, etternavn);
    }

    public void slettBilletter() {
        String sql = "DELETE FROM Kino";
        db.update(sql);
    }



}
