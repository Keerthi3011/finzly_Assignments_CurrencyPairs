package com.assignments.two;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.assignments.two.CurrencyPair;

public class AssignmentTwo {
	public static void main(String[] args) throws IOException {
		// Location the csv file
		String file = "C:\\Users\\keert\\Desktop\\CurrencyPairs.csv";
		BufferedReader data = null;
		String line = "";
		
		//ArrayList is used to store the data
		ArrayList <CurrencyPair> values = new ArrayList<>();
		
		//Retrieving the csv file
		data = new BufferedReader(new FileReader(file));
		
			while((line =data.readLine())!= null)
			{
				String[] row = line.split(",");
				
				values.add(new CurrencyPair(row[0], row[1],row[2],row[3], row[4], row[5],row[0]+ row[1] ));
			}
			
			//Sorting the last updated time
			Collections.sort(values,(s1,s2)->s1.getCurrencyPair().compareTo(s2.getCurrencyPair()));
			for(CurrencyPair x : values)
				System.out.println(x);
			
	}
}
