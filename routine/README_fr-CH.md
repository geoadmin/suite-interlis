
# Suite de tests - Routine de test
La routine de test a été développée en tant que projet *gradle*.

## Conditions préalables
- Kit de développement JAVA
- [iG/Check](https://www.interlis.ch/downloads/igcheck) (installé localement)

## Getting Started
Clonez/téléchargez le repository et modifiez le répertoire de travail :

```
cd suite-interlis/routine
```

### Exécuter la suite de tests
```
gradlew -Pvendor=<vendor> test
```
Le paramètre  ``<vendor>`` peut contenir les valeurs ``ilivalidator`` ou ``ig/check``.

Les résultats sont disponibles dans ``/build/reports/tests/test/index.html``.

### Compiler la JavaDoc
```
gradlew -Pvendor=<vendor> javadoc
```
La JavaDoc est disponible dans ``/build/docs/javadoc/index.html``.

### Faut-il utiliser un serveur proxy ?
```
gradlew -Dhttp.proxyHost=theProxyServer -Dhttp.proxyPort=theProxyPort -Pvendor=<vendor> test
```
### JAVA-JDK n'est pas dans le PATH ?
```
gradlew -Dorg.gradle.java.home=/pathToJavaJDK -Pvendor=<vendor> test
```
### ics.exe (iG/Check) n'est pas dans le PATH ?
- Variante 1
```
SET PATH=%PATH%;'pathToics.exe'
gradlew -Pvendor=ig/check test
```
- Variante 2
```
gradlew -Pvendor=ig/check -Pics=pathToics.exe test
```
Le paramètre ``-Pics`` peut également être utilisé pour tester différentes versions du logiciel iG/Check.

### Tester d'autres versions de l'ilivalidator
La routine est préconfigurée pour tester l'ilivalidator version 1.11.4.
Pour tester d'autres versions de l'ilivalidator, l'information ``compile 'ch.interlis:ilivalidator:1.11.4'`` dans le fichier ``build.gradle`` (sous ``dependencies``) doit être modifiée en conséquence.

### Désactiver les tests spécifiques
Tous les types de test de la routine sont listés dans le fichier  ``build.gradle`` (sous ``test``). Pour désactiver un type de test, la ligne correspondante doit être décommentée.

### Fichier interlis2.cfg
Des paramètres iG/Check spécifiques peuvent également être définis dans le fichier ``interlis2.cfg`` dans le repertoire ``igcheck2``.

### Tests qui ont été désactivés directement dans le code
#### ilivalidator Version 1.11.4
| Test | Raison |
| --- | --- |
| RCO.T01a.xtf | java.lang.NullPointerException |
| RCO.T02b.xtf | Hang |
| RHE.T01b.xtf | java.lang.IllegalArgumentException au lieu de java.lang.AssertionError. Le message d'erreur est correct |
| RHE.T04a.xtf | java.lang.IllegalArgumentException au lieu de java.lang.AssertionError. Le message d'erreur est correct |
| RTO.T02a.xtf | java.lang.IllegalArgumentException au lieu de java.lang.AssertionError. Le message d'erreur est correct |
| RTR.T02a.xtf | Le message d'erreur est erroné |
| RTR.T02b.xtf | Le message d'erreur est erroné |
| RTR.T03a.xtf | Le message d'erreur est erroné |
| RTR.T04a.xtf | Le message d'erreur est erroné |
| RXW.T02a.xtf | Le message d'erreur est erroné |
| RXW.T02e.xtf | Le message d'erreur est erroné |
| RXW.T02f.xtf | Le message d'erreur est erroné |

#### iG/Check Version 2018.0, 08.10.2018
| Test | Raison |
| --- | --- |
| RAt.T11e.xtf | Le message d'erreur est erroné |
| RAt.T11f.xtf | Le message d'erreur est erroné |
| RKo.T03a.xtf | Le message d'erreur est erroné |
| RKo.T03b.xtf | Le message d'erreur est erroné |
| RTO.T06c.xtf | Le message d'erreur est erroné |
