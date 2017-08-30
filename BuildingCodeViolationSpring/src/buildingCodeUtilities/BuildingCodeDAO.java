package buildingCodeUtilities;

import com.buildingCode.container.BuildingCode;
import com.buildingCode.container.BuildingListContainer;

public interface BuildingCodeDAO {

	public void updateBuilding(BuildingCode BuildingCode);

	public void deleteBuilding(BuildingCode BuildingCode);

	public BuildingCode getBuilding(BuildingCode BuildingCode);

	public void deleteBuildingCode(BuildingListContainer buildingListContainer);

}
