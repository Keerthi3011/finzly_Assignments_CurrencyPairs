package com.assignments.one;

// pojo class for storing the data
public class CurrencyPair {
	 String Ccy1;
	 String Ccy2;
	 String spotdays;
	 String WeekendDays;
	 String Precision;
	 String LastUpdatedTime;
	 String currencyPair;
	 
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
	
	
}
