import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        eigeneListe();
    }

    public static void eigeneListe() {
        ArrayList<Klausur> list = new ArrayList<Klausur>();

        list.add(new Klausur(50, "1234561"));
        list.add(new Klausur(39, "3124822"));
        list.add(new Klausur(60, "2384723"));

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
