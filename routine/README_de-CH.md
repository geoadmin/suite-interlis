# Test Suite - Routine
Die Routine wurde als gradle-Projekt entwickelt.

## Voraussetzungen
- JAVA Development Kit
- [iG/Check](https://www.interlis.ch/downloads/igcheck) (lokal installiert)

## Getting Started
Das Repository clonen/herunterladen und das Arbeitsverzeichnis wechseln:

```
cd suite-interlis/routine
```

### Die Test Suite ausführen
```
gradlew -Pvendor=<vendor> test
```
Der Parameter ``<vendor>`` kann die Werte ``ilivalidator`` oder ``ig/check`` Enthalten.

Die Ergebnisse stehen in ``/build/reports/tests/test/index.html`` zur Verfügung.

### Die JavaDoc kompilieren
```
gradlew -Pvendor=<vendor> javadoc
```
Die JavaDoc steht in ``/build/docs/javadoc/index.html`` zur Verfügung.

### Muss ein Proxyserver verwendet werden?
```
gradlew -Dhttp.proxyHost=theProxyServer -Dhttp.proxyPort=theProxyPort -Pvendor=<vendor> test
```
### Ist JAVA-JDK nicht im PATH?
```
gradlew -Dorg.gradle.java.home=/pathToJavaJDK -Pvendor=<vendor> test
```
### Ist ics.exe (iG/Check) nicht im PATH?
- Variante 1
```
SET PATH=%PATH%;'pathToics.exe'
gradlew -Pvendor=ig/check test
```
- Variante 2
```
gradlew -Pvendor=ig/check -Pics=pathToics.exe test
```
Der Parameter ``-Pics`` kann zusätzlich benutzt werden, um unterschiedliche Versionen von iG/Check zu testen.

### Andere Versionen des ilivalidators testen
Die Routine ist vorkonfiguriert um den ilivalidator Version 1.10.0 zu testen.
Um andere Versionen des ilivalidators zu testen, muss die Information ``compile 'ch.interlis:ilivalidator:1.10.0'`` in der Datei ``build.gradle`` (unter ``dependencies``) entsprechend angepasst werden.

### Spezifische Tests ausschalten
Alle Test-Typen der Routine sind in der Datei ``build.gradle`` (unter ``test``) gelistet. Um einen Test-Typ auszuschalten, muss die entsprechende Linie auskommentiert werden.

### Datei interlis2.cfg
Spezifische iG/Check-Einstellungen können zusätzlich in der Datei ``interlis2.cfg`` im Verzeichnis ``igcheck2`` gesetzt werden.

### Tests, die direkt im Code ausgeschaltet worden sind
#### ilivalidator Version 1.10.0
| Test | Begründung |
| --- | --- |
| RCO.T01a.xtf | java.lang.NullPointerException |
| RCO.T02b.xtf | Absturz |
| RHE.T01b.xtf | java.lang.IllegalArgumentException statt java.lang.AssertionError. Fehlermeldung ist korrekt |
| RHE.T04a.xtf | java.lang.IllegalArgumentException statt java.lang.AssertionError. Fehlermeldung ist korrekt |
| RKo.T08a.xtf | java.lang.NullPointerException |
| RKo.T08b.xtf | java.lang.NullPointerException |
| RKo.T08c.xtf | java.lang.NullPointerException |
| RKo.T08d.xtf | java.lang.NullPointerException |
| RTO.T02a.xtf | java.lang.IllegalArgumentException statt java.lang.AssertionError. Fehlermeldung ist korrekt |
| RTR.T02a.xtf | Falsche Fehlermeldung |
| RTR.T02b.xtf | Falsche Fehlermeldung |
| RTR.T03a.xtf | Falsche Fehlermeldung |
| RTR.T04a.xtf | Falsche Fehlermeldung |
| RXW.T02a.xtf | Falsche Fehlermeldung |
| RXW.T02e.xtf | Falsche Fehlermeldung |
| RXW.T02f.xtf | Falsche Fehlermeldung |

#### iG/Check Version 2018.0 vom 08.10.2018
| Test | Begründung |
| --- | --- |
| RAt.T11e.xtf | Falsche Fehlermeldung |
| RAt.T11f.xtf | Falsche Fehlermeldung |
| RKo.T03a.xtf | Falsche Fehlermeldung |
| RKo.T03b.xtf | Falsche Fehlermeldung |
| RTO.T06c.xtf | Falsche Fehlermeldung |
| RTR.T02c.xtf | Falsche Fehlermeldung |
| RXW.T01a.xtf | Falsche Fehlermeldung |


