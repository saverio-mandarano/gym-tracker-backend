# 🏋️ Gym Tracker — Back-end

## 📖 Perché nasce

Quando mi alleno in palestra annoto tutto nell'app Note dell'iPhone, dalle sessioni agli esercizi, con peso sollevato, numero di serie e ripetizioni e tempo di recupero.

Funziona, ma ha diversi limiti. Se il telefono si rompesse perderei tutte le note, non riesco a confrontare facilmente un allenamento con quello della settimana precedente e non ho modo di capire se sto progredendo su un esercizio. Dopo qualche mese, poi, lo storico diventa una lunga lista di testo difficile da consultare.

Non avendo trovato un gym tracker gratuito che rispecchiasse il mio modo di allenarmi, ho deciso di svilupparne uno. L'idea è mantenere la stessa semplicità delle note, salvando però i dati in modo strutturato, così da poterli riutilizzare per seguire i miei progressi nel tempo.

È anche un progetto di studio, con cui voglio mettere in pratica Java, Spring Boot e Angular dall'inizio alla fine.

## 🛠️ Tecnologie

- **Java 21**
- **Spring Boot 3.5**
- **Maven**

Il front-end è un progetto separato sviluppato in **Angular**.

## ✅ Cosa fa oggi

Il back-end espone un'API REST che permette di creare, leggere, modificare ed eliminare gli allenamenti. Ogni allenamento contiene i propri esercizi, e per ogni esercizio vengono salvate le serie eseguite con il numero di ripetizioni e il peso utilizzato. Prima del salvataggio, i dati in ingresso vengono validati.

Per ora i dati sono conservati in memoria, mentre il collegamento a un database arriverà in una fase successiva.

## 🎯 Obiettivi

L'obiettivo finale è avere uno strumento che, oltre a registrare gli allenamenti, mi aiuti a migliorare. Voglio poter capire quando è il momento di aumentare il carico, vedere i progressi su ogni esercizio e controllare quanto volume dedico a ciascun gruppo muscolare.
