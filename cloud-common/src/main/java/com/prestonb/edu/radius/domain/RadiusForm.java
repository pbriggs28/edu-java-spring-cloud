package com.prestonb.edu.radius.domain;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class RadiusForm {

	@NotNull
	@Min(value = 1)
	@Max(value = 100)
	private Double radius;
	private Double area;

	public Double getRadius() {
		return radius;
	}
	public void setRadius(Double radius) {
		this.radius = radius;
	}
	public Double getArea() {
		return area;
	}
	public void setArea(Double area) {
		this.area = area;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RadiusForm [radius=");
		builder.append(radius);
		builder.append(", area=");
		builder.append(area);
		builder.append("]");
		return builder.toString();
	}
}
