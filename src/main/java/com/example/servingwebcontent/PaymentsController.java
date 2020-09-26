package com.example.servingwebcontent;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PaymentsController {

	@GetMapping("/payments/process")
	public ResponseEntity<?> greeting(){

		try {
			//
			// Send messages
			//

			return ResponseEntity.status(HttpStatus.ACCEPTED).body("Payments processed!");
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error occurred, payments not processed.");
		}
	}

}
