# 🏋️ Gym Tracker — Back-end

## 📖 Perché nasce

Quando mi alleno in palestra annoto tutto nell'app Note dell'iPhone: sessioni, esercizi, peso sollevato, numero di serie
e di ripetizioni, tempo di recupero, ecc...

Funziona, ma ha diversi limiti. Rompendo il telefono perderei le note, non posso confrontare facilmente un allenamento
con quello della settimana
prima, non vedo se sto progredendo su un esercizio e, dopo qualche mese, lo storico diventa una lunga lista di testo
difficile da consultare.

Non avendo trovato un gym tracker gratuito che rispecchiasse quello che stavo cercando, da qui l'idea di sviluppare
un'app che mantiene la stessa semplicità delle note, ma salva i dati in modo
strutturato, così da poterli riutilizzare per capire come sto andando.

È anche un progetto di studio per mettere in pratica Java/Spring Boot e Angular dall'inizio alla fine.

## 🛠️ Tecnologie

- **Java 21**
- **Spring Boot 3.5**
- **Maven**

Il front-end è un progetto separato sviluppato in **Angular**.

## ✅ Cosa fa oggi

Il back-end espone un'API REST che permette di creare, leggere, modificare ed eliminare gli allenamenti. Ogni
allenamento contiene i suoi esercizi, e ogni esercizio le serie eseguite con relativo numero di ripetizioni e di peso
utilizzato. I dati in ingresso vengono validati prima di
essere salvati.

Per ora i dati sono conservati in memoria, il database verrà collegato in seguito.

## 🎯 Obiettivi

L'obiettivo finale è avere uno strumento che, oltre a registrare gli allenamenti, mi aiuti a **migliorare**: capire
quando aumentare il carico, vedere i progressi su ogni esercizio e controllare quanto volume dedico a ogni gruppo
muscolare.