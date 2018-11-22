# Data section: topics

## TOPIC
|ID|RTO
|:--|:--
|**Designation**|**TOPIC**
|**Description**|For the validation of a **Topic**, the rules defined in [[1]] Chap. 3.3.6 apply
|**Details**|<ul><li>The value ```%Model.Topic%``` must satisfy the ```ModelDef``` ([[1]] Chap. 2.5.1) and the ```TopicDef``` ([[1]] Chap. 2.5.2) in the INTERLIS data model</li><li>Each data container (```Basket```) receives a transfer identification  (XML attribut ```BID```). Where necessary, the ```BID``` value must satisfy the ```TopicDef``` ([[1]] Chap. 2.5.2) in the INTERLIS data model. The rules defined in [[1]] Chap. 2.8.9 also apply</li><li>All ```BID``` and all ```TID``` ([see Classes](classes.md)) within a transfer must be unique ([[1]] Chap. 3.3.7 and 3.2.6)</li>
|**Reference**|[[1]] Chap. 2.5.1, 2.5.2, 2.8.9, 3.2.5, 3.2.6 and 3.3.6</td>

### Test cases
###### Topics - RTO.T01
|ID|RTO.T01
|:--|:--
|**Designation**|**Topics:** ```TopicDef```
|**Description**|The tests must check whether the value ```%Model.Topic%``` satisfies the definition the INTERLIS data model
|**Test requirement**|[RTO.T01a.xtf](../data/RTO.T01a.xtf)
|**Expected result**|<ul><li>RTO.T01a.xtf: error message. Value ```%Topic%``` is wrong</li></ul>
|**Reference**|[[1]] Chap. 2.5.1, 3.3.4 and 3.3.6</td>

###### Topics - RTO.T02
|ID|RTO.T02
|:--|:--
|**Designation**|**Topics:** ```BID```
|**Description**|The tests must check whether the ```BID``` exists and satisfies the encoding rules
|**Test requirement**|[RTO.T02a.xtf](../data/RTO.T02a.xtf), [RTO.T02b.xtf](../data/RTO.T02b.xtf), [RTO.T02c.xtf](../data/RTO.T02c.xtf), [RTO.T02d.xtf](../data/RTO.T02d.xtf)
|**Expected result**|<ul><li>RTO.T02a.xtf: error message. ```BID``` not available</li><li>RTO.T02b.xtf: error message. Empty ```BID```</li><li>RTO.T02c.xtf: error message. ```BID``` must be encoded as XML-ID «à la INTERLIS». The first character must be a letter or a digit or an underscore</li><li>RTO.T02d.xtf: error message. Characters with umlauts are not allowed</li></ul>
|**Reference**|[[1]] Chap. 2.8.9 and 3.3.1<br/>[Object identification](identifiers.md)

###### Topics - RTO.T03
|ID|RTO.T03
|:--|:--
|**Designation**|**Topics:** ```BID``` **and** ```TID```
|**Description**|The tests must check whether all ```BID``` and all ```TID``` within the transfer are unique
|**Test requirement**|[RTO.T03a.xtf](../data/RTO.T03a.xtf), [RTO.T03b.xtf](../data/RTO.T03b.xtf)
|**Expected result**|<ul><li>RTO.T03a.xtf: error message. Double ```BID```</li><li>RTO.T03b.xtf: error message. Same value in ```BID``` and in ```TID```</li></ul>
|**Reference**|[[1]] Chap. 3.3.7 and 3.2.6

###### Topics - RTO.T04
|ID|RTO.T04
|:--|:--
|**Designation**|**Topics: containers and models**
|**Description**|The tests must check containers corresponding to different models
|**Test requirement**|[RTO.T04a.xtf](../data/RTO.T04a.xtf)
|**Expected result**|<ul><li>RTO.T04a.xtf: no error message</li></ul>

###### Topics - RTO.T05
|ID|RTO.T05
|:--|:--
|**Designation**|**Topics: empty containers**
|**Description**|The tests must check the rules for empty containers
|**Test requirement**|[RTO.T05a.xtf](../data/RTO.T05a.xtf), [RTO.T05b.xtf](../data/RTO.T05b.xtf)
|**Expected result**|<ul><li>RTO.T05a.xtf: no error message</li><li>RTO.T05b.xtf: no error message</li></ul>
|**Reference**|[[1]] Chap. 3.3.3, 3.3.5 and 3.3.6

###### Topics - RTO.T06
|ID|RTO.T06
|:--|:--
|**Designation**|**Topics: containers and imported models**
|**Description**|The tests must check containers that have been defined on the basis of imported models
|**Test requirement**|[RTO.T06a.xtf](../data/RTO.T06a.xtf), [RTO.T06b.xtf](../data/RTO.T06b.xtf), [RTO.T06c.xtf](../data/RTO.T06c.xtf)
|**Expected result**|<ul><li>RTO.T06a.xtf: no error message</li><li>RTO.T06b.xtf: no error message</li><li>RTO.T06c.xtf: error message. Because of ```ASSOCIATION```, the data must be transferred in a single basket</li></ul>
|**Reference**|[[1]] Chap. 2.5.1 and Appendix C

[1]: bib.md#1-cogis-interlis-version-2--reference-manual-13042006
[2]: bib.md#2-w3c-extensible-markup-language-xml-10-fifth-edition-26112008
