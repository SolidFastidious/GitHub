package buildingCodeUtilities;

public enum BuildingCodeLabelEnum {
	APO("Air Pollutants and Odors"),
    AnimalPESTS("Animals and Pests"),
	BIOHAZARDS ("Biohazards"),
	BUILDINGCONDITION("Building Conditions"),
	CHEMICALHAZARD ("Chemical Hazards"),
	GARBAGEREFUSE ("Garbage and Refuse"),
	RETAILFOOD("Retail Food"),
	UNSANITARYCONDIT ("Unsanitary Conditions"),
	VEGETATION ("Vegetation");
	
	private String buildingCodeLabel;

	BuildingCodeLabelEnum(String buildingCodeLabel) {
		this.buildingCodeLabel = buildingCodeLabel;
	}

	public String buildingCodeLabel() {
		return buildingCodeLabel;
	}

}
