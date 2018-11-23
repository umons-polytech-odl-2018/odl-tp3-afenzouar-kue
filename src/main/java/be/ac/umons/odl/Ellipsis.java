package be.ac.umons.odl;

import java.awt.*;

import static java.lang.Math.abs;

public class Ellipsis implements Drawable {

	private int xAxisLength, yAxis2Length;
	private Point center;

	public Ellipsis(Point center, int xAxisLength, int yAxis2Length) {
		this.center = center;
		this.xAxisLength = xAxisLength;
		this.yAxis2Length = yAxis2Length;

	}

	public int getxAxisLength() {
		return xAxisLength;
	}

	public void setxAxisLength(int xAxisLength) {
		this.xAxisLength = xAxisLength;
	}

	public int getyAxis2Length() {
		return yAxis2Length;
	}

	public void setyAxis2Length(int yAxis2Length) {
		this.yAxis2Length = yAxis2Length;
	}

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	public double computePerimeter() {

		return 0.0;
	}

	public double computeArea() {
		return 0.0;
	}

	@Override
	public void draw(Graphics g) {


		int x = center.getX();
		int y = center.getY();
		int width = abs(getxAxisLength()/2);
		int height = abs(getyAxis2Length()/2);

		g.drawOval(x,y,width,height);
	}

}
