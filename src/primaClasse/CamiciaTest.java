package primaClasse;

public class CamiciaTest { // "Test" si aggiunge perchè serve per testare il programma

	public static void main(String[] args) {
		// public: dovendo avviare il programma, deve esserlo per forza
		// static: rende il metodo main funzionante senza dover creare un'oggetto di tipo CamiciaTest
		// void: essendo il primo metodo a partire, non può fornire valori di ritorno "a monte"
		// main: nome del metodo, da scrivere SEMPRE COSì
		// String[] args: fossile informatico
		
		// compiti di competenza del main():
		// 1) creare instante/oggetti
		// 2) lanciare metodi
		// 3) inizializzare variabili
		Camicia miaCamicia; // dichiarazione di un oggetto di tipo Camicia, ho creato un riferimento
		miaCamicia = new Camicia(); // creo l'oggetto di tipo Camicia con un riferimento miaCamicia
		miaCamicia.display(); // invoco il metodo public display() tramite il riferimento
		Camicia tuaCamicia = new Camicia(); // dichiarazione e creazione di un altro oggetto di tipo Camicia con 		riferimento a tuaCamicia
		tuaCamicia.camiciaID = 1234; // assegno un valore alla variabile camiciaID di tuaCamicia
		tuaCamicia.descrizione = "Dedicata ai mondiali di calcio 2026";
		tuaCamicia.codiceColore = 'B';
		tuaCamicia.prezzo = 75.33; // i decimali si scrivono col punto
		tuaCamicia.disponibili = 90;
		tuaCamicia.display(); 
	}

}
