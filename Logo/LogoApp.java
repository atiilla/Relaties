package com.Logo;

public class LogoApp {
	public static void main(String[] args) {
	   Logo logo = new Logo();
      System.out.println(logo.getArea());
      System.out.println(logo.getText());
      
      logo.getCircle().setRadius(15);
      logo.getRectangle().setHeight(8);
      
      System.out.println(logo.getArea());
      
	}
}
