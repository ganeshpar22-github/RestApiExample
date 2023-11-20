package com.restdbdemo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cloud_vendor_info")
public class CloudVendor {
	
	@Id
	private String vendorId;
	
	private String vendorName;
	private String vendorAddress;
	private String vendorPhoneNumber;
	
	
	
	public String getVendorId() {
		return vendorId;
	}
	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	public String getVendorAddress() {
		return vendorAddress;
	}
	public void setVendorAddress(String vendoerAddress) {
		this.vendorAddress = vendoerAddress;
	}
	public String getVendorPhoneNumber() {
		return vendorPhoneNumber;
	}
	public void setVendorPhoneNumber(String vendoerPhoneNumber) {
		this.vendorPhoneNumber = vendoerPhoneNumber;
	}
	
	

	public CloudVendor() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public CloudVendor(String vendorId, String vendorName, String vendoerAddress, String vendoerPhoneNumber) {
		super();
		this.vendorId = vendorId;
		this.vendorName = vendorName;
		this.vendorAddress = vendoerAddress;
		this.vendorPhoneNumber = vendoerPhoneNumber;
	}
	
	

}
