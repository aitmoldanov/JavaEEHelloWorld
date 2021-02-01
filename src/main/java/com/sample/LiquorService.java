package com.sample;

import com.sample.model.LiquorType;

import java.util.ArrayList;
import java.util.List;

public class LiquorService {

    public List getAvailableBrands(LiquorType type){

        List brands = new ArrayList();

        if(type.equals(LiquorType.Ferrari)){
            brands.add("Adrianna Vineyard");
            brands.add(("J. P. Chenet"));

        }else if(type.equals(LiquorType.McLaren)){
            brands.add("Glenfiddich");
            brands.add("Johnnie Walker");

        }else if(type.equals(LiquorType.Lamborghini)){
            brands.add("Corona");

        }else {
            brands.add("No Brand Available");
        }
        return brands;
    }
}
