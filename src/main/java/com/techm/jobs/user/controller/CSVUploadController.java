package com.techm.jobs.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.techm.jobs.user.configuration.CsvUtils;
import com.techm.jobs.user.configuration.ResponseMessage;
import com.techm.jobs.user.model.Candidate;
import com.techm.jobs.user.service.CSVUploadService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/user")
@Api(value = "/user")
public class CSVUploadController {

	@Autowired
	CSVUploadService csvUpload;
	
	// Upload CSV file and stores into database
	@ApiOperation(value = "Upload CSV File", nickname = "uploadFile", notes = "", tags = {"UploadCSVFile", })
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK"), @ApiResponse(code = 201, message = "Created"),
	@ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 403, message = "Forbidden"),
	@ApiResponse(code = 404, message = "Not Found"), @ApiResponse(code = 405, message = "Invalid input") })
    @PostMapping("/uploadcsv")
	 public ResponseEntity<ResponseMessage> uploadFile(@RequestParam("file") MultipartFile file) {
	    String message = "";

	    if (CsvUtils.hasCSVFormat(file)) {
	    
	      try {
	        csvUpload.store(file);
	        message = "Uploaded the file successfully: " + file.getOriginalFilename();
	        
	        return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage(message));
	      } catch (Exception e) {
	        message = "Could not upload the file: " + file.getOriginalFilename() + "!";
	        
	        return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new ResponseMessage(message));
	      }
	    }
	    message = "Please upload a csv file!";
	    return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ResponseMessage(message));
	  }
	
	@ApiOperation(value = "GetAllCandidates", nickname = "GetCandidate", notes = "", tags = {"GetAllCandidates", })
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK"), @ApiResponse(code = 201, message = "Created"),
	@ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 403, message = "Forbidden"),
	@ApiResponse(code = 404, message = "Not Found"), @ApiResponse(code = 405, message = "Invalid input") })
	@GetMapping("/candidates")
	 public ResponseEntity<List<Candidate>> getAllCandidates() {
	    try {
	      List<Candidate> candidates = csvUpload.getAllCandidates();

	      if (candidates.isEmpty()) {
	        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	      }

	      return new ResponseEntity<>(candidates, HttpStatus.OK);
	    } catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	  }
}
