package org.hibernate.tutorial.hbm.collection;

import java.util.Map;

public class MapDomain {
	
	private int id;
	private String name;
	private String value;
	private Map<String, String> mapValue;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public Map<String, String> getMapValue() {
		return mapValue;
	}
	public void setMapValue(Map<String, String> mapValue) {
		this.mapValue = mapValue;
	}
		

}
