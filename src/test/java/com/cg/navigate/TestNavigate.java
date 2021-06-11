package com.cg.navigate;

public class TestNavigate {

	public static void main(String[] args) throws InterruptedException {
		NavigateExample ne = new NavigateExample();
		ne.loadUrl();
		ne.navigate();
//		ne.clickImages();
		ne.moveBack();
		ne.moveForward();
		ne.checkImage();
	}
}
