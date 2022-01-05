package com.xworkz.jdbc;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.jdbc.dao.TrainDao;
import com.xworkz.jdbc.dto.TrainDto;

public class TrainTester {
	public static void main(String[] args) {
		Collection<TrainDto> collection=new ArrayList<TrainDto>();
		collection.add(new TrainDto(1, "660340", "Banglore", "Shimoga", 45, 150.00, "Second Class", "Preetham"));
		collection.add(new TrainDto(2, "456876", "Banglore", "Birur", 12, 120.00, "First Class", "Sheethal"));
		collection.add(new TrainDto(3, "345876", "Mysore", "Hassan", 67, 220.00, "Second Class", "Raju"));
		collection.add(new TrainDto(4, "345689", "Chikkamaglore", "Shimoga", 87, 125.00, "First Class", "Chethan"));
		collection.add(new TrainDto(5, "874536", "Banglore", "Tiptur", 56, 110.00, "Ac Class", "Theju"));
		TrainDao dao=new TrainDao();
		//collection.forEach((e)->System.out.println(dao.save(e)));
		//System.out.println(dao.deleteByTrainNo("456876"));
		//System.out.println(dao.deleteByTrainNoAndId("345876", 3));
		//System.out.println(dao.getAllByTrainNo("660340"));
		//Collection<TrainDto> collection2=dao.getAll();
		//collection2.forEach((e)->System.out.println(e));
		//Collection<TrainDto> collection3= dao.getAllByBoarding("Banglore");
		//collection3.forEach((e)->System.out.println(e));
		//Collection<TrainDto> collection4= dao.getAllByDestination("Hassan");
		//collection4.forEach((e)->System.out.println(e));
		//System.out.println(dao.updateDestinationBytrainNo("abc", "874536"));
		//System.out.println(dao.updateDestinationAndBoardingBytrainNo("abc", "xyz", "345876"));
		//System.out.println(dao.getTotal());
		//System.out.println(dao.getMaxPrice());
		//System.out.println(dao.getMinPrice());
		
		
	}
}