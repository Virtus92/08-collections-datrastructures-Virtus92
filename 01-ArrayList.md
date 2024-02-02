# ArrayList

Ein ArrayList ist ein Objekt, das auf das Interface List aufbaut, ist also eine Sequenz mit einer definierten Reihenfolge, die mehrere Elemente mit demselben Wert beinhalten kann. Im Hintergrund ist die Datenstruktur in einem Array gespeichert.

## Warum ein ArrayList, wenn es doch ein Array gibt?

Der Sinn von ArrayList ist der, dass im Gegensatz zu normalen Arrays, die Größe nicht im Vorfeld definiert wird. So kann unser ArrayList wachsen oder schrumpfen, wenn man Elemente hinzufügt bzw. löscht. Ansonsten ist die Funktionsweise ähnlich wie bei Arrays. Der Zugriff auf Elemente erfolgt über die entsprechende ID. 

Wichtig ist anzumerken, dass ArrayList eine generische Klasse ist. So kann bei der Deklaration der Variable definiert werden, welche Art von Daten in die ArrayList gespeichert wird. 

## Instanzieren von AraryLists

Die Klasse ArrayList biete mehrere Konstruktoren. 

### Standard-Konstruktor ohne Argumente

#### Java 

```Java
List<String> list = new ArrayList<>();
```

#### C#

```c#

```

### Standard-Konstruktor mit Definition der initialen Größe

#### Java 

```Java
List<String> list = new ArrayList<>(20);
```

#### C#

```c#

```

### Standard-Konstruktor mit Collection

#### Java 

```Java
Collection<Integer> numbers = IntStream.range(0, 10).boxed().collect(toSet());

List<Integer> list = new ArrayList<>(numbers);
```

#### C#

```c#

```

## Methoden eines ArrayList

### ein Element hinzufügen

Mit den Methode *add(<Wert>)* bzw. *add(<Index>, <Wert>)* werden einzelne Elemente hinzugefügt.

#### Java 

```Java
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

#### C#

```c#

```

### ArrayList iterieren

Um ArrayLists zu iterieren wird zunächst der Iterator definiert: *Iterator* oder *ListIterator* (Vorteil vom 2. ist, dass man damit die Liste in beiden Richtungen iterieren kann).

Mit einem *Iterator* iteriert man mit dem Befehl *next()*.

Mit einem *ListIterator* kann man zusätzlich mit *previous()* rückwärts iterieren.

#### Java 

```Java
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

```c#

```

### ArrayList durchsuchen

Bei der Suche in einem ArrayList unterscheidet man zwischen 2 Zuständen:
- die Liste ist nicht sortiert
- die Liste ist bereits sortiert

#### Suche in der nicht sortierten Liste

#### Java 

```Java
List<Integer> list = new ArrayList<>(numbers);

list.add(1000);
list.add(2000);
list.add(5000);
list.add(3000);
list.add(1000); // Die Liste list schaut hier wie folgt aus: [1000, 2000, 5000, 3000, 1000]

Set<String> matchingStrings = new HashSet<>(Arrays.asList(5000, 2000));
Iterator<String> it = stringsToSearch.iterator();

List<String> result = new ArrayList<>();
while (it.hasNext()) {
    String s = it.next();
    if (matchingStrings.contains(s)) {
        result.add(s);
    }
}
// result würde wie folgt aussehen: [2000, 5000]
```

#### C#

```c#

```


#### Suche in einer bereits sortierten Liste

Hier gehen wir davon aus, dass die Elemente der Liste vor der Suche sortiert wurden (entweder beim Hinzufügen oder nachträglich).

#### Java 

```Java
List<Integer> list = new ArrayList<>(numbers);

list.add(1000);
list.add(2000);
list.add(5000);
list.add(3000);
list.add(1000); // Die Liste list schaut hier wie folgt aus: [1000, 2000, 5000, 3000, 1000]

Collections.sort(list);

int index = Collections.binarysearch(list, 5000)

// index ergibt: 4
```

Hier ist anzumerken, dass die Suche *-1* ergibt, wenn das gesuchte Element nicht gefunden wird.

#### C#

```c#

```

### Löschen eines Elements

Das Löschen eines Elements erfolgt mit den Methoden *remove(<Index>)* oder *remove(<Objekt>)*. 

#### Java 

```Java

List<String> stringsToSearch = new ArrayList<>(list);
stringsToSearch.addAll(list);

Set<String> matchingStrings = HashSet<>(Arrays.asList("a", "b", "c", "d", "e", "f"));

Iterator<String> it = stringsToSearch.iterator();
while (it.hasNext()) {
    if (matchingStrings.contains(it.next())) {
        it.remove();
    }
}
```

Hier ist anzumerken, dass die Suche *-1* ergibt, wenn das gesuchte Element nicht gefunden wird.

#### C#

```c#

```

Zurück zur [Startseite](README.md)
