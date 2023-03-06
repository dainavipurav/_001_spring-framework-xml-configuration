package com.abc.learning.modules.car;

import com.abc.learning.interfaces.Introduction;

public class CarIntro implements Introduction {

	private String image;
	private String intro;

	public void setImage(String image) {
		this.image = image;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

	@Override
	public String image() {
		return image;
	}

	@Override
	public String intro() {
		return intro;
	}

}
