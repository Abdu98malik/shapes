package uz.shapes.demo.service;

import org.springframework.stereotype.Service;

import uz.shapes.demo.entity.Shape;


@Service
public class ShapeServiceImpl implements ShapeService{


	@Override
	public double calculateSurface(String shape, Shape body) {

		return body.surface();
	}

	@Override
	public double calculatePerimeter(String shape, Shape body) {
		
		return body.perimeter();
	}

	
}
