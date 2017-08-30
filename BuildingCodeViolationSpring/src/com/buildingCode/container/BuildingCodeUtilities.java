package com.buildingCode.container;

import java.util.Collections;
import java.util.Comparator;

public class BuildingCodeUtilities  {

	final String apo = "Air Pollutants and Odors";
	final String aPests = "Animals and Pests";
	final String biohazard = "Biohazards";
	final String buildingCondition = "Building Conditions";
	final String chemicalHazard = "Chemical Hazards";
	final String garbageRefuse = "Garbage and Refuse";
	final String retailFood = "Retail Food";
	final String unsanitaryCond = "Unsanitary Conditions";
	final String vegetation = "Vegetation";

	public void numberOfViolationCategory(BuildingListContainer bListContainer) {

		System.out.println(apo + ": " + bListContainer.getApoList().size());
		System.out.println(aPests + ": " + bListContainer.getaPestList().size());
		System.out.println(biohazard + ": " + bListContainer.getBioList().size());
		System.out.println(buildingCondition + ": " + bListContainer.getBuildCondList().size());
		System.out.println(chemicalHazard + ": " + bListContainer.getChemList().size());
		System.out.println(garbageRefuse + ": " + bListContainer.getGarbList().size());
		System.out.println(retailFood + ": " + bListContainer.getRetFoodList().size());
		System.out.println(unsanitaryCond + ": " + bListContainer.getUnsanCondList().size());
		System.out.println(vegetation + ": " + bListContainer.getVegList().size());

	}

	public void compareDateViolation(BuildingListContainer bListContainer) {

		Collections.sort(bListContainer.getApoList(), new Comparator<BuildingCode>() {
			public int compare(BuildingCode m1, BuildingCode m2) {
				return m1.getViolation_date().compareTo(m2.getViolation_date());
			}
		});
		Collections.sort(bListContainer.getaPestList(), new Comparator<BuildingCode>() {
			public int compare(BuildingCode m1, BuildingCode m2) {
				return m1.getViolation_date().compareTo(m2.getViolation_date());
			}
		});
		Collections.sort(bListContainer.getBioList(), new Comparator<BuildingCode>() {
			public int compare(BuildingCode m1, BuildingCode m2) {
				return m1.getViolation_date().compareTo(m2.getViolation_date());
			}
		});
		Collections.sort(bListContainer.getBuildCondList(), new Comparator<BuildingCode>() {
			public int compare(BuildingCode m1, BuildingCode m2) {
				return m1.getViolation_date().compareTo(m2.getViolation_date());
			}
		});
		Collections.sort(bListContainer.getChemList(), new Comparator<BuildingCode>() {
			public int compare(BuildingCode m1, BuildingCode m2) {
				return m1.getViolation_date().compareTo(m2.getViolation_date());
			}
		});
		Collections.sort(bListContainer.getGarbList(), new Comparator<BuildingCode>() {
			public int compare(BuildingCode m1, BuildingCode m2) {
				return m1.getViolation_date().compareTo(m2.getViolation_date());
			}
		});
		Collections.sort(bListContainer.getRetFoodList(), new Comparator<BuildingCode>() {
			public int compare(BuildingCode m1, BuildingCode m2) {
				return m1.getViolation_date().compareTo(m2.getViolation_date());
			}
		});
		Collections.sort(bListContainer.getUnsanCondList(), new Comparator<BuildingCode>() {
			public int compare(BuildingCode m1, BuildingCode m2) {
				return m1.getViolation_date().compareTo(m2.getViolation_date());
			}
		});
		Collections.sort(bListContainer.getVegList(), new Comparator<BuildingCode>() {
			public int compare(BuildingCode m1, BuildingCode m2) {
				return m1.getViolation_date().compareTo(m2.getViolation_date());
			}
		});

		System.out.println(apo + ": "  + bListContainer.getApoList().get(0).getViolation_date());
		System.out.println(aPests + ": "  +  bListContainer.getaPestList().get(0).getViolation_date());
		System.out.println(biohazard + ": "  +  bListContainer.getBioList().get(0).getViolation_date());
		System.out.println(buildingCondition + ": "  +  bListContainer.getBuildCondList().get(0).getViolation_date());
		System.out.println(chemicalHazard + ": "  +  bListContainer.getChemList().get(0).getViolation_date());
		System.out.println(garbageRefuse + ": "  +  bListContainer.getGarbList().get(0).getViolation_date());
		System.out.println(retailFood + ": "  +  bListContainer.getRetFoodList().get(0).getViolation_date());
		System.out.println(unsanitaryCond + ": "  +  bListContainer.getUnsanCondList().get(0).getViolation_date());
		System.out.println(vegetation + ": "  +  bListContainer.getVegList().get(0).getViolation_date());

	}

}
