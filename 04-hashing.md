# Hashing

In den kommenden 2 Objekttypen kommt der Begriff Hash vor: HashSet und HashMap. Was bedeutet Hash?

Ein Hash ist die Umwandlung eines Objekts/Werts in eine Zeichenkette einer bestimmten Länge. Diese Zeichenkette stellt die Adresse dar, wo das Element in dem Objekt zu finden ist. Da der Hashwert nicht in den urspünglichen Wert zurückverwandelt werden soll können (im Gegensatz zur Verschüsselung) wird kein Schlüssel benötigt.

Wenn wir uns an die LinkedList oder Arraylist erinnern, um einen Wert zu finden mussten wir die gesamte Liste durchlaufen, bis der Wert gefunden wurde. Im Falle eine Hash-Objekttyps funktioniert es anders: man hast den zu suchenden Wert und es kommt die entsprechende "Adresse" heraus. So erfolgt der Zugriff sehr schnell.

Hashing wird zu verschiedenen Zwecken verwendet:
- Zugriff auf Elementen in Hash-Objekttypen bzw. in Datenbanken (Indices)
- Speicherung von Passwörtern: sinnvoll, da das gespeicherte Passwort nicht entschlüsselt werden kann
- Bitcoin Mining: Zur Sicherstellung, dass die Blockchain nicht manipuliert wurde.