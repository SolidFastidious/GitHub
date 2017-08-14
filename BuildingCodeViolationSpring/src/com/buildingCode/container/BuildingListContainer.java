package com.buildingCode.container;

import java.util.ArrayList;
import java.util.List;

public class BuildingListContainer {
	private List<BuildingCode> apoList = new ArrayList<BuildingCode>();
	private List<BuildingCode> aPestList = new ArrayList<BuildingCode>();
	private List<BuildingCode> bioList = new ArrayList<BuildingCode>();
	private List<BuildingCode> buildCondList = new ArrayList<BuildingCode>();
	private List<BuildingCode> chemList = new ArrayList<BuildingCode>();
	private List<BuildingCode> garbList = new ArrayList<BuildingCode>();
	private List<BuildingCode> retFoodList = new ArrayList<BuildingCode>();
	private List<BuildingCode> unsanCondList = new ArrayList<BuildingCode>();
	private List<BuildingCode> vegList = new ArrayList<BuildingCode>();

	@Override
	public String toString() {
		return "BuildingListContainer [apoList=" + apoList + ", aPestList=" + aPestList + ", bioList=" + bioList
				+ ", buildCondList=" + buildCondList + ", chemList=" + chemList + ", garbList=" + garbList
				+ ", retFoodList=" + retFoodList + ", unsanCondList=" + unsanCondList + ", vegList=" + vegList + "]";
	}

	public List<BuildingCode> getApoList() {
		return apoList;
	}

	public void setApoList(List<BuildingCode> apoList) {
		this.apoList = apoList;
	}

	public List<BuildingCode> getaPestList() {
		return aPestList;
	}

	public void setaPestList(List<BuildingCode> aPestList) {
		this.aPestList = aPestList;
	}

	public List<BuildingCode> getBioList() {
		return bioList;
	}

	public void setBioList(List<BuildingCode> bioList) {
		this.bioList = bioList;
	}

	public List<BuildingCode> getBuildCondList() {
		return buildCondList;
	}

	public void setBuildCondList(List<BuildingCode> buildCondList) {
		this.buildCondList = buildCondList;
	}

	public List<BuildingCode> getChemList() {
		return chemList;
	}

	public void setChemList(List<BuildingCode> chemList) {
		this.chemList = chemList;
	}

	public List<BuildingCode> getGarbList() {
		return garbList;
	}

	public void setGarbList(List<BuildingCode> garbList) {
		this.garbList = garbList;
	}

	public List<BuildingCode> getRetFoodList() {
		return retFoodList;
	}

	public void setRetFoodList(List<BuildingCode> retFoodList) {
		this.retFoodList = retFoodList;
	}

	public List<BuildingCode> getUnsanCondList() {
		return unsanCondList;
	}

	public void setUnsanCondList(List<BuildingCode> unsanCondList) {
		this.unsanCondList = unsanCondList;
	}

	public List<BuildingCode> getVegList() {
		return vegList;
	}

	public void setVegList(List<BuildingCode> vegList) {
		this.vegList = vegList;
	}

}
