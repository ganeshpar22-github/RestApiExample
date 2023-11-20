package com.restdbdemo.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restdbdemo.Service.CloudVendorService;
import com.restdbdemo.model.CloudVendor;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorController {
	
	CloudVendorService cloudVendorService;

	public CloudVendorController(CloudVendorService cloudVendorService) {
		this.cloudVendorService = cloudVendorService;
	}
	
	@GetMapping("{vendorId}")
	public CloudVendor getCloudVendorDetails(@PathVariable("vendorId") String vendorId) {
		return cloudVendorService.getCloudVendor(vendorId);
	}
	
	@GetMapping
	public List<CloudVendor> getAllCloudVendorDetails(){
		return cloudVendorService.getAllCloudVendor();
	}
	
	
	@PostMapping
	public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
		cloudVendorService.createCloudVendor(cloudVendor);
		return "Successfully Created";
	}
	
	
	@PutMapping
	public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
		cloudVendorService.updateCloudVenodor(cloudVendor);
		return "Update Successful";
	}
	
	@DeleteMapping("{vendorId}")
	public String deleteCloudVendorDetails(@PathVariable String vendorId) {
		cloudVendorService.deleteCloudVendor(vendorId);
		return "Delete Successful";
	}
	
	

}
