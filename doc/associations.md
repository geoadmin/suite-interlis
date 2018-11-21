# Data section: Relationships

## Relationships
|ID|RBe
|:--|:--
|**Designation**|**Relationships**
|**Description**|For the validation of relationships, the general rules defined in [[1]] Chap. 3.3.9 apply
|**Reference**|[[1]] Chap. 3.3.9

### Test cases
###### Relationships - RBe.T01
|ID|RBe.T01
|:--|:--
|**Designation**|**Relationships: References**
|**Description**|The tests check that the references to external Roles are additionally encoded with an XML Attribute ```BID```. *«If the reference points to an object in a different basket (within the same transfer or even elsewhere), the reference will be further coded with BID, thereby entering the basket identification of the object which has been referenced in BID.»* ([[1]] Chap. 3.3.9.2)
|**Test requirement**|[RBe.T01a.xtf](../data/RBe.T01a.xtf), [RBe.T01b.xtf](../data/RBe.T01b.xtf), [RBe.T01c.xtf](../data/RBe.T01c.xtf), [RBe.T01d.xtf](../data/RBe.T01d.xtf)
|**Expected result**|<ul><li>RBe.T01a.xtf: no error message</li><li>RBe.T01b.xtf: error message. ```BID``` not available</li><li>RBe.T01c.xtf: no error message.</li><li>RBe.T01d.xtf: error message. ```BID``` not available</li></ul>
|**Reference**|[[1]] Chap. 3.3.9.2

## Embedded relationships
|ID|REB
|:--|:--
|**Designation**|**Embedded relationships**
|**Description**|For the validation of embedded relationships, the rules defined in [[1]] Chap. 3.3.9.1 apply
|**Details**|<ul><li>The value ```%RoleName%``` must satisfy the ```RolDef``` ([[1]] Chap. 2.7.1) in the INTERLIS data model</li><li>If the reference points to an object in the same basket, the reference is encoded with ```REF```. If the reference points to an object in another basket (in the same transfer or even outside), a BID must be additionally provided</li><li>It must be checked whether the referenced object instance exists and satisfies the ```RolDef``` ([[1]] Chap. 2.7.1) in the INTERLIS data model</li></ul>
|**Reference**|[[1]] Chap. 2.7.1 and 3.3.9.1

### Test cases
###### Embedded relationships - REB.T01
|ID|REB.T01
|:--|:--
|**Designation**|**Embedded relationships: cardinality ``{0..1}`` at both roles**
|**Description**|The tests must check the rules for the embedding of relationships. *«If with both (basic) roles maximum cardinality is smaller or equal 1, the embedding takes place with the target class of the second role. If this target class has been defined in a different topic than the (basic) association and the target class of the first role has been defined in the same topic as the (basic) association, embedding will take place with the target class of the first role …»* [[1]] Chap. 3.3.9
|**Test requirement**|[REB.T01a.xtf](../data/REB.T01a.xtf), [REB.T01b.xtf](../data/REB.T01b.xtf), [REB.T01c.xtf](../data/REB.T01c.xtf)
|**Expected result**|<ul><li>REB.T01a.xtf: no error message</li><li>REB.T01b.xtf: error message. Wrong encoding</li><li>REB.T01c.xtf: no error message</li></ul>
|**Reference**|[[1]] Chap. 3.3.9

###### Embedded relationships - REB.T02
|ID|REB.T02
|:--|:--
|**Designation**|**Embedded relationships: cardinality ``{0..*}`` at one of the roles**
|**Description**|The tests must check the rules for the embedding of relationships. *«If maximum cardinality is greater than 1 in one of the two (basic) roles, the embedding takes place with the target class of this role …»* [[1]] Chap. 3.3.9
|**Test requirement**|[REB.T02a.xtf](../data/REB.T02a.xtf), [REB.T02b.xtf](../data/REB.T02b.xtf), [REB.T02c.xtf](../data/REB.T02c.xtf)
|**Expected result**|<ul><li>REB.T02a.xtf: no error message</li><li>REB.T02b.xtf: error message. Wrong encoding</li><li>REB.T02c.xtf: error message. Attribute ```Status``` is mandatory</li></ul>
|**Reference**|[[1]] Chap. 3.3.9

## Non-embedded relationships
|ID|RBk
|:--|:--
|**Designation**|**Non-embedded relationships: association classes**
|**Description**|For the validation of instances of association classes, the rules defined in [[1]] Chap. 3.3.7 for the element ```Link``` and in [[1]] Chap. 3.3.9.2 apply
|**Details**|<ul><li>The value ```%Model.Topic.Association%``` must satisfy the ```AssociationDef``` ([[1]] Chap. 2.7.1) in the INTERLIS data model. For relationships without explicit names, the (class) name is given by combining the individual role names (```%RoleName1RoleName2%```) ([[1]] Chap. 3.3.9.2)</li><li>Instances of ```Link``` only have a transfer identification if this has been set in the ```AssociationDef``` by means of the property ```OID``` ([[1]] Chap. 2.7.1)</li><li>The value ```%RoleName%``` must satisfy the ```RolDef``` ([[1]] Chap. 2.7.1) in the INTERLIS data model</li><li>If the reference points to an object in the same basket, the reference is encoded with ```REF```. If the reference points to an object in another basket (in the same transfer or even outside), a BID must be additionally provided</li><li>It must be checked whether the referenced object instance exists and satifies to the ```RolDef``` ([[1]] Chap. 2.7.1) in the INTERLIS data model</li></ul>
|**Reference**|[[1]] Chap. 2.7.1, 3.3.7 and 3.3.9.2

### Test cases
###### Non-embedded relationships - RBk.T01
|ID|RBk.T01
|:--|:--
|**Designation**|**Non-embedded relationships: cardinality ``{0..*}`` at the role EXTERNAL**
|**Description**|The tests must check the rules for the embedding of relationships. *«If maximum cardinality is greater than 1 in one of the two (basic) roles, the embedding takes place with the target class of this role. If this target class has been defined within a different topic than the (basic) association, then no embedding can take place …»* [[1]] Chap. 3.3.9
|**Test requirement**|[RBk.T01a.xtf](../data/RBk.T01a.xtf), [RBk.T01b.xtf](../data/RBk.T01b.xtf)
|**Expected result**|<ul><li>RBk.T01a.xtf: error message. Wrong encoding</li><li>RBk.T01b.xtf: no error message</li></ul>
|**Reference**|[[1]] Chap. 3.3.9

###### Non-embedded relationships - RBk.T02
|ID|RBk.T02
|:--|:--
|**Designation**|**Non-embedded relationships: cardinality ``{0..1}`` at both roles EXTERNAL**
|**Description**|The tests must check the rules for the embedding of relationships. *«…(in other words: if the target classes of both roles have been defined in a different topic than the (basic) association, no embedding can take place).»* [[1]] Chap. 3.3.9
|**Test requirement**|[RBk.T02a.xtf](../data/RBk.T02a.xtf), [RBk.T02b.xtf](../data/RBk.T02b.xtf),
|**Expected result**|<ul><li>RBk.T02a.xtf: no error message</li><li>RBk.T02b.xtf: error message. Wrong encoding</li></ul>
|**Reference**|[[1]] Chap. 3.3.9

###### Non-embedded relationships - RBk.T03
|ID|RBk.T03
|:--|:--
|**Designation**|**Non-embedded relationships: cardinality ``{0..*}`` at both roles**
|**Description**|The tests must check the rules for the embedding of relationships. *«Relationships are always embedded, unless ... maximum cardinality is greater than 1 for both (basic) roles or ...»* [[1]] Chap. 3.3.9
|**Test requirement**|[RBk.T03a.xtf](../data/RBk.T03a.xtf), [RBk.T03b.xtf](../data/RBk.T03b.xtf), [RBk.T03c.xtf](../data/RBk.T03c.xtf), [RBk.T03d.xtf](../data/RBk.T03d.xtf)
|**Expected result**|<ul><li>RBk.T03a.xtf: no error message</li><li>RBk.T03b.xtf: error message. Wrong encoding</li><li>RBk.T03c.xtf: error message. The roles of the ``ASSOCIATION`` are mandatory</li><li>RBk.T03d.xtf: error message. Double relationship with the same references</li></ul>
|**Reference**|[[1]] Chap. 3.3.9

## Cardinality
|ID|RKB
|:--|:--
|**Designation**|**Relationships cardinality**
|**Description**|For the validation of the cardinality, the number of necessary/allowed related objects must satisfy the ```RolDef``` ([[1]] Chap. 2.7.1) in the INTERLIS data model
|**Details**|<ul><li>The rules defined in [[1]] Chap. 2.7.3 apply additionally</li></ul>
|**Reference**|[[1]] Chap. 2.7.1 und 2.7.3

###### Cardinality - RKB.T01
|ID|RKB.T01
|:--|:--
|**Designation**|**Cardinality: ``{1}`` at both roles**
|**Description**|The tests must check the rules for the cardinality of relationships
|**Test requirement**|[RKB.T01a.xtf](../data/RKB.T01a.xtf), [RKB.T01b.xtf](../data/RKB.T01b.xtf), [RKB.T01c.xtf](../data/RKB.T01c.xtf), [RKB.T01d.xtf](../data/RKB.T01d.xtf)
|**Expected result**|<ul><li>RKB.T01a.xtf: no error message</li><li>RKB.T01b.xtf: error message. Missing role (```RolleA``` in ```Klasse B```)</li><li>RKB.T01c.xtf: error message. Two instances of ```B``` refer to the same instance of ```A```</li><li>RKB.T01d.xtf: error message. All instances of ```A``` must be referenced</li></ul>
|**Reference**|[[1]] Chap. 2.7.1 und 2.7.3

###### Cardinality - RKB.T02
|ID|RKB.T02
|:--|:--
|**Designation**|**Cardinality: ``{0..1} {1}``**
|**Description**|The tests must check the rules for the cardinality of relationships
|**Test requirement**|[RKB.T02a.xtf](../data/RKB.T02a.xtf)
|**Expected result**|<ul><li>RKB.T02a.xtf: no error message</li></ul>
|**Reference**|[[1]] Chap. 2.7.1 und 2.7.3

###### Cardinality - RKB.T03
|ID|RKB.T03
|:--|:--
|**Designation**|**Cardinality: ``{0..1} {0..1}``**
|**Description**|The tests must check the rules for the cardinality of relationships
|**Test requirement**|[RKB.T03a.xtf](../data/RKB.T03a.xtf)
|**Expected result**|<ul><li>RKB.T03a.xtf: no error message</li></ul>
|**Reference**|[[1]] Chap. 2.7.1 und 2.7.3

###### Cardinality - RKB.T04
|ID|RKB.T04
|:--|:--
|**Designation**|**Cardinality: ``{1} {0..*}``**
|**Description**|The tests must check the rules for the cardinality of relationships
|**Test requirement**|[RKB.T04a.xtf](../data/RKB.T04a.xtf)
|**Expected result**|<ul><li>RKB.T04a.xtf: no error message</li></ul>
|**Reference**|[[1]] Chap. 2.7.1 und 2.7.3

###### Cardinality - RKB.T05
|ID|RKB.T05
|:--|:--
|**Designation**|**Cardinality: ``{0..*} {1}``**
|**Description**|The tests must check the rules for the cardinality of relationships
|**Test requirement**|[RKB.T05a.xtf](../data/RKB.T05a.xtf), [RKB.T05b.xtf](../data/RKB.T05b.xtf)
|**Expected result**|<ul><li>RKB.T05a.xtf: error message. Wrong embedding</li><li>RKB.T05b.xtf: no error message</li></ul>
|**Reference**|[[1]] Chap. 2.7.1 und 2.7.3

[1]: bib.md#1-cogis-interlis-version-2--reference-manual-13042006
