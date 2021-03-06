import java.util.ArrayList;
import java.util.LinkedList;

public class KassaRij {
    private LinkedList<Dienblad> rij;
    /**
     * Constructor
     */
    public KassaRij() {
        // method body omitted
        rij = new LinkedList<>();
    }

    /**
     * Persoon sluit achter in de rij aan
     *
     * @param klant
     */
    public void sluitAchteraan(Dienblad klant) {
        rij.add(klant);
    }

    /**
     * Indien er een rij bestaat, de eerste klant uit de rij verwijderen en retourneren. Als er
     * niemand in de rij staat geeft deze null terug.
     *
     * @return Eerste klant in de rij of null
     */
    public Dienblad eerstePersoonInRij() {
        if(rij.size() != 0) {
            Dienblad klant = rij.get(0);
            rij.remove(0);
            return klant;
        }
        else {
            return null;
        }
    }

    /**
     * Methode kijkt of er personen in de rij staan.
     *
     * @return Of er wel of geen rij bestaat
     */
    public boolean erIsEenRij() {
        if(rij.size() >= 1) {
            return true;
        }
        else {
            return false;
        }
    }
}
