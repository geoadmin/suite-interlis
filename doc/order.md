# Data section: Order

## Order of objects within the data section
|ID|RRO
|:--|:--
|**Designation**|**Order within the data section**
|**Description**|For the validation of the order of the objects within the data section, the rules defined in [[1]] Chap. 3.2.5 apply
|**Details**|<ul><li>The sequence of the objects in the transfer is arbitrary. In particular, the objects within a container do not necessarily have to be sorted according to relationships or grouped according to classes.</li></ul>
|**Reference**|[[1]] Chap. 3.2.5

### Test cases
###### Order of objects within the data section - RRO.T01
|ID|RRO.T01
|:--|:--
|**Designation**|**Order: data section**
|**Description**|The tests must check the rules for the order of the objects within the data section
|**Test requirement**|[RRO.T01a.xtf](../data/RRO.T01a.xtf), [RRO.T01b.xtf](../data/RRO.T01b.xtf)
|**Expected result**|<ul><li>RRO.T01a.xtf: no error message</li><li>RRO.T01b.xtf: no error message</li></ul>
|**Reference**|[[1]] Chap. 3.2.5

## Order within class instances
|ID|RRiO
|:--|:--
|**Designation**|**Order within class instances**
|**Description**|For the validation of the order within class instances, the rules defined in  [[1]] Chap. 3.3.7 apply
|**Details**|<ul><li>The following applies for the order of attributes, roles, ```EmbeddedLink``` and reference attributes within a (extended) class :</li></ul><ol><li>Roles of the basic class</li><li>Attributes / Reference attributes of the basic class</li><li>```EmbeddedLink``` of the basic class</li><li>Attributes / Reference attributes of the extension</li><li>```EmbeddedLink``` of the extension</li></ol><ul><li>Within the same extension level, the attributes / reference attributes and the roles are encoded according to the definition in the INTERLIS data model</li><li>Within the same extension level, the ```EmbeddedLink``` are sorted alphabetically</li></ul>
|**Reference**|[[1]] Chap. 3.3.7

###### Order within class instances - RRiO.T01
|ID|RRiO.T01
|:--|:--
|**Designation**|**Order: class instances**
|**Description**|The tests must check the rules for the order of the object instances of a class
|**Test requirement**|[RRiO.T01a.xtf](../data/RRiO.T01a.xtf), [RRiO.T01b.xtf](../data/RRiO.T01b.xtf), [RRiO.T01c.xtf](../data/RRiO.T01c.xtf)
|**Expected result**|<ul><li>RRiO.T01a.xtf: no error message</li><li>RRiO.T01b.xtf: error message. Wrong sequence of the attributes</li><li>RRiO.T01c.xtf: error message. Wrong sequence of the ```EmbeddedLink```</li></ul>
|**Reference**|[[1]] Chap. 3.3.7

###### Order within class instances - RRiO.T02
|ID|RRiO.T02
|:--|:--
|**Designation**|**Order: instances of an extended class**
|**Description**|The tests must check the rules for the order of the object instances of an extended class
|**Test requirement**|[RRiO.T02a.xtf](../data/RRiO.T02a.xtf), [RRiO.T02b.xtf](../data/RRiO.T02b.xtf)
|**Expected result**|<ul><li>RRiO.T02a.xtf: no error message</li><li>RRiO.T02b.xtf: error message. Wrong sequence of the attributes (the attributes of the basic class must be encoded first)</li></ul>
|**Reference**|[[1]] Chap. 3.3.7

###### Order within class instances - RRiO.T03
|ID|RRiO.T03
|:--|:--
|**Designation**|**Order: instances of an extended association class**
|**Description**|The tests must check the rules for the order of the object instances of an extended association class
|**Test requirement**|[RRiO.T03a.xtf](../data/RRiO.T03a.xtf), [RRiO.T03b.xtf](../data/RRiO.T023.xtf), [RRiO.T03c.xtf](../data/RRiO.T03c.xtf), [RRiO.T03d.xtf](../data/RRiO.T03d.xtf)
|**Expected result**|<ul><li>RRiO.T03a.xtf: no error message</li><li>RRiO.T03b.xtf: error message. The roles of the basic class must be encoded first</li><li>RRiO.T03c.xtf: error message. The attributes of the basic class must be encoded first</li><li>RRiO.T03d.xtf: error message. The roles of the basic class are mandatory</li></ul>
|**Reference**|[[1]] Chap. 3.3.7

[1]: bib.md#1-cogis-interlis-version-2--reference-manual-13042006
