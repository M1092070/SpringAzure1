package com.example.demo.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.device.Device;

public interface DeviceRepository extends JpaRepository <Device,Integer>{

	List<Device> findAll();

	
}
