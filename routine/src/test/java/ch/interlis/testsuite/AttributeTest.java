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
 * Data section: Attributes
*/
public class AttributeTest {
	private final Logger logger = LoggerFactory.getLogger(AttributeTest.class);

	static String vendor;

    @Rule
    public TestName testName = new TestName();

	@BeforeClass
	public static void init() {
		vendor = System.getProperty("vendor");
	}

	/**
	 * @ID RAt.T01a
	 *
	 * @Designation Attributes: AttributeName
	 *
	 * @Description The tests must check whether the value %AttributeName% satisfies the definition in the INTERLIS data model
	 *
	 * @Test-requirement RAt.T01a.xtf
	 *
	 * @Expected-result Error message. Value %AttributeName% is wrong
	 *
	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 2.6 and 3.3.11</p>
	 */
	@Test
	public void RAt_T01a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RAt.T01a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RAt.T02a
	 *
	 * @Designation Attributes: TEXT
	 *
	 * @Description The tests must check whether the attribute value satisfies the definition for TEXT in the INTERLIS data model and the corresponding encoding rules
	 *
	 * @Test-requirement RAt.T02a.xtf
	 *
	 * @Expected-result No error message. Spaces are valid characters
	 *
	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 2.6, 2.8.1 and 3.3.11.2</p>
	 * <p><a href="https://www.w3.org/TR/xml/#charsets">Extensible Markup Language (XML) 1.0 Chap. 2.2</a></p>
	 */
	@Test
	public void RAt_T02a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RAt.T02a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}

	/**
	 * @ID RAt.T02b
	 *
	 * @Designation Attributes: TEXT
	 *
	 * @Description The tests must check whether the attribute value satisfies the definition for TEXT in the INTERLIS data model and the corresponding encoding rules
	 *
	 * @Test-requirement RAt.T02b.xtf
	 *
	 * @Expected-result Error message. Attribute Art3 must be limited to three characters
	 *
	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 2.6, 2.8.1 and 3.3.11.2</p>
	 * <p><a href="https://www.w3.org/TR/xml/#charsets">Extensible Markup Language (XML) 1.0 Chap. 2.2</a></p>
	 */
	@Test
	public void RAt_T02b() {
		boolean ret = TestUtil.runJob(vendor, "../data/RAt.T02b.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RAt.T02c
	 *
	 * @Designation Attributes: TEXT
	 *
	 * @Description The tests must check whether the attribute value satisfies the definition for TEXT in the INTERLIS data model and the corresponding encoding rules
	 *
	 * @Test-requirement RAt.T02c.xtf
	 *
	 * @Expected-result Error message. TEXT must be encoded as a single-line text, control characters are not allowed
	 *
	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 2.6, 2.8.1 and 3.3.11.2</p>
	 * <p><a href="https://www.w3.org/TR/xml/#charsets">Extensible Markup Language (XML) 1.0 Chap. 2.2</a></p>
	 */
	@Test
	public void RAt_T02c() {
		boolean ret = TestUtil.runJob(vendor, "../data/RAt.T02c.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RAt.T03a
	 *
	 * @Designation Attributes: MTEXT
	 *
	 * @Description The tests must check whether the attribute value satisfies the definition for MTEXT in the INTERLIS data model and the corresponding encoding rules
	 *
	 * @Test-requirement RAt.T03a.xtf
	 *
	 * @Expected-result Error message. Attribute Beschreibung must be limited to 9 characters; each carriage return counts as 1 character
	 *
	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 2.6, 2.8.1 and 3.3.11.2</p>
	 * <p><a href="https://www.w3.org/TR/xml/#charsets">Extensible Markup Language (XML) 1.0 Chap. 2.2</a></p>
	 * <p><a href="http://www.w3.org/TR/xml/#sec-line-ends">Extensible Markup Language (XML) 1.0 Chap. 2.11</a></p>
	 */
	@Test
	public void RAt_T03a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RAt.T03a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RAt.T03b
	 *
	 * @Designation Attributes: MTEXT
	 *
	 * @Description The tests must check whether the attribute value satisfies the definition for MTEXT in the INTERLIS data model and the corresponding encoding rules
	 *
	 * @Test-requirement RAt.T03b.xtf
	 *
	 * @Expected-result No error message. Control characters such as tabs are allowed in MTEXT
	 *
	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 2.6, 2.8.1 and 3.3.11.2</p>
	 * <p><a href="https://www.w3.org/TR/xml/#charsets">Extensible Markup Language (XML) 1.0 Chap. 2.2</a></p>
	 * <p><a href="http://www.w3.org/TR/xml/#sec-line-ends">Extensible Markup Language (XML) 1.0 Chap. 2.11</a></p>
	 */
	@Test
	public void RAt_T03b() {
		boolean ret = TestUtil.runJob(vendor, "../data/RAt.T03b.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}

	/**
	 * @ID RAt.T04a
	 *
	 * @Designation Attributes: NAME
	 *
	 * @Description The tests must check whether the attribute value satisfies the definition for NAME in the INTERLIS data model and the corresponding encoding rules
	 *
	 * @Test-requirement RAt.T04a.xtf
	 *
	 * @Expected-result Error message. NAME is a sequence of up to 255 letters, numbers and underscores
	 *
	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 2.2.2, 2.2.7, 2.6, 2.8.1 and 3.3.11.2</p>
	 * <p><a href="https://www.w3.org/TR/xml/#NT-Name">Extensible Markup Language (XML) 1.0 Chap. 2.3</a></p>
	 */
	@Test
	public void RAt_T04a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RAt.T04a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RAt.T04b
	 *
	 * @Designation Attributes: NAME
	 *
	 * @Description The tests must check whether the attribute value satisfies the definition for NAME in the INTERLIS data model and the corresponding encoding rules
	 *
	 * @Test-requirement RAt.T04b.xtf
	 *
	 * @Expected-result Error message. The first character must be a letter
	 *
	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 2.2.2, 2.2.7, 2.6, 2.8.1 and 3.3.11.2</p>
	 * <p><a href="https://www.w3.org/TR/xml/#NT-Name">Extensible Markup Language (XML) 1.0 Chap. 2.3</a></p>
	 */
	@Test
	public void RAt_T04b() {
		boolean ret = TestUtil.runJob(vendor, "../data/RAt.T04b.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RAt.T04c
	 *
	 * @Designation Attributes: NAME
	 *
	 * @Description The tests must check whether the attribute value satisfies the definition for NAME in the INTERLIS data model and the corresponding encoding rules
	 *
	 * @Test-requirement RAt.T04c.xtf
	 *
	 * @Expected-result Error message. Reserved INTERLIS words are not allowed
	 *
	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 2.2.2, 2.2.7, 2.6, 2.8.1 and 3.3.11.2</p>
	 * <p><a href="https://www.w3.org/TR/xml/#NT-Name">Extensible Markup Language (XML) 1.0 Chap. 2.3</a></p>
	 */
	@Test
	public void RAt_T04c() {
		boolean ret = TestUtil.runJob(vendor, "../data/RAt.T04c.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RAt.T05a
	 *
	 * @Designation Attributes: URI
	 *
	 * @Description The tests must check whether the attribute value satisfies the definition for URI in the INTERLIS data model and the corresponding encoding rules
	 *
	 * @Test-requirement RAt.T05a.xtf
	 *
	 * @Expected-result Error message. URI is a sequence of up to 1023 characters
	 *
	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 2.6, 2.8.1 and 3.3.11.2</p>
	 * <p><a href="https://www.ietf.org/rfc/rfc2396.txt">RFC Uniform Resource Identifiers (URI): Generic Syntax Chap. 3</a></p>
	 */
	@Test
	public void RAt_T05a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RAt.T05a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RAt.T05b
	 *
	 * @Designation Attributes: URI
	 *
	 * @Description The tests must check whether the attribute value satisfies the definition for URI in the INTERLIS data model and the corresponding encoding rules
	 *
	 * @Test-requirement RAt.T05b.xtf
	 *
	 * @Expected-result Error message. URI schema is missing
	 *
	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 2.6, 2.8.1 and 3.3.11.2</p>
	 * <p><a href="https://www.ietf.org/rfc/rfc2396.txt">RFC Uniform Resource Identifiers (URI): Generic Syntax Chap. 3</a></p>
	 */
	@Test
	public void RAt_T05b() {
		boolean ret = TestUtil.runJob(vendor, "../data/RAt.T05b.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RAt.T06a
	 *
	 * @Designation Attributes: EnumerationType
	 *
	 * @Description The tests must check whether the attribute value satisfies the definition for EnumerationType in the INTERLIS data model and the corresponding encoding rules
	 *
	 * @Test-requirement RAt.T06a.xtf
	 *
	 * @Expected-result Error message. The values of an enumeration are case-sensitive
	 *
	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 2.6, 2.8.1 and 3.3.11.3</p>
	 */
	@Test
	public void RAt_T06a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RAt.T06a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RAt.T06b
	 *
	 * @Designation Attributes: EnumerationType
	 *
	 * @Description The tests must check whether the attribute value satisfies the definition for EnumerationType in the INTERLIS data model and the corresponding encoding rules
	 *
	 * @Test-requirement RAt.T06b.xtf
	 *
	 * @Expected-result Error message. The leaves of the tree (but not the nodes) form the set of allowed values: Gebaeude is a node
	 *
	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 2.6, 2.8.1 and 3.3.11.3</p>
	 */
	@Test
	public void RAt_T06b() {
		boolean ret = TestUtil.runJob(vendor, "../data/RAt.T06b.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RAt.T06c
	 *
	 * @Designation Attributes: EnumerationType
	 *
	 * @Description The tests must check whether the attribute value satisfies the definition for EnumerationType in the INTERLIS data model and the corresponding encoding rules
	 *
	 * @Test-requirement RAt.T06c.xtf
	 *
	 * @Expected-result Error message. Spaces are not allowed
	 *
	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 2.6, 2.8.1 and 3.3.11.3</p>
	 */
	@Test
	public void RAt_T06c() {
		boolean ret = TestUtil.runJob(vendor, "../data/RAt.T06c.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RAt.T07a
	 *
	 * @Designation Attributes: EnumTreeValueType
	 *
	 * @Description The tests must check whether the attribute value satisfies the definition for EnumTreeValueType in the INTERLIS data model and the corresponding encoding rules
	 *
	 * @Test-requirement RAt.T07a.xtf
	 *
	 * @Expected-result Error message. Invalid value (dunkel)
	 *
	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 2.6, 2.8.1 and 3.3.11.3</p>
	 */
	@Test
	public void RAt_T07a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RAt.T07a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RAt.T07b
	 *
	 * @Designation Attributes: EnumTreeValueType
	 *
	 * @Description The tests must check whether the attribute value satisfies the definition for EnumTreeValueType in the INTERLIS data model and the corresponding encoding rules
	 *
	 * @Test-requirement RAt.T07b.xtf
	 *
	 * @Expected-result No error message. Leaves and nodes are allowed
	 *
	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 2.6, 2.8.1 and 3.3.11.3</p>
	 */
	@Test
	public void RAt_T07b() {
		boolean ret = TestUtil.runJob(vendor, "../data/RAt.T07b.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}

	/**
	 * @ID RAt.T08a
	 *
	 * @Designation Attributes: BooleanType
	 *
	 * @Description The tests must check whether the attribute value satisfies the definition for BooleanType in the INTERLIS data model and the corresponding encoding rules
	 *
	 * @Test-requirement RAt.T08a.xtf
	 *
	 * @Expected-result No error message
	 *
	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 2.6, 2.8.4 and 3.3.11</p>
	 */
	@Test
	public void RAt_T08a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RAt.T08a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}

	/**
	 * @ID RAt.T08b
	 *
	 * @Designation Attributes: BooleanType
	 *
	 * @Description The tests must check whether the attribute value satisfies the definition for BooleanType in the INTERLIS data model and the corresponding encoding rules
	 *
	 * @Test-requirement RAt.T08b.xtf
	 *
	 * @Expected-result Error message. Invalid value (0)
	 *
	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 2.6, 2.8.4 and 3.3.11</p>
	 */
	@Test
	public void RAt_T08b() {
		boolean ret = TestUtil.runJob(vendor, "../data/RAt.T08b.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RAt.T09a
	 *
	 * @Designation Attributes: NumericType
	 *
	 * @Description The tests must check whether the attribute value satisfies the definition for NumericType in the INTERLIS data model and the corresponding encoding rules
	 *
	 * @Test-requirement RAt.T09a.xtf
	 *
	 * @Expected-result No error message
	 *
	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 2.6, 2.8.5 and 3.3.11.4</p>
	 */
	@Test
	public void RAt_T09a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RAt.T09a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}

	/**
	 * @ID RAt.T09b
	 *
	 * @Designation Attributes: NumericType
	 *
	 * @Description The tests must check whether the attribute value satisfies the definition for NumericType in the INTERLIS data model and the corresponding encoding rules
	 *
	 * @Test-requirement RAt.T09b.xtf
	 *
	 * @Expected-result Error message.Invalid value (0.9)
	 *
	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 2.6, 2.8.5 and 3.3.11.4</p>
	 */
	@Test
	public void RAt_T09b() {
		boolean ret = TestUtil.runJob(vendor, "../data/RAt.T09b.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RAt.T09c
	 *
	 * @Designation Attributes: NumericType
	 *
	 * @Description The tests must check whether the attribute value satisfies the definition for NumericType in the INTERLIS data model and the corresponding encoding rules
	 *
	 * @Test-requirement RAt.T09c.xtf
	 *
	 * @Expected-result No error message
	 *
	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 2.6, 2.8.5 and 3.3.11.4</p>
	 */
	@Test
	public void RAt_T09c() {
		boolean ret = TestUtil.runJob(vendor, "../data/RAt.T09c.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}

	/**
	 * @ID RAt.T09d
	 *
	 * @Designation Attributes: NumericType
	 *
	 * @Description The tests must check whether the attribute value satisfies the definition for NumericType in the INTERLIS data model and the corresponding encoding rules
	 *
	 * @Test-requirement RAt.T09d.xtf
	 *
	 * @Expected-result Error message (00004 instead of 4)
	 *
	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 2.6, 2.8.5 and 3.3.11.4</p>
	 */
	@Test
	public void RAt_T09d() {
		boolean ret = TestUtil.runJob(vendor, "../data/RAt.T09d.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RAt.T09e
	 *
	 * @Designation Attributes: NumericType
	 *
	 * @Description The tests must check whether the attribute value satisfies the definition for NumericType in the INTERLIS data model and the corresponding encoding rules
	 *
	 * @Test-requirement RAt.T09e.xtf
	 *
	 * @Expected-result No error message (10000.1 will be rounded to 10000.0)
	 *
	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 2.6, 2.8.5 and 3.3.11.4</p>
	 */
	@Test
	public void RAt_T09e() {
		boolean ret = TestUtil.runJob(vendor, "../data/RAt.T09e.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}

	/**
	 * @ID RAt.T09f
	 *
	 * @Designation Attributes: NumericType
	 *
	 * @Description The tests must check whether the attribute value satisfies the definition for NumericType in the INTERLIS data model and the corresponding encoding rules
	 *
	 * @Test-requirement RAt.T09f.xtf
	 *
	 * @Expected-result No error message
	 *
	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 2.6, 2.8.5 and 3.3.11.4</p>
	 */
	@Test
	public void RAt_T09f() {
		boolean ret = TestUtil.runJob(vendor, "../data/RAt.T09f.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}

	/**
	 * @ID RAt.T09g
	 *
	 * @Designation Attributes: NumericType
	 *
	 * @Description The tests must check whether the attribute value satisfies the definition for NumericType in the INTERLIS data model and the corresponding encoding rules
	 *
	 * @Test-requirement RAt.T09g.xtf
	 *
	 * @Expected-result Error message (10000.5 will be rounded to 10000.1)
	 *
	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 2.6, 2.8.5 and 3.3.11.4</p>
	 */
	@Test
	public void RAt_T09g() {
		boolean ret = TestUtil.runJob(vendor, "../data/RAt.T09g.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RAt.T10a
	 *
	 * @Designation Attributes: FormattedType
	 *
	 * @Description The tests must check whether the attribute value satisfies the definition for FormattedType in the INTERLIS data model and the corresponding encoding rules
	 *
	 * @Test-requirement RAt.T10a.xtf
	 *
	 * @Expected-result Error message. Invalid value (1)
	 *
	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 2.6, 2.8.6, 2.8.7 and 3.3.11.5</p>
	 */
	@Test
	public void RAt_T10a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RAt.T10a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RAt.T10b
	 *
	 * @Designation Attributes: FormattedType
	 *
	 * @Description The tests must check whether the attribute value satisfies the definition for FormattedType in the INTERLIS data model and the corresponding encoding rules
	 *
	 * @Test-requirement RAt.T10b.xtf
	 *
	 * @Expected-result Error message. Invalid year (3000)
	 *
	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 2.6, 2.8.6, 2.8.7 and 3.3.11.5</p>
	 */
	@Test
	public void RAt_T10b() {
		boolean ret = TestUtil.runJob(vendor, "../data/RAt.T10b.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RAt.T10c
	 *
	 * @Designation Attributes: FormattedType
	 *
	 * @Description The tests must check whether the attribute value satisfies the definition for FormattedType in the INTERLIS data model and the corresponding encoding rules
	 *
	 * @Test-requirement RAt.T10c.xtf
	 *
	 * @Expected-result Error message. Invalid year (2018)
	 *
	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 2.6, 2.8.6, 2.8.7 and 3.3.11.5</p>
	 */
	@Test
	public void RAt_T10c() {
		boolean ret = TestUtil.runJob(vendor, "../data/RAt.T10c.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RAt.T11a
	 *
	 * @Designation Attributes: OIDType
	 *
	 * @Description The tests must check whether the attribute value satisfies the definition for OIDType in the INTERLIS data model and the corresponding encoding rules
	 *
	 * @Test-requirement RAt.T11a.xtf
	 *
	 * @Expected-result Error message. Invalid UUID for the BID
	 *
	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 2.8.9 and 3.3.11.16</p>
	 * <p><a href="https://www.w3.org/TR/xml-id">xml:id Version 1.0 Chap. D.2</a></p>
	 */
	@Test
	public void RAt_T11a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RAt.T11a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RAt.T11b
	 *
	 * @Designation Attributes: OIDType
	 *
	 * @Description The tests must check whether the attribute value satisfies the definition for OIDType in the INTERLIS data model and the corresponding encoding rules
	 *
	 * @Test-requirement RAt.T11b.xtf
	 *
	 * @Expected-result Error message. Invalid UUID for the TID
	 *
	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 2.8.9 and 3.3.11.16</p>
	 * <p><a href="https://www.w3.org/TR/xml-id">xml:id Version 1.0 Chap. D.2</a></p>
	 */
	@Test
	public void RAt_T11b() {
		boolean ret = TestUtil.runJob(vendor, "../data/RAt.T11b.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RAt.T11c
	 *
	 * @Designation Attributes: OIDType
	 *
	 * @Description The tests must check whether the attribute value satisfies the definition for OIDType in the INTERLIS data model and the corresponding encoding rules
	 *
	 * @Test-requirement RAt.T11c.xtf
	 *
	 * @Expected-result No error message
	 *
	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 2.8.9 and 3.3.11.16</p>
	 * <p><a href="https://www.w3.org/TR/xml-id">xml:id Version 1.0 Chap. D.2</a></p>
	 */
	@Test
	public void RAt_T11c() {
		boolean ret = TestUtil.runJob(vendor, "../data/RAt.T11c.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}

	/**
	 * @ID RAt.T11d
	 *
	 * @Designation Attributes: OIDType
	 *
	 * @Description The tests must check whether the attribute value satisfies the definition for OIDType in the INTERLIS data model and the corresponding encoding rules
	 *
	 * @Test-requirement RAt.T11d.xtf
	 *
	 * @Expected-result Error message. Invalid encoding (it must be encoded as XML attribute)
	 *
	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 2.8.9 and 3.3.11.16</p>
	 * <p><a href="https://www.w3.org/TR/xml-id">xml:id Version 1.0 Chap. D.2</a></p>
	 */
	@Test
	public void RAt_T11d() {
		boolean ret = TestUtil.runJob(vendor, "../data/RAt.T11d.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RAt.T11e
	 *
	 * @Designation Attributes: OIDType
	 *
	 * @Description The tests must check whether the attribute value satisfies the definition for OIDType in the INTERLIS data model and the corresponding encoding rules
	 *
	 * @Test-requirement RAt.T11e.xtf
	 *
	 * @Expected-result Error message. Only numbers and letters are allowed
	 *
	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 2.8.9 and 3.3.11.16</p>
	 * <p><a href="https://www.w3.org/TR/xml-id">xml:id Version 1.0 Chap. D.2</a></p>
	 */
	@Test
	public void RAt_T11e() {
		// Ignored if vendor="ig/check" --> Wrong error message
		assumeFalse (System.getProperty("vendor").equals("ig/check"));
		boolean ret = TestUtil.runJob(vendor, "../data/RAt.T11e.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}
	/**
	 * @ID RAt.T11f
	 *
	 * @Designation Attributes: OIDType
	 *
	 * @Description The tests must check whether the attribute value satisfies the definition for OIDType in the INTERLIS data model and the corresponding encoding rules
	 *
	 * @Test-requirement RAt.T11f.xtf
	 *
	 * @Expected-result Error message. First character must be letter or underscore
	 *
	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 2.8.9 and 3.3.11.16</p>
	 * <p><a href="https://www.w3.org/TR/xml-id">xml:id Version 1.0 Chap. D.2</a></p>
	 */
	@Test
	public void RAt_T11f() {
		// Ignored if vendor="ig/check" --> Wrong error message
		assumeFalse (System.getProperty("vendor").equals("ig/check"));
		boolean ret = TestUtil.runJob(vendor, "../data/RAt.T11f.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}
}
