package com.DataTypes.hydroPWNicsAPI.github.io;

public class WaterData {

	/**
	 * ph_lvl : Water pH level at the time of sample
	 */
	double ph_lvl = 0.0;
	/**
	 * do_lvl : Water dissolved OxyGen Content at time of sample
	 */
	double do_lvl = 0.0;
	/**
	 * ppm_lvl : Water PPM level at the time of sample
	 */
	double ppm_lvl = 0.0;
	/**
	 * temp_lvl : Water temperature at the time of sample
	 */
	double temp_lvl = 0.0;

	/**
	 * Initilization Constructor, allows for the variable fields of the data
	 * opject to be initialized via the arguments
	 * 
	 * @param iph_lvl
	 *            initial ph level
	 * @param ido_lvl
	 *            initial dissolved oxygen level
	 * @param ippm_lvl
	 *            initial ppm level
	 */
	public WaterData(double iph_lvl, double ido_lvl, double ippm_lvl,
			double itemp_lvl) {
		ph_lvl = iph_lvl;
		do_lvl = ido_lvl;
		ppm_lvl = ippm_lvl;
		temp_lvl = itemp_lvl;
	}

	/**
	 * Default Constructor, defaults to value of 0.0 for all fields.
	 */
	public WaterData() {

	}

	/**
	 * 
	 * @return
	 */
	public double getPh_lvl() {
		return ph_lvl;
	}

	/**
	 * 
	 * @return
	 */
	public double getDo_lvl() {
		return do_lvl;
	}

	/**
	 * 
	 * @return
	 */
	public double getPpm_lvl() {
		return ppm_lvl;
	}

	/**
	 * 
	 * @return
	 */
	public double getWaterTemp() {
		return temp_lvl;
	}
}
