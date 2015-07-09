package com.DataTypes.hydroPWNicsAPI.github.io;

import java.util.ArrayList;
import java.util.Iterator;

public class Garden {
	ArrayList<PlantGroup> GardenRows = new ArrayList<PlantGroup>();
	Iterator<PlantGroup> IGardenRowsIterator = GardenRows.iterator();
	int GardenRowCount = 0;
	int MaxGardenRowSize = 0;
	int PlantRowSize = 0;
	int GardenSize = 0;
	
	/**
	 * 
	 * @param rowToAdd
	 */
	public void addRowToGarden(PlantGroup rowToAdd){
		if(GardenRows.size()<MaxGardenRowSize){
			GardenRows.add(rowToAdd);
		}
		else{
			// Throws exception message or something
		}
	}
	
	/**
	 * 
	 * @param rowToRemove
	 */
	public void removeRowFromGarden(PlantGroup rowToRemove){
		
	}
	
	
	/**
	 * 
	 * @param plantRowNum
	 */
	public void removeRowFromGarden(int plantRowNum){
		
	}
	
	/**
	 * 
	 * @param whchRow
	 * @param plantRowNum
	 */
	public void AddPlantToGarden(PlantGroup whchRow, int plantRowNum){
		
	}
	
	/**
	 * 
	 * @param whchRow
	 * @param plantRowNum
	 */
	public void removePlantFromGarden(PlantGroup whchRow, int plantRowNum){
		
	}
	
}
