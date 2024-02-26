# HashSet

Ein `HashSet` ist eine Kollektion von unsortierten Elementen (Objekte), in der jedes Element einmalig ist. Der Vorteil von `HashSet` ist, dass die Suche nach einem Element wesentlich schneller ist, als zum Beispiel in einem ArrayList. Sie ist sogar konstant schnell. Auch das hinzufügen eines Elements ist konstant schnell, da zuerst ein Hash vom hinzufügenden Element erstellt wird und geprüft wird, ob es bereits vorhanden ist. Wenn nicht, wird das Element hinzugefügt. Wenn das Element gefunden wird, wird auch keine Exception geworfen.

Die Eigenschaften eines HashSet sind also:
- Kollektion von *EINMALIGEN* Elementen (Ein HashSet beinhaltet keine Duplikate!).
- Die Elemente im HashSet sind *NICHT* sortiert.
- Die Suche nach einem Element ist besonders schnell und sogar konstant schnell.
- Das Hinzufügen eines Elements ist ebenfalls konstant schnell.
- Gespeichert werden Elemente in `Buckets`. Jedes Bucket entspricht einem HashCode. Da mehrere Elemente potenziell denselben HashCode erhalten können, können mehrere Elemente in ein Bucket gespeichert werden.

## Java

In Java ist der Objekttyp `HashSet` im Package `java.util` zu finden.

Die API von `java.util.HashSet` bietet u.a. folgende Methoden:
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

### contains()

Die Methode `contains()` prüft, ob ein Element im HashSet vorhanden ist und gibt `true` aus, wenn ja, ansonsten `false`. 

> [!IMPORTANT] Diese Methode hasht zuerst den übergebenen Wert mit der Methode `hashcode()`, anschließend prüft anhand der Methode `equals()` im entprechenden Bucket, ob das Element vorhanden ist.

```Java
// Java

Set<String> hashsetContains = new HashSet<>();
hashsetContains.add("String Added");
 
if (hashsetContains.contains("String Added")){
    System.out.println("Das Element wurde gefunden");
} else {
    System.out.println("Das Element wurde nicht gefunden");
}
```

### remove()

Die Methode `remove()` löscht das entsprechende Element aus dem HashSet und gibt `true` aus, wenn das Element gefunden wurde. 

```Java
// Java

Set<String> hashsetContains = new HashSet<>();
hashsetContains.add("String Added");
 
if (hashsetContains.remove("String Added")){
    System.out.println("Das Element wurde gefunden");
} else {
    System.out.println("Das Element wurde nicht gefunden");
}
```

### clear()

`clear()` löscht alle Elemente aus dem aufrufenden HashSet.

```Java
// Java

    Set<String> clearHashSet = new HashSet<>();
    clearHashSet.add("String Added");
    clearHashSet.clear();
```

### size()

`size()` gibt die Anzahl der Elemente im HashSet aus.

```Java
// Java

    Set<String> hashSet = new HashSet<>();
    hashSet.add("String Added");
    hashSet.size(); // gibt hier 1 aus
```

### isEmpty()

`isEmpty()` prüft, ob das HashSet leer ist und gibt `true` aus, wenn ja, ansonsten `false`.

```Java
// Java

    Set<String> hashSet = new HashSet<>();
    hashSet.add("String Added");
    boolean hashSetIsEmpty = hashSet.isEmpty(); // gibt hier false aus
    hashSet.clear();
    hashSetIsEmpty = hashSet.isEmpty(); // gibt hier true aus
```

## C#

[...]

## Referenzen

[HashSet - Baeldung](https://www.baeldung.com/java-hashset)

Zurück zur [Startseite](README.md)