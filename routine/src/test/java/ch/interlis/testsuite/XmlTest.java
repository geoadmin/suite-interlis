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
 * Tests XML Well-Formedness
 */
public class XmlTest {
	private final Logger logger = LoggerFactory.getLogger(XmlTest.class);

	static String vendor;

    @Rule
    public TestName testName = new TestName();

	@BeforeClass
	public static void init() {
		vendor = System.getProperty("vendor");
	}

	/**
	 * @ID RXW.T01a
	 *
	 * @Designation Tags
	 *
	 * @Description The tests must check the well-formedness of the tags
	 *
	 * @Test-requirement RXW.T01a.xtf
	 *
	 * @Expected-result Error message. There is a space in the DATASECTION tag
	 *
	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 3.3.1 and 3.3.3</p>
	 * <p><a href="https://www.w3.org/TR/xml/#sec-well-formed">Extensible Markup Language (XML) 1.0 Chap. 2.1</a></p>
	 */
	@Test
	public void RXW_T01a() {
		// Ignored if vendor="ig/check" --> Wrong error message
		assumeFalse (System.getProperty("vendor").equals("ig/check"));
		boolean ret = TestUtil.runJob(vendor, "../data/RXW.T01a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RXW.T01b
	 *
	 * @Designation Tags
	 *
	 * @Description The tests must check the well-formedness of the tags
	 *
	 * @Test-requirement RXW.T01b.xtf
	 *
	 * @Expected-result Error message. The closing tag TRANSFERs does not match the opening tag TRANSFER
	 *
	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 3.3.1 and 3.3.3</p>
	 * <p><a href="https://www.w3.org/TR/xml/#sec-well-formed">Extensible Markup Language (XML) 1.0 Chap. 2.1</a></p>
	 */
	@Test
	public void RXW_T01b() {
		boolean ret = TestUtil.runJob(vendor, "../data/RXW.T01b.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}
	/**
	 * @ID RXW.T02a
	 *
	 * @Designation XML attributes
	 *
	 * @Description The tests must check whether the XML attributes are written in quotation marks (single or double quotation marks) and that an attribute name does not occur more than once in the same tag
	 *
	 * @Test-requirement RXW.T02a.xtf
	 *
	 * @Expected-result Error message. Attribute value (xmlns) not in quotation marks
	 *
	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 3.3.1</p>
	 * <p><a href="https://www.w3.org/TR/xml/#sec-well-formed">Extensible Markup Language (XML) 1.0 Chap. 3.1</a></p>
	 */
	@Test
	public void RXW_T02a() {
		// Ignored if vendor="ilivalidator" --> Wrong error message
		assumeFalse (System.getProperty("vendor").equals("ilivalidator"));
		boolean ret = TestUtil.runJob(vendor, "../data/RXW.T02a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}
	/**
	 * @ID RXW.T02b
	 *
	 * @Designation XML attributes
	 *
	 * @Description The tests must check whether the XML attributes are written in quotation marks (single or double quotation marks) and that an attribute name does not occur more than once in the same tag
	 *
	 * @Test-requirement RXW.T02b.xtf
	 *
	 * @Expected-result No error message. Single and double quotation marks are both valid
	 *
	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 3.3.1</p>
	 * <p><a href="https://www.w3.org/TR/xml/#sec-well-formed">Extensible Markup Language (XML) 1.0 Chap. 3.1</a></p>
	 */
	@Test
	public void RXW_T02b() {
		boolean ret = TestUtil.runJob(vendor, "../data/RXW.T02b.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}
	/**
	 * @ID RXW.T02c
	 *
	 * @Designation XML attributes
	 *
	 * @Description The tests must check whether the XML attributes are written in quotation marks (single or double quotation marks) and that an attribute name does not occur more than once in the same tag
	 *
	 * @Test-requirement RXW.T02c.xtf
	 *
	 * @Expected-result Error message. Double attribute BID
	 *
	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 3.3.1</p>
	 * <p><a href="https://www.w3.org/TR/xml/#sec-well-formed">Extensible Markup Language (XML) 1.0 Chap. 3.1</a></p>
	 */
	@Test
	public void RXW_T02c() {
		boolean ret = TestUtil.runJob(vendor, "../data/RXW.T02c.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RXW.T02d
	 *
	 * @Designation XML attributes
	 *
	 * @Description The tests must check whether the XML attributes are written in quotation marks (single or double quotation marks) and that an attribute name does not occur more than once in the same tag
	 *
	 * @Test-requirement RXW.T02d.xtf
	 *
	 * @Expected-result Error message. Double attribute TID
	 *
	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 3.3.1</p>
	 * <p><a href="https://www.w3.org/TR/xml/#sec-well-formed">Extensible Markup Language (XML) 1.0 Chap. 3.1</a></p>
	 */
	@Test
	public void RXW_T02d() {
		boolean ret = TestUtil.runJob(vendor, "../data/RXW.T02d.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RXW.T02e
	 *
	 * @Designation XML attributes
	 *
	 * @Description The tests must check whether the XML attributes are written in quotation marks (single or double quotation marks) and that an attribute name does not occur more than once in the same tag
	 *
	 * @Test-requirement RXW.T02e.xtf
	 *
	 * @Expected-result Error message. Double attribute VERSION in HEADERSECTION
	 *
	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 3.3.1</p>
	 * <p><a href="https://www.w3.org/TR/xml/#sec-well-formed">Extensible Markup Language (XML) 1.0 Chap. 3.1</a></p>
	 */
	@Test
	public void RXW_T02e() {
		// Ignored if vendor="ilivalidator" --> Wrong error message
		assumeFalse (System.getProperty("vendor").equals("ilivalidator"));
		boolean ret = TestUtil.runJob(vendor, "../data/RXW.T02e.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RXW.T02f
	 *
	 * @Designation XML attributes
	 *
	 * @Description The tests must check whether the XML attributes are written in quotation marks (single or double quotation marks) and that an attribute name does not occur more than once in the same tag
	 *
	 * @Test-requirement RXW.T02f.xtf
	 *
	 * @Expected-result Error message. Double attribute VERSION in MODEL
	 *
	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 3.3.1</p>
	 * <p><a href="https://www.w3.org/TR/xml/#sec-well-formed">Extensible Markup Language (XML) 1.0 Chap. 3.1</a></p>
	 */
	@Test
	public void RXW_T02f() {
		// Ignored if vendor="ilivalidator" --> Wrong error message
		assumeFalse (System.getProperty("vendor").equals("ilivalidator"));
		boolean ret = TestUtil.runJob(vendor, "../data/RXW.T02f.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

}
