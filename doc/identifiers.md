# Object identification

```BID``` and ```TID``` are encoded as XML-ID ([[1]] Chap. 3.3.6 and 3.3.7). The EBNF rule for XML-ID is ([[1]] Chap. 3.3.1):

``
XML-ID = XML-ValueDelimiter [ XML-NcName ':' ] ( Letter | Digit | '_' ) { Letter | Digit | '_' | '-' | '.' } XML-ValueDelimiter
``

According to this rule, a BID/TID can have a letter or a digit or an underscore as first character (not "proper" XML-ID according to https://www.w3.org/TR/xml-id/#id-avn).

```OID``` values of text ```OID``` domains must comply with the rules of the XML-ID type: they are "proper" XML-ID.

```STANDARDOID``` and ```UUIDOID``` have their own definitions.

Summary:

* ```TID``` and ```BID``` are encoded as XML-ID «à la INTERLIS» (according to [[1]] Chap. 3.3.1) and not as "proper" XML-ID
* ```STANDARDOID```: only numbers and letters are allowed ([[1]] Chap. 2.8.9)
* ```UUIDOID```: valid UUID according to ISO 11578 ([[1]] Chap. 2.8.9)
*	Numeric ```OID```: only numbers are allowed
*	Text ```OID```: "proper" XML-ID (according to [[1]]  Chap. 2.8.9)

[1]: bib.md#1-cogis-interlis-version-2--reference-manual-13042006
