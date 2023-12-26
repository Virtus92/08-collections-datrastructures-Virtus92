# LinkedList

Eine *LinkedList* ist eine doppelt verkettete Liste. Das heißt, ein Element der Liste hat:
* einen Wert
* ein voriges Element
* ein nächtes Element

Die *LinkedList* wird über das erste und das letzte Element der Liste definiert. Auf die weiteren Elemente kann zugegriffen werden, indem die Liste vom ersten oder vom letzten Element aus durchiteriert wird.

In diesem Kapitel stellen wir die wichtigsten Eigenschaften und Methoden der *LinkedList* vor.

## Vergleich ArrayList / LinkedList

Die Daten einer *ArrayList* sind in einem Array im Hintergrund gespeichert, sodass der zufällige Zugriff auf ein bestimmtes Element eine **Performance von O(1)** aufweist.

Auf der anderen Seite sind die Daten einer *LinkedList* in einer Liste von Elementen gespeichert, welche mit dem vorigen und nächsten Element verlinkt sind. So ist beim zufälligen Zugriff auf ein bestimmtes Element **die Performance O(n)**.

Beim Hinzufügen oder Löschen eines Elementen aus einer *LinkedList* werden lediglich die benachbarten Elemente verändert (next und previous werden neu gesetzt), während bei einem *ArrayList* die Größe des Arrays angepasst werden muss.

In Punkto Speicherbedarf verbraucht eine *LinkedList* mehr Speicher als eine *ArrayList*, weil sie für jede Node neben den Daten 2 Referenzen (previous und next) während die *ArrayList* lediglich die Daten und das jeweilige Index speichert.

## Instanzierung eines LinkedList

### Java 

```Java
List<Object> list = new LinkedList<>();
```

### C#

```c#

```

## Element hinzufügen

*LinkedList* bietet neben den üblichen Methoden *add()* bzw. *addAll()* auch *addFirst()* und *addLast*, um Elemente am Anfang bzw. am Ende der Liste hinzuzufügen. Weiters kann auch die Methode push aus der Queue-Schnittstelle verwendet werden

### Java 

```Java
Object object = new Object();
list.add(object); //'object' am Ende der Liste hinzufügen, liefert true wenn erfolgreich
list.add(0, object); // 'object' an der Position 0 in der Liste hinzufügen

list.addFirst(object); // fügt 'object' an erster Stelle in die LinkedList hinein
list.addLast(object); // fügt 'object' an letzter Stelle in die LinkedList hinein

Collection<String> collect = new ArrayList<String>();
collect.add("CORDERS");
collect.add(".");
collect.add("BAY");
list.addAll(collect); // fügt alle Elemente von collect in die LinkedList hinein
list.addAll(2, collect); //fügt alle Elemente von 'collect' an der Position 2 in die LinkedList hinein

list.push(object); // fügt 'object' an erster Stelle in list hinein
```

### C#

```c#

```

## Elemente ausgeben/finden

In einer *LinkedList* werden die Methoden *get()*, *getFirst()*, *getLast()*, *contains()* angeboten.

### Java

```Java
Object element = list.get(3); // Gibt das Element an Position 3 (0 ist das erste Element) aus

Object firstElement = list.getFirst(); // Gibt das erste Element der Liste aus
Objekt lastElement = list.getLast(); // Gibt das letzte Element der Liste aus

boolean found = list.contains(searchedElement); // Gibt an, ob das Element in der Liste gefunden wurde

```

### C#

```c#

```

## Element löschen

Wie beim Hinzufügen eines Elementen werden neben den Standard *remove()*-Methoden auch *removeFirst()* und *removeLast()*, aber auch *removeFirstOccurence()* und *removeLastOccurence()* angeboten.

Weiters werden auch die Queue-Methoden angeboten: poll() und pop() bzw. pollFirst() und pollLast(). Der Unterschied zwischen poll und pop liegt darin, dass pop() bei einer leeren LinkedList eine *NoSuchElementException* auswerfen wird.

Mit der Methode *clear()* werden alle Elemente der LinkedList gelöscht.

### Java

```Java
boolean deleteSuccessfull = list.remove(); // entfernt das erste Element (head) aus list und gibt true zurück, wenn erfolgreich
deleteSuccessfull = list.remove(0); // entfernt das Element an der Position 0 aus list
deleteSuccessfull = list.remove(object); // entfernt das Element 'object' aus list
deleteSuccessfull = list.removeFirst(); // entfernt das erste Element aus list
deleteSuccessfull = list.removeLast(); // entfernt das letzte Element aus list

list.removeFirstOccurence(object); // entfernt die erste Instanz von 'object' aus list
list.removeLastOccurence(object); // entfernt die letzte Instanz von 'object' aus list

object deletedElement = list.poll(); // entfernt das erste Element (head) aus list und gibt das gelöschte Element zurück, gibt null zurück, wenn list leer ist.
object deletedElement = list.pollFirst(); // entfernt das erste Element (head) aus list und gibt das gelöschte Element zurück, gibt null zurück, wenn list leer ist.
object deletedElement = list.pollLast(); // entfernt das letzte Element (tail) aus list und gibt das gelöschte Element zurück, gibt null zurück, wenn list leer ist.

object deletedElement = list.pop(); // entfernt das erste Element (head) aus list und gibt das gelöschte Element zurück, wirft NoSuchElementException aus, wenn list leer ist.


list.clear(); // entfernt alle Elemente aus list
```

### C#

```c#

```

## Liste clonen

*LinkedList* sind Objekte, also ein Referenzdatentyp, kein primärer Datentyp. Daher würde eine Zuweisung von list zu einer neuen Variable linkedList dazu führen, dass beide Variablen exakt dieselben Elemente beinhalten und daher die Änderung eines Elements in list sich auch auf linkedList auswirkt.
So benötigt man eine Methode, um die Elemente der Liste zu kopieren eine *clone()*-Methode! 

### Java 

```Java
List linkedListCopy = list.clone(); // erstellt eine Kopie der Liste list in linkedListCopy
```

### C#

```c#

```

## Zusammenfassend

Zusammenfassend ist anzumerken, dass ArrayList die Standard Listenimplementierung ist. Allerdings kann die LinkedList in bestimmten Fällen einen Vorteil bringen, insbesondere wenn die Dauer fürs Hinzufügen/Löschen von Elementen wichtiger als die Dauer für den Zugriff auf Elemente bzw. der Speicherbedarf ist.