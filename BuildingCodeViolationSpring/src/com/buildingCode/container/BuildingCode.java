package com.buildingCode.container;

import java.util.Date;

public class BuildingCode {

	private int violation_id;
	private int inspection_id;
	private String violation_category;
	private Date violation_date;
	private Date violation_date_closed;
	private String violation_type;

	public BuildingCode(int violation_id, int inspection_id, String violation_category, Date violation_date,
			Date violation_date_closed, String violation_type) {
		this.violation_id = violation_id;
		this.inspection_id = inspection_id;
		this.violation_category = violation_category;
		this.violation_date = violation_date;
		this.violation_date_closed = violation_date_closed;
		this.violation_type = violation_type;
	}

	
	@Override
	public String toString() {
		return "BuildingCode [violation_id=" + violation_id + ", inspection_id=" + inspection_id
				+ ", violation_category=" + violation_category + ", violation_date=" + violation_date
				+ ", violation_date_closed=" + violation_date_closed + ", violation_type=" + violation_type + "]";
	}


	public int getViolation_id() {
		return violation_id;
	}

	public void setViolation_id(int violation_id) {
		this.violation_id = violation_id;
	}

	public int getInspection_id() {
		return inspection_id;
	}

	public void setInspection_id(int inspection_id) {
		this.inspection_id = inspection_id;
	}

	public String getViolation_category() {
		return violation_category;
	}

	public void setViolation_category(String violation_category) {
		this.violation_category = violation_category;
	}

	public Date getViolation_date() {
		return violation_date;
	}

	public void setViolation_date(Date violation_date) {
		this.violation_date = violation_date;
	}

	public Date getViolation_date_closed() {
		return violation_date_closed;
	}

	public void setViolation_date_closed(Date violation_date_closed) {
		this.violation_date_closed = violation_date_closed;
	}

	public String getViolation_type() {
		return violation_type;
	}

	public void setViolation_type(String violation_type) {
		this.violation_type = violation_type;
	}

}
