package com.apxone.client;

import com.apxone.factory.Shap;
import com.apxone.factory.ShapFactory;

public class ShapClient {
	public static void main(String[] args) {
		ShapFactory factory = new ShapFactory();
		
		Shap circleShap = factory.getSapInstance("circle");
		System.out.println(circleShap);
		circleShap.drow();
		
		Shap squareShap = factory.getSapInstance("square");
		System.out.println(squareShap);
		squareShap.drow();
	}
}
