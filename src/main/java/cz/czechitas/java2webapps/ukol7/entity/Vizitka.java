package cz.czechitas.java2webapps.ukol7.entity;

import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Vizitka {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Length(max = 100)
    @NotBlank
    private String cele_jmeno;

    @Length(max = 100)
    @NotBlank
    private String firma;

    @Length(max = 100)
    @NotBlank
    private String ulice;

    @Length(max = 100)
    @NotBlank
    private String obec;

    @Length(min = 5, max = 5)
    @NotBlank
    private String psc;

    @Length(max = 100)
    private String email;

    @Length(max = 20)
    private String telefon;

    @Length(max = 100)
    private String web;

    public Integer getId() {
        return id;
    }

    public String getCele_jmeno() {
        return cele_jmeno;
    }

    public String getFirma() {
        return firma;
    }

    public String getPsc() {
        return psc;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefon() {
        return telefon;
    }

    public String getUlice() {
        return ulice;
    }

    public String getObec() {
        return obec;
    }

    public String getWeb() {
        return web;
    }

    public String getCelaAdresa() {
        return ulice + ", " + psc + " " + obec;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setCele_jmeno(String cele_jmeno) {
        this.cele_jmeno = cele_jmeno;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public void setPsc(String psc) {
        this.psc = psc;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public void setUlice(String ulice) {
        this.ulice = ulice;
    }

    public void setObec(String obec) {
        this.obec = obec;
    }

    public void setWeb(String web) {
        this.web = web;
    }
}