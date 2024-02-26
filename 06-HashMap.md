# HashMap

Eine `HashMap` ist eine Kollektion von Key-Value-Paaren (sie implementiert das Interface `java.util.Map`), in dem der Zugriff auf Elemente über den Key erfolgt. `HashMap`s sind besonders schnell, da die Keys gehasht wurde, sodass der Zugriff auf ein Key genauso schnell ist, wie in einem `HashSet`. 

## Java

In Java ist der Objekttyp `HashMap` im Package `java.util` zu finden.

Die API von `java.util.HashMap` bietet u.a. folgende Methoden:
- [put()](#put)
- [putAll()](#putall)
- [remove()](#remove)
- [get()](#get)
- [containsKey()](#containskey)
- [containsValue()](#containsvalue)
- [clear()](#clear)

### Erstellen einer neuen HashMap

```Java
// Java

import java.util.HashMap;

class Manager{
    public HashMap<Integer,String> createNewHashSet() {
        HashMap<Integer,String> meineHashMap = new HashMap<>();
        return meineHashMap;
    }
}
```

Hier ist wichtig zu beachten:
- In der Deklaration der HashMap stellt `Integer` den Objekttyp des Keys und `String` den Objekttyp des Werts dar.
- jeden Key gibt es nur 1 Mal, aber die Values können mehrfach vorkommen.

### put()

Die Methode `put(key, value)` nimmt 2 Parameter: den Schlüssel und den Wert und heißt: setze für den angegebenen Schlüssel `key` den Wert `value`.

```Java
// Java

meineHashMap.put(1, 'Wert');
```

> [!IMPORTANT] Wichtig anzumerken ist, dass das hinzufügen eines vorhandenen Keys, den Wert dieses Keys in der HashMap ersetzt. Ein Key kommt immer nur 1 Mal vor.

### putAll()

Die Methode `putAll(existingHashMap)` nimmt 1 Parameter: eine bereits existierende HashMap, die in die HashMap **kopiert** werden soll.

```Java
// Java

meineHashMap.putAll(existingHashMap);
```

### remove()

Die Methode `remove(key)` nimmt 1 Parameter: den Schlüssel, des zu löschenden Elements. Die Methode gibt den Wert der gelöscht wurde aus. Wurde der Schlüssel nicht gefunden, wird `null` ausgegeben.

```Java
// Java

meineHashMap.remove(1);
```

### get()

Die Methode `get(key)` nimmt 1 Parameter: den Schlüssel des Elements in der HashMap und gibt den dazugehörigen Wert aus.

```Java
// Java

meineHashMap.get(1);
```

### containsKey()

Die Methode `containsKey(key)` prüft, ob der angegebene Schlüssel in der HashMap vorhanden ist gibt `true` aus, wenn der Schlüssel vorhanden ist, ansonsten `false`.

```Java
// Java

meineHashMap.containsKey(1);
```

### containsValue()

Die Methode `containsValue('Wert')` prüft, ob der angegebene Wert in der HashMap vorhanden ist gibt `true` aus, wenn der Schlüssel vorhanden ist, ansonsten `false`.

```Java
// Java

meineHashMap.containsKey(1);
```

### clear()

Die Methode `clear()` löscht alle Elemente aus der HashMap.

```Java
// Java

meineHashMap.clear();
```

## Referenzen

- [HashMap: Baeldung](https://www.geeksforgeeks.org/java-util-hashmap-in-java-with-examples/?ref=lbp)

Zurück zur [Startseite](README.md)