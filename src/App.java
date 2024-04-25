import java.lang.reflect.Array;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        eigeneListeMitInt();
    }

    public static void eigeneListeMitInt() {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(10);

        System.out.println(list);

        // Element an Stelle 5 entfernen
        // list.remove(5);

        // Element mit Wert 5 entfernen
        list.remove(Integer.valueOf(5));

        System.out.println(list);
    }

    public static void eigeneListe() {
        ArrayList<Klausur> list = new ArrayList<Klausur>();

        list.add(new Klausur(50, "1234561"));
        list.add(new Klausur(39, "3124822"));
        list.add(new Klausur(60, "2384723"));

        // Auslesen: arr[0] wird zu: list.get(0)
        // Schreiben: arr[0] = 3 wird zu: list.set(0, 3);

        System.out.println("Die Punkte der ersten Klausur: " + list.get(0).getPunkte());

        for (Klausur klausur : list) {
            if (klausur.bestanden()) {
                System.out.println("Hurra! " + klausur.getMatrikelNummer() + " hat bestanden!");
            }
        }

        System.out.println(list);
    }

    public static void stringListe() {

        ArrayList<String> list = new ArrayList<String>();

        String exklamation = "!";

        list.add("Hallo");
        list.add("Welt");
        list.add(exklamation);
        list.add("Wie");
        list.add("geht's");
        list.add("?");
        list.add(exklamation);
        list.add(exklamation);
        list.add(exklamation);

        System.out.println(list);

        list.remove(0);
        list.remove(exklamation);

        System.out.println(list);

        System.out.println("Das erste Element: " + list.getFirst());
        System.out.println("Das letzte Element: " + list.getLast());
        System.out.println("Das dritte Element: " + list.get(2));

        list.set(2, "Mars");

        System.out.println(list);

        System.out.println("Die Länge der Liste: " + list.size());
        System.out.println("Ist Hallo in der Liste? " + list.contains("Hallo"));
        System.out.println("An welcher Stelle steht das erste !? " + list.indexOf(exklamation));
        System.out.println("An welcher Stelle steht das letzte !? " + list.lastIndexOf(exklamation));

    }
}
