package com.springweb.domain;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class ExpenseDetail implements Serializable {
	
	private Date date;
	private String account;
	private String description;
	private Double hotelFee;
	private Double transportFee;
	private Double fuelFee;
	private Double mealsFee;
	private Double phoneFee;
	private Double entertainmentFee;
	private Double miscFee;
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getHotelFee() {
		return hotelFee;
	}
	public void setHotelFee(Double hotelFee) {
		this.hotelFee = hotelFee;
	}
	public Double getTransportFee() {
		return transportFee;
	}
	public void setTransportFee(Double transportFee) {
		this.transportFee = transportFee;
	}
	public Double getFuelFee() {
		return fuelFee;
	}
	public void setFuelFee(Double fuelFee) {
		this.fuelFee = fuelFee;
	}
	public Double getMealsFee() {
		return mealsFee;
	}
	public void setMealsFee(Double mealsFee) {
		this.mealsFee = mealsFee;
	}
	public Double getPhoneFee() {
		return phoneFee;
	}
	public void setPhoneFee(Double phoneFee) {
		this.phoneFee = phoneFee;
	}
	public Double getEntertainmentFee() {
		return entertainmentFee;
	}
	public void setEntertainmentFee(Double entertainmentFee) {
		this.entertainmentFee = entertainmentFee;
	}
	public Double getMiscFee() {
		return miscFee;
	}
	public void setMiscFee(Double miscFee) {
		this.miscFee = miscFee;
	}
}
