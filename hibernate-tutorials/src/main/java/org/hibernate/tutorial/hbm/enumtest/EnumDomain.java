package org.hibernate.tutorial.hbm.enumtest;

public class EnumDomain {

	private int uniqueId;
	private String description;
	public enum MONTHS{JAN,FEB,MAR,APR,MAY,JUN,JUL,AUG,SEP,OCT,NOV,DEC}
	public enum PRISMCOLORS{RED,ORANGE,YELLOW,GREEN,BLUE,INDIGO,VOILET}
	
	private MONTHS month;
	
	private PRISMCOLORS color;

	public int getUniqueId() {
		return uniqueId;
	}

	public void setUniqueId(int uniqueId) {
		this.uniqueId = uniqueId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public MONTHS getMonth() {
		return month;
	}

	public void setMonth(MONTHS month) {
		this.month = month;
	}

	public PRISMCOLORS getColor() {
		return color;
	}

	public void setColor(PRISMCOLORS color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "EnumDomain [uniqueId=" + uniqueId + ", description="
				+ description + ", month=" + month + month.ordinal() + ", color=" + color +color.ordinal() + "]";
	}
	
	
}
