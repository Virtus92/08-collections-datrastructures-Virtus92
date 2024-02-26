# Datenstrukturen


## Aufgabe: Mengenlehre

Gegeben sind drei Zahlenmengen A, B, C.

A = { 1, 3, 5 }
B = { 3, 5, 7 }
C = { 5, 7, 9 }

Berechne möglichst effizient die Vereinigungsmenge von A ∪ B ∪ C sowie alle möglichen Schnittmengen und Differenzmengen der drei Zahlenmengen. Du kannst davon ausgehen, dass alle Mengen gleich groß sind.

Verwende dazu die bereits vorhandene Klasse "HashSet" und deren Methoden. Du sollst die Logik, wie sich z.B. eine Vereinigungsmenge bildet NICHT selbst programmieren. Die Klasse HashSet kann das schon.

Gestalte deine Methoden so, dass sie zur Berechnung der Ergebnismenge den selben return Typ haben wie die Parameter. Dadurch können die Methodenaufrufe beliebig oft geschachtelt werden.

z.B.: getUnionList(a, getIntersectionList(b,c)); // das sollte funktionieren und heißt A ∪ (B ∩ C)

### Abnahmekriterien

- Die Variablennamen sind aussagekräftig
- Die gewählten Datentypen sind sinnvoll
- Das Programm erfüllt folgende Anforderungen: 
  - Ausgabe der Union aller 2er Kombinationen: A ∪ B, A ∪ C, B ∪ C
  - Ausgabe der Intersektion aller 2er Kombinationen: A ∩ B, A ∩ C, B ∩ C, B ∩ A, C ∩ A, C ∩ B
  - Ausgabe der Union A ∪ B ∪ C
  - Ausgabe der Beispiel A ∪ (B ∩ C)
- Der:die Teilnehmer:in kann den Code erklären
- Der Code ist in GITHub gepuscht

## Aufgabe: Wörterbuch

Erstelle ein Programm welches ein Wörterbuch zum Übersetzen von Wörtern zwischen Englisch und Deutsch implementiert (bi-direktional). Es soll folgende Funktionalitäten umfassen:

    Hinzufügen eines neuen Wort-Paars (Englisch und Deutsch)
    Entfernen eines Wort-Paars aus dem Wörterbuch
    Suchen der Übersetzung eines Wortes (in beide Richtungen)

Um diese Aufgabe zu lösen ist das **Map** Interface gut geeignet.

### Abnahmekriterien

- Die Variablennamen sind aussagekräftig
- Die gewählten Datentypen sind sinnvoll
- Das Programm erfüllt folgende Anforderungen: 
  - effiziente Suche von Wörtern auf Deutsch
  - effiziente Suche von Wörtern auf Englisch
  - bzw. alle oben angeführten Anforderungen (Hinzufügen/Löschen)
- Der:die Teilnehmer:in kann den Code erklären
- Der Code ist in GITHub gepuscht

## Aufgabe: Liste sortieren

Wähle einen der bereits mit Arrays implementierten Sortieralgorithmus und ändere die Implementation derart, dass statt Arrays Listen verwendet werden. Wichtig: Es soll NICHT die eingebaute Sortierfunktion des Listen Interface, sondern euer eigener Algorithmus verwendet werden.

### Abnahmekriterien

- Die Variablennamen sind aussagekräftig
- Die gewählten Datentypen sind sinnvoll
- Das Programm erfüllt die oben genannten Anforderungen
- Der:die Teilnehmer:in kann den Code erklären
- Der Code ist in GITHub gepuscht

Zurück zur [Startseite](README.md)

