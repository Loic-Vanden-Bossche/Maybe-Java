/!\ Vous devez impérativement écrire votre code dans le répertoire src/main/com/gitlab/

# Partie 1 : Lambdas

Une lambda est une fonction anonyme (pas de nom) de première classe (First-Class Citizen). C'est-à-dire qu'elle peut être passée en paramètre ou retournée par une autre méthode.
En conséquence de quoi une lambda peut être stockée dans une variable (elle a donc un type).

En Java, le type d'une lambda est définie par une interface fonctionnelle.


### Exercice 1 (total: 2 points)

#### Etape 1 (1 points)
`Consumer` permet de définir des lambdas qui reçoivent un Integer et effectue des opérations.
- Créer une interface `Consumer`
- Lui ajouter une méthode `void perform(Integer value)`
- Ajouter l'annotation `@FunctionalInterface` devant la déclaration de l'interface


#### Etape 2 (1 points)
- Décommenter `test1` dans le fichier *Exercie1.java* : les tests doivent tous passés au vert
- Décommenter et compléter `test2` dans le fichier *Exercie1.java*

Une lambda ne peut affecter une variable. Par contre, elle peut modifier l'état d'un objet (appeler un setter, par exemple). C'est pourquoi nous devons utiliser la classe `Result`.

----

### Exercice 2 (total: 5 points)
`Predicate` définit des lambdas qui retourne vrai si la valeur passée en paramètre valide le prédicat.Faux sinon
Pour rappel un prédicat est une opération booléenne du type : `(2 + 2) == 4` ou `myString.contains("abcd")`

#### Etape 1 (3 points)
- Créer une nouvelle interface fonctionnelle `Predicate` avec une méthode `perform` qui prend en paramètre un Integer

#### Etape 2 (2 points)
- Décommenter les tests `test3` et `test4` et valider l'interface fonctionnelle `Predicate`

-----

# Partie 2 : Higher Order Function

Une fonction d'ordre supérieur est une une fonction qui prend ou retourne une autre fonction (first-class citizen).

### Exercice 3 (total: 3 points)

#### Etape 1 (2 points)
- Créer une classe `Value` qui a un attribut `Integer value`
- Ajouter une méthode `is` qui prend un `Predicate` en paramèttre et qui retourne `true` si l'attribut `value` valide le prédicat. `false`, sinon.

#### Etape 2 (1 points)
- Décommenter les tests `test5` et `test6` et valider le fonctionnement de la classe `Value`


### Exercice 4 (total: 3 points)

#### Etape 1 (2 points)
- Ajouter une méthode `then` qui prend un `Consumer` en paramètre
- Appeler le `Consumer` dans la méthode `then` en lui passant l'attribut en paramètre

#### Etape 2 (1 points)
- Ecrire le `test7` pour valider le bon fonctionnement de la méthode `then`
  - Penser à utiliser la classe `Result` comme dans la partie 1


-----

# Partie 3 : Maybe

Le pattern *Maybe* (ou *Optional*) permet d'encapsuler un objet qui peut être nul.

L'objectif est de simplifier les traitements des objets *nullable* en s'abstrayant des conditions de le code : si l'objet est une valeur (instance de `Value`), alors `then` appellera le consumer. Si c'est une instance de `None`, `then` ne fera rien.
Pour la méthode `is`, applique le prédicat sur une valeur et retourne systématiquement `false` pour une instance de `None`.


### Exercice 5 (total: 5 points)

#### Etape 1 (2 points)
- Créer une interface `Maybe`
- Ajouter les méthodes `then` et `is`
- La classe `Value` doit implémenter cette interface

#### Etape 2 (2 points)
- Créer une classe `None` qui implémente l'interface `Maybe`
- La méthode `is` retourne tout le temps `false`
- La méthode `then` ne fait rien

#### Etape 3 (1 points)
- Ecrire le tests `test8` et `test9` pour valider le fonctionnement de la classe `None`


### Exercice 6 (2 points)

- Créer une méthode statique `Maybe.of(Integer value)` qui retourne une instance de `Value` si le paramètre n'est pas nul
- Créer une méthode statique `Maybe.nothing()` qui retourne une instance de `None`
- Empêcher l'instanciation des classes `Value` et `None` autrement que par l'appel de ces deux méthodes statiques
- Décommenter le `test10` pour valider la création des objets.
