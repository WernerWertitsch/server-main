package com.wecreate.crm.stimmbericht.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "stimmbericht")
public class Stimmbericht {
    @Id
    String id;

    String kalenderId;
    String luftfeuchtigkeit;
    String klavierstimmungVorher;
    String klavierstimmungNachher;
    String resonanzboden;
    String stege;
    String saiten;
    String stimmwirbel;
    String stimmstock;
    String hammerkoepfe;
    String mechanik;
    String daempfer;
    String tastatur;
    String oberflaeche;
    String rahmen;
    String anmerkungen;
    String oertlichkeit;
    String transport;
    String nacharbeit;
    String zahlungsart;
    Boolean kostenvoranschlag;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getKalenderId() {
        return kalenderId;
    }

    public void setKalenderId(String kalenderId) {
        this.kalenderId = kalenderId;
    }

    public String getLuftfeuchtigkeit() {
        return luftfeuchtigkeit;
    }

    public void setLuftfeuchtigkeit(String luftfeuchtigkeit) {
        this.luftfeuchtigkeit = luftfeuchtigkeit;
    }

    public String getKlavierstimmungVorher() {
        return klavierstimmungVorher;
    }

    public void setKlavierstimmungVorher(String klavierstimmungVorher) {
        this.klavierstimmungVorher = klavierstimmungVorher;
    }

    public String getKlavierstimmungNachher() {
        return klavierstimmungNachher;
    }

    public void setKlavierstimmungNachher(String klavierstimmungNachher) {
        this.klavierstimmungNachher = klavierstimmungNachher;
    }

    public String getResonanzboden() {
        return resonanzboden;
    }

    public void setResonanzboden(String resonanzboden) {
        this.resonanzboden = resonanzboden;
    }

    public String getStege() {
        return stege;
    }

    public void setStege(String stege) {
        this.stege = stege;
    }

    public String getSaiten() {
        return saiten;
    }

    public void setSaiten(String saiten) {
        this.saiten = saiten;
    }

    public String getStimmwirbel() {
        return stimmwirbel;
    }

    public void setStimmwirbel(String stimmwirbel) {
        this.stimmwirbel = stimmwirbel;
    }

    public String getStimmstock() {
        return stimmstock;
    }

    public void setStimmstock(String stimmstock) {
        this.stimmstock = stimmstock;
    }

    public String getHammerkoepfe() {
        return hammerkoepfe;
    }

    public void setHammerkoepfe(String hammerkoepfe) {
        this.hammerkoepfe = hammerkoepfe;
    }

    public String getMechanik() {
        return mechanik;
    }

    public void setMechanik(String mechanik) {
        this.mechanik = mechanik;
    }

    public String getDaempfer() {
        return daempfer;
    }

    public void setDaempfer(String daempfer) {
        this.daempfer = daempfer;
    }

    public String getTastatur() {
        return tastatur;
    }

    public void setTastatur(String tastatur) {
        this.tastatur = tastatur;
    }

    public String getOberflaeche() {
        return oberflaeche;
    }

    public void setOberflaeche(String oberflaeche) {
        this.oberflaeche = oberflaeche;
    }

    public String getRahmen() {
        return rahmen;
    }

    public void setRahmen(String rahmen) {
        this.rahmen = rahmen;
    }

    public String getAnmerkungen() {
        return anmerkungen;
    }

    public void setAnmerkungen(String anmerkungen) {
        this.anmerkungen = anmerkungen;
    }

    public String getOertlichkeit() {
        return oertlichkeit;
    }

    public void setOertlichkeit(String oertlichkeit) {
        this.oertlichkeit = oertlichkeit;
    }

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public String getNacharbeit() {
        return nacharbeit;
    }

    public void setNacharbeit(String nacharbeit) {
        this.nacharbeit = nacharbeit;
    }

    public String getZahlungsart() {
        return zahlungsart;
    }

    public void setZahlungsart(String zahlungsart) {
        this.zahlungsart = zahlungsart;
    }

    public Boolean getKostenvoranschlag() {
        return kostenvoranschlag;
    }

    public void setKostenvoranschlag(Boolean kostenvoranschlag) {
        this.kostenvoranschlag = kostenvoranschlag;
    }
}
