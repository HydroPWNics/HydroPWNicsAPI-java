package com.DataTypes.hydroPWNicsAPI.github.io;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Iterator;


public class Plant {
	/**
	 * plantDataSamples : an ArrayList of type PlantData containing all the data
	 * samples on a given plant complete with timestamp
	 */
	ArrayList<PlantData> plantDataSamples = new ArrayList<PlantData>();

	/**
	 * plantDataSamplesIterator an Iterator of Type PlantData for cycling
	 * through the arraylist of containing all plant data samples
	 */
	Iterator<PlantData> plantDataSamplesIterator = plantDataSamples.iterator();
	
	/**
	 * datPlanted : a timestamp object denoting the time the plant was added to
	 * the system
	 */
	Timestamp datePlanted = new Timestamp(0);
	
	/**
	 * PlantTyep : a string of the plant type, e.g Tomato, or Pepper etc
	 */
	String PlantType = "N/A";

	/**
	 * plnt_stage : an enum denoting the plants growth stage, Seedling, sprout,
	 * vegetative, flowering and fruiting.
	 */
	PlantStage plnt_stage = null;

	/**
	 * Instantiation constructor, accepts a date of planting, string for type
	 */
	public Plant(Timestamp date, String type, PlantStage pstage) {
		datePlanted = date;
		PlantType = type;
		plnt_stage = pstage;
	}
	
	
	/**
	 * Returns plant data on a given day/time
	 * 
	 * @param desired_date
	 *            accepts a timstamp object representing the desired date
	 * @return returns a PlantData object containing all the plant data on the
	 *         specified date.
	 */
	public PlantData getPlantDataOnDate(Timestamp desired_date) {
		PlantData dd_data = new PlantData();
		Timestamp iterator_time = new Timestamp(0);
		while (plantDataSamplesIterator.hasNext()) {
			dd_data = plantDataSamplesIterator.next();
			iterator_time = dd_data.getSmplDate();

			if (iterator_time.equals(desired_date)) {
				return dd_data;
			}// end if

		}// end while
		return null;
	}// end funct

	/**
	 * 
	 * @return
	 */
	public int getDays() {
		return 0;
	}

	/**
	 * 
	 * @return
	 */
	public int getWeeks() {
		return 0;
	}
}
