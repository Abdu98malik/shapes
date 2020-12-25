package uz.shapes.demo.service;

import uz.shapes.demo.entity.Shape;

public interface ShapeService {

	double calculateSurface(String shape, Shape body);
	double calculatePerimeter(String shape, Shape body);
}
