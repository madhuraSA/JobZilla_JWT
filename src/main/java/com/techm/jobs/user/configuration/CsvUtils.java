package com.techm.jobs.user.configuration;


import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.web.multipart.MultipartFile;

import com.techm.jobs.user.model.Candidate;

public class CsvUtils {
	

	 public static String TYPE = "text/csv";
	 
	  public static boolean hasCSVFormat(MultipartFile file) {

	    if (!TYPE.equals(file.getContentType())) {
	      return false;
	    }

	    return true;
	  }
	

	 public static List<Candidate> parseCsvFile(InputStream is) {

		    
		    List<Candidate> candidates = new ArrayList<Candidate>();
		    
		    try {
		      BufferedReader fileReader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
		      CSVParser csvParser = new CSVParser(fileReader,
		          CSVFormat.DEFAULT.withFirstRecordAsHeader().withIgnoreHeaderCase().withTrim());
		 
		      Iterable<CSVRecord> csvRecords = csvParser.getRecords();
		      
		      for (CSVRecord csvRecord : csvRecords) {
		          Candidate candidate = new Candidate(
		              Long.parseLong(csvRecord.get("id")),
		              csvRecord.get("firstname"),
		              csvRecord.get("address"),
		              csvRecord.get("lastname"),
		              csvRecord.get("salary"),
		              csvRecord.get("emailid"),
		              csvRecord.get("company"),
		              csvRecord.get("mobileno"),
		              csvRecord.get("currentrole"),
		              csvRecord.get("skillset")
		              );
		        		
		        
		        candidates.add(candidate);
		      }
		      return candidates;
		    } catch (Exception e) {
		    	
		    	throw new RuntimeException("fail to parse CSV file: " + e.getMessage());}
		     
	 }
}
