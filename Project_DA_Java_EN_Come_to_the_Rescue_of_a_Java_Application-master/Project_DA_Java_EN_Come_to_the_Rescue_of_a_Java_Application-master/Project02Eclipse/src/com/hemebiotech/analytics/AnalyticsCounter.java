package com.hemebiotech.analytics;


import java.util.TreeMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

public class AnalyticsCounter {
	
	

	public static void main(String args[]) throws Exception {
		// first get input  count the symptoms and put it into ArrayList
		
	HashMap<String, Long> results =  (HashMap<String, Long>)Symptom.countResults("Project02Eclipse/symptoms.txt");
	// prepare the writer to write into the result file
	WriteSymtomDataToFile symptomsWriter = new WriteSymtomDataToFile("result.out");
	// write the results to the output file
	symptomsWriter.writeResult(results);
	
	
	}
}
