package be.ap.javadv.collections;

import java.util.ArrayList;

public class Ontology <v extends Person, k extends Link<v>>{
    private ArrayList<v> personList;
    private ArrayList<k> linkList;
    public Ontology() {
        this.personList = new ArrayList<v>();
        this.linkList = new ArrayList<k>();
    }
    public Ontology(ArrayList<v> list){
        this.personList = list;
        this.linkList = new ArrayList<k>();
    }

    public void link(k l){
        if(this.personList.contains(l.getPersonA()) && this.personList.contains(l.getPersonB())){
            this.linkList.add(l);
        }
        else{
            System.out.println("Persoon staat niet in de lijn");
        }
    }

    @Override
    public String toString() {
        String output = "";
        for (k link : this.linkList) {
            output += link.getPersonA() + "\t---" + link.getLink() + "---->\t" + link.getPersonB() + "\t(since " + link.getStartDate() + " )\n";
        }
        return output;
    }
    
}