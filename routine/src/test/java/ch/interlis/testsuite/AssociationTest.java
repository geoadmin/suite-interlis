package ch.interlis.testsuite;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeFalse;
import org.junit.Ignore;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ch.interlis.testsuite.util.TestUtil;

/**
 * Tests Data section: Relationships
 */
public class AssociationTest {
	private final Logger logger = LoggerFactory.getLogger(AssociationTest.class);

	static String vendor;

    @Rule
    public TestName testName = new TestName();

	@BeforeClass
	public static void init() {
		vendor = System.getProperty("vendor");
	}

	/**
	 * @ID RBe.T01a
 	 *
	 * @Designation Relationships: References
	 *
	 * @Description <p>The tests check that the references to external Roles are additionally encoded with an XML Attribute BID.</p>
	 * <p><i>If the reference points to an object in a different basket (within the same transfer or even elsewhere), the reference will be further coded with BID, thereby entering the basket identification of the object which has been referenced in BID.</i></p>
	 *
	 * @Test-requirement RBe.T01a.xtf
	 *
	 * @Expected-result No error message
	 *
	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 3.3.9.2</p>
	*/
	@Test
	public void RBe_T01a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RBe.T01a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}

	/**
	 * @ID RBe.T01b
	 *
	 * @Designation Relationships: References
	 *
	 * @Description <p>The tests check that the references to external Roles are additionally encoded with an XML Attribute BID.</p>
	 * <p><i>If the reference points to an object in a different basket (within the same transfer or even elsewhere), the reference will be further coded with BID, thereby entering the basket identification of the object which has been referenced in BID.</i></p>
	 *
	 * @Test-requirement RBe.T01b.xtf
	 *
	 * @Expected-result Error message. BID not available
	 *
	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 3.3.9.2</p>
	*/
	@Test
	public void RBe_T01b() {
		boolean ret = TestUtil.runJob(vendor, "../data/RBe.T01b.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RBe.T01c
	 *
	 * @Designation Relationships: References
	 *
	 * @Description <p>The tests check that the references to external Roles are additionally encoded with an XML Attribute BID.</p>
	 * <p><i>If the reference points to an object in a different basket (within the same transfer or even elsewhere), the reference will be further coded with BID, thereby entering the basket identification of the object which has been referenced in BID.</i></p>
	 *
	 * @Test-requirement RBe.T01c.xtf
	 *
	 * @Expected-result No error message
	 *
	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 3.3.9.2</p>
	*/
	@Test
	public void RBe_T01c() {
		boolean ret = TestUtil.runJob(vendor, "../data/RBe.T01c.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}

	/**
	 * @ID RBe.T01d
	 *
	 * @Designation Relationships: References
	 *
	 * @Description <p>The tests check that the references to external Roles are additionally encoded with an XML Attribute BID.</p>
	 * <p><i>If the reference points to an object in a different basket (within the same transfer or even elsewhere), the reference will be further coded with BID, thereby entering the basket identification of the object which has been referenced in BID.</i></p>
	 *
	 * @Test-requirement RBe.T01d.xtf
	 *
	 * @Expected-result Error message. BID not available
	 *
	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 3.3.9.2</p>
	*/
	@Test
	public void RBe_T01d() {
		boolean ret = TestUtil.runJob(vendor, "../data/RBe.T01d.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID REB.T01a
	 *
	 * @Designation Embedded relationships: cardinality {0..1} at both roles
	 *
	 * @Description <p>The tests must check the rules for the embedding of relationships.</p>
	 * <p><i>If with both (basic) roles maximum cardinality is smaller or equal 1, the embedding takes place with the target class of the second role. If this target class has been defined in a different topic than the (basic) association and the target class of the first role has been defined in the same topic as the (basic) association, embedding will take place with the target class of the first role …</i></p>
	 *
	 * @Test-requirement REB.T01a.xtf
	 *
	 * @Expected-result No error message
	 *
	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 3.3.9</p>
	*/
	@Test
	public void REB_T01a() {
		boolean ret = TestUtil.runJob(vendor, "../data/REB.T01a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}

	/**
	 * @ID REB.T01b
	 *
	 * @Designation Embedded relationships: cardinality {0..1} at both roles
	 *
	 * @Description <p>The tests must check the rules for the embedding of relationships.</p>
	 * <p><i>If with both (basic) roles maximum cardinality is smaller or equal 1, the embedding takes place with the target class of the second role. If this target class has been defined in a different topic than the (basic) association and the target class of the first role has been defined in the same topic as the (basic) association, embedding will take place with the target class of the first role …</i></p>
	 *
	 * @Test-requirement REB.T01b.xtf
	 *
	 * @Expected-result Error message. Wrong encoding
	 *
	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 3.3.9</p>
	*/
	@Test
	public void REB_T01b() {
		boolean ret = TestUtil.runJob(vendor, "../data/REB.T01b.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID REB.T01c
	 *
	 * @Designation Embedded relationships: cardinality {0..1} at both roles
	 *
	 * @Description <p>The tests must check the rules for the embedding of relationships.</p>
	 * <p><i>If with both (basic) roles maximum cardinality is smaller or equal 1, the embedding takes place with the target class of the second role. If this target class has been defined in a different topic than the (basic) association and the target class of the first role has been defined in the same topic as the (basic) association, embedding will take place with the target class of the first role …</i></p>
	 *
	 * @Test-requirement REB.T01c.xtf
	 *
	 * @Expected-result No error message
	 *
	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 3.3.9</p>
	*/
	@Test
	public void REB_T01c() {
		boolean ret = TestUtil.runJob(vendor, "../data/REB.T01c.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}

	/**
	 * @ID REB.T02a
	 *
	 * @Designation Embedded relationships: cardinality {0..*} at one of the roles
	 *
	 * @Description <p>The tests must check the rules for the embedding of relationships.</p>
	 * <p><i>If maximum cardinality is greater than 1 in one of the two (basic) roles, the embedding takes place with the target class of this role …</i></p>
	 *
	 * @Test-requirement REB.T02a.xtf
	 *
	 * @Expected-result No error message
	 *
	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 3.3.9</p>
	*/
	@Test
	public void REB_T02a() {
		boolean ret = TestUtil.runJob(vendor, "../data/REB.T02a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}

	/**
	 * @ID REB.T02b
	 *
	 * @Designation Embedded relationships: cardinality {0..*} at one of the roles
	 *
	 * @Description <p>The tests must check the rules for the embedding of relationships.</p>
	 * <p><i>If maximum cardinality is greater than 1 in one of the two (basic) roles, the embedding takes place with the target class of this role …</i></p>
	 *
	 * @Test-requirement REB.T02b.xtf
	 *
	 * @Expected-result Error message. Wrong encoding
	 *
	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 3.3.9</p>
	*/
	@Test
	public void REB_T02b() {
		boolean ret = TestUtil.runJob(vendor, "../data/REB.T02b.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID REB.T02c
	 *
	 * @Designation Embedded relationships: cardinality {0..*} at one of the roles
	 *
	 * @Description <p>The tests must check the rules for the embedding of relationships.</p>
	 * <p><i>If maximum cardinality is greater than 1 in one of the two (basic) roles, the embedding takes place with the target class of this role …</i></p>
	 *
	 * @Test-requirement REB.T02c.xtf
	 *
	 * @Expected-result Error message. Attribute Status is mandatory
	 *
	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 3.3.9</p>
	*/
	@Test
	public void REB_T02c() {
		boolean ret = TestUtil.runJob(vendor, "../data/REB.T02c.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID REB.T02d
	 *
	 * @Designation Embedded relationships: cardinality {0..*} at one of the roles
	 *
	 * @Description <p>The tests must check the rules for the embedding of relationships.</p>
	 * <p><i>If maximum cardinality is greater than 1 in one of the two (basic) roles, the embedding takes place with the target class of this role …</i></p>
	 *
	 * @Test-requirement REB.T02d.xtf
	 *
	 * @Expected-result No error message
	 *
	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 3.3.9</p>
	*/
	@Test
	public void REB_T02d() {
		boolean ret = TestUtil.runJob(vendor, "../data/REB.T02d.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}

	/**
	 * @ID RBk.T01a
	 *
	 * @Designation Non-embedded relationships: cardinality {0..*} at the role EXTERNAL
	 *
	 * @Description <p>The tests must check the rules for the embedding of relationships.</p>
	 * <p><i>If maximum cardinality is greater than 1 in one of the two (basic) roles, the embedding takes place with the target class of this role. If this target class has been defined within a different topic than the (basic) association, then no embedding can take place …</i></p>
	 *
	 * @Test-requirement RBk.T01a.xtf
	 *
	 * @Expected-result Error message. Wrong encoding
	 *
	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 3.3.9</p>
	*/
	@Test
	public void RBk_T01a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RBk.T01a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RBk.T01b
	 *
	 * @Designation Non-embedded relationships: cardinality {0..*} at the role EXTERNAL
	 *
	 * @Description <p>The tests must check the rules for the embedding of relationships.</p>
	 * <p><i>If maximum cardinality is greater than 1 in one of the two (basic) roles, the embedding takes place with the target class of this role. If this target class has been defined within a different topic than the (basic) association, then no embedding can take place …</i></p>
	 *
	 * @Test-requirement RBk.T01b.xtf
	 *
	 * @Expected-result No error message
	 *
	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 3.3.9</p>
	*/
	@Test
	public void RBk_T01b() {
		boolean ret = TestUtil.runJob(vendor, "../data/RBk.T01b.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}

	/**
	 * @ID RBk.T02a
	 *
	 * @Designation Non-embedded relationships: cardinality {0..1} at both roles EXTERNAL
	 *
	 * @Description <p>The tests must check the rules for the embedding of relationships.</p>
	 * <p><i>…(in other words: if the target classes of both roles have been defined in a different topic than the (basic) association, no embedding can take place).</i></p>
	 *
	 * @Test-requirement RBk.T02a.xtf
	 *
	 * @Expected-result No error message
	 *
	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 3.3.9</p>
	*/
	@Test
	public void RBk_T02a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RBk.T02a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}

	/**
	 * @ID RBk.T02b
	 *
	 * @Designation Non-embedded relationships: cardinality {0..1} at both roles EXTERNAL
	 *
	 * @Description <p>The tests must check the rules for the embedding of relationships.</p>
	 * <p><i>…(in other words: if the target classes of both roles have been defined in a different topic than the (basic) association, no embedding can take place).</i></p>
	 *
	 * @Test-requirement RBk.T02b.xtf
	 *
	 * @Expected-result Error message. Wrong encoding
	 *
	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 3.3.9</p>
	*/
	@Test
	public void RBk_T02b() {
		boolean ret = TestUtil.runJob(vendor, "../data/RBk.T02b.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RBk.T03a
	 *
	 * @Designation Non-embedded relationships: cardinality {0..*} at both roles
	 *
	 * @Description <p>The tests must check the rules for the embedding of relationships.</p>
	 * <p><i>Relationships are always embedded, unless ... maximum cardinality is greater than 1 for both (basic) roles or ...</i></p>
	 *
	 * @Test-requirement RBk.T03a.xtf
	 *
	 * @Expected-result No error message
	 *
	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 3.3.9</p>
	*/
	@Test
	public void RBk_T03a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RBk.T03a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}

	/**
	 * @ID RBk.T03b
	 *
	 * @Designation Non-embedded relationships: cardinality {0..*} at both roles
	 *
	 * @Description <p>The tests must check the rules for the embedding of relationships.</p>
	 * <p><i>Relationships are always embedded, unless ... maximum cardinality is greater than 1 for both (basic) roles or ...</i></p>
	 *
	 * @Test-requirement RBk.T03b.xtf
	 *
	 * @Expected-result Error message. Wrong encoding
	 *
	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 3.3.9</p>
	*/
	@Test
	public void RBk_T03b() {
		boolean ret = TestUtil.runJob(vendor, "../data/RBk.T03b.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RBk.T03c
	 *
	 * @Designation Non-embedded relationships: cardinality {0..*} at both roles
	 *
	 * @Description <p>The tests must check the rules for the embedding of relationships.</p>
	 * <p><i>Relationships are always embedded, unless ... maximum cardinality is greater than 1 for both (basic) roles or ...</i></p>
	 *
	 * @Test-requirement RBk.T03c.xtf
	 *
	 * @Expected-result Error message. The roles of the ASSOCIATION are mandatory
	 *
	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 3.3.9</p>
	*/
	@Test
	public void RBk_T03c() {
		boolean ret = TestUtil.runJob(vendor, "../data/RBk.T03c.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RBk.T03d
	 *
	 * @Designation Non-embedded relationships: cardinality {0..*} at both roles
	 *
	 * @Description <p>The tests must check the rules for the embedding of relationships.</p>
	 * <p><i>Relationships are always embedded, unless ... maximum cardinality is greater than 1 for both (basic) roles or ...</i></p>
	 *
	 * @Test-requirement RBk.T03d.xtf
	 *
	 * @Expected-result Error message. Double relationship with the same references
	 *
	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 3.3.9</p>
	*/
	@Test
	public void RBk_T03d() {
		boolean ret = TestUtil.runJob(vendor, "../data/RBk.T03d.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}
}
