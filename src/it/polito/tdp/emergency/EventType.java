package it.polito.tdp.emergency;

public enum EventType {
	ARRIVA, // arriva nuovo paziente all'ingresso
	TRIAGE, // al paziente viene assegnato un codice (5 min dopo l'arrivo)
	CHIAMATA, // il paziente entra dal medico
	USCITA, // il paziente esce dallo studio medico
	
	TIMEOUT_WHITE,
	TIMEOUT_YELLOW,
	TIMEOUT_RED,
	
	POLLING;     //periodicamente verifica se ci sono studi liberi e pazienti in attesa
}
