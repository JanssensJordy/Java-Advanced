# Examen JAVA Advanced (31089/1607/1819/1/72)

|                |                    |
|----------------|--------------------|
| Datum          | 2019-04-01         |
| Lector         | D. D'Haese         |
| Toezichters    | P. Possemiers      |
| Student naam   | Janssens Jordy     |
| Student nummer | s103542 |

## Regels voor dit examen

- Dit is een digitaal examen
- Dit examen is 'open boek', d.w.z. je mag gebruik maken van
	- internet
	- cursus theorie
	- cursus oefeningen en oplossingen
- Je mag tijdens het examen met *niemand* communiceren
- Alle vormen van communicatie worden als examenfraude beschouwd
- De monitoring tool moet gedurende de ganse tijd aan staan, geen volledige monitoring = geen punten
- Alle resultaten worden op plagiaat getoetst
- Alle overtredingen, klein of groot, worden aan de examencommissie doorgegeven

## Verloop van het examen

1. Sluit programma’s die je niet nodig hebt (programma's om te communiceren zijn niet toegestaan)
1. Start examonitoring tool op: geen monitoring = geen punten
1. Plaats jouw naam en s-nummer bovenaan dit bestand waar er staat `JOUW NAAM HIER` en `JOUW S-NUMMER HIER`
1. Hernoem dit bestand als `Exam_Javadv_<JOUW S-NUMMER HIER>.md`
1. Lees de opdracht tot het einde, tekst `in dit lettertype` moet je letterlijk opvatten
1. Voer opdracht uit
1. Dien dit bestand in via https://toets.ap.be/. Bij een correct ingediende opdracht verschijnt dit icoontje:

   ![OK](Media/OK.png)

1. Aftekenen + verlaat lokaal

## Formattering

Het is voldoende om alle ingeleverde code te formatteren met een default formatter (`ALT+SHIFT+P` in VS Code).

## Puntenverdeling

Het examen wordt berekend op 20 punten. Er zijn 10 vragen en elke vraag staat op 2 punten.

## Opdracht
### Vraag 1 - Maven project
#### Gegeven:

- `group-id`, `artifact-id` en `name` = `be.ap.javadv.exam_01`
- `version` = `1.0-SNAPSHOT`
- Archetype `maven-archetype-quickstart`

#### Opgave:

- Maak een Maven project aan met opgegeven specificaties
- Voeg de dependency toe met artifactId `joda-time` (versie `2.10.1`)
- Voeg onderstaande plugin toe aan het `POM.xml` bestand om de applicatie te kunnen starten met `mvn compile exec:java`.

```xml
<plugin>
	<groupId>org.codehaus.mojo</groupId>
	<artifactId>exec-maven-plugin</artifactId>
	<version>1.6.0</version>
	<executions>
		<execution>
			<goals>
				<goal>java</goal>
			</goals>
		</execution>
	</executions>
	<configuration>
		<mainClass>be.ap.javadv.exam_01.App</mainClass>
	</configuration>
</plugin>
```

#### Oplossing:

Plak hieronder jouw `POM.xml` bestand:

```xml (POM.xml)
<?xml version="1.0" encoding="UTF-8"?>
<?xml version="1.0" encoding="UTF-8"?>

<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>

  <groupId>be.ap.javadv.exam_01</groupId>
  <artifactId>be.ap.javadv.exam_01</artifactId>
  <version>1.0-SNAPSHOT</version>

  <name>be.ap.javadv.exam_01</name>
  <!-- FIXME change it to the project's website -->
  <url>http://www.example.com</url>

  <properties>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    <maven.compiler.source>1.8</maven.compiler.source>
    <maven.compiler.target>1.8</maven.compiler.target>
  </properties>

  <dependencies>

    <dependency>
      <groupId>org.wso2.orbit.joda-time</groupId>
      <artifactId>joda-time</artifactId>
      <version>2.9.4.wso2v1</version>
    </dependency>

    <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>4.11</version>
      <scope>test</scope>
    </dependency>
  </dependencies>

  <build>
    <pluginManagement><!-- lock down plugins versions to avoid using Maven defaults (may be moved to parent pom) -->
      <plugins>
        <!-- clean lifecycle, see https://maven.apache.org/ref/current/maven-core/lifecycles.html#clean_Lifecycle -->
        <plugin>
          <artifactId>maven-clean-plugin</artifactId>
          <version>3.1.0</version>
        </plugin>
        <!-- default lifecycle, jar packaging: see https://maven.apache.org/ref/current/maven-core/default-bindings.html#Plugin_bindings_for_jar_packaging -->
        <plugin>
          <artifactId>maven-resources-plugin</artifactId>
          <version>3.0.2</version>
        </plugin>
        <plugin>
          <artifactId>maven-compiler-plugin</artifactId>
          <version>3.8.0</version>
        </plugin>
        <plugin>
          <artifactId>maven-surefire-plugin</artifactId>
          <version>2.22.1</version>
        </plugin>
        <plugin>
          <artifactId>maven-jar-plugin</artifactId>
          <version>3.0.2</version>
        </plugin>
        <plugin>
          <artifactId>maven-install-plugin</artifactId>
          <version>2.5.2</version>
        </plugin>
        <plugin>
          <artifactId>maven-deploy-plugin</artifactId>
          <version>2.8.2</version>
        </plugin>
        <!-- site lifecycle, see https://maven.apache.org/ref/current/maven-core/lifecycles.html#site_Lifecycle -->
        <plugin>
          <artifactId>maven-site-plugin</artifactId>
          <version>3.7.1</version>
        </plugin>
        <plugin>
          <artifactId>maven-project-info-reports-plugin</artifactId>
          <version>3.0.0</version>
        </plugin>
        <plugin>
	<groupId>org.codehaus.mojo</groupId>
	<artifactId>exec-maven-plugin</artifactId>
	<version>1.6.0</version>
	<executions>
		<execution>
			<goals>
				<goal>java</goal>
			</goals>
		</execution>
	</executions>
	<configuration>
		<mainClass>be.ap.javadv.exam_01.App</mainClass>
	</configuration>
        </plugin>
      </plugins>
    </pluginManagement>
  </build>
</project>

```

### Vraag 2 - Enumeraties
#### Gegeven

- Namespace = `be.ap.javadv.exam_01`
- Een `State` die de volgende waarden kan aannemen: `SCHEDULED`, `WAITING_FOR_FIRST_VISIT`, `WAITING_FOR_NEW_VISIT`, `CONSULTATION_ON_GOING`, `DISMISSED`, `LOST`
- Een `Priority` die de volgende waarden kan aannemen: `MEDIUM`, `HIGH`, `LOW`

#### Opgave

- Maak de enumeratie klassen aan volgens opgegeven specificaties
- Maak een `App` klasse met daarin de methode `printEnumValues`
- Zorg ervoor dat de methode `printEnumValues`, op generieke wijze, de waarden van een opgegeven enumeratie afdrukt. Bijvoorbeeld de onderstaande code:

	```java
	printEnumValues(State.class);
	printEnumValues(Priority.class);
	```
	moet het volgende resultaat opleveren:
	```
	State: 
		SCHEDULED
		WAITING_FOR_FIRST_VISIT
		WAITING_FOR_NEW_VISIT
		CONSULTATION_ON_GOING
		DISMISSED
		LOST

	Priority: 
		LOW
		MEDIUM
		HIGH
	```

#### Oplossing

Plak hieronder de *volledige* inhoud van `State.java`:

```java (State.java)
package be.ap.javadv.exam_01;

enum State {
    SCHEDULED,
	WAITING_FOR_FIRST_VISIT,
	WAITING_FOR_NEW_VISIT,
	CONSULTATION_ON_GOING,
	DISMISSED,
	LOST
  }
```

Plak hieronder de *volledige* inhoud van `Priority.java`:

```java (Priority.java)
package be.ap.javadv.exam_01;

enum Priority {
    LOW,
	MEDIUM,
	HIGH
  }
```

Plak hieronder de methode `printEnumValues`:

```java (App.java - printEnumValues)
private static void printEnumValues(Class<Enum<?>> enumClass){
        for (Object value : enumClass.values()) {
            System.out.println(value);
        } 
    }
```

### Vraag 3 - Patiënt
#### Gegeven

- Een `Patient` heeft de volgende eigenschappen: `id`, `patientsTotal`, `state`, `patientsDismissed`, `patientsLost`, `name` en `age` en de methode `generateId`
#### Opgave

- Maak een klasse `Patient` aan volgense bovenstaande specificaties
- Zorg ervoor dat de velden enkel toegankelijk zijn via getters en setters
- Denk na over de toegankelijkheid en het statisch karakter van de velden en methoden
- De velden `patientsTotal`, `patientsDismissed`, `patientsLost` moeten op de waarde `0` geïnitialiseerd worden
- Zorg ervoor dat een patiënt op drie manieren gecreëerd kan worden:

	```java
	Patient patient1 = new Patient ();
	Patient patient2 = new Patient ( "Seli Peeters" );
	Patient patient3 = new Patient ( "Seli Peeters", 32 );
	```
	Indien de naam of de leeftijd niet opgegeven wordt, moeten deze velden ingesteld worden met de waarde `null`.
- Tijdens het creëren van een object van deze klasse, moet de methode `generateId` aangeroepen worden (de methode moet voorlopig nog niets doen)
- Zorg ervoor dat `generateId` slechts één keer wordt aangeroepen

#### Oplossing

Plak hieronder alle veld-declaraties voor de klasse `Patient`:

```java (Patient.java - Fields)
    private static int numberCounter = 1;
    private String id;
    private static int patientsTotal = 0;
    private State state;
    private static int patientsDismissed = 0;
    private static int patientsLost = 0;
    private String name;
    private Integer age;
```
Plak hieronder alle constructors voor de klasse `Patient`:

```java (Patient.java - Constructors)
public Patient(String name, Integer age) {
        setName(name);
        setAge(age);
        generateId();
    }
    public Patient(String name) {
        this(name,null);
    }
    public Patient() {
        this(null, null);
    }
```
### Vraag 4 - Hashes
#### Gegeven

- Een klasse `Patient` met de velden `name` en `age`

#### Opgave

- Overschrijf de nodige `Object`-methoden van de `Patient` klasse zodat de onderstaande code:

	```
	Patient patient3 = new Patient("Seli Peeters", 32);
	Patient patient4 = new Patient("Seli Peeters", 32);

	System.out.println("Are patient3 and patient4 the same patient?");
	System.out.println("The answer is " + (!patient3.equals(patient4) ? "No." : "Maybe."));

	Set<Patient> patients = new HashSet<>();
	patients.add(patient3);
	patients.add(patient4);

	System.out.println(
		"Placing patient3 and patient4 in a set results " +
		"in a cardinality of " + patients.size());
	```
	dit resultaat weergeeft:
	```
	Are patient3 and patient4 the same patient?
	The answer is Maybe.
	Placing patient3 and patient4 in a set results in a cardinality of 1
	```

#### Oplossing

Plak hier de code die je voor deze opgave hebt moet *toevoegen* aan `Patients.java` exclusief de eventuele `import`-statements:

```java (Patient.java - Hashes)
    @Override
    public boolean equals(Object o) {
        // If the object is compared with itself then return true   
        if (o == this) { 
            return true; 
        } 
  
        /* Check if o is an instance of Complex or not 
          "null instanceof [type]" also returns false */
        if (!(o instanceof Patient)) { 
            return false; 
        } 
          
        // typecast o to Complex so that we can compare data members  
        Patient c = (Patient) o; 
          
        // Compare the data members and return accordingly  
        return this.getName().compareTo(c.getName()) == 0
                && Integer.compare(this.getAge(), c.getAge()) == 0; 
    }

    @Override
    public int hashCode() {
        return this.getName().hashCode() * this.getAge();
    }
```

### Vraag 5 - Mapping
#### Gegeven

- Set van 4 patiënten `patients`:

		patients.add(new Patient ("Seli Peeters", 32 ));
		patients.add(new Patient ("Erika Bomqkvist", 32 ));
		patients.add(new Patient ("Younes Abad", 93 ));
		patients.add(new Patient ("Euler Maine", 93 ));

#### Opgave

- Schrijf code om de set van patiënten te groeperen naar leeftijd
- Bewaar het resultaat van deze groepering in een HashMap `Map <Integer, List<Patient>> patientsByAge`
- Probeer elegante code te schrijven door gebruik te maken van methode `groupingBy` van de `java.util.stream.Collectors` klasse
- Gebruik een traditionele foreach lus om per leeftijd de lijst van patiënten naar de console af te drukken
- Pas zonodig de klasse `Patient` aan zodat je hetvolgende te zien krijgt als resultaat:

	```
	Patients with age 32: [Erika Bomqkvist, Seli Peeters]
	Patients with age 93: [Younes Abad, Euler Maine]
	```

#### Oplossing

Plak hieronder de code (uit de `App` klasse) die je hebt gebruikt om bovenstaand resultaat te bekomen:

```java (App.java - Mapping)
    public static void main( String[] args )
    {
        Set<Patient> patients = new HashSet<>();
        patients.add(new Patient ("Seli Peeters", 32 ));
        patients.add(new Patient ("Erika Bomqkvist", 32 ));
        patients.add(new Patient ("Younes Abad", 93 ));
        patients.add(new Patient ("Euler Maine", 93 ));

        HashMap <Integer, List<Patient>> patientsByAge = new HashMap <Integer, List<Patient>>(patients.stream()
            .collect(Collectors.groupingBy(Patient::getAge)));

            for(Map.Entry<Integer, List<Patient>> entry : patientsByAge.entrySet()) {
                Integer age = entry.getKey();
                List<Patient> patientsWithAge = entry.getValue();
                System.out.println("Patienten met leeftijd " + age + ":" + patientsWithAge);
            }
}
```

### Vraag 6 - Statussen en Visites
#### Gegeven

- Klasse `Patient`
- De entiteit `Visit` heeft de eigenschap `date` van het type `org.joda.time.LocalDate` die de datum van het (gepland) bezoek moet bijhouden
- De entiteit `StateChange` heeft de eigenschappen `timeChanged` (een `org.joda.time.DateTime`), `from` (`State`) en `to` (`State`)

#### Opgave

- Maak de nodige klassen aan volgens bovenstaande specificaties
- Zorg ervoor dat objecten van de types `Visit` en `StateChange` niet kunnen worden gecreëerd alvorens een overeenkomstig object van het type `Patient` werd aangemaakt
- De constructor van `StateChange` moet een `from` status en een `to` status aanvaarden
- De constructor van `Visit` moet een datum aanvaarden
- Het veld `timeChanged` moet automatisch ingesteld worden op de huidige tijd tijdens het creëren van een object van het type `StateChange`
- Voeg de nodige setters en getters toe

#### Oplossing

Plak hieronder de *volledige* declaratie voor klasse `Visit`:

```java (Patient.java - Visit)
    public class Visit {
        private LocalDate date;
        public Visit(LocalDate date) {
            setDate(date);
        }
        /**
         * @param date the date to set
         */
        public void setDate(LocalDate date) {
            this.date = date;
        }
        /**
         * @return the date
         */
        public LocalDate getDate() {
            return date;
        }
    }
```

Plak hieronder de *volledige* declaratie voor klasse `StateChange`:

```java (Patient.java - StateChange)
public class StateChange {
        private DateTime timeChanged;
        private State from;
        private State to;
        public StateChange(State from, State to) {
            setFrom(from);
            setTo(to);
            setTimeChanged(DateTime.now());
        }
        /**
         * @param from the from to set
         */
        public void setFrom(State from) {
            this.from = from;
        }
        /**
         * @param to the to to set
         */
        public void setTo(State to) {
            this.to = to;
        }
        /**
         * @param timeChanged the timeChanged to set
         */
        public void setTimeChanged(DateTime timeChanged) {
            this.timeChanged = timeChanged;
        }
        /**
         * @return the from
         */
        public State getFrom() {
            return from;
        }
        /**
         * @return the to
         */
        public State getTo() {
            return to;
        }
        /**
         * @return the timeChanged
         */
        public DateTime getTimeChanged() {
            return timeChanged;
        }
    }
```

### Vraag 7 - Identificatie
#### Gegeven

- Klasse `Patient`
- Methode `generateId`

#### Opgave

- Implementeer de methode `generateId` in klasse `Patient` zodat bij het aanroepen ervan een ID wordt gegenereerd voor een patiënt
- De id-codes (String) moeten oplopen als `CLIN_001`, `CLIN_002`, enz&hellip;
- Wanneer een object van het type `Visit` wordt afgedrukt moet iets gelijkaardigs verschijnen:
	```
	Visit of 2019-04-01 (Patient CLIN_003)
	```
- Wanneer een object van het type `StateChange` wordt afgedrukt moet iets gelijkaardigs verschijnen:
	```
	State for patient CLIN_003 changed from WAITING_FOR_FIRST_VISIT to CONSULTATION_ON_GOING on 2019-04-01 12:34
	```
- Schrijf test code om voor een `Patient ("Friedrich Agust", 12)` een visite van `2019-04-01` aan te maken en een `StateChange` van `SCHEDULED` --> `WAITING_FOR_NEW_VISIT` aan te maken en om de resulterende objecten af te drukken naar de console.

#### Oplossing

Plak hier de code voor de methode `generateId`:

```java (Patient.java - GenerateID)
private void generateId(){
        this.id = String.format("CLIN_%03d", numberCounter ++);
    }
```

Plak hier de `toString` methode voor `Visit`: 
```java (Patient.java - Visit_toString)
        @Override
        public String toString() {
            return "Visit of " + getDate() + " (Patient " + getId() + ")";
        }
```

Plak hier de `toString` methode voor `StateChange`:

```java (Patient.java - StateChange_toString)
@Override
        public String toString() {
            return "State for patient " + getId() + " changed from " + getFrom() + " to " + getTo() + " on " + getTimeChanged();
        }
``` 

Plak hieronder de gevraagde test code:

```java (App.java - Identificatie)
    public static void main( String[] args )
    {
        Patient august = new Patient("Friedrich Agust", 12);
        Patient.Visit newvisit = august.new Visit(new LocalDate(2019,04,01));
        Patient.StateChange newstate = august.new StateChange(State.SCHEDULED, State.WAITING_FOR_NEW_VISIT);

        System.out.println(august);
        System.out.println(newvisit);
        System.out.println(newstate);
    }
```

### Vraag 8 - Partitions
#### Gegeven

- Een nieuw Maven Project met namespace `be.ap.javadv.exam_02`

#### Opgave

- Voeg nu de nodige dependencies toe om de `javafx.controls` en `javafx.graphics` modules te laden
- Maak een toepassing/hoofdklasse `Partitions.java` aan die een taartdiagram toont
- Het diagram moet de relatieve grootte van de partities van jouw harde schijf laat zien:

   ![Partitions](Media/Partitions.png)
- Haal de data op via een methode `getPartitionData` binnen de hoofdklasse
- Probeer waar mogelijk gebruik te maken van streams

#### Oplossing

Plak hieronder de dependencies die je hebt toegevoegd zoals ze in de `POM.xml` verschijnen:

```xml (POM.xml - JavaFX)
            <dependency>
            <groupId>org.openjfx</groupId>
            <artifactId>javafx-controls</artifactId>
            <version>11.0.2</version>
        </dependency>
        <dependency>
            <groupId>org.openjfx</groupId>
            <artifactId>javafx-graphics</artifactId>
            <version>11.0.2</version>
        </dependency>
        <dependency>
            <groupId>org.openjfx</groupId>
            <artifactId>javafx-media</artifactId>
            <version>11.0.2</version>
        </dependency>
```

Plak hieronder de *volledige* inhoud van de enige klasse `Partitions.java`:

```xml (Partitions.java)
package be.ap.javadv.exam_02;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.stage.Stage;

import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Partitions extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setWidth(500);
        stage.setHeight(500);

        Scene scene = new Scene(new Group());
        stage.setTitle("Partitions");

        ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList();

        // Can replace this with 'foreach' loop, just practicing my iterators
        Iterator<Map.Entry<String,Long>> it = this.getDiskSpace().entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            pieChartData.add(new PieChart.Data(pair.getKey().toString(), (long)pair.getValue()));
        }

        final PieChart chart = new PieChart(pieChartData);
        chart.setTitle("Disk Sizes");

        ((Group) scene.getRoot()).getChildren().add(chart);

        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
    }

    public Map<String, Long> getDiskSpace() {
        Map<String, Long> diskSizes = new HashMap<>();

        for (Path root: FileSystems.getDefault().getRootDirectories()) {

            System.out.print(root.toString() + ": ");
            try {
                FileStore store = Files.getFileStore(root);
                diskSizes.put(root.toString(), store.getTotalSpace());

                System.out.println("total=" + store.getTotalSpace());
            } catch (IOException e) {
                System.out.println("error querying space: " + e.toString());
            }
        }

        return diskSizes;
    }

}

```

### Vraag 9 - Processen
#### Gegeven

- Een nieuw Maven Project met namespace `be.ap.javadv.exam_03`

#### Opgave

- Maak een JavaFX toepassing die een lijst weergeeft van de actieve processen op jouw PC:

   ![Processes](Media/Processes.png)
- De titel van de applicatie en naam van de (enige) hoofdklasse is `ProcessViewer`. De scene graph moet er als volgt uitzien:

	```
	Stage stage
		└── Scene scene
			└── ListView<ProcessHandle> processListView
	```

- Zoek zelf uit hoe je een lijst van de processen moet ophalen uit jouw systeem
- Als je jouw lijst van processen hebt, dan moet je deze filteren op processen waarvoor een gebruiker gekend is
- Zorg dat de process id en het path (`command`) getoond worden zoals in de afbeelding hierboven
- Maak voor het binden van de data aan de listview gebruik van de constructie `setCellFactory(p -> new ListCell<ProcessHandle>() {...` en overschrijf de `updateItem` methode van de callback.
- Geef aan dat het venster minimaal 350 pixels breed mag zijn.

#### Oplossing

Plak hieronder de *volledige* inhoud van `ProcessViewer.java`:

```java (ProcessViewer.java)
package be.ap.javadv.exam_03;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

public class ProcessViewer extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    private ListView<String> getProcessInfo() {
        ListView<String> processListView = new ListView<>();

        processListView.setCellFactory(p -> new ListCell<>() {
            @Override
            protected void updateItem(ProcessHandle item, boolean empty) {
                super.updateItem(item, empty);

                if (item == null || empty) {
                    setDisable(false);
                    setGraphic(null);
                } else {
                    setDisable(true);
                    ProcessHandle.allProcesses()
                .filter(p -> p.info().user().isPresent())
                .forEach(p -> processListView.getItems().add(
                        String.format("%d (%s)", p.pid(), p.info().command().orElse(null))));
                }}});

        return processListView;
    }


    @Override
    public void start(Stage stage) throws Exception {
        ListView<String> processListView = getProcessInfo();

        Group group = new Group(processListView);
        Scene scene = new Scene(group);

        stage.setTitle("ProcessViewer");
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.setHeight(800);
        stage.setWidth(1000);
        processListView.setMinWidth(stage.getWidth() - 15);
        processListView.setMinHeight(stage.getHeight() - 15);
        stage.show();

    }
}

```

### Vraag 10 - Surfing Documentation
#### Gegeven

- De online documentatie voor JavaFX 11
- De online documentatie voor JDK 11

#### Opgave 1

- Zoek de documentatie pagina voor klasse `SVGPath`
- In de voorbeeld code van de documentatie staat een methode beschreven
- Deze methode wordt ook in andere klassen gebruikt en één van deze klassen heeft een `Map` als argument
- Heb je deze klasse gevonden, dan zoek ja naar de enige methode die een Set<T> teruggeeft
- Klik door op dit type T
- Geef aan wanneer de constructor van dit type een `IllegalArgumentException` geeft

#### Opgave 2

- Vertrekkende van de klasse `LinkedHashSet`
- Zoek in de beschrijving welke wrapper methode er moet gebruikt worden om een 'synchrone' implementatie van deze klasse te bekomen
- Kopieer het voorbeeld uit de documentatie van hoe deze wrapper methode gebruikt kan worden

#### Oplossing

Kopieer hier de voorwaarde uit de documentatie om een `IllegalArgumentException` te geven (je moet het niet vertalen):

``` (Documentation_1)
Throws:
IllegalArgumentException - if one of the given mime types is already assigned to another DataFormat.
```

Kopieer hier het voorbeeld uit de documentatie om de wrapper methode te gebruiken:

``` (Documentation_2)
Set s = Collections.synchronizedSet(new LinkedHashSet(...));
```

Succes!!!
