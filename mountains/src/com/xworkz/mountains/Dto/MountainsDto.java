package com.xworkz.mountains.Dto;

public class MountainsDto {

	private String name;
	private String peakName;
	private int length;
	private String region;
	private String borders;
	private int elevation;
	private String rangeCoordination;
public MountainsDto() {
	// TODO Auto-generated constructor stub
}
public MountainsDto(String name, String peakName, int length, String region, String borders, int elevation,
		String rangeCoordination) {
	super();
	this.name = name;
	this.peakName = peakName;
	this.length = length;
	this.region = region;
	this.borders = borders;
	this.elevation = elevation;
	this.rangeCoordination = rangeCoordination;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPeakName() {
	return peakName;
}
public void setPeakName(String peakName) {
	this.peakName = peakName;
}
public int getLength() {
	return length;
}
public void setLength(int length) {
	this.length = length;
}
public String getRegion() {
	return region;
}
public void setRegion(String region) {
	this.region = region;
}
public String getBorders() {
	return borders;
}
public void setBorders(String borders) {
	this.borders = borders;
}
public int getElevation() {
	return elevation;
}
public void setElevation(int elevation) {
	this.elevation = elevation;
}
public String getRangeCoordination() {
	return rangeCoordination;
}
public void setRangeCoordination(String rangeCoordination) {
	this.rangeCoordination = rangeCoordination;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((borders == null) ? 0 : borders.hashCode());
	result = prime * result + elevation;
	result = prime * result + length;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + ((peakName == null) ? 0 : peakName.hashCode());
	result = prime * result + ((rangeCoordination == null) ? 0 : rangeCoordination.hashCode());
	result = prime * result + ((region == null) ? 0 : region.hashCode());
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
	MountainsDto other = (MountainsDto) obj;
	if (borders == null) {
		if (other.borders != null)
			return false;
	} else if (!borders.equals(other.borders))
		return false;
	if (elevation != other.elevation)
		return false;
	if (length != other.length)
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (peakName == null) {
		if (other.peakName != null)
			return false;
	} else if (!peakName.equals(other.peakName))
		return false;
	if (rangeCoordination == null) {
		if (other.rangeCoordination != null)
			return false;
	} else if (!rangeCoordination.equals(other.rangeCoordination))
		return false;
	if (region == null) {
		if (other.region != null)
			return false;
	} else if (!region.equals(other.region))
		return false;
	return true;
}
@Override
public String toString() {
	return "MountainsDto [name=" + name + ", peakName=" + peakName + ", length=" + length + ", region=" + region
			+ ", borders=" + borders + ", elevation=" + elevation + ", rangeCoordination=" + rangeCoordination + "]";
}


	
	}
