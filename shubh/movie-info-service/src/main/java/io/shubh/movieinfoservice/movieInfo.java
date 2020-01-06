package io.shubh.movieinfoservice;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/movieInfo")
public class movieInfo {
	
	@RequestMapping("/{movieList}")	
	public List<movie> getCataloge(@PathVariable("movieList") String movie){
		
		
		return Collections.singletonList(
				new movie(movie,"CC")
				);
				
				
					}

}
