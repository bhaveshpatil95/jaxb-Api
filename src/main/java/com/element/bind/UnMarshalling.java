package com.element.bind;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class UnMarshalling {
	
	public static void main(String[] args) throws Exception {
		
		JAXBContext context = JAXBContext.newInstance(Employee.class);
		Unmarshaller unmarsh = context.createUnmarshaller();
		Employee employee = (Employee) unmarsh.unmarshal(new File("abc.xml"));
		System.out.println(employee);
	}

}
