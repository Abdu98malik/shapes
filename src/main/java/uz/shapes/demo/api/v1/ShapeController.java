package uz.shapes.demo.api.v1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uz.shapes.demo.entity.Shape;
import uz.shapes.demo.service.ShapeService;

@RestController
@RequestMapping("/api/v1")
public class ShapeController {

	@Autowired ShapeService shapeService;
	
	@GetMapping(value ="/perimeter/{shape}", consumes =MediaType.APPLICATION_JSON_VALUE)
	public double perimeter(@PathVariable String shape, @RequestBody Shape body) {
		return shapeService.calculatePerimeter(shape, body);
	}
	
	@GetMapping(value = "/surface/{shape}",  consumes =MediaType.APPLICATION_JSON_VALUE)
	public double surface(@PathVariable String shape, @RequestBody Shape body) {
		return shapeService.calculateSurface(shape, body);
	}
}
