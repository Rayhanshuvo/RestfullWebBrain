package com.crud;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JustForController {

	@Autowired
	private JustForService sr;

	@RequestMapping("/processForm")
	public List<JustForTryEntity> letsShout() {

		/* String thename= request.getParameter("studentname"); */

		return sr.getAllTopics();
	}
	
	@RequestMapping("/processForm/{id}")
	public JustForTryEntity getOnlyOne(@PathVariable Integer id){
		
		return sr.getSingleValue(1);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/processForm")
	private void addStudent(@RequestBody JustForTryEntity justForTryEntity){
		
		sr.addProcessForSave(justForTryEntity);
	}

}
