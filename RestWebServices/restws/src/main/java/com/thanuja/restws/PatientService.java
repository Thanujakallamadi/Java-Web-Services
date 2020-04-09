package com.thanuja.restws;



import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.thanuja.restws.model.Patient;

@Path("/patientservice")
public interface PatientService {
	@Path("/patients")
	@GET
	List<Patient> getPatients();
}
