# LinkedList

Eine `LinkedList` ist eine doppelt verkettete Liste. Das heißt, ein Element der Liste hat:
* einen Wert
* ein voriges Element
* ein nächtes Element

Die `LinkedList` wird über das erste und das letzte Element der Liste definiert. Auf die weiteren Elemente kann zugegriffen werden, indem die Liste vom ersten oder vom letzten Element aus durchiteriert wird.

In diesem Kapitel stellen wir die wichtigsten Eigenschaften und Methoden der `LinkedList` vor.

## Vergleich ArrayList / LinkedList

Die Daten einer `ArrayList` sind in einem Array im Hintergrund gespeichert, sodass der zufällige Zugriff auf ein bestimmtes Element eine **Performance von O(1)** aufweist.

Auf der anderen Seite sind die Daten einer `LinkedList` in einer Liste von Elementen gespeichert, welche mit dem vorigen und nächsten Element verlinkt sind. So ist beim zufälligen Zugriff auf ein bestimmtes Element **die Performance O(n)**.

Beim Hinzufügen oder Löschen eines Elementen aus einer `LinkedList` werden lediglich die benachbarten Elemente verändert (next und previous werden neu gesetzt), während bei einem *ArrayList* die Größe des Arrays angepasst werden muss.

In Punkto Speicherbedarf verbraucht eine `LinkedList` mehr Speicher als eine `ArrayList`, weil sie für jede Node neben den Daten 2 Referenzen (previous und next) während die `ArrayList` lediglich die Daten und das jeweilige Index speichert.

## Instanzierung eines LinkedList

Um LinkedList nutzen zu können, müssen wir das entsprechende Package zuerst importieren:
```Java
// Java

import java.util.LinkedList;
```
```csharp
// C# 

using System.Collections.Generic;
```

```Java
// Java

List<Object> list = new LinkedList<>();
```

```csharp
// C# 

LinkedList<object> list = new LinkedList<object>();
```

## Element hinzufügen

`LinkedList` bietet neben den üblichen Methoden `add()` bzw. `addAll()` auch `addFirst()` und `addLast`, um Elemente am Anfang bzw. am Ende der Liste hinzuzufügen. Weiters kann auch die Methode push aus der Queue-Schnittstelle verwendet werden

```Java
// Java

import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        // Erstellen einer LinkedList von Objekten
        LinkedList<Object> list = new LinkedList<>();

        // Ein Objekt erstellen
        Object obj = new Object();

        // 'object' am Ende der Liste hinzufügen, liefert true wenn erfolgreich
        boolean addedToEnd = list.add(obj);

        // 'object' an der Position 0 in der Liste hinzufügen
        list.add(0, obj);

        // 'object' an erster Stelle in die LinkedList hinein fügen
        list.addFirst(obj);

        // 'object' an letzter Stelle in die LinkedList hinein fügen
        list.addLast(obj);

        // Eine Collection erstellen und Elemente hinzufügen
        Collection<String> collect = new ArrayList<>();
        collect.add("CORDERS");
        collect.add(".");
        collect.add("BAY");

        // Alle Elemente von collect in die LinkedList hinein fügen
        list.addAll(collect);

        // Alle Elemente von 'collect' an der Position 2 in die LinkedList hinein fügen
        list.addAll(2, collect);

        // 'object' an erster Stelle in list hinein fügen
        list.push(obj);
    }
}
```

```csharp
// C# 

using System;
using System.Collections.Generic;

class Program
{
    static void Main()
    {
        // Erstellen einer LinkedList von Objekten
        LinkedList<object> list = new LinkedList<object>();

        // Ein Objekt erstellen
        object obj = new object();

        // 'object' am Ende der Liste hinzufügen, liefert true wenn erfolgreich
        bool addedToEnd = list.Add(obj);

        // 'object' an der Position 0 in der Liste hinzufügen
        list.AddFirst(obj);

        // 'object' an erster Stelle in die LinkedList hinein fügen
        list.AddFirst(obj);

        // 'object' an letzter Stelle in die LinkedList hinein fügen
        list.AddLast(obj);

        // Eine Collection erstellen und Elemente hinzufügen
        ICollection<string> collect = new List<string>();
        collect.Add("CORDERS");
        collect.Add(".");
        collect.Add("BAY");

        // Alle Elemente von collect in die LinkedList hinein fügen
        list.AddRange(collect);

        // Alle Elemente von 'collect' an der Position 2 in die LinkedList hinein fügen
        list.InsertRange(2, collect);

        // 'object' an erster Stelle in list hinein fügen
        list.AddFirst(obj);
    }
}

```

## Elemente ausgeben/finden

In einer `LinkedList` werden die Methoden `get()`, `getFirst()`, `getLast()`, `contains()` angeboten.

```Java
// Java 

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // Erstellen einer LinkedList von Objekten
        LinkedList<Object> list = new LinkedList<Object>();

        // Elemente zur LinkedList hinzufügen
        list.add("Element 0");
        list.add("Element 1");
        list.add("Element 2");
        list.add("Element 3");
        list.add("Element 4");

        // Gibt das Element an Position 3 (0 ist das erste Element) aus
        Object element = list.get(3);

        // Gibt das erste Element der Liste aus
        Object firstElement = list.getFirst();

        // Gibt das letzte Element der Liste aus
        Object lastElement = list.getLast();

        // Gibt an, ob das Element in der Liste gefunden wurde
        boolean found = list.contains("Element 2");
    }
}

```

```csharp
// C# 

using System;
using System.Collections.Generic;

class Program
{
    static void Main()
    {
        // Erstellen einer LinkedList von Objekten
        LinkedList<object> list = new LinkedList<object>();

        // Elemente zur LinkedList hinzufügen
        list.AddLast("Element 0");
        list.AddLast("Element 1");
        list.AddLast("Element 2");
        list.AddLast("Element 3");
        list.AddLast("Element 4");

        // Gibt das Element an Position 3 (0 ist das erste Element) aus
        object element = list.ElementAt(3);

        // Gibt das erste Element der Liste aus
        object firstElement = list.First.Value;

        // Gibt das letzte Element der Liste aus
        object lastElement = list.Last.Value;

        // Gibt an, ob das Element in der Liste gefunden wurde
        bool found = list.Contains("Element 2");
    }
}
```

## Element löschen

Wie beim Hinzufügen eines Elementen werden neben den Standard `remove()`-Methoden auch `removeFirst()` und `removeLast()`, aber auch `removeFirstOccurence()` und `removeLastOccurence()` angeboten.

Weiters werden auch die Queue-Methoden angeboten: `poll()` und `pop()` bzw. `pollFirst()` und `pollLast()`. Der Unterschied zwischen `poll` und `pop` liegt darin, dass `pop()` bei einer leeren LinkedList eine `NoSuchElementException` auswerfen wird.

Mit der Methode `clear()` werden alle Elemente der LinkedList gelöscht.

### Java

```Java
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // Erstellen einer LinkedList von Objekten
        LinkedList<Object> list = new LinkedList<>();

        // Elemente zur LinkedList hinzufügen
        list.add("Element 0");
        list.add("Element 1");
        list.add("Element 2");
        list.add("Element 3");
        list.add("Element 4");

        // Entfernt das erste Element (head) aus list und gibt true zurück, wenn erfolgreich
        boolean deleteSuccessful = list.removeFirst();

        // Entfernt das Element an der Position 0 aus list
        deleteSuccessful = list.removeFirst();

        // Entfernt das Element 'object' aus list
        Object obj = "Element 2";
        deleteSuccessful = list.remove(obj);

        // Entfernt das letzte Element aus list
        deleteSuccessful = list.removeLast();

        // Entfernt die erste Instanz von 'object' aus list
        list.removeFirstOccurrence(obj);

        // Entfernt die letzte Instanz von 'object' aus list
        list.removeLastOccurrence(obj);

        // Entfernt das erste Element (head) aus list und gibt das gelöschte Element zurück, gibt null zurück, wenn list leer ist
        Object deletedElement = list.poll();

        // Entfernt das letzte Element (tail) aus list und gibt das gelöschte Element zurück, gibt null zurück, wenn list leer ist
        deletedElement = list.pollLast();

        // Entfernt alle Elemente aus list
        list.clear();
    }
}

```

```csharp
// C# 

using System;
using System.Collections.Generic;

class Program
{
    static void Main()
    {
        // Erstellen einer LinkedList von Objekten
        LinkedList<object> list = new LinkedList<object>();

        // Elemente zur LinkedList hinzufügen
        list.AddLast("Element 0");
        list.AddLast("Element 1");
        list.AddLast("Element 2");
        list.AddLast("Element 3");
        list.AddLast("Element 4");

        // Entfernt das erste Element (head) aus list und gibt true zurück, wenn erfolgreich
        bool deleteSuccessful = list.RemoveFirst();

        // Entfernt das Element an der Position 0 aus list
        deleteSuccessful = list.RemoveFirst();

        // Entfernt das Element 'object' aus list
        object obj = "Element 2";
        deleteSuccessful = list.Remove(obj);

        // Entfernt das letzte Element aus list
        deleteSuccessful = list.RemoveLast();

        // Entfernt die erste Instanz von 'object' aus list
        list.RemoveFirstOccurrence(obj);

        // Entfernt die letzte Instanz von 'object' aus list
        list.RemoveLastOccurrence(obj);

        // Entfernt das erste Element (head) aus list und gibt das gelöschte Element zurück, gibt null zurück, wenn list leer ist
        list.RemoveFirst();

        // Entfernt das letzte Element (tail) aus list und gibt das gelöschte Element zurück, gibt null zurück, wenn list leer ist
        list.RemoveLast();

        // Entfernt alle Elemente aus list
        list.Clear();
    }
}
```

## Liste clonen

`LinkedList` sind Objekte, also ein Referenzdatentyp, kein primärer Datentyp. Daher würde eine Zuweisung von list zu einer neuen Variable linkedList dazu führen, dass beide Variablen exakt dieselben Elemente beinhalten und daher die Änderung eines Elements in list sich auch auf linkedList auswirkt.
So benötigt man, um die Elemente der Liste zu kopieren, eine entsprechende Methode! In Java gibt es die `clone()`-Methode. In C# müssen wir zum Beispiel auf die Methode `ToList()` zurückgreifen.

```Java
// Java 

List<Object> linkedListCopy = list.clone(); // erstellt eine Kopie der Liste list in linkedListCopy
```

```csharp
// C# 

List<object> linkedListCopy = list.ToList(); // erstellt eine Kopie der Liste list in linkedListCopy
```

## Zusammenfassend

Zusammenfassend ist anzumerken, dass ArrayList die Standard Listenimplementierung ist. Allerdings kann die LinkedList in bestimmten Fällen einen Vorteil bringen, insbesondere wenn die Dauer fürs Hinzufügen/Löschen von Elementen wichtiger als die Dauer für den Zugriff auf Elemente bzw. der Speicherbedarf ist.

Zurück zur [Startseite](../README.md)