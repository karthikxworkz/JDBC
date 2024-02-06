package com.xworkz.soap.Dto;

public class SoapDto {
	
	private int id;
	private String name;
	private String companyName;
	private int price;
	private String headQuater;
	private String owner;
	private String foundedDate;
	private String website;
	private String color;
	private String flavour;

   public SoapDto() {
	// TODO Auto-generated constructor stub
}

public SoapDto(int id, String name, String companyName, int price, String headQuater, String owner, String foundedDate,
		String website, String color, String flavour) {
	super();
	this.id = id;
	this.name = name;
	this.companyName = companyName;
	this.price = price;
	this.headQuater = headQuater;
	this.owner = owner;
	this.foundedDate = foundedDate;
	this.website = website;
	this.color = color;
	this.flavour = flavour;
}

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

public String getCompanyName() {
	return companyName;
}

public void setCompanyName(String companyName) {
	this.companyName = companyName;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

public String getHeadQuater() {
	return headQuater;
}

public void setHeadQuater(String headQuater) {
	this.headQuater = headQuater;
}

public String getOwner() {
	return owner;
}

public void setOwner(String owner) {
	this.owner = owner;
}

public String getFoundedDate() {
	return foundedDate;
}

public void setFoundedDate(String foundedDate) {
	this.foundedDate = foundedDate;
}

public String getWebsite() {
	return website;
}

public void setWebsite(String website) {
	this.website = website;
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

public String getFlavour() {
	return flavour;
}

public void setFlavour(String flavour) {
	this.flavour = flavour;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((color == null) ? 0 : color.hashCode());
	result = prime * result + ((companyName == null) ? 0 : companyName.hashCode());
	result = prime * result + ((flavour == null) ? 0 : flavour.hashCode());
	result = prime * result + ((foundedDate == null) ? 0 : foundedDate.hashCode());
	result = prime * result + ((headQuater == null) ? 0 : headQuater.hashCode());
	result = prime * result + id;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + ((owner == null) ? 0 : owner.hashCode());
	result = prime * result + price;
	result = prime * result + ((website == null) ? 0 : website.hashCode());
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
	SoapDto other = (SoapDto) obj;
	if (color == null) {
		if (other.color != null)
			return false;
	} else if (!color.equals(other.color))
		return false;
	if (companyName == null) {
		if (other.companyName != null)
			return false;
	} else if (!companyName.equals(other.companyName))
		return false;
	if (flavour == null) {
		if (other.flavour != null)
			return false;
	} else if (!flavour.equals(other.flavour))
		return false;
	if (foundedDate == null) {
		if (other.foundedDate != null)
			return false;
	} else if (!foundedDate.equals(other.foundedDate))
		return false;
	if (headQuater == null) {
		if (other.headQuater != null)
			return false;
	} else if (!headQuater.equals(other.headQuater))
		return false;
	if (id != other.id)
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (owner == null) {
		if (other.owner != null)
			return false;
	} else if (!owner.equals(other.owner))
		return false;
	if (price != other.price)
		return false;
	if (website == null) {
		if (other.website != null)
			return false;
	} else if (!website.equals(other.website))
		return false;
	return true;
}

@Override
public String toString() {
	return "SoapDto [id=" + id + ", name=" + name + ", companyName=" + companyName + ", price=" + price
			+ ", headQuater=" + headQuater + ", owner=" + owner + ", foundedDate=" + foundedDate + ", website="
			+ website + ", color=" + color + ", flavour=" + flavour + "]";
}


   
}
