import java.util.Iterator;

public class Kassa {

    private int totaalProducten;
    private double totaalGeld;
    private KassaRij kassarij;
    private Artikel artikel;

    /**
     * Constructor
     */
    public Kassa(KassaRij kassarij) {
        this.kassarij = kassarij;

    }

    /**
     * Vraag het aantal artikelen en de totaalprijs op. Tel deze gegevens op bij de controletotalen
     * die voor de kassa worden bijgehouden. De implementatie wordt later vervangen door een echte
     * betaling door de persoon.
     *
     * @param klant die moet afrekenen
     */
    public void rekenAf(Dienblad klant) {

        totaalProducten += totaalArtikelenDienblad(klant);
        totaalGeld += totaalPrijsDienblad(klant);
    }


    /**
     * Geeft het aantal artikelen dat de kassa heeft gepasseerd, vanaf het moment dat de methode
     * resetWaarden is aangeroepen.
     *
     * @return aantal artikelen
     */
    public int aantalArtikelen() {
        return totaalProducten;
    }

    /**
     * Geeft het totaalbedrag van alle artikelen die de kass zijn gepasseerd, vanaf het moment dat
     * de methode resetKassa is aangeroepen.
     *
     * @return hoeveelheid geld in de kassa
     */
    public double hoeveelheidGeldInKassa() {
        return totaalGeld;
    }

    /**
     * reset de waarden van het aantal gepasseerde artikelen en de totale hoeveelheid geld in de
     * kassa.
     */
    public void resetKassa() {
        totaalGeld = 0;
        totaalProducten = 0;
    }

    public int totaalArtikelenDienblad(Dienblad dienblad){
        int totaal = 0;
        if (dienblad.getIterator() == null) {
            System.out.println("Het dienblad is leeg");
            return totaal;
        }

        else{
            Iterator<Artikel> it = dienblad.getIterator();
            while (it.hasNext()) {
                it.next();
                totaal++;
            }
            return totaal;
        }

    }

    public double totaalPrijsDienblad(Dienblad dienblad){
        double totaal = 0.0;
        if (dienblad.getIterator() == null) {
            System.out.println("Het dienblad is leeg");
            return totaal;
        }

        else{
            Iterator<Artikel> it = dienblad.getIterator();
            while (it.hasNext()) {
                artikel = it.next();
                totaal += artikel.getPrijs();
            }
            return totaal;
        }
    }
}
