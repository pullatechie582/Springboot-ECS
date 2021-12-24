package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EcsController {
	
	@GetMapping("/getEcs")
	public String getEcsName() {
		return "This is ECS application for new relic";
	}

}
