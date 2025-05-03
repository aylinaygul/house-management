package com.aylinaygul.housemanagement.service;

import com.aylinaygul.housemanagement.model.*;
import com.aylinaygul.housemanagement.repository.HouseRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HouseService {
    private final HouseRepository repository = new HouseRepository();

    public int getTotalPriceOfHouses() {
        return repository.getHouseList().stream().mapToInt(House::getPrice).sum();
    }

    public int getTotalPriceOfVillas() {
        return repository.getVillaList().stream().mapToInt(House::getPrice).sum();
    }

    public int getTotalPriceOfSummerHouses() {
        return repository.getSummerHouseList().stream().mapToInt(House::getPrice).sum();
    }

    public int getTotalPriceOfAllHouses() {
        return getTotalPriceOfHouses() + getTotalPriceOfVillas() + getTotalPriceOfSummerHouses();
    }

    public double getAverageSquareMeterOfHouses() {
        return repository.getHouseList().stream().mapToInt(House::getSquareMeters).average().orElse(0);
    }

    public double getAverageSquareMeterOfVillas() {
        return repository.getVillaList().stream().mapToInt(House::getSquareMeters).average().orElse(0);
    }

    public double getAverageSquareMeterOfSummerHouses() {
        return repository.getSummerHouseList().stream().mapToInt(House::getSquareMeters).average().orElse(0);
    }

    public double getAverageSquareMeterOfAllHouses() {
        List<House> allHouses = new ArrayList<>();
        allHouses.addAll(repository.getHouseList());
        allHouses.addAll(repository.getVillaList());
        allHouses.addAll(repository.getSummerHouseList());

        return allHouses.stream().mapToInt(House::getSquareMeters).average().orElse(0);
    }

    public List<House> filterHousesByRoomAndLivingRoom(int roomCount, int livingRoomCount) {
        List<House> allHouses = new ArrayList<>();
        allHouses.addAll(repository.getHouseList());
        allHouses.addAll(repository.getVillaList());
        allHouses.addAll(repository.getSummerHouseList());

        return allHouses.stream()
                .filter(h -> h.getNumberOfRooms() == roomCount && h.getNumberOfLivingRooms() == livingRoomCount)
                .collect(Collectors.toList());
    }
}
