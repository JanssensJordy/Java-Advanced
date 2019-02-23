package be.ap.javadv.collections;

import java.util.ArrayList;

public class KeyValues <k extends Number,v>{
    private ArrayList<k> keys;
    private ArrayList<v> values;

    public KeyValues(ArrayList<k> keys, ArrayList<v> values) {
       this.setArrays(keys, values);
    }

    public void addKeyValue(k key, v value){
        this.keys.add(key);
        this.values.add(value);
    }

    public v getValue(k key){
        return values.get(keys.indexOf(key));
    }
    
    private void setArrays(ArrayList<k> keys, ArrayList<v> values){
        if (keys.size() == values.size()) {
            this.keys = keys;
            this.values = values;
        }
    }

}