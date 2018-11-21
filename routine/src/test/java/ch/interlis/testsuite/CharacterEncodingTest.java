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
 * Tests Characters encoding
 */
public class CharacterEncodingTest {
	private final Logger logger = LoggerFactory.getLogger(CharacterEncodingTest.class);

	static String vendor;

    @Rule
    public TestName testName = new TestName();

	@BeforeClass
	public static void init() {
		vendor = System.getProperty("vendor");
	}

	/**
	 * @ID RZe.T01a
	 *
	 * @Designation Characters encoding
	 *
	 * @Description The tests must check whether the characters satisfy the UTF-8 encoding rules
	 *
	 * @Test-requirement RZe.T01a.xtf
	 *
	 * @Expected-result No error message
	 *
	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 3.3.2</p>
	 */
	@Test
	public void RZe_T01a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RZe.T01a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}

	/**
	 * @ID RZe.T01b
	 *
	 * @Designation Characters encoding
	 *
	 * @Description The tests must check whether the characters satisfy the UTF-8 encoding rules
	 *
	 * @Test-requirement RZe.T01b.xtf
	 *
	 * @Expected-result Error message. File not encoded as UTF-8
	 *
	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 3.3.2</p>
	 */
	@Test
	public void RZe_T01b() {
		boolean ret = TestUtil.runJob(vendor, "../data/RZe.T01b.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RZe.T01c
	 *
	 * @Designation Characters encoding
	 *
	 * @Description The tests must check whether the characters satisfy the UTF-8 encoding rules
	 *
	 * @Test-requirement RZe.T01c.xtf
	 *
	 * @Expected-result Error message. Invalid UTF-8 characters
	 *
	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 3.3.2</p>
	 */
	@Test
	public void RZe_T01c() {
		boolean ret = TestUtil.runJob(vendor, "../data/RZe.T01c.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}
}
