# Vorspann

## HEADERSECTION
|ID|RHE
|:--|:--
|**Bezeichnung**|**HEADERSECTION**
|**Beschreibung**|Für die Validierung des Vorspanns gelten die im [[1]] Kap. 3.3.4 definierten Regeln
|**Details**|<ul><li>Die Angaben ```VERSION``` und ```SENDER``` im Tag ```HEADERSECTION``` sind verbindlich</li><li>Im Element ```MODELS``` müssen alle Datenmodelle (mindestens eines) aufgeführt werden, zu deren Themen Daten vorkommen</li><li>Die Angaben ```NAME```, ```VERSION``` und ```URI``` im Tag ```MODEL``` sind verbindlich</li><li>Die Angabe ```NAME``` muss zwingend der ```ModelDef``` ([[1]] Kap. 2.5.1) im INTERLIS-Datenmodell entsprechen</li><li>Die Angabe ```VERSION``` soll der ```ModelDef``` ([[1]] Kap. 2.5.1) im INTERLIS-Datenmodell entsprechen</li><li>Die Angabe ```URI``` hat für die Datenprüfung keine weitere Bedeutung</li></ul>
|**Referenz**|[[1]] Kap. 2.5.1 und 3.3.4

### Testfälle
###### Vorspann - RHE.T01
|ID|RHE.T01
|:--|:--
|**Bezeichnung**|**Vorspann: XML-Attribute**
|**Beschreibung**|Die Tests müssen prüfen, ob die XML-Attribute ```VERSION``` und ```SENDER``` im Tag ```HEADERSECTION``` vorhanden sind
|**Testvoraussetzung**|[RHE.T01a.xtf](../data/RHE.T01a.xtf), [RHE.T01b.xtf](../data/RHE.T01b.xtf), [RHE.T01c.xtf](../data/RHE.T01c.xtf)
|**Erwartetes Ergebnis**|<ul><li>RHE.T01a.xtf: Fehlermeldung. ```VERSION``` nicht vorhanden</li><li>RHE.T01b.xtf: Fehlermeldung. ```SENDER``` nicht vorhanden</li><li>RHE.T01c.xtf: Fehlermeldung. ```VERSION``` nicht gleich 2.3</li></ul>
|**Referenz**|[[1]] Kap. 3.3.4

###### Vorspann - RHE.T02
|ID|RHE.T02
|:--|:--
|**Bezeichnung**|**Vorspann: Tag MODELS**
|**Beschreibung**|Der Test muss prüfen, ob das Tag ```MODELS``` im Tag ```HEADERSECTION``` vorhanden ist
|**Testvoraussetzung**|[RHE.T02a.xtf](../data/RHE.T02a.xtf)
|**Erwartetes Ergebnis**|<ul><li>RHE.T02a.xtf: Fehlermeldung. Tag ```MODELS``` nicht vorhanden</li></ul>
|**Referenz**|[[1]] Kap. 3.3.4

###### Vorspann - RHE.T03
|ID|RHE.T03
|:--|:--
|**Bezeichnung**|**Vorspann: Sub-Tag MODEL**
|**Beschreibung**|Der Test muss prüfen, ob das Sub-Tag ```MODEL``` im Tag ```MODELS``` vorhanden ist
|**Testvoraussetzung**|[RHE.T03a.xtf](../data/RHE.T03a.xtf)
|**Erwartetes Ergebnis**|<ul><li>RHE.T03a.xtf: Fehlermeldung. Sub-Tag ```MODEL``` nicht vorhanden</li></ul>
|**Referenz**|[[1]] Kap. 3.3.4

###### Vorspann - RHE.T04
|ID|RHE.T04
|:--|:--
|**Bezeichnung**|**Vorspann: XML-Attribute im Sub-Tag MODEL**
|**Beschreibung**|Die Tests müssen prüfen, ob die XML-Attribute ```NAME```, ```VERSION``` und ```URI``` im Sub-Tag ```MODEL``` vorhanden sind
|**Testvoraussetzung**|[RHE.T04a.xtf](../data/RHE.T04a.xtf), [RHE.T04b.xtf](../data/RHE.T04b.xtf), [RHE.T04c.xtf](../data/RHE.T04c.xtf)
|**Erwartetes Ergebnis**|<ul><li>RHE.T04a.xtf: Fehlermeldung. ```NAME``` nicht vorhanden</li><li>RHE.T04b.xtf: Fehlermeldung. ```VERSION``` nicht vorhanden</li><li>RHE.T04c.xtf: Fehlermeldung. ```URI``` nicht vorhanden</li></ul>
|**Referenz**|[[1]] Kap. 3.3.4

###### Vorspann - RHE.T05
|ID|RHE.T05
|:--|:--
|**Bezeichnung**|**Vorspann: Attributswerte in ```NAME```, und ```VERSION```**
|**Beschreibung**|Die Tests müssen prüfen, ob die Werte der Attribute ```NAME``` und ```VERSION``` im Sub-Tag ```MODEL``` der ```ModelDef``` im INTERLIS-Datenmodell entsprechen
|**Testvoraussetzung**|[RHE.T05a.xtf](../data/RHE.T05a.xtf), [RHE.T05b.xtf](../data/RHE.T05b.xtf)
|**Erwartetes Ergebnis**|<ul><li>RHE.T05a.xtf: Fehlermeldung. Wert in ```NAME``` stimmt nicht / Model ``TestSuite`` nicht vorhanden</li><li>RHE.T05b.xtf: Fehlermeldung. Wert in ```VERSION``` stimmt nicht</li></ul>
|**Referenz**|[[1]] Kap. 3.3.4

[1]: bib.md#1-kogis-interlis-2--referenzhandbuch-13042006
