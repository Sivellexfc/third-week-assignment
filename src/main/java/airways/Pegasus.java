package airways;

import java.util.HashMap;

public class Pegasus extends Airway{

    private HashMap<String,Integer> cities;

    public Pegasus(int capacity) {
        super(capacity);
    }

    public void addCity(String city,int price){
        cities.put(city,price);
    }
    public HashMap<String, Integer> getCities() {
        return cities;
    }

    public void setCities(HashMap<String, Integer> cities) {
        this.cities = cities;
    }
}
