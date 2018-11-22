# Header section

## HEADERSECTION
|ID|RHE
|:--|:--
|**Designation**|**HEADERSECTION**
|**Description**|For the validation of the header section, the rules defined in [[1]] Chap. 3.3.4 apply
|**Details**|<ul><li>The XML attributes ```VERSION``` and ```SENDER``` in tag ```HEADERSECTION``` are mandatory</li><li>The element ```MODELS``` must list all models (at least one) for which data is available</li><li>The XML attributes ```NAME```, ```VERSION``` and ```URI``` in tag ```MODEL``` are mandatory</li><li>The value ```NAME``` must satisfy the ```ModelDef``` ([[1]] Chap. 2.5.1) in the INTERLIS data model</li><li>The value ```VERSION``` should satisfy the ```ModelDef``` ([[1]] Chap. 2.5.1) in the INTERLIS data model</li><li>The value ```URI``` has no further meaning for data validation</li></ul>
|**Reference**|[[1]] Chap. 2.5.1 and 3.3.4

### Test cases
###### Header section - RHE.T01
|ID|RHE.T01
|:--|:--
|**Designation**|**Header section: XML attributes**
|**Description**|The tests must check whether the XML attributes ```VERSION``` and ```SENDER``` are available in the tag ```HEADERSECTION```
|**Test requirement**|[RHE.T01a.xtf](../data/RHE.T01a.xtf), [RHE.T01b.xtf](../data/RHE.T01b.xtf), [RHE.T01c.xtf](../data/RHE.T01c.xtf)
|**Expected result**|<ul><li>RHE.T01a.xtf: error message. ```VERSION``` not available</li><li>RHE.T01b.xtf: error message. ```SENDER``` not available</li><li>RHE.T01c.xtf: error message. ```VERSION``` not equal 2.3</li></ul>
|**Reference**|[[1]] Chap. 3.3.4

###### Header section - RHE.T02
|ID|RHE.T02
|:--|:--
|**Designation**|**Header section: tag MODELS**
|**Description**|The tests must check whether the tag ```MODELS``` is available in the tag ```HEADERSECTION```
|**Test requirement**|[RHE.T02a.xtf](../data/RHE.T02a.xtf)
|**Expected result**|<ul><li>RHE.T02a.xtf: error message. Tag ```MODELS``` not available</li></ul>
|**Reference**|[[1]] Chap. 3.3.4

###### Header section - RHE.T03
|ID|RHE.T03
|:--|:--
|**Designation**|**Header section: tag MODEL**
|**Description**|The tests must check whether the tag ```MODEL``` is available in the Tag ```MODELS```
|**Test requirement**|[RHE.T03a.xtf](../data/RHE.T03a.xtf)
|**Expected result**|<ul><li>RHE.T03a.xtf: error message. Tag ```MODEL``` not available</li></ul>
|**Reference**|[[1]] Chap. 3.3.4

###### Header section - RHE.T04
|ID|RHE.T04
|:--|:--
|**Designation**|**Header section: XML attributes in tag MODEL**
|**Description**|The tests must check whether the XML attributes ```NAME```, ```VERSION``` and ```URI``` are available in tag ```MODEL```
|**Test requirement**|[RHE.T04a.xtf](../data/RHE.T04a.xtf), [RHE.T04b.xtf](../data/RHE.T04b.xtf), [RHE.T04c.xtf](../data/RHE.T04c.xtf)
|**Expected result**|<ul><li>RHE.T04a.xtf: error message. ```NAME``` not available</li><li>RHE.T04b.xtf: error message. ```VERSION``` not available</li><li>RHE.T04c.xtf: error message. ```URI``` not available</li></ul>
|**Reference**|[[1]] Chap. 3.3.4

###### Header section - RHE.T05
|ID|RHE.T05
|:--|:--
|**Designation**|**Header section: attribute value in ```NAME``` and ```VERSION```**
|**Description**|The tests must check whether the values of the attributes ```NAME``` and ```VERSION``` in tag ```MODEL``` satisfy the ```ModelDef``` in the INTERLIS data model
|**Test requirement**|[RHE.T05a.xtf](../data/RHE.T05a.xtf), [RHE.T05b.xtf](../data/RHE.T05b.xtf)
|**Expected result**|<ul><li>RHE.T05a.xtf: error message. The value ```NAME``` is wrong (model ``TestSuite`` not available)</li><li>RHE.T05b.xtf: error message. The value ```VERSION``` is wrong</li></ul>
|**Reference**|[[1]] Chap. 3.3.4

[1]: bib.md#1-cogis-interlis-version-2--reference-manual-13042006
