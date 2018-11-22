# Data section: Classes

## Classes
|ID|RKl
|:--|:--
|**Designation**|**Classes**
|**Description**|For the validation of class instances, the rules defined in [[1]] Chap. 3.3.7 for the element ```Object``` apply
|**Details**|<ul><li>The value ```%Model.Topic.Class%``` must satisfy the ```ClassDef``` ([[1]] Chap. 2.5.3) in the INTERLIS data model</li><li>Each class instance implicitly receives a transfer identification (XML attribute ```TID```). Where necessary, the ```TID``` value must satisfy the ```TopicDef``` ([[1]] Chap. 2.5.2) respectively the ```ClassDef``` ([[1]] Chap. 2.5.3) in the INTERLIS data model. The rules defined in [[1]] Chap. 2.8.9 also apply</li><li>All ```TID``` and all ```BID``` ([see Topic](topic.md)) within a transfer must be unique ([[1]] Chap. 3.3.7 and 3.2.6)</li></ul>
|**Reference**|[[1]] Chap. 2.5.2, 2.5.3, 2.7.1, 2.8.9, 3.2.6, 3.3.7 and 3.3.9.2

### Test cases
###### Classes - RKl.T01
|ID|RKl.T01
|:--|:--
|**Designation**|Classes: ```ClassDef```
|**Description**|The tests must check whether the value ```%Model.Topic.Class%``` satisfies the ```ClassDef``` in the INTERLIS data model
|**Test requirement**|[RKl.T01a.xtf](../data/RKl.T01a.xtf)
|**Expected result**|<ul><li>RKl.T01a.xtf: error message. Value ```%Class%``` is wrong</li></ul>
|**Reference**| [[1]] Chap. 3.3.7

###### Classes - RKl.T02
|ID|RKl.T02
|:--|:--
|**Designation**|Classes: ```TID```
|**Description**|The tests must check whether the ```TID``` exist and are unique
|**Test requirement**|[RKl.T02a.xtf](../data/RKl.T02a.xtf), [RKl.T02b.xtf](../data/RKl.T02b.xtf), [RKl.T02c.xtf](../data/RKl.T02c.xtf), [RKl.T02d.xtf](../data/RKl.T02d.xtf), [RKl.T02e.xtf](../data/RKl.T02e.xtf)
|**Expected result**|<ul><li>RKl.T02a.xtf: error message. Empty ```TID``` </li><li>RKl.T02b.xtf: error message. ```TID``` not available</li><li>RKl.T02c.xtf: error message. Double ```TID```</li><li>RKl.T02d.xtf: error message. ```TID``` must be encoded as XML-ID «à la INTERLIS». The first character must be a letter or a digit or an underscore</li><li>RKl.T02e.xtf: error message. Characters with umlauts are not allowed</li></ul>
|**Reference**|[[1]] Chap. 2.8.9, 3.3.1 and 3.3.7<br/>[Object identification](identifiers.md)

[1]: bib.md#1-cogis-interlis-version-2--reference-manual-13042006
