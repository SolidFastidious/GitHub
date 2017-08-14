package buildingCodeUtilities;

import java.io.FileReader;
import java.io.IOException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import com.buildingCode.container.BuildingCode;
import com.buildingCode.container.BuildingListContainer;

import au.com.bytecode.opencsv.CSVReader;

public class CSVFileReader {

	public void fillBuildingCodeList(String csvReader, BuildingListContainer bListContainer)
			throws IOException, ParseException {
		readFile(csvReader, bListContainer);
	}

	public void readFile(String csvReader, BuildingListContainer bListContainer) throws IOException, ParseException {
		CSVReader reader = new CSVReader(new FileReader(csvReader), ',', '"', 1);

		String[] nextLine;

		while ((nextLine = reader.readNext()) != null) {
			if (nextLine != null) {
				if (buildingCodeCreator(nextLine).getViolation_category().equalsIgnoreCase(BuildingCodeLabelEnum.APO.buildingCodeLabel())) {
					bListContainer.getApoList().add(buildingCodeCreator(nextLine));
				}
				if (buildingCodeCreator(nextLine).getViolation_category().equalsIgnoreCase(BuildingCodeLabelEnum.AnimalPESTS.buildingCodeLabel())) {
					bListContainer.getaPestList().add(buildingCodeCreator(nextLine));
				}
				if (buildingCodeCreator(nextLine).getViolation_category().equalsIgnoreCase(BuildingCodeLabelEnum.BIOHAZARDS.buildingCodeLabel())) {
					bListContainer.getBioList().add(buildingCodeCreator(nextLine));
				}
				if (buildingCodeCreator(nextLine).getViolation_category().equalsIgnoreCase(BuildingCodeLabelEnum.BUILDINGCONDITION.buildingCodeLabel())) {
					bListContainer.getBuildCondList().add(buildingCodeCreator(nextLine));
				}
				if (buildingCodeCreator(nextLine).getViolation_category().equalsIgnoreCase(BuildingCodeLabelEnum.CHEMICALHAZARD.buildingCodeLabel())) {
					bListContainer.getChemList().add(buildingCodeCreator(nextLine));
				}
				if (buildingCodeCreator(nextLine).getViolation_category().equalsIgnoreCase(BuildingCodeLabelEnum.GARBAGEREFUSE.buildingCodeLabel())) {
					bListContainer.getGarbList().add(buildingCodeCreator(nextLine));
				}
				if (buildingCodeCreator(nextLine).getViolation_category().equalsIgnoreCase(BuildingCodeLabelEnum.RETAILFOOD.buildingCodeLabel())) {
					bListContainer.getRetFoodList().add(buildingCodeCreator(nextLine));
				}
				if (buildingCodeCreator(nextLine).getViolation_category().equalsIgnoreCase(BuildingCodeLabelEnum.UNSANITARYCONDIT.buildingCodeLabel())) {
					bListContainer.getUnsanCondList().add(buildingCodeCreator(nextLine));
				}
				if (buildingCodeCreator(nextLine).getViolation_category().equalsIgnoreCase(BuildingCodeLabelEnum.VEGETATION.buildingCodeLabel())) {
					bListContainer.getVegList().add(buildingCodeCreator(nextLine));
				}
			}
		}

		reader.close();
	}

	public BuildingCode buildingCodeCreator(String[] nextLine) throws ParseException {
		int violation_id = Integer.parseInt(nextLine[0]);
		int inspection_id = Integer.parseInt(nextLine[1]);
		String violation_category = nextLine[2];
		Date violation_date = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.ENGLISH).parse(nextLine[3]);
		Date violation_date_closed = null;
		if (!nextLine[4].isEmpty()) {
			violation_date_closed = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.ENGLISH).parse(nextLine[4]);
		}
		String violation_type = nextLine[5];

		BuildingCode buildingCode = new BuildingCode(violation_id, inspection_id, violation_category, violation_date,
				violation_date_closed, violation_type);
		return buildingCode;

	}

}
