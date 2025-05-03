package com.aylinaygul.housemanagement.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class House {
    private int price;
    private int squareMeters;
    private int numberOfRooms;
    private int numberOfLivingRooms;
}
