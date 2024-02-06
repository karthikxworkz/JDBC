package com.xworkz.theyyam.Dto;

public class TheyyamDto {
	
	private int theyyam_Id;
	private String origin;
	private String Country;
	private int typesOfTheyyam;
	private String anotherName;
	private String startMonth;
	private String endMonth;
	private String belongsFamilyName;
	private String originatedPeriods;
	private String devoteeOf;
	
	public TheyyamDto() {
		// TODO Auto-generated constructor stub
	}

	public TheyyamDto(int theyyam_Id, String origin, String country, int typesOfTheyyam, String anotherName,
			String startMonth, String endMonth, String belongsFamilyName, String originatedPeriods, String devoteeOf) {
		super();
		this.theyyam_Id = theyyam_Id;
		this.origin = origin;
		Country = country;
		this.typesOfTheyyam = typesOfTheyyam;
		this.anotherName = anotherName;
		this.startMonth = startMonth;
		this.endMonth = endMonth;
		this.belongsFamilyName = belongsFamilyName;
		this.originatedPeriods = originatedPeriods;
		this.devoteeOf = devoteeOf;
	}

	public int getTheyyam_Id() {
		return theyyam_Id;
	}

	public void setTheyyam_Id(int theyyam_Id) {
		this.theyyam_Id = theyyam_Id;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public int getTypesOfTheyyam() {
		return typesOfTheyyam;
	}

	public void setTypesOfTheyyam(int typesOfTheyyam) {
		this.typesOfTheyyam = typesOfTheyyam;
	}

	public String getAnotherName() {
		return anotherName;
	}

	public void setAnotherName(String anotherName) {
		this.anotherName = anotherName;
	}

	public String getStartMonth() {
		return startMonth;
	}

	public void setStartMonth(String startMonth) {
		this.startMonth = startMonth;
	}

	public String getEndMonth() {
		return endMonth;
	}

	public void setEndMonth(String endMonth) {
		this.endMonth = endMonth;
	}

	public String getBelongsFamilyName() {
		return belongsFamilyName;
	}

	public void setBelongsFamilyName(String belongsFamilyName) {
		this.belongsFamilyName = belongsFamilyName;
	}

	public String getOriginatedPeriods() {
		return originatedPeriods;
	}

	public void setOriginatedPeriods(String originatedPeriods) {
		this.originatedPeriods = originatedPeriods;
	}

	public String getDevoteeOf() {
		return devoteeOf;
	}

	public void setDevoteeOf(String devoteeOf) {
		this.devoteeOf = devoteeOf;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Country == null) ? 0 : Country.hashCode());
		result = prime * result + ((anotherName == null) ? 0 : anotherName.hashCode());
		result = prime * result + ((belongsFamilyName == null) ? 0 : belongsFamilyName.hashCode());
		result = prime * result + ((devoteeOf == null) ? 0 : devoteeOf.hashCode());
		result = prime * result + ((endMonth == null) ? 0 : endMonth.hashCode());
		result = prime * result + ((origin == null) ? 0 : origin.hashCode());
		result = prime * result + ((originatedPeriods == null) ? 0 : originatedPeriods.hashCode());
		result = prime * result + ((startMonth == null) ? 0 : startMonth.hashCode());
		result = prime * result + theyyam_Id;
		result = prime * result + typesOfTheyyam;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TheyyamDto other = (TheyyamDto) obj;
		if (Country == null) {
			if (other.Country != null)
				return false;
		} else if (!Country.equals(other.Country))
			return false;
		if (anotherName == null) {
			if (other.anotherName != null)
				return false;
		} else if (!anotherName.equals(other.anotherName))
			return false;
		if (belongsFamilyName == null) {
			if (other.belongsFamilyName != null)
				return false;
		} else if (!belongsFamilyName.equals(other.belongsFamilyName))
			return false;
		if (devoteeOf == null) {
			if (other.devoteeOf != null)
				return false;
		} else if (!devoteeOf.equals(other.devoteeOf))
			return false;
		if (endMonth == null) {
			if (other.endMonth != null)
				return false;
		} else if (!endMonth.equals(other.endMonth))
			return false;
		if (origin == null) {
			if (other.origin != null)
				return false;
		} else if (!origin.equals(other.origin))
			return false;
		if (originatedPeriods == null) {
			if (other.originatedPeriods != null)
				return false;
		} else if (!originatedPeriods.equals(other.originatedPeriods))
			return false;
		if (startMonth == null) {
			if (other.startMonth != null)
				return false;
		} else if (!startMonth.equals(other.startMonth))
			return false;
		if (theyyam_Id != other.theyyam_Id)
			return false;
		if (typesOfTheyyam != other.typesOfTheyyam)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TheyyamDto [theyyam_Id=" + theyyam_Id + ", origin=" + origin + ", Country=" + Country
				+ ", typesOfTheyyam=" + typesOfTheyyam + ", anotherName=" + anotherName + ", startMonth=" + startMonth
				+ ", endMonth=" + endMonth + ", belongsFamilyName=" + belongsFamilyName + ", originatedPeriods="
				+ originatedPeriods + ", devoteeOf=" + devoteeOf + "]";
	}

	
}
