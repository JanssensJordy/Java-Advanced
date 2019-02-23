package be.ap.javadv.collections;

public class Person {
    private String name;

    public Person(String n) {
        this.name = n;
    }

    @Override
    public String toString(){
        return this.name;
    }
}