package org.example;

import org.example.data.MyDataSource;
import org.example.data.city.CityDAO;
import org.example.data.city.CityDAORepository;
import org.example.entity.City;

import java.sql.SQLException;
import java.util.SortedMap;

public class App {
    public static void main( String[] args ) {

        CityDAO dao = new CityDAORepository();
        //City city = new City("Kalmar","SWE", "Kalmar", 36392);
        //city = dao.create(city);
        //System.out.println(city);
        //______________
        System.out.println(dao.findById(4081));
        //City vaxjo = dao.findById(4080).get();
        //kalmar.setPopulation(37802);
        //System.out.println(dao.update(kalmar));
        //__________________________
//        int result = dao.delete(vaxjo);
//        System.out.println(result + " rows where affected");

    }
}
