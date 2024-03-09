# Key-Value-Pair

Bei Key-Value-Paaren unterscheiden sich die Bezeichnungen je nach Programmiersprache:
- in Java verwendet man z.B. eine `HashMap`. Sie implementiert das Interface `java.util.Map`, in dem der Zugriff auf Elemente über den Key erfolgt. `HashMap` ist im Package `java.util` zu finden.
- in C# verwendet man die Klasse `Dictionary`. `Dictionary` ist im Namespace `System.Collections.Generic` zu finden.

`HashMap`s und `Dictionary`s sind besonders schnell, da die Keys gehasht werden. Der Zugriff auf ein Key ist genauso schnell, wie in einem `HashSet`. 

Die API von `java.util.HashMap` bzw. `Dictionary` in `System.Collections.Generic` bietet u.a. folgende Methoden:

## Erstellen einer neuen HashMap

```Java
// Java

import java.util.HashMap;

class Manager{
    public HashMap<Integer,String> createNewHashMap() {
        HashMap<Integer,String> myHashMap = new HashMap<>();
        return myHashMap;
    }
}
```
Hier ist wichtig zu beachten:
- In der Deklaration der HashMap stellt `Integer` den Objekttyp des Keys und `String` den Objekttyp des Werts dar.
- jeden Key gibt es nur 1 Mal, aber die Values können mehrfach vorkommen.

```csharp
// C# 

using System.Collections.Generic;

class Manager
{
    public Dictionary<int, string> CreateNewDictionary()
    {
        Dictionary<int, string> myDictionary = new Dictionary<int, string>();
        return myDictionary;
    }
}
```

## Ein Key-Value-Pair hinzufügen

Die Methode `put(key, value)` nimmt 2 Parameter: den Schlüssel und den Wert und heißt: setze für den angegebenen Schlüssel `key` den Wert `value`.

```Java
// Java

myHashMap.put(1, 'Wert');
```


```csharp
// C#

myDictionary.Add(1, 'Wert');
```

> [!IMPORTANT] Wichtig anzumerken ist, dass das hinzufügen eines vorhandenen Keys, den Wert dieses Keys in der HashMap ersetzt. Ein Key kommt immer nur 1 Mal vor.

## Mehrere Key-Value-Pairs hinzufügen

Die Methode `putAll(existingKeyValuePairs)` nimmt 1 Parameter, hier `existingKeyValuePairs` vom selben Objekttyp wie `myHashMap`: eine bereits existierende HashMap, die in die HashMap **kopiert** werden soll.

```Java
// Java

myHashMap.putAll(existingKeyValuePairs);
```

In C# gibt es keine solche Methode, diese ist aber leicht durch eine Schleife zu ersetzen.

## Element auslesen

Die Methode `get(key)`/`Get(key)` nimmt 1 Parameter `key`: den Schlüssel des Elements in der HashMap und gibt den dazugehörigen Wert aus.

```Java
// Java

myHashMap.get(1);
```
```csharp
// C# 

myDictionary.Get(1);
```

## Key vorhanden?

Die Methode `containsKey(key)`/`ContainsKey(key)` prüft, ob der angegebene Schlüssel in der HashMap vorhanden ist gibt `true` aus, wenn der Schlüssel vorhanden ist, ansonsten `false`.

```Java
// Java

myHashMap.containsKey(1);
```
```csharp
// C# 

myDictionary.ContainsKey(1);
```

## Wert vorhanden?

Die Methode `containsValue(value)`/`ContainsValue(value)` prüft, ob der angegebene Wert `value` in der HashMap/im Divctionary vorhanden ist gibt `true` aus, wenn der Schlüssel vorhanden ist, ansonsten `false`.

```Java
// Java

myHashMap.containsValue('Wert');
```
```csharp
// C# 

myDictionary.ContainsValue('Wert');
```

## Element löschen

Die Methode `remove(key)`/`Remove(key)` nimmt 1 Parameter `key`: den Schlüssel, des zu löschenden Elements. Die Methode gibt den Wert der gelöscht wurde aus. Wurde der Schlüssel nicht gefunden, wird `null` ausgegeben.

```Java
// Java

myHashMap.remove(1);
```

```csharp
// C# 

myDictionary.Remove(1);
```

## Alle Elemente löschen

Die Methode `clear`/`Clear` löscht alle Elemente aus der HashMap/aus dem Dictionary.

```Java
// Java

myHashMap.clear();
```
```csharp
// C# 

myDictionary.Clear();
```

## Referenzen

- [HashMap: Baeldung](https://www.geeksforgeeks.org/java-util-hashmap-in-java-with-examples/?ref=lbp)

Zurück zur [Startseite](README.md)