package com.thanuja.restws;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.cxf.jaxrs.client.WebClient;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.ContentDisposition;

public class FileClient {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		WebClient client=WebClient.create("http://localhost:8080/restattachments/services/fileService/upload");
		client.type("multipart/form-data");
		ContentDisposition cd=new ContentDisposition("attachment;filename=Fishers.jpg");
		
		Attachment attachment=new Attachment("root",new FileInputStream(new File("C:\\Users\\kalla\\Pictures\\SML\\P1\\Fishers.jpg")),cd);
	
		client.post(attachment);
	}

}
