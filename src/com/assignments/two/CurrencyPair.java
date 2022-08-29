package com.assignments.two;

//pojo class for storing the data into arraylist
public class CurrencyPair {
	 private String Ccy1;
	 private String Ccy2;
	 private String spotdays;
	 private String WeekendDays;
	 private String Precision;
	 private String LastUpdatedTime;
	 private String currencyPair;
	 
	 public CurrencyPair() {}

	
	public CurrencyPair(String ccy1, String ccy2, String spotdays, String weekendDays, String precision,
			String lastUpdatedTime, String currencyPair) {
		super();
		Ccy1 = ccy1;
		Ccy2 = ccy2;
		this.spotdays = spotdays;
		WeekendDays = weekendDays;
		Precision = precision;
		LastUpdatedTime = lastUpdatedTime;
		this.currencyPair = currencyPair;
	}


	@Override
	public String toString() {
		return "CurrencyPair [Ccy1=" + Ccy1 + ", Ccy2=" + Ccy2 + ", spotdays=" + spotdays + ", WeekendDays="
				+ WeekendDays + ", Precision=" + Precision + ", LastUpdatedTime=" + LastUpdatedTime +", currencyPair =" + currencyPair + "]";
	}

	public String getCcy1() {
		return Ccy1;
	}

	public void setCcy1(String ccy1) {
		Ccy1 = ccy1;
	}

	public String getCcy2() {
		return Ccy2;
	}

	public void setCcy2(String ccy2) {
		Ccy2 = ccy2;
	}

	public String getSpotdays() {
		return spotdays;
	}

	public void setSpotdays(String spotdays) {
		this.spotdays = spotdays;
	}

	public String getWeekendDays() {
		return WeekendDays;
	}

	public void setWeekendDays(String weekendDays) {
		WeekendDays = weekendDays;
	}

	public String getPrecision() {
		return Precision;
	}

	public void setPrecision(String precision) {
		Precision = precision;
	}

	public String getLastUpdatedTime() {
		return LastUpdatedTime;
	}

	public void setLastUpdatedTime(String lastUpdatedTime) {
		LastUpdatedTime = lastUpdatedTime;
	}

	public String getCurrencyPair() {
		return currencyPair;
	}

	public void setCurrencyPair(String currencyPair) {
		this.currencyPair = currencyPair;
	}

	/*
	 * @Override public int compareTo(CurrencyPair o) { // TODO Auto-generated
	 * method stub return (this.currencyPair.compareTo(o.currencyPair)); }
	 */
	

	
}
