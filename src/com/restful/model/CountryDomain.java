package com.restful.model;

public class CountryDomain {
		
	int countryid;
	String countryname;
	String countrycapital;
	
	public CountryDomain(){
	}
	
	public CountryDomain(int countryid, String countryname, String countrycapital) {
		super();
		this.countryid = countryid;
		this.countryname = countryname;
		this.countrycapital = countrycapital;
	}
	public int getCountryid() {
		return countryid;
	}
	public void setCountryid(int countryid) {
		this.countryid = countryid;
	}
	public String getCountryname() {
		return countryname;
	}
	public void setCountryname(String countryname) {
		this.countryname = countryname;
	}
	public String getCountrycapital() {
		return countrycapital;
	}
	public void setCountrycapital(String countrycapital) {
		this.countrycapital = countrycapital;
	}

}
