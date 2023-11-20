package com.restdbdemo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restdbdemo.model.CloudVendor;

public interface CloudVendorRepository extends JpaRepository<CloudVendor, String> {

}
