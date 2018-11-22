# Data section: Constraints

## Constraints
|ID|RKo
|:--|:--
|**Designation**|**Constraints**
|**Description**|INTERLIS data must satisfy the ```ConstraintDef``` ([[1]] Chap. 2.12 and 2.13) in the INTERLIS data model
|**Details**|<ul><li>Constraints formulated with standard functions ([[1]] Chap. 2.14) must also be checked, especially geometrical constraints, such as those formulated with the standard function ```areAreas```</li></ul>
|**Reference**|[[1]] Chap. 2.12, 2.13 and 2.14

### Test cases
###### Constraints - RKo.T01
|ID|RKo.T01
|:--|:--
|**Designation**|**Constraints:** ```UNIQUE```
|**Description**|The tests must check whether the data satisfies the ```ConstraintDef``` in the INTERLIS data model
|**Test requirement**|[RKo.T01a.xtf](../data/RKo.T01a.xtf), [RKo.T01b.xtf](../data/RKo.T01b.xtf)
|**Expected result**|<ul><li>RKo.T01a.xtf: no error message</li><li>RKo.T01b.xtf: error message. Constraint violated</li></ul>
|**Reference**|[[1]] Chap. 2.12, 2.13 and 2.14

###### Constraints - RKo.T02
|ID|RKo.T02
|:--|:--
|**Designation**|**Constraints:** ```UNIQUE (LOCAL)```
|**Description**|The tests must check whether the data satisfies the ```ConstraintDef``` in the INTERLIS data model
|**Test requirement**|[RKo.T02a.xtf](../data/RKo.T02a.xtf), [RKo.T02b.xtf](../data/RKo.T02b.xtf)
|**Expected result**|<ul><li>RKo.T02a.xtf: error message. Constraint violated</li><li>RKo.T02b.xtf: no error message</li></ul>
|**Reference**|[[1]] Chap. 2.12, 2.13 and 2.14

###### Constraints - RKo.T03
|ID|RKo.T03
|:--|:--
|**Designation**|**Constraints:** ```UNIQUE WHERE```
|**Description**|The tests must check whether the data satisfies the ```ConstraintDef``` in the INTERLIS data model
|**Test requirement**|[RKo.T03a.xtf](../data/RKo.T03a.xtf), [RKo.T03b.xtf](../data/RKo.T03b.xtf)
|**Expected result**|<ul><li>RKo.T03a.xtf: no error message</li><li>RKo.T03b.xtf: error message. Constraint violated</li></ul>
|**Reference**|[[1]] Chap. 2.12, 2.13 and 2.14

###### Constraints - RKo.T04
|ID|RKo.T04
|:--|:--
|**Designation**|**Constraints:** ```EXISTENCE CONSTRAINT```
|**Description**|The tests must check whether the data satisfies the ```ConstraintDef``` in the INTERLIS data model
|**Test requirement**|[RKo.T04a.xtf](../data/RKo.T04a.xtf), [RKo.T04b.xtf](../data/RKo.T04b.xtf), [RKo.T04c.xtf](../data/RKo.T04c.xtf)
|**Expected result**|<ul><li>RKo.T04a.xtf: no error message</li><li>RKo.T04b.xtf: error message. Constraint violated</li><li>RKo.T04c.xtf: no error message</li></ul>
|**Reference**|[[1]] Chap. 2.12, 2.13 and 2.14

###### Constraints - RKo.T05
|ID|RKo.T05
|:--|:--
|**Designation**|**Constraints:** ```MANDATORY``` **with comparison**
|**Description**|The tests must check whether the data satisfies the ```ConstraintDef``` in the INTERLIS data model
|**Test requirement**|[RKo.T05a.xtf](../data/RKo.T05a.xtf), [RKo.T05b.xtf](../data/RKo.T05b.xtf)
|**Expected result**|<ul><li>RKo.T05a.xtf: no error message</li><li>RKo.T05b.xtf: error message. Constraint violated</li></ul>
|**Reference**|[[1]] Chap. 2.12, 2.13 and 2.14

###### Constraints - RKo.T06
|ID|RKo.T06
|:--|:--
|**Designation**|**Constraints:** ```MANDATORY``` **with specification of conditions**
|**Description**|The tests must check whether the data satisfies the ```ConstraintDef``` in the INTERLIS data model
|**Test requirement**|[RKo.T06a.xtf](../data/RKo.T06a.xtf), [RKo.T06b.xtf](../data/RKo.T06b.xtf), [RKo.T06c.xtf](../data/RKo.T06c.xtf), [RKo.T06d.xtf](../data/RKo.T06d.xtf), [RKo.T06e.xtf](../data/RKo.T06e.xtf), [RKo.T06f.xtf](../data/RKo.T06f.xtf), [RKo.T06g.xtf](../data/RKo.T06g.xtf)
|**Expected result**|<ul><li>RKo.T06a.xtf: no error message</li><li>RKo.T06b.xtf: no error message</li><li>RKo.T06c.xtf: error message. *Datum* is mandatory</li><li>RKo.T06d.xtf: no error message</li><li>RKo.T06e.xtf: no error message</li><li>RKo.T06f.xtf: error message. Constraint violated</li><li>RKo.T06g.xtf: error message. Constraint violated</li></ul>
|**Reference**|[[1]] Chap. 2.12, 2.13 and 2.14

###### Constraints - RKo.T07
|ID|RKo.T07
|:--|:--
|**Designation**|**Constraints:** ```MANDATORY``` **with function** (```INTERLIS.len```)
|**Description**|The tests must check whether the data satisfies the ```ConstraintDef``` in the INTERLIS data model
|**Test requirement**|[RKo.T07a.xtf](../data/RKo.T07a.xtf), [RKo.T07b.xtf](../data/RKo.T07b.xtf)
|**Expected result**|<ul><li>RKo.T07a.xtf: no error message</li><li>RKo.T07b.xtf: error message. Constraint violated</li></ul>
|**Reference**|[[1]] Chap. 2.12, 2.13 and 2.14

###### Constraints - RKo.T08
|ID|RKo.T08
|:--|:--
|**Designation**|**Constraints:** ```SET CONSTRAINT``` **with function** (```are.Areas```)
|**Description**|The tests must check whether the data satisfies the ```ConstraintDef``` in the INTERLIS data model
|**Test requirement**|[RKo.T08a.xtf](../data/RKo.T08a.xtf), [RKo.T08b.xtf](../data/RKo.T08b.xtf), [RKo.T08c.xtf](../data/RKo.T08c.xtf), [RKo.T08d.xtf](../data/RKo.T08d.xtf)
|**Expected result**|<ul><li>RKo.T08a.xtf: error message. Constraint violated</li><li>RKo.T08b.xtf: no error message</li><li>RKo.T08c.xtf: no error message</li><li>RKo.T08d.xtf: error message. Constraint violated</li></ul>
|**Reference**|[[1]] Chap. 2.12, 2.13 and 2.14

[1]: bib.md#1-cogis-interlis-version-2--reference-manual-13042006
