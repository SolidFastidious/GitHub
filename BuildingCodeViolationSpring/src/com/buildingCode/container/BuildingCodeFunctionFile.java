package com.buildingCode.container;

public class BuildingCodeFunctionFile {

	public void updateBuilding(BuildingCode buildingCode, BuildingCode updateBuildingData) {
		buildingCode = updateBuildingData;

	}

	public void deleteBuilding(BuildingList buildingList, int violationId) {
		for(BuildingCode currBuilding : buildingList.getBuildingList()){
			if (currBuilding.getViolation_id() == violationId){
				buildingList.getBuildingList().remove(currBuilding);
			}
		}
	}

	public BuildingCode getBuilding(BuildingList buildingList, BuildingCode buildingCode) {
		for(BuildingCode currBuilding : buildingList.getBuildingList()){
			if (currBuilding.getViolation_id() == buildingCode.getViolation_id()){
				return currBuilding;
			}
		}
		return null;
	}

}
