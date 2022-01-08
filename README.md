# Weather station Web App
#### Davide Furlani, Jacopo Zagoli

## Scenari
#### 1) Visualizzazione dell'elenco di tutte le stazioni dispiegate
- Funzionamento:
  La pagina mostra una griglia di tutte le stazioni (HomePage).
- Cosa può andare storto:
  Se nessuna stazione è presente nel DB allora la pagina mostra un avviso.
- Altre attività:
  Nella stessa pagina sono presenti altri componenti che permettono di navigare tra le altre funzionalità.
- Stato del sistema al completamento:
  La griglia è visualizzata correttamente ed è possibile compiere altre azioni.

#### 2) Ricerca stazione per id
- Assunzioni iniziali:
  L'applicazione web mostra la HomePage.
- Funzionamento:
  L'utente scrive nella barra di ricerca l'id della stazione e preme il pulsante "cerca".
  Se l'id digitato corrisponde ad una stazione presente nel DB allora l'applicazione mostra una pagina dedicata alla stazione contenente tutti i dati relativi.
- Cosa può andare storto:
  Se l'id non corrisponde a nessuna stazione allora la pagina mostra un avviso.
- Altre attività:
  Nella stessa pagina sono presenti altri componenti che permettono di navigare tra le altre funzionalità.
- Stato del sistema al completamento:
  L'applicazione mostra la pagina relativa alla stazione cercata oppure un messaggio di errore.

#### 3) Pagina info stazione
- Assunzioni iniziali:
  L'utente ha eseguito una ricerca o ha cliccato una stazione sulla griglia della HomePage.
- Funzionamento:
  La pagina mostra tutti i dati relativi alla stazione: id, nome, posizione, stato (acceso, spento).
- Altre attività:
  E' presente un bottone per modificare i dati della stazione, uno per visualizzare una tabella con i dati raccolti finora e uno per visualizzare i grafici realitivi ai dati raccolti
  Nella stessa pagina sono presenti altri componenti che permettono di navigare tra le altre funzionalità.
- Stato del sistema al completamento:
  L'applicazione mostra la pagina relativa alla stazione corrente.

#### 4) Visualizzazione dei dati raccolti da una stazione
- Assunzioni iniziali:
  L'utente dalla pagina di una stazione ha cliccato sul pulsante per visualizzare tutti i dati raccolti da quella stazione.
- Funzionamento:
  La pagina mostra una tabella contenente tutti i dati raccolti finora: una riga per ogni timestamp e una colonna per ogni tipologia di dato raccolto.
- Cosa può andare storto:
  se per la stazione non sono presenti dati, la tabella sarà vuota e viene mostrato un avviso.
- Altre attività:
  È possibile ordinare la tabella in ordine crescente o decrescente dei timestamp.
- Stato del sistema al completamento:
  L'applicazione mostra la tabella dei dati richiesti.

#### 5) Visualizzazione riassuntiva dei dati raccolti
- Assunzioni iniziali:
  L'utente ha scelto di visualizzare la schermata riassuntiva dei dati tramite il menù di navigazione.
- Funzionamento:
  La pagina mostra una visualizzazione d'insieme dei dati raccolti: il numero di misurazioni ricevute, il numero di stazioni che hanno
  inviato dati, e il minimo, massimo e media su ogni tipologia di dati che vengono ricevuti.
- Altre attività:
  Nella stessa pagina sono presenti altri componenti che permettono di navigare tra le altre funzionalità.
- Stato del sistema al completamento:
  L'applicazione mostra la pagina richiesta.

#### 6) Aggiunta di una stazione al DB
- Assunzioni iniziali:
  L'utente ha scelto di aggiungere una stazione tramite il menù di navigazione.
- Funzionamento:
  La pagina mostra tre campi: uno per il nome, uno per la latitudine e uno per la longitudine. Inseriti i tre dati l'unte deve confermare l'inserimento premendo il pulsante "Save". A questo punto verrà inserito nel DB una stazione con lo stato "spento".
- Cosa può andare storto:
  se l'utente inserisce dei valori nel formato sbagliato viene mostrato un avviso e la stazione non viene inserita.
- Altre attività:
  Nella stessa pagina sono presenti altri componenti che permettono di navigare tra le altre funzionalità.
- Stato del sistema al completamento:
  La stazione è stata inserita nel DB, l'applicazione mostra la pagina della stazione appena inserita

#### 7) Modifica dei dati di una stazione
- Assunzioni iniziali:
  L'utente ha scelto di modificare una stazione tramite la pagina di visualizzazione dellla stazione.
- Funzionamento:
  La pagina mostra quattro campi: uno per il nome, uno per la latitudine, uno per la longitudine e l'ultimo per lo stato, contententi i valori correnti. L'utente ha la possibilità di modificare i valori. Deve poi confermare la modifica premendo il pulsante "submit". A questo punto verrà modificata nel DB la stazione scelta.
- Cosa può andare storto:
  se l'utente inserisce dei valori nel formato sbagliato viene mostrato un avviso e la stazione non viene aggiornata.
- Altre attività:
  Nella stessa pagina sono presenti altri componenti che permettono di navigare tra le altre funzionalità.
- Stato del sistema al completamento:
  La stazione è stata modificata nel DB, l'applicazione mostra la pagina della stazione.
