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
 * Tests Data section: Relationships cardinality
 */
public class CardinalityAssociationTest {
	private final Logger logger = LoggerFactory.getLogger(CardinalityAssociationTest.class);

	static String vendor;

    @Rule
    public TestName testName = new TestName();

	@BeforeClass
	 public static void init() {
	 vendor = System.getProperty("vendor");
	}

	/**
	 * @ID RKB.T01a
	 *
	 * @Designation Cardinality: {1} at both roles
	 *
	 * @Description The tests must check the rules for the cardinality of relationships
	 *
	 * @Test-requirement RKB.T01a.xtf
	 *
	 * @Expected-result No error message
	 *
	 * @Reference <a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 2.7.1 and 2.7.3
	 */
	@Test
	public void RKB_T01a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RKB.T01a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}

	/**
	 * @ID RKB.T01b
	 *
	 * @Designation Cardinality: {1} at both roles
	 *
	 * @Description The tests must check the rules for the cardinality of relationships
	 *
	 * @Test-requirement RKB.T01b.xtf
	 *
	 * @Expected-result Error message. Missing role (RolleA in Klasse B)
	 *
	 * @Reference <a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 2.7.1 and 2.7.3
	 */
	@Test
	public void RKB_T01b() {
		boolean ret = TestUtil.runJob(vendor, "../data/RKB.T01b.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RKB.T01c
	 *
	 * @Designation Cardinality: {1} at both roles
	 *
	 * @Description The tests must check the rules for the cardinality of relationships
	 *
	 * @Test-requirement RKB.T01c.xtf
	 *
	 * @Expected-result Error message. Two instances of B refer to the same instance of A
	 *
	 * @Reference <a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 2.7.1 and 2.7.3
	 */
	@Test
	public void RKB_T01c() {
		boolean ret = TestUtil.runJob(vendor, "../data/RKB.T01c.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RKB.T01d
	 *
	 * @Designation Cardinality: {1} at both roles
	 *
	 * @Description The tests must check the rules for the cardinality of relationships
	 *
	 * @Test-requirement RKB.T01d.xtf
	 *
	 * @Expected-result Error message. All instances of A must be referenced
	 *
	 * @Reference <a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 2.7.1 and 2.7.3
	 */
	@Test
	public void RKB_T01d() {
		boolean ret = TestUtil.runJob(vendor, "../data/RKB.T01d.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RKB.T02a
	 *
	 * @Designation Cardinality: <p>{0..1}</p><p>{1}</p>
	 *
	 * @Description The tests must check the rules for the cardinality of relationships
	 *
	 * @Test-requirement RKB.T02a.xtf
	 *
	 * @Expected-result No error message
	 *
	 * @Reference <a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 2.7.1 and 2.7.3
	 */
	@Test
	public void RKB_T02a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RKB.T02a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}

	/**
	 * @ID RKB.T03a
	 *
	 * @Designation Cardinality: <p>{0..1}</p><p>{0..1}</p>
	 *
	 * @Description The tests must check the rules for the cardinality of relationships
	 *
	 * @Test-requirement RKB.T03a.xtf
	 *
	 * @Expected-result No error message
	 *
	 * @Reference <a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 2.7.1 and 2.7.3
	 */
	@Test
	public void RKB_T03a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RKB.T03a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}

	/**
	 * @ID RKB.T04a
	 *
	 * @Designation Cardinality: <p>{1}</p><p>{0..*}</p>
	 *
	 * @Description The tests must check the rules for the cardinality of relationships
	 *
	 * @Test-requirement RKB.T04a.xtf
	 *
	 * @Expected-result No error message
	 *
	 * @Reference <a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 2.7.1 and 2.7.3
	 */
	@Test
	public void RKB_T04a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RKB.T04a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}

	/**
	 * @ID RKB.T05a
	 *
	 * @Designation Cardinality: <p>{0..*}</p><p>{1}</p>
	 *
	 * @Description The tests must check the rules for the cardinality of relationships
	 *
	 * @Test-requirement RKB.T5a.xtf
	 *
	 * @Expected-result Error message. Wrong embedding
	 *
	 * @Reference <a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 2.7.1 and 2.7.3
	 */
	@Test
	public void RKB_T05a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RKB.T05a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RKB.T05b
	 *
	 * @Designation Cardinality: <p>{0..*}</p><p>{1}</p>
	 *
	 * @Description The tests must check the rules for the cardinality of relationships
	 *
	 * @Test-requirement RKB.T5b.xtf
	 *
	 * @Expected-result No error message
	 *
	 * @Reference <a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 2.7.1 and 2.7.3
	 */
	@Test
	public void RKB_T05b() {
		boolean ret = TestUtil.runJob(vendor, "../data/RKB.T05b.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}

}
