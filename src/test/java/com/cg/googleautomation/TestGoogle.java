package com.cg.googleautomation;

public class TestGoogle {

	public static void main(String[] args) {
		
		GoogleAutomation ga = new GoogleAutomation();
		ga.loadUrl();
		ga.getTitle();
		ga.searchText();
		ga.findAnchors();

	}

}
