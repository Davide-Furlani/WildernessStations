# Wilderness Stations Web App

#### Davide Furlani, Jacopo Zagoli

## Descrizione dell'applicazione e assunzioni
WildernessStations è una applicazione web che consente di controllare tutte le stazioni meteorologiche dispiegate sul territorio.  
Tramite questa applicazione, è possibile visualizzare tutte le stazioni, avere una panoramica dei dati raccolti complessivamente e
vedere nel dettaglio i dati raccolti da una singola stazione, cercare una stazione in particolare e aggiungere o modificare una stazione.  
Trattandosi di un progetto didattico, abbiamo scelto di non implementare un sistema di autenticazione e di autorizzazione, comune a
molte applicazioni, ma di focalizzarci su features specifiche riguardanti questo ambito particolare.  
Inoltre, dal momento che le stazioni non sono state implementate a livello software, abbiamo assunto che i dati siano già stati raccolti,
elaborati e inviati al centro di controllo, e che si trovino quindi all'interno del database.

## Scenari

#### 1) Visualizzazione dell'elenco di tutte le stazioni dispiegate
- Funzionamento:
  La pagina mostra una griglia di tutte le stazioni, con il nome e lo stato di ciascuna (HomePage).
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
  Se l'id digitato corrisponde a una stazione presente nel DB allora l'applicazione mostra una pagina dedicata alla stazione contenente tutti i dati relativi.
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
  È presente un bottone per modificare i dati della stazione, uno per visualizzare una tabella con i dati raccolti finora e uno per visualizzare informazioni relative ai dati raccolti
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
  La pagina mostra tre campi: uno per il nome, uno per la latitudine e uno per la longitudine. Inseriti i tre dati
  l'utente deve confermare l'inserimento premendo il pulsante "Save". A questo punto verrà inserito nel DB una stazione con lo stato "spento".
- Cosa può andare storto:
  Se l'utente inserisce dei valori nel formato sbagliato viene mostrato un avviso e la stazione non viene inserita.
- Altre attività:
  Nella stessa pagina sono presenti altri componenti che permettono di navigare tra le altre funzionalità.
- Stato del sistema al completamento:
  La stazione è stata inserita nel DB, l'applicazione mostra la pagina della stazione appena inserita

#### 7) Modifica dei dati di una stazione
- Assunzioni iniziali:
  L'utente ha scelto di modificare una stazione tramite la pagina di visualizzazione della stazione.
- Funzionamento:
  La pagina mostra quattro campi: uno per il nome, uno per la latitudine, uno per la longitudine e l'ultimo per lo stato, contenenti i valori correnti. L'utente ha la possibilità di modificare i valori. Deve poi confermare la modifica premendo il pulsante "submit". A questo punto verrà modificata nel DB la stazione scelta.
- Cosa può andare storto:
  se l'utente inserisce dei valori nel formato sbagliato viene mostrato un avviso e la stazione non viene aggiornata.
- Altre attività:
  Nella stessa pagina sono presenti altri componenti che permettono di navigare tra le altre funzionalità.
- Stato del sistema al completamento:
  La stazione è stata modificata nel DB, l'applicazione mostra la pagina della stazione.

## Tests

### Test di unità
Per ora, l'applicazione non ha una logica di business complessa: la maggior parte del codice si occupa di
recuperare e modificare dati presenti nel database. Dal momento che l'interfaccia grafica viene testata con Selenium,
i test di unità controllano se i metodi per interagire con il database operino in maniera corretta.  
Questi test sono nel file 'EntitiesTest', implementati con Junit, e più precisamente sono i seguenti:
- saveStation
- allStations
- existsStation
- saveMeasurement
- measurementsInfo

Eseguendo i test con la coverage analysis di IntelliJ, notiamo che sono state testate il 100% delle classi
nello scope e il 62% dei metodi nello scope. Questo perché i metodi che non sono testati sono setter e getter
triviali.

### Acceptance tests
Gli acceptance test sono stati implementati tramite selenium e page object. È presente almeno un test per ogni scenario.

#### AddStationTest
In questa classe sono presenti tre metodi:
- addStationTest
- wrongStationDataTest
- emptyFieldsTest

Tutti partono dalla homepage e navigano fino alla pagina d'inserimento della stazione.
Il primo inserisce all'interno del form il nome, la latitudine e la longitudine della stazione e invia il form.
Trovandosi nella pagina della stazione appena inserita, controlla se il nome della stazione corrisponde a quello previsto.  
Il secondo e il terzo test invece, inseriscono rispettivamente dati errati e nessun dato nel form e cercano d'inviarlo.
Poi verificano che nessuna stazione venga inserita e che i campi di input mostrino un avviso.