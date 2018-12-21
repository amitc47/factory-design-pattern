package com.apxone.factory;

public class ShapFactory {
	
	public Shap getSapInstance(String typeOfShape) {
		if(typeOfShape==null) {
			return null;
		}
		
		if(typeOfShape.equalsIgnoreCase("circle")) {
			return new Circle();
		}else if(typeOfShape.equalsIgnoreCase("square")) {
			return new Square();
		}else {
			throw new ShapNotAvailableException("No shap availble with name :: "+typeOfShape);
		}
		
	}
}
