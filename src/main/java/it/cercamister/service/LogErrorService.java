package it.cercamister.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.cercamister.domain.LogError;
import it.cercamister.repository.LogErrorRepository;

@Service
public class LogErrorService {
@Autowired
LogErrorRepository repo;

	public void loggaErrore() {
		LogError err = new LogError("codice1", "errore del cacxcci");
		repo.save(err);
	}
	
}
