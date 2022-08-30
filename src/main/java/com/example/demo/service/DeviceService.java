package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.device.Device;
import com.example.demo.repository.DeviceRepository;

@Service
public class DeviceService {
	@Autowired
	public DeviceRepository deviceRepo;
	
	public List<Device> getAllDevices()
	{
		List<Device> devices =new ArrayList<>();
				deviceRepo.findAll().forEach(devices::add);
				return devices;
	}
	
	//public void addDevice(Device device) {
		//deviceRepo.save(device);
	//}

	public void addDevice(Device device) {
		// TODO Auto-generated method stub
		deviceRepo.save(device);
		
	}
	public void updateDevice(Integer id,Device device) {
		deviceRepo.save(device);
	}

	

}
