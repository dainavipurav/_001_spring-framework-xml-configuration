package com.abc.learning.modules.rikshaw;

import com.abc.learning.interfaces.GovtRecognition;

public class RikshawGovtRecognised implements GovtRecognition {

	private boolean isGovtRecognized;

	public void setIsGovtRecognized(boolean isGovtRecognized) {
		this.isGovtRecognized = isGovtRecognized;
	}

	@Override
	public boolean isGovtRecognized() {
		return isGovtRecognized;
	}

}
