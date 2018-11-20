# Transfer structure

## Transfer
|ID|RTR
|:--|:--
|**Designation**|**TRANSFER**
|**Description**|For the validation of the transfer structure, the rules defined in [[1]] Chap. 3.3.3 apply
|**Details**|<ul><li>The declaration ```<?xml version="1.0" encoding="UTF-8">``` is mandatory</li><li>The XML attribute ```xmlns="http://www.interlis.ch/INTERLIS2.3"``` in tag ```TRANSFER``` is mandatory</li><li>The XML tags  must be in the correct order (```TRANSFER```, ```HEADERSECTION```, ```DATASECTION```)</li>
|**Reference**|[[1]] Chap. 3.3.3

### Testfälle
###### Transfer - RTR.T01
|ID|RTR.T01
|:--|:--
|**Designation**|**Transfer: XML declaration**
|**Description**|The tests must check whether the XML declaration exists
|**Test requirement**|[RTR.T01a.xtf](../data/RTR.T01a.xtf)
|**Expected result**|<ul><li>RTR.T01a.xtf: error message. XML declaration not available</li></ul>
|**Reference**|[[1]] Chap. 3.3.3<br/>[[2]] Chap. 2.8 (https://www.w3.org/TR/xml/#sec-prolog-dtd)



###### Transfer - RTR.T02
|ID|RTR.T02
|:--|:--
|**Designation**|**Transfer: structure of a transfer file**
|**Description**|The tests must check whether the XML tags ```TRANSFER```, ```HEADERSECTION```, ```DATASECTION``` exist
|**Test requirement**|[RTR.T02a.xtf](../data/RTR.T02a.xtf), [RTR.T02b.xtf](../data/RTR.T02b.xtf), [RTR.T02c.xtf](../data/RTR.T02c.xtf)
|**Expected result**|<ul><li>RTR.T02a.xtf: error message. ```TRANSFER``` not available</li><li>RTR.T02b.xtf: error message. ```HEADERSECTION``` not available</li><li>RTR.T02c.xtf: error message. ```DATASECTION``` not available</li></ul>
|**Reference**|[[1]] Chap. 3.3.3

###### Transfer - RTR.T03
|ID|RTR.T03
|:--|:--
|**Designation**|**Transfer: elements order**
|**Description**|The tests must check whether the XML tags ```TRANSFER```, ```HEADERSECTION```, ```DATASECTION``` are in the correct order
|**Test requirement**|[RTR.T03a.xtf](../data/RTR.T03a.xtf)
|**Expected result**|<ul><li>RTR.T03a.xtf: error message. ```HEADERSECTION``` and ```DATASECTION``` occur in reverse order</li></ul>
|**Reference**|[[1]] Chap. 3.3.3

###### Transfer - RTR.T04
|ID|RTR.T04
|:--|:--
|**Designation**|**Transfer: attribute xmlns**
|**Description**|The tests must check whether the xmlns attribute exists in tag ```TRANSFER```
|**Test requirement**|[RTR.T04a.xtf](../data/RTR.T04a.xtf)
|**Expected result**|<ul><li>RTR.T04a.xtf: error message. xmlns attribute not available</li></ul>
|**Reference**|[[1]] Chap. 3.3.3

[1]: bib.md#1-cogis-interlis-version-2--reference-manual-13042006
[2]: bib.md#2-w3c-extensible-markup-language-xml-10-fifth-edition-26112008
