package com.restful.controller;

import java.util.List;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.restful.dao.orm.CountryDAOImpl;
import com.restful.model.CountryDomain;

@RestController
public class CountryController {
	
	@Autowired
	CountryDAOImpl countryDAO;
	
	
	@RequestMapping(value = "/country" , method = RequestMethod.GET , produces = "application/json")
	@ResponseBody
	public List<CountryDomain> getCountryList(){
		List< CountryDomain> countryList = countryDAO.getCountryList();
		return countryList;
	}
	
	@RequestMapping(value = "/country/{countryid}", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public CountryDomain getCountryById(@PathVariable(value = "countryid") int countryid){
		CountryDomain country = (CountryDomain) countryDAO.getCountryById(countryid);
		return country;
	}
}
