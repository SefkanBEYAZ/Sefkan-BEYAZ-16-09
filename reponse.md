#Fake it#

[X] 1- Construire une classe de tests nommée `DictionaryTest`
[X] 2- Ecrire dans cette classe un test créant un objet de type `Dictionary`, lui assignant un nom, et vérifiant que ce nom est correctement stocké dans l’objet.
[X] 3- Créer une classe `Dictionary` vide, puis lui ajouter un constructeur vide.
[X] 4- Écrire une méthode vide `getName()` renvoyant la chaîne de caractères `"Example"`.
[X] 5- La valeur "example" du champ name
[X] 6- Supprimer la duplication du code en introduisant un attribut privé `name`, et adapter le constructeur et la méthode `getName()`de manière à s’assurer que cette variable soit correctement positionnée et renvoyée.
[X] 7- Utiliser la technique précédente pour écrire un test, puis une méthode permettant de vérifier si un dictionnaire est vide ou pas (méthode `isEmpty`). En l’absence de méthodes pour ajouter quoi que ce soit au dictionnaire, on se limitera à renvoyer une valeur constante.
[X] 8- Comme cette fonctionnalité n’est pas implémentée de manière correcte, rajouter le problème du traitement du dictionnaire vide dans la task list


#Triangulation#

[X] 1- Écrire un test permettant de vérifier que l’ajout d’une traduction au dictionnaire (`addTranslation`) se passe correctement lors de la vérification (`getTranslation`).
[X] 2- Oui, on pourrait ne pas implémenter la méthode addTranslation et directement ajouter une traduction dans le constructeur
[X] 3- Utiliser *Fake it* pour faire passer le test en faisant renvoyer à `getTranslation` la réponse attendue par le test.
[X] 4- Ajouter dans le test la vérification d’une seconde traduction qui soit différente de la première.
[X] 5- Ajouter à la classe `Dictionary`une table de hachage `Map<String, String> translations`.
[X] 6- Rendre le code de `addTranslation` et de `getTranslation` correct.
[7] 7- Améliorer le test du vide du dictionnaire en augmentant le test initial.

#JUnit#
[X] Prévoir une fixture pour l’ensemble des tests de la classe DictionaryTest.

#Traductions multiples#
[X] 1-On peut ajouter à un mot une List et non pas un String
[X] 2-Ajouter un test permettant de vérifier le fonctionnement d’une traduction ayant deux sens possibles.
