import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Salem city list:
        ArrayList<City> salemCities = new ArrayList<>();
        salemCities.add(new City("Attur",1));
        salemCities.add(new City("Edappadi",2));
        salemCities.add(new City("Mettur",3));
        salemCities.add(new City("Omalur",4));
        salemCities.add(new City("Sanakari",5));
        salemCities.add(new City("Valapady",6));
        salemCities.add(new City("Yercaud",7));

        //Chennai city List:
        ArrayList<City> chennaiCities = new ArrayList<>();
        chennaiCities.add(new City("Tambaram",1));
        chennaiCities.add(new City("Adyar",2));
        chennaiCities.add(new City("Mylapore",3));
        chennaiCities.add(new City("Velachery",4));
        chennaiCities.add(new City("Nungambakkam",5));
        chennaiCities.add(new City("Chromepet",6));

        //Districts in TamilNadu:
        ArrayList<ArrayList<City>> districtsOfTamilNadu = new ArrayList<>();
        districtsOfTamilNadu.add(salemCities);
        districtsOfTamilNadu.add(chennaiCities);

        //States of India:
        ArrayList<ArrayList<ArrayList<City>>> statesOfIndia = new ArrayList<>();
        statesOfIndia.add(districtsOfTamilNadu);

        //India:
        ArrayList<ArrayList<ArrayList<ArrayList<City>>>> india = new ArrayList<>();
        india.add(statesOfIndia);

        for(ArrayList<ArrayList<ArrayList<City>>> states:india){
            for(ArrayList<ArrayList<City>> districts : statesOfIndia){
                for(ArrayList<City> cities : districtsOfTamilNadu){
                    System.out.println(cities);
                }
            }
        }
    }
}

