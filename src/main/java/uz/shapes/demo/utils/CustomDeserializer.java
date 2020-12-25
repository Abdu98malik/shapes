package uz.shapes.demo.utils;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.node.ObjectNode;

import uz.shapes.demo.entity.Circle;
import uz.shapes.demo.entity.Shape;
import uz.shapes.demo.entity.Rectangle;
import uz.shapes.demo.entity.Square;
import uz.shapes.demo.entity.Triangle;


public class CustomDeserializer extends StdDeserializer<Shape>{

	public  CustomDeserializer() {
		super(Shape.class);
	}

	@Override
	public Shape deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
		
		final ObjectMapper mapper = (ObjectMapper)p.getCodec();
	    final ObjectNode root = mapper.readTree(p);	
    
	    
	    if(root.has("radius")) {
	    	double value = root.get("radius").asDouble();
	    	Circle shape = new Circle();
	    	shape.setRadius(value);	
	    	return shape;
	    }else if(root.has("side")) {
	    	double value = root.get("side").asDouble();
	    	Square shape = new Square();
	    	shape.setSide(value);
	    	return shape;
	    }else if(root.has("sideC")) {
	    	double value = root.get("sideA").asDouble();
	    	double value2 = root.get("sideB").asDouble();
	    	double value3 = root.get("sideC").asDouble();
	    	Triangle shape = new Triangle();
	    	shape.setSideA(value);
	    	shape.setSideB(value2);
	    	shape.setSideC(value3);
	    	
	    	return shape;
	    }else  {
	    	double value = root.get("sideA").asDouble();
	    	double value2 = root.get("sideB").asDouble();

	    	Rectangle shape = new Rectangle();
	    	shape.setSideA(value);
	    	shape.setSideB(value2);
	    	
	    	return shape;

	    }
	    
	
	}

}
