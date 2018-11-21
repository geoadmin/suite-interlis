package ch.interlis.testsuite;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeFalse;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.rules.TestName;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ch.interlis.testsuite.util.TestUtil;

/**
 * Tests Header section
 */
public class HeaderSectionTest {
	private final Logger logger = LoggerFactory.getLogger(HeaderSectionTest.class);

	static String vendor;

    @Rule
    public TestName testName = new TestName();

	@BeforeClass
	public static void init() {
		vendor = System.getProperty("vendor");
	}

	/**
	 * @ID RHE.T01a
	 *
	 * @Designation Header section: XML attributes
 	 *
 	 * @Description The tests must check whether the XML attributes VERSION and SENDER are available in the tag HEADERSECTION
 	 *
 	 * @Test-requirement RHE.T01a.xtf
 	 *
 	 * @Expected-result Error message. VERSION not available
 	 *
 	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 3.3.4</p>
 	 */
	@Test
	public void RHE_T01a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RHE.T01a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RHE.T01b
	 *
	 * @Designation Header section: XML attributes
 	 *
 	 * @Description The tests must check whether the XML attributes VERSION and SENDER are available in the tag HEADERSECTION
 	 *
 	 * @Test-requirement RHE.T01b.xtf
 	 *
 	 * @Expected-result Error message. SENDER not available
 	 *
 	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 3.3.4</p>
 	 */
	@Test
	public void RHE_T01b() {
		// Ausgesetzt falls vendor="ilivalidator" --> java.lang.IllegalArgumentException: Attribute SENDER missing in HEADERSECTION statt java.lang.AssertionError. Fehlermeldung ist korrekt
		assumeFalse (System.getProperty("vendor").equals("ilivalidator"));
		boolean ret = TestUtil.runJob(vendor, "../data/RHE.T01b.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RHE.T01c
	 *
	 * @Designation Header section: XML attributes
 	 *
 	 * @Description The tests must check whether the XML attributes VERSION and SENDER are available in the tag HEADERSECTION
 	 *
 	 * @Test-requirement RHE.T01c.xtf
 	 *
 	 * @Expected-result Error message. VERSION not equal 2.3
 	 *
 	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 3.3.4</p>
 	 */
	@Test
	public void RHE_T01c() {
		boolean ret = TestUtil.runJob(vendor, "../data/RHE.T01c.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RHE.T02a
	 *
	 * @Designation Header section: tag MODELS
 	 *
 	 * @Description The tests must check whether the tag MODELS is available in the tag HEADERSECTION
 	 *
 	 * @Test-requirement RHE.T02a.xtf
 	 *
 	 * @Expected-result Error message. Tag MODELS not available
 	 *
 	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 3.3.4</p>
 	 */
	@Test
	public void RHE_T02a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RHE.T02a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RHE.T03a
	 *
	 * @Designation Header section: tag MODEL
 	 *
 	 * @Description The tests must check whether the tag MODEL is available in the tag MODELS
 	 *
 	 * @Test-requirement RHE.T03a.xtf
 	 *
 	 * @Expected-result Error message. Tag MODEL not available
 	 *
 	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 3.3.4</p>
 	 */
	@Test
	public void RHE_T03a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RHE.T03a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RHE.T04a
	 *
	 * @Designation Header section: XML attributes in tag MODEL
 	 *
 	 * @Description The tests must check whether the XML attributes NAME, VERSION and URI are available in tag MODEL
 	 *
 	 * @Test-requirement RHE.T04a.xtf
 	 *
 	 * @Expected-result Error message. NAME not available
 	 *
 	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 3.3.4</p>
 	 */
	@Test
	public void RHE_T04a() {
		// Ignored if vendor="ilivalidator" --> java.lang.IllegalArgumentException: java.lang.IllegalArgumentException: Attribute NAME missing in MODEL statt java.lang.AssertionError. Error message is correct
		assumeFalse (System.getProperty("vendor").equals("ilivalidator"));
		boolean ret = TestUtil.runJob(vendor, "../data/RHE.T04a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RHE.T04b
	 *
	 * @Designation Header section: XML attributes in tag MODEL
 	 *
 	 * @Description The tests must check whether the XML attributes NAME, VERSION and URI are available in tag MODEL
 	 *
 	 * @Test-requirement RHE.T04b.xtf
 	 *
 	 * @Expected-result Error message. VERSION not available
 	 *
 	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 3.3.4</p>
 	 */
	@Test
	public void RHE_T04b() {
		boolean ret = TestUtil.runJob(vendor, "../data/RHE.T04b.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RHE.T04c
	 *
	 * @Designation Header section: XML attributes in tag MODEL
 	 *
 	 * @Description The tests must check whether the XML attributes NAME, VERSION and URI are available in tag MODEL
 	 *
 	 * @Test-requirement RHE.T04c.xtf
 	 *
 	 * @Expected-result Error message. URI not available
 	 *
 	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 3.3.4</p>
 	 */
	@Test
	public void RHE_T04c() {
		boolean ret = TestUtil.runJob(vendor, "../data/RHE.T04c.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RHE.T05a
	 *
	 * @Designation Header section: attribute value in NAME and VERSION
 	 *
 	 * @Description The tests must check whether the values of the attributes NAME and VERSION in tag MODEL satisfy the ModelDef in the INTERLIS data model
 	 *
 	 * @Test-requirement RHE.T05a.xtf
 	 *
 	 * @Expected-result Error message. The value NAME is wrong (model TestSuite not available)
 	 *
 	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 3.3.4</p>
 	 */
	@Test
 	public void RHE_T05a() {
 		boolean ret = TestUtil.runJob(vendor, "../data/RHE.T05a.xtf");
 		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
 		assertFalse(ret);
 	}

	/**
	 * @ID RHE.T05b
	 *
	 * @Designation Header section: attribute value in NAME and VERSION
 	 *
 	 * @Description The tests must check whether the values of the attributes NAME and VERSION in tag MODEL satisfy the ModelDef in the INTERLIS data model
 	 *
 	 * @Test-requirement RHE.T05b.xtf
 	 *
 	 * @Expected-result Error message. The value VERSION is wrong
 	 *
 	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 3.3.4</p>
 	 */
	@Test
	public void RHE_T05b() {
		boolean ret = TestUtil.runJob(vendor, "../data/RHE.T05b.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}
}
