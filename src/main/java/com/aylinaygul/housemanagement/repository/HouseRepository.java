package com.aylinaygul.housemanagement.repository;

import com.aylinaygul.housemanagement.model.*;
import java.util.ArrayList;
import java.util.List;

public class HouseRepository {
    private final List<NormalHouse> houseList = new ArrayList<>();
    private final List<Villa> villaList = new ArrayList<>();
    private final List<SummerHouse> summerHouseList = new ArrayList<>();

    public HouseRepository() {
        houseList.add(new NormalHouse(1000000, 120, 3, 1));
        houseList.add(new NormalHouse(900000, 110, 2, 1));
        houseList.add(new NormalHouse(800000, 100, 2, 1));

        villaList.add(new Villa(2500000, 300, 5, 2));
        villaList.add(new Villa(2700000, 320, 6, 2));
        villaList.add(new Villa(2300000, 280, 4, 1));

        summerHouseList.add(new SummerHouse(1500000, 200, 4, 1));
        summerHouseList.add(new SummerHouse(1600000, 210, 3, 1));
        summerHouseList.add(new SummerHouse(1400000, 190, 3, 1));
    }

    public List<NormalHouse> getHouseList() {
        return houseList;
    }

    public List<Villa> getVillaList() {
        return villaList;
    }

    public List<SummerHouse> getSummerHouseList() {
        return summerHouseList;
    }
}
