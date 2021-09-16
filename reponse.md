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
[3] 3- Utiliser *Fake it* pour faire passer le test en faisant renvoyer à `getTranslation` la réponse attendue par le test.