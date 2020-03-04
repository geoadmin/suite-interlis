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
 * Tests Transfer structure
 */
public class TransferStructureTest {
	private final Logger logger = LoggerFactory.getLogger(TransferStructureTest.class);

	static String vendor;

    @Rule
    public TestName testName = new TestName();

	@BeforeClass
	public static void init() {
		vendor = System.getProperty("vendor");
	}

	/**
	 * @ID RTR.T01a
	 *
	 * @Designation Transfer: XML declaration
 	 *
 	 * @Description The tests must check whether the XML declaration exists
 	 *
 	 * @Test-requirement RTR.T01a.xtf
 	 *
 	 * @Expected-result Error message. XML declaration not available
 	 *
 	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 3.3.3</p>
 	 * <p><a href="https://www.w3.org/TR/xml/#sec-prolog-dtd">Extensible Markup Language (XML) 1.0 Chap. 2.8</a></p>
	 */
	@Test
	public void RTR_T01a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RTR.T01a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RTR.T02a
	 *
	 * @Designation Transfer: structure of a transfer file
 	 *
 	 * @Description The tests must check whether the XML tags TRANSFER, HEADERSECTION, DATASECTION exist
 	 *
 	 * @Test-requirement RTR.T02a.xtf
 	 *
 	 * @Expected-result Error message. TRANSFER not available
 	 *
 	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 3.3.3</p>
	 */
	@Test
	public void RTR_T02a() {
		// Ignored if vendor="ilivalidator" --> Wrong error message
		// assumeFalse (System.getProperty("vendor").equals("ilivalidator"));
		boolean ret = TestUtil.runJob(vendor, "../data/RTR.T02a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RTR.T02b
	 *
	 * @Designation Transfer: structure of a transfer file
 	 *
 	 * @Description The tests must check whether the XML tags TRANSFER, HEADERSECTION, DATASECTION exist
 	 *
 	 * @Test-requirement RTR.T02b.xtf
 	 *
 	 * @Expected-result Error message. HEADERSECTION not available
 	 *
 	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 3.3.3</p>
	 */
	@Test
	public void RTR_T02b() {
		// Ignored if vendor="ilivalidator" --> Wrong error message
		assumeFalse (System.getProperty("vendor").equals("ilivalidator"));
		boolean ret = TestUtil.runJob(vendor, "../data/RTR.T02b.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RTR.T02c
	 *
	 * @Designation Transfer: structure of a transfer file
 	 *
 	 * @Description The tests must check whether the XML tags TRANSFER, HEADERSECTION, DATASECTION exist
 	 *
 	 * @Test-requirement RTR.T02c.xtf
 	 *
 	 * @Expected-result Error message. DATASECTION not available
 	 *
 	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 3.3.3</p>
	 */
	@Test
	public void RTR_T02c() {
		// Ignored if vendor="ig/check" --> Wrong error message
		assumeFalse (System.getProperty("vendor").equals("ig/check"));
		boolean ret = TestUtil.runJob(vendor, "../data/RTR.T02c.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RTR.T03a
	 *
	 * @Designation Transfer: elements order
 	 *
 	 * @Description The tests must check whether the XML tags TRANSFER, HEADERSECTION, DATASECTION are in the correct order
 	 *
 	 * @Test-requirement RTR.T03a.xtf
 	 *
 	 * @Expected-result Error message. HEADERSECTION and DATASECTION occur in reverse order
 	 *
 	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 3.3.3</p>
	 */
	@Test
	public void RTR_T03a() {
		// Ignored if vendor="ilivalidator" --> Wrong error message
		assumeFalse (System.getProperty("vendor").equals("ilivalidator"));
		boolean ret = TestUtil.runJob(vendor, "../data/RTR.T03a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RTR.T04a
	 *
	 * @Designation Transfer: attribute xmlns
 	 *
 	 * @Description The tests must check whether the xmlns attribute exists in tag TRANSFER
 	 *
 	 * @Test-requirement RTR.T04a.xtf
 	 *
 	 * @Expected-result Error message. xmlns attribute not available
 	 *
 	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 3.3.3</p>
	 */
	@Test
	public void RTR_T04a() {
		// Ignored if vendor="ilivalidator" --> Wrong error message
		assumeFalse (System.getProperty("vendor").equals("ilivalidator"));
		boolean ret = TestUtil.runJob(vendor, "../data/RTR.T04a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}
}
