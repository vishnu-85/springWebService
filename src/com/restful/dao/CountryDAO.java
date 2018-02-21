package com.restful.dao;

import java.util.List;

import com.restful.model.CountryDomain;

public interface CountryDAO {

	List<CountryDomain> getCountryList();

	CountryDomain getCountryById(int countryid);

}
