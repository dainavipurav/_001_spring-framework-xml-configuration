package com.abc.learning.modules.car;

import com.abc.learning.interfaces.GovtRecognition;

public class CarGovtRecognition implements GovtRecognition {

	private boolean isGovtRecognized;

	public void setIsGovtRecognized(boolean isGovtRecognized) {
		this.isGovtRecognized = isGovtRecognized;
	}

	@Override
	public boolean isGovtRecognized() {
		return isGovtRecognized;
	}

}
