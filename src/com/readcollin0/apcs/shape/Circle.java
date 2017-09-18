package com.readcollin0.apcs.shape;


/**
 * Implement a circle
 * 
 * @author Mr. Jaffe 
 * @version 2017-07-14
 */
public class Circle implements Shape
{
  private int radius;
  private String color;

  /**
   * Constructor for objects of class Circle
   */
  public Circle(int radius, String color)
  {
    this.radius = radius;
    this.color = color;
  }

  /**
   * Get the area
   * 
   * @return     returns the area of the circle
   */
  public double getArea()
  {
    return Math.PI * this.radius * this.radius;
  }

  /**
   * Get the perimeter
   * 
   * @return     returns the perimeter of the circle
   */
  public double getPerimeter()
  {
    return 2 * Math.PI * this.radius;
  }

  /**
   * Get the color
   * 
   * @return     returns the color of the circle
   */
  public String getColor()
  {
    return this.color;
  }
}
