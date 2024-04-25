# sortierte Listen 

Listen können auf 2 verschiedenen Arten sortiert werden:
- beim Hinzufügen eines Elements wird dieses an der richtigen Stelle hinzugefügt
- auf Anfrage: Elemente werden in der Reihenfolge gespeichert, wie sie hinzugefügt wurden und erst danach bei bedarf sortiert

## Java

In Java gibt es keine sortierten Listen, da eine Liste in Java laut Definition ihre Elemente in der Reihenfolge zu speichern hat, wie diese hinzugefügt wurden.

Wenn aber ein Objekttyp benötigt wird, der Elemente beim Hinzufügen sortiert und keine doppelten Einträge erlaubt, kann der Objekttyp `TreeSet` verwendet werden.

Für nähere Informationen: [Why there is no Sorted List in Java?](https://www.baeldung.com/java-sorted-list)

## C#

In C# gibt es ein Objekttyp namens `SortedList`. Eine `SortedList` stellt eine Auflistung von Schlüssel-Wert-Paaren dar, die nach Schlüsseln sortiert sind und auf die sowohl über Schlüssel als auch über Indizes zugegriffen werden kann. Wie der Zugriff auf Elemente erfolgt ist in diesem Beispiel erklärt:


```csharp
// C# 

using System;
using System.Collections;

class Program {
    static void Main() {
        // Erstellen einer SortedList mit Zeichenfolgen als Schlüssel und Ganzzahlen als Werte
        SortedList<string, int> sortedList = new SortedList<string, int>();

        // Elemente zur SortedList hinzufügen
        sortedList.Add("B", 2);
        sortedList.Add("C", 3);
        sortedList.Add("A", 1);

        // Elemente ausgeben
        Console.WriteLine("Elemente in der sortierten Liste:");
        foreach (KeyValuePair<string, int> pair in sortedList) {
            Console.WriteLine($"Key: {pair.Key}, Value: {pair.Value}");
        }

        // Auf vorhandene Schlüssel zugreifen
        Console.WriteLine("\nZugriff auf vorhandene Schlüssel:");
        Console.WriteLine($"Value für Key 'A': {sortedList["A"]}");
        Console.WriteLine($"Value für Key 'B': {sortedList["B"]}");
        Console.WriteLine($"Value für Key 'C': {sortedList["C"]}");

        // Auf nicht vorhandene Schlüssel zugreifen
        Console.WriteLine("\nZugriff auf nicht vorhandene Schlüssel:");
        try{
            Console.WriteLine($"Value für Key 'D': {sortedList["D"]}");
        } catch (KeyNotFoundException) {
            Console.WriteLine("Key 'D' wurde nicht gefunden.");
        }
    }
}
```

Das Ergebnis in der Console sieht wie folgt aus:

```
Elemente in der sortierten Liste:
Key: A, Value: 1
Key: B, Value: 2
Key: C, Value: 3

Zugriff auf vorhandene Schlüssel:
Value für Key 'A': 1
Value für Key 'B': 2
Value für Key 'C': 3

Zugriff auf nicht vorhandene Schlüssel:
Key 'D' wurde nicht gefunden.
```

Nähere Informationen sind hier zu finden: [Microsoft Learn - SortedList Class](https://learn.microsoft.com/de-de/dotnet/api/system.collections.sortedlist?view=net-9.0)

Zurück zur [Startseite](../README.md)