package com.DataTypes.hydroPWNicsAPI.github.io;

import java.util.ArrayList;
import java.util.Iterator;

public class PlantGroup {
	/**
	 * a unique number for every plant row in every garden
	 */
	int plantRowNumber = 0;
	int num_plants = 0;
	int max_plant_num = 4;
	ArrayList<Plant> PlantsInRow = new ArrayList<Plant>();
	Iterator<Plant> IPlantsInRowIterator = PlantsInRow.iterator();

	/**
	 * Main Constructor
	 * 
	 * @param iPlantsInRow
	 */
	public PlantGroup(ArrayList<Plant> iPlantsInRow) {
		PlantsInRow = iPlantsInRow;
		num_plants = iPlantsInRow.size();
	}
	

	/**
	 * 
	 * @return
	 */
	public int getNumberOfPlants() {
		return num_plants;
	}

	/**
	 * 
	 * @return
	 */
	public Plant getPlant(int list_index) {
		return PlantsInRow.get(list_index);
	}

	/**
	 * 
	 * @param newPlant
	 */
	public void addPlantToRow(Plant newPlant) {
		if (PlantsInRow.size() < max_plant_num) {
			PlantsInRow.add(newPlant);
		}
	}

}
