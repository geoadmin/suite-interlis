package ch.interlis.testsuite;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeFalse;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ch.interlis.testsuite.util.TestUtil;

/**
 * Tests Data section: Cardinality of attributes
 */
public class CardinalityAttributeTest {
	private final Logger logger = LoggerFactory.getLogger(CardinalityAttributeTest.class);

	static String vendor;

    @Rule
    public TestName testName = new TestName();

	@BeforeClass
	public static void init() {
		vendor = System.getProperty("vendor");
	}

	/**
	 * @ID RKA.T01a
	 *
	 * @Designation Cardinality: MANDATORY
	 *
	 * @Description The tests must check the rules for the cardinality of attributes
	 *
	 * @Test-requirement RKA.T01a.xtf
	 *
	 * @Expected-result No error message
	 *
	 * @Reference <a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 2.6.1 and 2.7.3
	 */
	@Test
	public void RKA_T01a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RKA.T01a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}

	/**
	 * @ID RKA.T01b
	 *
	 * @Designation Cardinality: MANDATORY
	 *
	 * @Description The tests must check the rules for the cardinality of attributes
	 *
	 * @Test-requirement RKA.T01b.xtf
	 *
	 * @Expected-result Error message. Mandatory attribute missing
	 *
	 * @Reference <a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 2.6.1 and 2.7.3
	 */
	@Test
	public void RKA_T01b() {
		boolean ret = TestUtil.runJob(vendor, "../data/RKA.T01b.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RKA.T02a
	 *
	 * @Designation Cardinality: BAG OF
	 *
	 * @Description The tests must check the rules for the cardinality of attributes
	 *
	 * @Test-requirement RKA.T02a.xtf
	 *
	 * @Expected-result No error message
	 *
	 * @Reference <a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 2.6.1 and 2.7.3
	 */
	@Test
	public void RKA_T02a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RKA.T02a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}

	/**
	 * @ID RKA.T02b
	 *
	 * @Designation Cardinality: BAG OF
	 *
	 * @Description The tests must check the rules for the cardinality of attributes
	 *
	 * @Test-requirement RKA.T02b.xtf
	 *
	 * @Expected-result Error message. Mandatory attribute missing
	 *
	 * @Reference <a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 2.6.1 and 2.7.3
	 */
	@Test
	public void RKA_T02b() {
		boolean ret = TestUtil.runJob(vendor, "../data/RKA.T02b.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RKA.T02c
	 *
	 * @Designation Cardinality: BAG OF
	 *
	 * @Description The tests must check the rules for the cardinality of attributes
	 *
	 * @Test-requirement RKA.T02c.xtf
	 *
	 * @Expected-result Error message. The structure must not occur more than twice
	 *
	 * @Reference <a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 2.6.1 and 2.7.3
	 */
	@Test
	public void RKA_T02c() {
		boolean ret = TestUtil.runJob(vendor, "../data/RKA.T02c.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RKA.T02d
	 *
	 * @Designation Cardinality: BAG OF
	 *
	 * @Description The tests must check the rules for the cardinality of attributes
	 *
	 * @Test-requirement RKA.T02d.xtf
	 *
	 * @Expected-result Error message. Wrong encoding (multiple tags Namen)
	 *
	 * @Reference <a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 2.6.1 and 2.7.3
	 */
	@Test
	public void RKA_T02d() {
		boolean ret = TestUtil.runJob(vendor, "../data/RKA.T02d.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}
}
