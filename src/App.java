import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

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
