# XML

## Predefined XML rules
|ID|RVX
|:--|:--
|**Designation**|**Predefined XML rules**
|**Description**|The predefined rules in [[1]] Chap. 3.3.1 apply
|**Reference**|[[1]] Chap. 3.3.1

## XML Well-Formedness
|ID|RXW
|:--|:--
|**Designation**|**XML Well-Formedness**
|**Description**|XML-formatted INTERLIS transfer files must be well-formed according to the XML-1.0 standard [[2]]
|**Reference**|[[1]] Chap. 3.3.1 and 3.3.3

### Test cases
###### XML Well-Formedness - RXW.T01
|ID|RXW.T01
|:--|:--
|**Designation**|**Tags**
|**Description**|The tests must check the well-formedness of the tags
|**Test requirement**|[RXW.T01a.xtf](../data/RXW.T01a.xtf), [RXW.T01b.xtf](../data/RXW.T01b.xtf)
|**Expected result**|<ul><li>RXW.T01a.xtf: error message. There is a space in the ```DATASECTION``` tag</li><li>RXW.T01b.xtf: error message. The closing tag ```TRANSFERs``` does not match the opening tag ```TRANSFER```</li></ul>
|**Reference**|[[1]] Chap. 3.3.1 and 3.3.3 <br/>[[2]] Chap. 2.1 (https://www.w3.org/TR/xml/#sec-starttags>)

###### XML Well-Formedness - RXW.T02
|ID|RXW.T02
|:--|:--
|**Designation**|**XML attributes**
|**Description**|The tests must check whether the XML attributes are written in quotation marks (single or double quotation marks) and that an attribute name does not occur more than once in the same tag
|**Test requirement**|[RXW.T02a.xtf](../data/RXW.T02a.xtf), [RXW.T02b.xtf](../data/RXW.T02b.xtf), [RXW.T02c.xtf](../data/RXW.T02c.xtf), [RXW.T02d.xtf](../data/RXW.T02d.xtf), [RXW.T02e.xtf](../data/RXW.T02e.xtf), [RXW.T02f.xtf](../data/RXW.T02f.xtf)
|**Expected result**|<ul><li>RXW.T02a.xtf: error message. Attribute value (```xmlns```) not in quotation marks</li><li>RXW.T02b.xtf: no error message. Single and double quotation marks are both valid</li><li>RXW.T02c.xtf: error message. Double attribute ```BID```</li><li>RXW.T02d.xtf: error message. Double attribute ```TID```</li><li>RXW.T02e.xtf: error message. Double attribute ``VERSION`` in ``HEADERSECTION``</li><li>RXW.T02f.xtf: error message. Double attribute ``VERSION`` in ``MODEL``</li></ul>
|**Reference**|[[1]] Chap. 3.3.1<br/>[[2]] Chap. 3.1 (https://www.w3.org/TR/xml/#uniqattspec)

[1]: bib.md#1-cogis-interlis-version-2--reference-manual-13042006
[2]: bib.md#2-w3c-extensible-markup-language-xml-10-fifth-edition-26112008
