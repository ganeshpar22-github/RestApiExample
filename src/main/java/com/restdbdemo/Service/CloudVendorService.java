package com.restdbdemo.Service;

import java.util.List;

import com.restdbdemo.model.CloudVendor;

public interface CloudVendorService {
	
	public String createCloudVendor(CloudVendor cloudVendor);
	public String updateCloudVenodor(CloudVendor cloudVendor);
	public String deleteCloudVendor(String vendorId);
	public CloudVendor getCloudVendor(String vendorId);
	public List<CloudVendor> getAllCloudVendor();

}
