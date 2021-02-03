# Test Suite - Routine
The test routine is implemented as a *gradle* project.

## Requirements
- JAVA Development Kit
- [iG/Check](https://www.interlis.ch/downloads/igcheck) (locally installed)

## Getting Started
Clone/download the repository and change the working directory:

```
cd suite-interlis/routine
```

### Run the Test Suite
```
gradlew -Pvendor=<vendor> test
```
The parameter ``<vendor>`` can contain the values ``ilivalidator`` or ``ig/check``.

The results are available in ``/build/reports/tests/test/index.html``.

### Compile the JavaDoc
```
gradlew -Pvendor=<vendor> javadoc
```
The JavaDoc is available in  ``/build/docs/javadoc/index.html``.

### Does a proxy server have to be used?
```
gradlew -Dhttp.proxyHost=theProxyServer -Dhttp.proxyPort=theProxyPort -Pvendor=<vendor> test
```
### Isn't JAVA-JDK in PATH?
```
gradlew -Dorg.gradle.java.home=/pathToJavaJDK -Pvendor=<vendor> test
```
### Isn't ics.exe (iG/Check) in PATH?
- Alternative 1
```
SET PATH=%PATH%;'pathToics.exe'
gradlew -Pvendor=ig/check test
```
- Alternative 2
```
gradlew -Pvendor=ig/check -Pics=pathToics.exe test
```
The parameter ``-Pics`` can also be used to test different versions of iG/Check.

### Testing other versions of the ilivalidator
The routine is preconfigured to test the ilivalidator version 1.11.9.
To test other versions, string ``compile 'ch.interlis:ilivalidator:1.11.9'`` in the ``build.gradle`` file (under ``dependencies``) must be modified accordingly.

### Skip specific tests
All test types are listed in the file ``build.gradle`` (under ``test``). To skip a test type, the corresponding line must be commented out.

### File interlis2.cfg
Specific iG/Check settings can be set in the file ``interlis2.cfg`` in the directory ``igcheck2``.

### Tests that have been switched off directly in the code
#### ilivalidator Version 1.11.9
| Test | Reason |
| --- | --- |
| RCO.T01a.xtf | java.lang.NullPointerException |
| RCO.T02b.xtf | Hang |
| RHE.T01b.xtf | java.lang.IllegalArgumentException instead of java.lang.AssertionError. Error message is correct |
| RHE.T04a.xtf | java.lang.IllegalArgumentException instead of java.lang.AssertionError. Error message is correct |
| RTO.T02a.xtf | java.lang.IllegalArgumentException instead of java.lang.AssertionError. Error message is correct |
| RTR.T02a.xtf | Error message is wrong/incomplete |
| RTR.T04a.xtf | Error message is wrong |
| RXW.T02a.xtf | Error message is wrong |

#### iG/Check Version 2018.0.695, 29.11.2019
| Test | Reason |
| --- | --- |
| RAt.T11e.xtf | Error message is wrong |
| RAt.T11f.xtf | Error message is wrong |
| RKo.T03a.xtf | Error message is wrong |
| RKo.T03b.xtf | Error message is wrong |
| RTO.T06c.xtf | Error message is wrong |
