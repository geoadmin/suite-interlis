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
 * Tests Order within class instances
 */
public class OrderAttributeTest {
	private final Logger logger = LoggerFactory.getLogger(OrderAttributeTest.class);

	static String vendor;

    @Rule
    public TestName testName = new TestName();

	@BeforeClass
	public static void init() {
		vendor = System.getProperty("vendor");
	}

	/**
	 * @ID RRiO.T01a
	 *
	 * @Designation Order: class instances
 	 *
 	 * @Description The tests must check the rules for the order of the object instances of a class
 	 *
 	 * @Test-requirement RRiO.T01a.xtf
 	 *
 	 * @Expected-result No error message
 	 *
 	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 3.3.7</p>
 	 */
	@Test
	public void RRiO_T01a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RRiO.T01a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}

	/**
	 * @ID RRiO.T01b
	 *
	 * @Designation Order: class instances
 	 *
 	 * @Description The tests must check the rules for the order of the object instances of a class
 	 *
 	 * @Test-requirement RRiO.T01b.xtf
 	 *
 	 * @Expected-result Error message. Wrong sequence of the attributes
 	 *
 	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 3.3.7</p>
 	 */
	@Test
	public void RRiO_T01b() {
		boolean ret = TestUtil.runJob(vendor, "../data/RRiO.T01b.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RRiO.T01c
	 *
	 * @Designation Order: class instances
 	 *
 	 * @Description The tests must check the rules for the order of the object instances of a class
 	 *
 	 * @Test-requirement RRiO.T01c.xtf
 	 *
 	 * @Expected-result Error message. Wrong sequence of the EmbeddedLink
 	 *
 	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 3.3.7</p>
 	 */
	@Test
	public void RRiO_T01c() {
		boolean ret = TestUtil.runJob(vendor, "../data/RRiO.T01c.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RRiO.T02a
	 *
	 * @Designation Order: instances of an extended class
 	 *
 	 * @Description The tests must check the rules for the order of the object instances of an extended class
 	 *
 	 * @Test-requirement RRiO.T02a.xtf
 	 *
 	 * @Expected-result No error message
 	 *
 	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 3.3.7</p>
 	 */
	@Test
	public void RRiO_T02a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RRiO.T02a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}

	/**
	 * @ID RRiO.T02b
	 *
	 * @Designation Order: instances of an extended class
 	 *
 	 * @Description The tests must check the rules for the order of the object instances of an extended class
 	 *
 	 * @Test-requirement RRiO.T02b.xtf
 	 *
 	 * @Expected-result Error message. Wrong sequence of the attributes (the attributes of the basic class must be encoded first)
 	 *
 	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 3.3.7</p>
 	 */
	@Test
	public void RRiO_T02b() {
		boolean ret = TestUtil.runJob(vendor, "../data/RRiO.T02b.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RRiO.T03a
	 *
	 * @Designation Order: instances of an extended association class
 	 *
 	 * @Description The tests must check the rules for the order of the object instances of an extended association class
 	 *
 	 * @Test-requirement RRiO.T03a.xtf
 	 *
 	 * @Expected-result No error message
 	 *
 	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 3.3.7</p>
 	 */
	@Test
	public void RRiO_T03a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RRiO.T03a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}

	/**
	 * @ID RRiO.T03b
	 *
	 * @Designation Order: instances of an extended association class
 	 *
 	 * @Description The tests must check the rules for the order of the object instances of an extended association class
 	 *
 	 * @Test-requirement RRiO.T03b.xtf
 	 *
 	 * @Expected-result Error message. The roles of the basic class must be encoded first
 	 *
 	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 3.3.7</p>
 	 */
	@Test
	public void RRiO_T03b() {
		boolean ret = TestUtil.runJob(vendor, "../data/RRiO.T03b.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RRiO.T03c
	 *
	 * @Designation Order: instances of an extended association class
 	 *
 	 * @Description The tests must check the rules for the order of the object instances of an extended association class
 	 *
 	 * @Test-requirement RRiO.T03c.xtf
 	 *
 	 * @Expected-result Error message. The attributes of the basic class must be encoded first
 	 *
 	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 3.3.7</p>
 	 */
	@Test
	public void RRiO_T03c() {
		boolean ret = TestUtil.runJob(vendor, "../data/RRiO.T03c.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RRiO.T03d
	 *
	 * @Designation Order: instances of an extended association class
 	 *
 	 * @Description The tests must check the rules for the order of the object instances of an extended association class
 	 *
 	 * @Test-requirement RRiO.T03d.xtf
 	 *
 	 * @Expected-result Error message. The roles of the basic class are mandatory
 	 *
 	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 3.3.7</p>
 	 */
	@Test
	public void RRiO_T03d() {
		boolean ret = TestUtil.runJob(vendor, "../data/RRiO.T03d.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}
}
