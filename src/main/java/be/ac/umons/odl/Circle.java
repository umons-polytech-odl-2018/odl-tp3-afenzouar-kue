package be.ac.umons.odl;
import java.awt.*;

import static java.lang.Math.PI;
import static java.lang.Math.abs;

public class Circle extends Ellipsis implements Drawable{

	private int radius;

	public Circle(Point center, int radius){

		super(center,radius,radius);
		this.radius = radius;

	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public double computePerimeter() {
		return 2*PI*radius;
	}

	@Override
	public double computeArea(){
		return PI*radius*radius;
	}


	@Override
	public void draw(Graphics g) {

		Point center = getCenter();
		int x = center.getX();
		int y = center.getY();
		int width = abs(radius);
		int height = abs(radius);

		g.drawOval(x,y,width,height);
	}
}
