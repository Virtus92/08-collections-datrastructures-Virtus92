# Listen

Eine ArrayList ist ein Objekt, das auf dem Interface List aufbaut, es handelt sich also um eine Sequenz mit einer definierten Reihenfolge, die mehrere Elemente mit demselben Wert beinhalten kann. Im Hintergrund ist die Datenstruktur in einem Array gespeichert.

## Warum eine Liste, wenn es doch ein Array gibt?

Der Sinn von einer Liste ist der, dass im Gegensatz zu normalen Arrays, die Größe nicht im Vorfeld definiert wird. So kann unsere Liste wachsen oder schrumpfen, wenn man Elemente hinzufügt bzw. löscht. Wie wir bereits wissen, wenn sich die Größe eines Arrays ändert müssen wir das Array neu instanzieren und den Inhalt clonen. In einer Liste ist das nicht der Fall. 

Die Funktionsweise einer Liste ist ähnlich wie bei einem Array. Der Zugriff auf Elemente erfolgt über die entsprechende ID. 

Wichtig ist anzumerken, dass in Java `ArrayList` bzw. in C# `List` eine generische Klasse ist. So kann bei der Deklaration der Variable definiert werden, welche Art von Daten darin gespeichert werden. 

## Instanzieren von Listen

Die Klasse `ArrayList`/`List` bietet mehrere Konstruktoren. Bevor wir diese aber anwenden können müssen wir die nötigen Packages importieren:

```Java
// Java

import java.util.ArrayList;
```

```csharp
// C#

using System;
using System.Collections.Generic;
```

### Standard-Konstruktor ohne Argumente

```Java
// Java

List<String> list = new ArrayList<>();
```

```csharp
// C#

List<int> numbers = new List<int>();
```

### Standard-Konstruktor mit Definition der initialen Größe

```Java
// Java

List<String> list = new ArrayList<>(20);
```

```csharp
// C#

List<int> numbers = new List<int>(20);
```

### Standard-Konstruktor mit Collection

#### Java 

```Java
// Java 

Collection<Integer> numbers = IntStream.range(0, 10).boxed().collect(toSet());

List<Integer> list = new ArrayList<>(numbers);
```

```csharp
// C# 

List<int> numbers = Enumerable.Range(0, 10).ToList();

List<int> list = new List<int>(numbers);
```

## Methoden eines ArrayList

### ein Element hinzufügen

Mit den Methode *add(Wert)* bzw. *add(Index, Wert)* werden einzelne Elemente hinzugefügt.

```Java
// Java

List<Integer> list = new ArrayList<>(numbers);

list.add(1000); // Das Element 1000 wird an das Ende der ArrayList hinzugefüht
list.add(2000); // Das Element 2000 wird an das Ende der ArrayList hinzugefüht
list.add(5000); // Das Element 5000 wird an das Ende der ArrayList hinzugefüht
list.add(2, 3000); // Das Element 3000 wird an der Stelle 2 der ArrayList hinzugefüht
list.add(1, 1000); // Das Element 3000 wird an der Stelle 1 der ArrayList hinzugefüht
```

Die ArrayList sieht schließlich wie folgt aus:

```
[1000, 1000, 2000, 3000, 5000]
```

```csharp
// C# 

List<int> list = new List<int>();

// Elemente hinzufügen
list.Add(1000); // Das Element 1000 wird an das Ende der Liste hinzugefügt
list.Add(2000); // Das Element 2000 wird an das Ende der Liste hinzugefügt
list.Add(5000); // Das Element 5000 wird an das Ende der Liste hinzugefügt
list.Insert(2, 3000); // Das Element 3000 wird an der Stelle 2 der Liste hinzugefügt
list.Insert(1, 1000); // Das Element 1000 wird an der Stelle 1 der Liste hinzugefügt
```

### Liste iterieren

#### Java

Um eine ArrayList zu iterieren wird zunächst der Iterator definiert: `Iterator` oder `ListIterator` (Vorteil vom 2. ist, dass man damit die Liste in beiden Richtungen iterieren kann).

Mit einem `Iterator` iteriert man mit dem Befehl `next()`.

Mit einem `ListIterator` kann man zusätzlich mit `previous()` rückwärts iterieren.

```Java
// Java 

List<Integer> list = new ArrayList<>(numbers);

list.add(1000);
list.add(2000);
list.add(5000);
list.add(3000);
list.add(1000); // Die Liste list schaut hier wie folgt aus: [1000, 2000, 5000, 3000, 1000]

ListIterator<Integer> it = list.listIterator(list.size());
List<Integer> result = new ArrayList<>(list.size());
while (it.hasPrevious()) { // würde man die Liste Vorwärts durchiterieren wollen, würde man hier hasNext() und next() verwenden
    result.add(it.previous());
}
// Die Liste result schaut jetzt wie folgt aus: [1000, 3000, 5000, 2000, 1000]
```

#### C#
In C# gibt es kein Pendant für die Klasse `ListIterator`. Statt dessen könnte man die Liste rückwärts durchiterieren:

```csharp
// C# 

List<int> list = new List<int>();

// Elemente hinzufügen
list.Add(1000);
list.Add(2000);
list.Add(5000);
list.Add(3000);
list.Add(1000);

// Die Liste list schaut hier wie folgt aus: [1000, 2000, 5000, 3000, 1000]

// Rückwärts durch die Liste iterieren und Elemente in eine neue Liste einfügen
List<int> result = new List<int>(list.Count);
for (int i = list.Count - 1; i >= 0; i--)
{
    result.Add(list[i]);
}
```

### Liste durchsuchen

Bei der Suche in einem ArrayList unterscheidet man zwischen 2 Zuständen:
- die Liste ist nicht sortiert
- die Liste ist bereits sortiert

#### Suche in der nicht sortierten Liste

Im folgenden Beispiel möchten wir in der Liste list nach Elementen suchen, die sich ebenfalls in matchingNumbers befinden und lediglich jene ausgeben, die gefunden wurden.

```Java
// Java

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Erstellen einer Liste von Ganzzahlen
        List<Integer> list = new ArrayList<>();

        // Elemente hinzufügen
        list.add(1000);
        list.add(2000);
        list.add(5000);
        list.add(3000);
        list.add(1000);

        // Die Liste list schaut hier wie folgt aus: [1000, 2000, 5000, 3000, 1000]

        // Erstellen eines Sets mit übereinstimmenden Zahlen
        Set<Integer> matchingNumbers = new HashSet<>();
        matchingNumbers.add(5000);
        matchingNumbers.add(2000);

        // Ergebnisliste initialisieren
        List<Integer> result = new ArrayList<>();

        // Durchlaufen der Liste und Hinzufügen übereinstimmender Zahlen zum Ergebnis
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            int num = it.next();
            if (matchingNumbers.contains(num)) {
                result.add(num);
            }
        }

        // Ausgabe der Liste
        for (int num : result) {
            System.out.println(num);
        }
    }
}
// result würde wie folgt aussehen: [2000, 5000]
```

```csharp
// C# 
using System;
using System.Collections.Generic;

class Program
{
    static void Main()
    {
        // Erstellen einer Liste von Ganzzahlen
        List<int> list = new List<int>();

        // Elemente hinzufügen
        list.Add(1000);
        list.Add(2000);
        list.Add(5000);
        list.Add(3000);
        list.Add(1000);

        // Die Liste list schaut hier wie folgt aus: [1000, 2000, 5000, 3000, 1000]

        // Erstellen eines Sets mit übereinstimmenden Zahlen
        HashSet<int> matchingNumbers = new HashSet<int>(new int[] { 5000, 2000 });

        // Ergebnisliste initialisieren
        List<int> result = new List<int>();

        // Durchlaufen der Liste und Hinzufügen übereinstimmender Zahlen zum Ergebnis
        foreach (int num in list)
        {
            if (matchingNumbers.Contains(num))
            {
                result.Add(num);
            }
        }

        // Ausgabe der Liste
        foreach (int num in result)
        {
            Console.WriteLine(num);
        }
    }
}
// result würde wie folgt aussehen: [2000, 5000]
```


#### Suche in einer bereits sortierten Liste

Hier gehen wir davon aus, dass die Elemente der Liste vor der Suche sortiert wurden (entweder beim Hinzufügen oder nachträglich).

Im folgenden Beispiel möchten wir in der sortierten Liste list den Index der ersten Instanz des Elements mit dem Wert 5000 ausgeben. Die Suche ergibt -1, wenn der Wert in der Liste nicht gefunden wurde.

```Java
// Java 

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Erstellen einer Liste von Ganzzahlen
        List<Integer> list = new ArrayList<>();

        // Elemente hinzufügen
        list.add(1000);
        list.add(2000);
        list.add(5000);
        list.add(3000);
        list.add(1000);

        // Die Liste list schaut hier wie folgt aus: [1000, 2000, 5000, 3000, 1000]

        // Sortieren der Liste
        Collections.sort(list);

        // Suche nach der Zahl 5000 in der sortierten Liste
        int index = Collections.binarySearch(list, 5000);
        System.out.println("Index von 5000 in der sortierten Liste: " + index);
    }
}
```

Hier ist anzumerken, dass die Suche *-1* ergibt, wenn das gesuchte Element nicht gefunden wird.

```csharp
// C# 

using System;
using System.Collections.Generic;

class Program
{
    static void Main()
    {
        // Erstellen einer Liste von Ganzzahlen
        List<int> list = new List<int>();

        // Elemente hinzufügen
        list.Add(1000);
        list.Add(2000);
        list.Add(5000);
        list.Add(3000);
        list.Add(1000);

        // Die Liste list schaut hier wie folgt aus: [1000, 2000, 5000, 3000, 1000]

        // Sortieren der Liste
        list.Sort();

        // Suche nach der Zahl 5000 in der sortierten Liste
        int index = list.BinarySearch(5000);
        Console.WriteLine("Index von 5000 in der sortierten Liste: " + index);
    }
}
```

### Löschen eines Elements

Das Löschen eines Elements erfolgt mit den Methoden *remove(Index)* oder *remove(Objekt)*. 

Im folgenden Beispiel möchten wir, dass alle Elemente aus dem Set matchingStrings von der Liste stringsToSearch entfernt werden.

```Java
// Java

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Erstellen einer Liste von Strings
        List<String> stringsToSearch = new ArrayList<>(Arrays.asList("a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"));

        // Erstellen eines Sets mit übereinstimmenden Strings
        Set<String> matchingStrings = new HashSet<>(Arrays.asList("a", "b", "c", "d", "e", "f"));

        // Durchlaufen der Liste und Entfernen übereinstimmender Strings
        int i = 0;
        while (i<stringsToSearch.size()){
            if (matchingStrings.contains(stringsToSearch.get(i))) {
                stringsToSearch.remove(i);
            } else{
                // Erhöhen des Index nur, wenn kein Element entfernt wurde,
                // da die Liste sich verkürzt und somit die Elemente verschoben werden
                i++;
            }
        }

        // Ausgabe der Liste stringsToSearch
        for (String str : stringsToSearch) {
            System.out.println(str);
        }
    }
}
```

```csharp
// C#

using System;
using System.Collections.Generic;

class MainClass {
    public static void Main (string[] args) {
        // Erstellen einer Liste von Strings
        List<string> stringsToSearch = new List<string>{"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};

        // Erstellen eines Sets mit übereinstimmenden Strings
        HashSet<string> matchingStrings = new HashSet<string>{"a", "b", "c", "d", "e", "f"};

        // Durchlaufen der Liste und Entfernen übereinstimmender Strings
        int i = 0;
        while (i < stringsToSearch.Count) {
            if (matchingStrings.Contains(stringsToSearch[i])) {
                stringsToSearch.RemoveAt(i);
            } else {
                // Erhöhen des Index nur, wenn kein Element entfernt wurde,
                // da die Liste sich verkürzt und somit die Elemente verschoben werden
                i++;
            }
        }

        // Ausgabe der Liste stringsToSearch
        foreach (string str in stringsToSearch) {
            Console.WriteLine(str);
        }
    }
}

```

Zurück zur [Startseite](../README.md)
