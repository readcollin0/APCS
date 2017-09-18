package com.readcollin0.apcs.shape;

/**
 * Shape interface is the template used to define geometric shapes
 * 
 * @author Mr. Jaffe
 * @version 2017-07-14
 */
public interface Shape
{
  /**
   * Computes the area of the shape
   * 
   * @return    The computed area
   */
  double getArea();

  /**
   * Computes the perimeter of the shape
   * 
   * @return    The computed perimeter
   */
  double getPerimeter();

  /**
   * Gets the shape's color
   * 
   * @return    The color
   */
  String getColor();
}
