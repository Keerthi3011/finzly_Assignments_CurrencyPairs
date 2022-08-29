package com.assignments.one;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class AssignmentOne {
	public static void main(String[] args) throws IOException {
		// Location the csv file 
		String file = "C:\\Users\\keert\\Desktop\\CurrencyPairs.csv";
		BufferedReader data = null;
		String line = "";
		
		//ArrayList is used to store the data
		List <CurrencyPair> values = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value");
		String search = sc.next();
		
		//Retrieving the csv file
		data = new BufferedReader(new FileReader(file));
			while((line =data.readLine())!= null)
			{
				String[] row = line.split(",");
				String currencyPair = row[0]+row[1];
				values.add(new CurrencyPair(row[0], row[1],row[2],row[3], row[4], row[5], currencyPair));
				
				//comparing the ccy fields
				if(search.equals(currencyPair))
					{
						System.out.println("CurrencyPair [Ccy1=" + row[0] + ", Ccy2=" + row[1] + ", spotdays=" + row[2] + ", WeekendDays="
								+ row[3] + ", Precision=" + row[4] + ", LastUpdatedTime=" + row[5] +"]");
					}
				
				
			}
			
	}		
}
