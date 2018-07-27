package it.errori.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import it.errori.service.LogErrorService;

@RestController
public class LogErrorController {
	private final Logger log = LoggerFactory.getLogger(LogErrorController.class);
	@Autowired
	LogErrorService logS;
	@RequestMapping(value = "log/", method = RequestMethod.GET)
	public String logError() {
		log.debug("controllo okokkkokok");
		
		logS.loggaErrore();
		
		return "{Errore loggato}";
	}
}
