package be.ap.javadv.collections;

import java.util.ArrayList;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Person> personen = new ArrayList<>();
        Person jan = new Person("Jan");
        Person piet = new Person("Piet");
        Person joris = new Person("Joris");
        personen.add(jan);
        personen.add(piet);
        personen.add(joris);
        Ontology<Person,Link<Person>> o = new Ontology<Person,Link<Person>>(personen);
        o.link(new Link<Person>(jan, piet,"Is vader van"));
        o.link(new Link<Person>(jan,piet,"Is vriend van"));
        System.out.println(o.toString());
        
    }
}