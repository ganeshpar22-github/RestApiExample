package com.restdbdemo.Service.ServiceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.restdbdemo.Exception.CloudVendorNotFoundException;
import com.restdbdemo.Repository.CloudVendorRepository;
import com.restdbdemo.Service.CloudVendorService;
import com.restdbdemo.model.CloudVendor;


@Service
public class CloudVendorServiceImpl implements CloudVendorService {
	
	CloudVendorRepository cloudVendorRepository;

	
	public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
		this.cloudVendorRepository = cloudVendorRepository;
	}

	@Override
	public String createCloudVendor(CloudVendor cloudVendor) {
		cloudVendorRepository.save(cloudVendor);
		return "Successfully Added";
	}

	@Override
	public String updateCloudVenodor(CloudVendor cloudVendor) {
		cloudVendorRepository.save(cloudVendor);
		return "Successfully Updated";
	}

	@Override
	public String deleteCloudVendor(String vendorId) {
		cloudVendorRepository.deleteById(vendorId);
		return "Deleted Successfully";
	}

	@Override
	public CloudVendor getCloudVendor(String vendorId) {
		if(!cloudVendorRepository.findById(vendorId).isPresent())
			throw new CloudVendorNotFoundException("Requested Cloud Vendor"
					+ "Doesn't exists");
			
		return cloudVendorRepository.findById(vendorId).get();
	}

	@Override
	public List<CloudVendor> getAllCloudVendor() {
		return cloudVendorRepository.findAll();
	}

}
