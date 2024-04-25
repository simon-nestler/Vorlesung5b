public class Klausur {
    private int punkte;
    private String matrikelNummer;

    public Klausur(int punkte, String matrikelNummer) {
        this.punkte = punkte;
        this.matrikelNummer = matrikelNummer;
    }

    public int getPunkte() {
        return punkte;
    }

    public String getMatrikelNummer() {
        return matrikelNummer;
    }

    public boolean bestanden() {
        return punkte >= 40;
    }

    public String toString() {
        return "Klausur mit " + punkte + " Punkten von " + matrikelNummer;
    }
}
