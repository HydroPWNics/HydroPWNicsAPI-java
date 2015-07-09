package com.DataTypes.hydroPWNicsAPI.github.io;

import java.sql.Timestamp;

public class PlantData {

	/**
	 * plant_humidity Humidity within the vicinity of the plant
	 */
	double plant_humidity = 0.0;
	/**
	 * plant_temp the temperature within the vicinity of the plant
	 */
	double plant_temp = 0.0;
	/**
	 * smpl_waterData : the waterData at the time of that the sample of plant
	 * data is taking place
	 */
	WaterData smpl_waterData = new WaterData();

	/**
	 * lght_tmp : an enum pertaining to the type of light conditions the plant
	 * is under at the time of the plant data sample taking place
	 */
	LightTemp lght_tmp = null;
	/**
	 * type : an enum pertainting to the type of garden the plant is in,
	 * hydroponic, soil, or soiless
	 */
	GardenType type = null;
	/**
	 * smplDate : a Timestamp object containting the date and time the sample of
	 * plant data occurred.
	 */
	Timestamp smplDate = new Timestamp(0);

	/**
	 * Main constructor used for full instantiation of PlantData Object
	 * 
	 * @param iplant_humidity
	 *            Humidity around the plant at time of sample
	 * @param iplant_temp
	 *            Temperature around the plant at time of sample
	 * @param ismpl_waterData
	 *            Water datagram at the time of sample
	 * @param itype
	 *            Plant type, hydroponic, soil, or soiless pertains to garden
	 *            growth type
	 */
	public PlantData(double iplant_humidity, double iplant_temp,
			WaterData ismpl_waterData, GardenType itype, LightTemp ilght_tmp,
			Timestamp idate) {
		plant_humidity = iplant_humidity;
		plant_temp = iplant_temp;
		smpl_waterData = ismpl_waterData;
		type = itype;
		lght_tmp = ilght_tmp;
		smplDate = idate;
	}

	/**
	 * default constructor defaults to hydroponic garden designation all other
	 * datatypes default to their constructor default in this case
	 */
	public PlantData() {
		type = GardenType.HYDRO;
	}

	
	/**
	 * getPlant_humidity : returns the plants humidity
	 * 
	 * @return returns type double, member variable pertaining to humidity of
	 *         plant at time of sample
	 */
	public double getPlant_humidity() {
		return plant_humidity;
	}

	/**
	 * 
	 * @return
	 */
	public double getPlant_temp() {
		return plant_temp;
	}

	/**
	 * 
	 * @return
	 */
	public WaterData getSmpl_waterData() {
		return smpl_waterData;
	}

	/**
	 * 
	 * @return
	 */
	public GardenType getType() {
		return type;
	}

	/**
	 * 
	 * @param type
	 */
	public void setType(GardenType type) {
		this.type = type;
	}

	/**
	 * 
	 * @return
	 */
	public Timestamp getSmplDate() {
		return smplDate;
	}

}
