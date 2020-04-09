package com.thanuja.restws;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.thanuja.restws.model.Patient;

@Service
public class PatientServiceImpl implements PatientService {

	Map<Long,Patient> patients=new HashMap<>();
	long currentId=123;
	public PatientServiceImpl() {
		init();
	}
	void init() {
		Patient patient=new Patient();
		patient.setId(currentId);
		patient.setName("John");
		patients.put(patient.getId(),patient);
	}
	@Override
	public List<Patient> getPatients() {
		// TODO Auto-generated method stub
		Collection<Patient> results = patients.values();
		List<Patient> response = new ArrayList<>(results);
		
		return response;
	}
}
