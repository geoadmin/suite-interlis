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
 * Tests Data section: Classes
 */
public class ClassTest {
	private final Logger logger = LoggerFactory.getLogger(ClassTest.class);

	static String vendor;

    @Rule
    public TestName testName = new TestName();

	@BeforeClass
	public static void init() {
		vendor = System.getProperty("vendor");
	}

	/**
	 * @ID RKl.T01a
	 *
	 * @Designation Classes: ClassDef
 	 *
 	 * @Description The tests must check whether the value %Model.Topic.Class% satisfies the ClassDef in the INTERLIS data model
 	 *
 	 * @Test-requirement RKl.T01a.xtf
 	 *
 	 * @Expected-result Error message. Value %Class% is wrong
 	 *
 	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 3.3.7</p>
 	 */
	@Test
	public void RKl_T01a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RKl.T01a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RKl.T02a
	 *
	 * @Designation Classes: TID
 	 *
 	 * @Description The tests must check whether the TID exist and are unique
 	 *
 	 * @Test-requirement RKl.T02a.xtf
 	 *
 	 * @Expected-result Error message. Empty TID
 	 *
 	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 2.8.9, 3.3.1 and 3.3.7</p>
 	 */
	@Test
	public void RKl_T02a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RKl.T02a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RKl.T02b
	 *
	 * @Designation Classes: TID
 	 *
 	 * @Description The tests must check whether the TID exist and are unique
 	 *
 	 * @Test-requirement RKl.T02b.xtf
 	 *
 	 * @Expected-result Error message. TID not available
 	 *
 	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 2.8.9, 3.3.1 and 3.3.7</p>
 	 */
	@Test
	public void RKl_T02b() {
		boolean ret = TestUtil.runJob(vendor, "../data/RKl.T02b.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RKl.T02c
	 *
	 * @Designation Classes: TID
 	 *
 	 * @Description The tests must check whether the TID exist and are unique
 	 *
 	 * @Test-requirement RKl.T02c.xtf
 	 *
 	 * @Expected-result Error message. Double TID
 	 *
 	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 2.8.9, 3.3.1 and 3.3.7</p>
 	 */
	@Test
	public void RKl_T02c() {
		boolean ret = TestUtil.runJob(vendor, "../data/RKl.T02c.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RKl.T02d
	 *
	 * @Designation Classes: TID
 	 *
 	 * @Description The tests must check whether the TID exist and are unique
 	 *
 	 * @Test-requirement RKl.T02d.xtf
 	 *
 	 * @Expected-result Error message. TID must be encoded as XML-ID à la INTERLIS. The first character must be a letter or a digit or an underscore
 	 *
 	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 2.8.9, 3.3.1 and 3.3.7</p>
 	 */
	@Test
	public void RKl_T02d() {
		boolean ret = TestUtil.runJob(vendor, "../data/RKl.T02d.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RKl.T02e
	 *
	 * @Designation Classes: TID
 	 *
 	 * @Description The tests must check whether the TID exist and are unique
 	 *
 	 * @Test-requirement RKl.T02e.xtf
 	 *
 	 * @Expected-result Error message. Characters with umlauts are not allowed
 	 *
 	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 2.8.9, 3.3.1 and 3.3.7</p>
 	 */
	@Test
	public void RKl_T02e() {
		boolean ret = TestUtil.runJob(vendor, "../data/RKl.T02e.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}
}
