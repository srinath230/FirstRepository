package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
	public class MyRestController {
		@Autowired(required = true)
		private MySampleBean msb;

		@RequestMapping(name = "/") // Jersy Techniques
		public String testing() {
			return "Sample Controller with get mapping " + msb.getDataFromBean();
		}

		@RequestMapping(name = "/", method = RequestMethod.PUT) // Jersy Techniques
		public String testing4() {
			return "Sample Controller with put mapping only for Updating resource on the web";
		}

		@RequestMapping(name = "/", method = RequestMethod.DELETE) // Jersy Techniques
		public String testing5() {
			return "Sample Controller with put mapping only for Deleting resource on the web";
		}

		@PostMapping(name = "/") // Jersy Techniques
		public String testing1() {
			return "Sample Controller with post mapping creating new resource";
		}

		@RequestMapping("/{nameofemp}/") // Jersy Techniques
		public String testing2(@PathVariable String nameofemp) {
			return nameofemp + "Sample Controller with get mapping " + msb.getDataFromBean();
		}


}
