package it.cardinali.log.errori.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.cardinali.log.errori.domain.LogError;
import it.cardinali.log.errori.repository.LogErrorRepository;

@Service
public class LogErrorService {
@Autowired
LogErrorRepository repo;

	public void loggaErrore() {
		LogError err = new LogError("codice1", "errore del cacxcci");
		repo.save(err);
	}
	
}
