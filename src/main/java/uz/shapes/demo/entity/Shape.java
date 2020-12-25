package uz.shapes.demo.entity;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import uz.shapes.demo.utils.CustomDeserializer;

@JsonDeserialize(using = CustomDeserializer.class)
public interface Shape {

	double surface();
	double perimeter();
}
