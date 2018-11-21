package ch.interlis.testsuite;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeFalse;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ch.interlis.testsuite.util.TestUtil;

/**
 * Data section: Coordinates
 */
public class CoordinateAttributeTest {
	private final Logger logger = LoggerFactory.getLogger(CoordinateAttributeTest.class);

	static String vendor;

    @Rule
    public TestName testName = new TestName();

	@BeforeClass
	public static void init() {
		vendor = System.getProperty("vendor");
	}

	/**
	 * @ID RCO.T01a
	 *
	 * @Designation Coordinates
 	 *
 	 * @Description The tests must check whether the coordinates are available
 	 *
 	 * @Test-requirement RCO.T01a.xtf
 	 *
 	 * @Expected-result Error message. Coordinates not available
 	 *
 	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 2.8.8 and 3.3.11.11</p>
 	 */
	@Test
	public void RCO_T01a() {
		// Ignored if vendor="ilivalidator" --> Crash Error: java.lang.NullPointerException
		assumeFalse (System.getProperty("vendor").equals("ilivalidator"));
		boolean ret = TestUtil.runJob(vendor, "../data/RCO.T01a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RCO.T02a
	 *
	 * @Designation Coordinates: encoding
 	 *
 	 * @Description The tests must check whether the coordinates satisfy the encoding rules
 	 *
 	 * @Test-requirement RCO.T02a.xtf
 	 *
 	 * @Expected-result Error message. Wrong encoding (C4)
 	 *
 	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 2.8.8 and 3.3.11.11</p>
 	 */
	@Test
	public void RCO_T02a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RCO.T02a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RCO.T02b
	 *
	 * @Designation Coordinates: encoding
 	 *
 	 * @Description The tests must check whether the coordinates satisfy the encoding rules
 	 *
 	 * @Test-requirement RCO.T02b.xtf
 	 *
 	 * @Expected-result Error message. Redundant coordinates (C2)
 	 *
 	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 2.8.8 and 3.3.11.11</p>
 	 */
	@Test
	public void RCO_T02b() {
		// Ignored if vendor="ilivalidator" --> Crash Error: java.lang.NullPointerException
		assumeFalse (System.getProperty("vendor").equals("ilivalidator"));
		boolean ret = TestUtil.runJob(vendor, "../data/RCO.T02b.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RCO.T03a
	 *
	 * @Designation Coordinates: domain
 	 *
 	 * @Description The tests must check whether the coordinates satisfy the definition in the INTERLIS data model
 	 *
 	 * @Test-requirement RCO.T03a.xtf
 	 *
 	 * @Expected-result Error message. C2 outside the value range
 	 *
 	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 2.8.8 and 3.3.11.11</p>
 	 */
	@Test
	public void RCO_T03a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RCO.T03a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RCO.T03b
	 *
	 * @Designation Coordinates: domain
 	 *
 	 * @Description The tests must check whether the coordinates satisfy the definition in the INTERLIS data model
 	 *
 	 * @Test-requirement RCO.T03b.xtf
 	 *
 	 * @Expected-result Error message. C3 not allowed because value range is defined for 2D coordinates
 	 *
 	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 2.8.8 and 3.3.11.11</p>
 	 */
	@Test
	public void RCO_T03b() {
		boolean ret = TestUtil.runJob(vendor, "../data/RCO.T03b.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}
}
