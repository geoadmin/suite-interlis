package ch.interlis.testsuite;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ch.interlis.testsuite.util.TestUtil;

/**
 * Tests Order of objects within the data section
 */
public class OrderObjectTest {
	private final Logger logger = LoggerFactory.getLogger(OrderObjectTest.class);

	static String vendor;

    @Rule
    public TestName testName = new TestName();

	@BeforeClass
	public static void init() {
		vendor = System.getProperty("vendor");
	}

	/**
	 * @ID RRO.T01a
	 *
	 * @Designation Order: data section
 	 *
 	 * @Description The tests must check the rules for the order of the objects within the data section
 	 *
 	 * @Test-requirement RRO.T01a.xtf
 	 *
 	 * @Expected-result No error message
 	 *
 	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 3.2.5</p>
 	 */
	@Test
	public void RRO_T01a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RRO.T01a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}

	/**
	 * @ID RRO.T01b
	 *
	 * @Designation Order: data section
 	 *
 	 * @Description The tests must check the rules for the order of the objects within the data section
 	 *
 	 * @Test-requirement RRO.T01b.xtf
 	 *
 	 * @Expected-result No error message
 	 *
 	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 3.2.5</p>
 	 */
	@Test
	public void RRO_T01b() {
		boolean ret = TestUtil.runJob(vendor, "../data/RRO.T01b.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}
}
