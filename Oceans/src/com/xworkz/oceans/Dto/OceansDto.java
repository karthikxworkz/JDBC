package com.xworkz.oceans.Dto;

public class OceansDto {
	private String name;
	private int depth;
	private String borders;
	private int coveredPercentage;

	public OceansDto() {
		// TODO Auto-generated constructor stub
	}

	public OceansDto(String name, int depth, String borders, int coveredPercentage) {
		super();
		this.name = name;
		this.depth = depth;
		this.borders = borders;
		this.coveredPercentage = coveredPercentage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}

	public String getBorders() {
		return borders;
	}

	public void setBorders(String borders) {
		this.borders = borders;
	}

	public int getCoveredPercentage() {
		return coveredPercentage;
	}

	public void setCoveredPercentage(int coveredPercentage) {
		this.coveredPercentage = coveredPercentage;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((borders == null) ? 0 : borders.hashCode());
		result = prime * result + coveredPercentage;
		result = prime * result + depth;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		OceansDto other = (OceansDto) obj;
		if (borders == null) {
			if (other.borders != null)
				return false;
		} else if (!borders.equals(other.borders))
			return false;
		if (coveredPercentage != other.coveredPercentage)
			return false;
		if (depth != other.depth)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "OceansDto [name=" + name + ", depth=" + depth + ", borders=" + borders + ", coveredPercentage="
				+ coveredPercentage + "]";
	}
	
	
}
