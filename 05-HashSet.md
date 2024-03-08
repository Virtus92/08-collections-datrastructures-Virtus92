# HashSet

Ein `HashSet` ist eine Kollektion von unsortierten Elementen (Objekte), in der jedes Element einmalig ist. Der Vorteil von `HashSet` ist, dass die Suche nach einem Element wesentlich schneller ist, als zum Beispiel in einem ArrayList. Sie ist sogar konstant schnell. Auch das hinzufügen eines Elements ist konstant schnell, da zuerst ein Hash vom hinzufügenden Element erstellt wird und geprüft wird, ob es bereits vorhanden ist. Wenn nicht, wird das Element hinzugefügt. Wenn das Element gefunden wird, wird auch keine Exception geworfen.

Die Eigenschaften eines HashSet sind also:
- Kollektion von *EINMALIGEN* Elementen (Ein HashSet beinhaltet keine Duplikate!).
- Die Elemente im HashSet sind *NICHT* sortiert.
- Die Suche nach einem Element ist besonders schnell und sogar konstant schnell.
- Das Hinzufügen eines Elements ist ebenfalls konstant schnell.
- Gespeichert werden Elemente in `Buckets`. Jedes Bucket entspricht einem HashCode. Da mehrere Elemente potenziell denselben HashCode erhalten können, können mehrere Elemente in ein Bucket gespeichert werden.

Der Objekttyp `HashSet` befindet sich im Package `java.util` (Java) bzw. `System.Collections.Generic` (C#). 

Die API von `HashSet` bietet u.a. folgende Methoden:
- [add()](#add)
- [contains()](#contains)
- [remove()](#remove)
- [clear()](#clear)
- [size()](#size)
- [isEmpty()](#isempty)

### erstellen eines HashSets 

```Java
// Java

import java.util.HashSet;

class Manager{
    public Set<String> createNewHashSet() {
        Set<String> hashset = new HashSet<>();
        return hashset;
    }
}
```

```csharp
// C#

using System.Collections.Generic;

class Manager
{
    public HashSet<string> CreateNewHashSet()
    {
        HashSet<string> hashSet = new HashSet<string>();
        return hashSet;
    }
}
```

### add()

Mit der Methode `add(<Element>)` werden Elemente in die Liste hinzugefügt.

> [!IMPORTANT] Elemente werden nur dann hinzugefügt, wenn kein Element mit demselben Wert vorhanden ist! Die Methode gibt `true` aus, wenn das Element hinzugefügt wurde, `false`, wenn nicht.

```Java
// Java

import java.util.HashSet;

class Manager{
    public void addElementToHashSet() {
        Set<String> hashset = new HashSet<>();
    
        hashset.add("String Added");
    }
}
```

```csharp
// C#

using System.Collections.Generic;

class Manager
{
    public void AddElementToHashSet()
    {
        HashSet<string> hashSet = new HashSet<string>();
    
        hashSet.Add("String Added");
    }
}
```

### contains()

Die Methode `contains()` prüft, ob ein Element im HashSet vorhanden ist und gibt `true` aus, wenn ja, ansonsten `false`. 

> [!IMPORTANT] Diese Methode hasht zuerst den übergebenen Wert mit der Methode `hashcode()`, anschließend prüft anhand der Methode `equals()` im entprechenden Bucket, ob das Element vorhanden ist.

```Java
// Java

import java.util.HashSet;
import java.util.Set;

class Manager {
    public static void main(String[] args) {
        Set<String> hashSetContains = new HashSet<>();
        hashSetContains.add("String Added");

        if (hashSetContains.contains("String Added")) {
            System.out.println("Das Element wurde gefunden");
        } else {
            System.out.println("Das Element wurde nicht gefunden");
        }
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
        HashSet<string> hashSetContains = new HashSet<string>();
        hashSetContains.Add("String Added");

        if (hashSetContains.Contains("String Added"))
        {
            Console.WriteLine("Das Element wurde gefunden");
        }
        else
        {
            Console.WriteLine("Das Element wurde nicht gefunden");
        }
    }
}

```

### remove()

Die Methode `remove()` löscht das entsprechende Element aus dem HashSet und gibt `true` aus, wenn das Element gefunden wurde. 

```Java
// Java

import java.util.HashSet;
import java.util.Set;

class Program {
    public static void main(String[] args) {
        Set<String> hashSetContains = new HashSet<>();
        hashSetContains.add("String Added");

        if (hashSetContains.remove("String Added")) {
            System.out.println("Das Element wurde gefunden");
        } else {
            System.out.println("Das Element wurde nicht gefunden");
        }
    }
}

```

```csharp
// C#

using System;
using System.Collections.Generic;

class Program {
    static void Main() {
        HashSet<string> hashSetContains = new HashSet<string>();
        hashSetContains.Add("String Added");

        if (hashSetContains.Remove("String Added")) {
            Console.WriteLine("Das Element wurde gefunden");
        } else {
            Console.WriteLine("Das Element wurde nicht gefunden");
        }
    }
}
```

### clear()

`clear()` löscht alle Elemente aus dem aufrufenden HashSet.

```Java
// Java

import java.util.HashSet;
import java.util.Set;

class Main {
    public static void main(String[] args) {
        Set<String> clearHashSet = new HashSet<>();
        clearHashSet.add("String Added");
        clearHashSet.add("String2 Added");
        clearHashSet.clear(); // Alle Elemente werden aus clearHashSet gelöscht
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
        HashSet<string> clearHashSet = new HashSet<string>();
        clearHashSet.Add("String Added");
        clearHashSet.Add("String2 Added");
        clearHashSet.Clear(); // Alle Elemente werden aus clearHashSet gelöscht
    }
}
```

### size()

`size()` gibt die Anzahl der Elemente im HashSet aus.

```Java
// Java

import java.util.HashSet;
import java.util.Set;

class Main {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("String Added");
        int size = hashSet.size(); // gibt hier 1 aus
        System.out.println(size); // gibt hier 1 aus
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
        HashSet<string> hashSet = new HashSet<string>();
        hashSet.Add("String Added");

        // Gibt die Anzahl der Elemente im HashSet aus
        int count = hashSet.Count;
        Console.WriteLine(count); // Ausgabe: 1
    }
}

```


### isEmpty()

`isEmpty()` prüft, ob das HashSet leer ist und gibt `true` aus, wenn ja, ansonsten `false`.

```Java
// Java

import java.util.HashSet;
import java.util.Set;

class Manager {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("String Added");

        // Überprüfen, ob das HashSet leer ist
        boolean hashSetIsEmpty = hashSet.isEmpty();
        System.out.println(hashSetIsEmpty); // Ausgabe: false

        // Alle Elemente aus dem HashSet entfernen
        hashSet.clear();

        // Überprüfen, ob das HashSet nach dem Löschen leer ist
        hashSetIsEmpty = hashSet.isEmpty();
        System.out.println(hashSetIsEmpty); // Ausgabe: true
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
        HashSet<string> hashSet = new HashSet<string>();
        hashSet.Add("String Added");

        // Überprüfen, ob das HashSet leer ist
        bool hashSetIsEmpty = hashSet.Count == 0;
        Console.WriteLine(hashSetIsEmpty); // Ausgabe: False

        // Alle Elemente aus dem HashSet entfernen
        hashSet.Clear();

        // Überprüfen, ob das HashSet nach dem Löschen leer ist
        hashSetIsEmpty = hashSet.Count == 0;
        Console.WriteLine(hashSetIsEmpty); // Ausgabe: True
    }
}
```
## Referenzen

[HashSet (Java) - Baeldung](https://www.baeldung.com/java-hashset)
[Microsoft Learn (C#) - HashSet Klasse](https://learn.microsoft.com/de-de/dotnet/api/system.collections.generic.hashset-1?view=net-8.0)

Zurück zur [Startseite](README.md)