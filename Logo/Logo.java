package com.Logo;

public class Logo {
   private Rectangle rect;
   private Circle circle;
   private String text;

   public Logo() {
   	rect = new Rectangle(3,4);
   	circle = new Circle(6);
   	text = "My Logo";
   }
      
   public Rectangle getRectangle() {
      return rect;
   }

   public Circle getCircle() {
      return circle;
   }

   public String getText() {
      return text;
   }
   
   public double getArea() {
      return rect.getArea() + circle.getArea();
   }   
   
}
