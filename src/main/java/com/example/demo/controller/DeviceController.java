package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.device.Device;
import com.example.demo.service.DeviceService;

@RestController
public class DeviceController {
	
	@SuppressWarnings("null")
	@RequestMapping("/devices")
	public List<Device>getAllDevices()
	{
		DeviceService deviceService = null;
		return deviceService.getAllDevices();
	}
	
	@RequestMapping(method = RequestMethod.POST ,value="/devices")
	public void addDevice(@RequestBody Device device)
	{
		DeviceService deviceService = null;
		deviceService.addDevice(device);
	}
	

	
		
	
}

