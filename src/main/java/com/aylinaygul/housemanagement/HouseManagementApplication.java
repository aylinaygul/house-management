package com.aylinaygul.housemanagement;

import com.aylinaygul.housemanagement.model.House;
import com.aylinaygul.housemanagement.service.HouseService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HouseManagementApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(HouseManagementApplication.class, args);
	}

	@Override
	public void run(String... args) {
		HouseService service = new HouseService();

		System.out.println("Total price of houses: " + service.getTotalPriceOfHouses());
		System.out.println("Total price of villas: " + service.getTotalPriceOfVillas());
		System.out.println("Total price of summer houses: " + service.getTotalPriceOfSummerHouses());
		System.out.println("Total price of all houses: " + service.getTotalPriceOfAllHouses());

		System.out.println("Average square meters of houses: " + service.getAverageSquareMeterOfHouses());
		System.out.println("Average square meters of villas: " + service.getAverageSquareMeterOfVillas());
		System.out.println("Average square meters of summer houses: " + service.getAverageSquareMeterOfSummerHouses());
		System.out.println("Average square meters of all houses: " + service.getAverageSquareMeterOfAllHouses());

		System.out.println("Filtered houses with 3 rooms and 1 living room:");
		for (House house : service.filterHousesByRoomAndLivingRoom(3, 1)) {
			System.out.println(house);
		}
	}
}
