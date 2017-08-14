package com.buildingCode.container;

import java.io.IOException;
import java.text.ParseException;

import buildingCodeUtilities.CSVFileReader;

public class BuildingCodeViolation {

	public static void main(String[] args) throws IOException, ParseException {

		BuildingListContainer buildListContainer = new BuildingListContainer();

		final String csvReader = "src//dev-challenge-data.csv";

		CSVFileReader csvFileReader = new CSVFileReader();
		csvFileReader.fillBuildingCodeList(csvReader, buildListContainer);

		BuildingCodeUtilities buildCodeUtilities = new BuildingCodeUtilities();

		System.out.println("The number of violations in each category ");
		buildCodeUtilities.numberOfViolationCategory(buildListContainer);

		System.out.println("\nThe earliest and latest violation date for each category ");
		buildCodeUtilities.compareDateViolation(buildListContainer);
		
	}

}
