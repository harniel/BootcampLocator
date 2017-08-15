package com.devslopes.bootcamplocator.services;

import com.devslopes.bootcamplocator.model.Devslopes;

import java.util.ArrayList;
/**
 * Created by AsusPc on 8/15/2017.
 */

public class DataService {
    private static DataService instance = new DataService();

    public static DataService getInstance() {
        return instance;
    }

    private DataService() {

    }

    public ArrayList<Devslopes> getBootcampLocationsWithin10MilesOfZip(int zipcode) {
        //pretending we are downloading data from the server

        ArrayList<Devslopes> bootCamps =new ArrayList<>();
        bootCamps.add(new Devslopes( 10.2912f , 123.8617f, "Usjr Tesda Building", "Basak Pardo Cebu City, Cebu", "img"));
        bootCamps.add(new Devslopes( 10.2948f,123.8676f, "Don Bosco Technology Center", "Punta Princesa Cebu City, City", "img"));
        bootCamps.add(new Devslopes( 10.2891f,123.8710f, "Shopwise", "N. Bacalso Ave., Basak San Nicolas, Cebu City, 6000", "img"));
        return bootCamps;
    }
}
