package airways;

import entity.Customer;

import java.util.*;

public class Airway {

    private List<Customer> passenger = new ArrayList<>();
    private String[][] seatingList;
    private HashMap<String,Integer> cities;
    private int totalEarn = 0;

    private int capacity;
    private UUID flightNumber;

    public Airway(int capacity) {
        cities = new HashMap<>();
        if(capacity > 500) throw new IllegalArgumentException("500'den büyük olamaz");
        char[] alphabet = {'A','B','C','D','E','F','G','H','J','K','L','M','N','O'};
        int i = capacity / 10;
        this.seatingList = new String[10][i];
        for (int j = 0; j < seatingList.length; j++) {
            for (int k = 0; k < seatingList[0].length; k++) {
                seatingList[j][k] = String.valueOf(alphabet[j]) + String.valueOf(k);
            }
        }
        this.capacity = capacity;
    }


    public void showSeatingPlan(){
        for (int j = 0; j < seatingList[0].length; j++) {
            for (int k = 0; k < seatingList.length; k++) {
                System.out.print(seatingList[k][j] +" ");
            }
            System.out.println();
        }
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

    public List<Customer> getPassenger() {
        return passenger;
    }

    public void addPassenger(Customer passenger,String seatNumber,String city) {
        double price = 0;
        for (int j = 0; j < seatingList[0].length; j++) {
            for (int k = 0; k < seatingList.length; k++) {
                if(seatingList[k][j].equals(seatNumber)){
                    passenger.setSeatNo(seatingList[k][j]);
                    if(j <= 1) {
                        System.out.println("j : " + j);
                        price = 4*(cities.get(city));
                    }
                    else if(j >= seatingList[0].length-1) {
                        System.out.println("j : " + j);
                        price = 4*(cities.get(city));
                    }
                    else {
                        price = (cities.get(city));
                    }
                    seatingList[k][j] = "X";
                }
            }
        }
        this.flightNumber = UUID.randomUUID();
        this.passenger.add(passenger);
        System.out.println("the price is " + price + " $ for "+city);
    }

    public int getTotalEarn() {
        return totalEarn;
    }

    public void setTotalEarn(int totalEarn) {
        this.totalEarn = totalEarn;
    }

    public String[][] getSeatingList() {
        return seatingList;
    }

    public void setSeatingList(String[][] seatingList) {
        this.seatingList = seatingList;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public UUID getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(UUID flightNumber) {
        this.flightNumber = flightNumber;
    }


    @Override
    public String toString() {
        return "Airway{" +
                "passenger=" + passenger +
                ", seatingList=" + Arrays.toString(seatingList) +
                ", cities=" + cities +
                ", totalEarn=" + totalEarn +
                ", capacity=" + capacity +
                ", flightNumber=" + flightNumber +
                '}';
    }
}
