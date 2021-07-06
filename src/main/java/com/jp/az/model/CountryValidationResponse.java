package com.jp.az.model;

import lombok.Getter;
import lombok.Setter;

public class CountryValidationResponse {
	
	
	
	public CountryValidationResponse(boolean result) {
		super();
		this.result = result;
	}

	@Getter
	@Setter
	private boolean result;

}
