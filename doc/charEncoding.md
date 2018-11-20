# Characters encoding

## Characters encoding
|ID|RZe
|:--|:--
|**Designation**|**Characters encoding**
|**Description**|For the encoding of XML-String respectively XML-NormalizedString, the rules defined in [[1]] Chap. 3.3.1, Chap. 3.3.2 and Annex B apply
|**Reference**|[[1]] Chap. 3.3.1, 3.3.2 and Annex B

### Test cases
###### Characters encoding - RZe.T01
|ID|RZe.T01
|:--|:--
|**Designation**|**Characters encoding**
|**Description**|The tests must check whether the characters satisfy the UTF-8 encoding rules
|**Test requirement**|[RZe.T01a.xtf](../data/RZe.T01a.xtf), [RZe.T01b.xtf](../data/RZe.T01b.xtf), [RZe.T01c.xtf](../data/RZe.T01c.xtf)
|**Expected result**|<ul><li>RZe.T01a.xtf: no error message</li><li>RZe.T01b.xtf: error message. File not encoded as UTF-8 </li><li>RZe.T01c.xtf: error message. Invalid UTF-8 characters</li></ul>
|**Reference**|[[1]] Chap. 3.3.2

[1]: bib.md#1-cogis-interlis-version-2--reference-manual-13042006
