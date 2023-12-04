# LinkedList

Eine *LinkedList* ist eine doppelt verkettete Liste. Daher muss die Liste bei jedem Zugriff auf einem Element, die ganze Liste bis zu diesem Element durchlaufen werden.

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

### Java 

*LinkedList* bietet neben den üblichen Methoden *add()* bzw. *addAll()* auch *addFirst()* und *addLast*, um Elemente am Anfang bzw. am Ende der Liste hinzuzufügen.

### C#

```c#

```

## Element löschen

Wie beim Hinzufügen eines Elementen werden neben den Standard *remove()*-Methoden auch *removeFirst()* und *removeLast()*, aber auch *removeFirstOccurence()* und *removeLastOccurence()* angeboten.

## Zusammenfassend

Zusammenfassend ist anzumerken, dass ArrayList die Standard Listenimplementierung ist. Allerdings kann die LinkedList in bestimmten Fällen einen Vorteil bringen, insbesondere wenn die Dauer fürs Hinzufügen/Löschen von Elementen wichtiger als die Dauer für den Zugriff auf Elementen bzw. der Speicherbedarf ist.