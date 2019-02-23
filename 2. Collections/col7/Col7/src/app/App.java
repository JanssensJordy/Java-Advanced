package app;

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        List<String> names = new ArrayList<>();

        names.add ("Abu");
        names.add ("Bob");
        names.add ("Bea");

        Iterator<String> nameIterator = names.iterator();

        while(nameIterator.hasNext()) {
	        String name = nameIterator.next();
	        if ( name.toString() == "Bob" ){
		        nameIterator.remove();
	        }
        }
        for (String var : names) {
            System.out.println(var);
        }
    }
}