package com.restful.dao.orm;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.restful.dao.CountryDAO;
import com.restful.model.CountryDomain;

public class CountryDAOImpl implements CountryDAO{
	private HibernateTemplate template;
	
	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}


	@Override
	public List<CountryDomain> getCountryList(){
		
		List<CountryDomain> countryList = new ArrayList<CountryDomain>();
		countryList = template.loadAll(CountryDomain.class);
		return countryList;
	} 
	
	@Override
	public CountryDomain getCountryById(int countryid){
		CountryDomain country = (CountryDomain) template.get(CountryDomain.class, countryid);
		return country;
	}

}
