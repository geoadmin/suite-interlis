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
 * Data section: Topics
 */
public class TopicTest {
	private final Logger logger = LoggerFactory.getLogger(TopicTest.class);

	static String vendor;

    @Rule
    public TestName testName = new TestName();

	@BeforeClass
	public static void init() {
		vendor = System.getProperty("vendor");
	}

	/**
	 * @ID RTO.T01a
	 *
	 * @Designation Topics: TopicDef
 	 *
 	 * @Description The tests must check whether the value %Model.Topic% satisfies the definition the INTERLIS data model
 	 *
 	 * @Test-requirement RTO.T01a.xtf
 	 *
 	 * @Expected-result Error message. Value %Topic% is wrong
 	 *
 	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 2.8.9 and 3.3.1</p>
 	 */
	@Test
	public void RTO_T01a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RTO.T01a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RTO.T02a
	 *
	 * @Designation Topics: BID
 	 *
 	 * @Description The tests must check whether the BID exists and satisfies the encoding rules
 	 *
 	 * @Test-requirement RTO.T02a.xtf
 	 *
 	 * @Expected-result Error message. BID not available
 	 *
 	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 2.8.9 and 3.3.1</p>
 	 */
	@Test
	public void RTO_T02a() {
		// Ignored if vendor="ilivalidator" --> java.lang.IllegalArgumentException instead of java.lang.AssertionError. Error message is correct
		assumeFalse (System.getProperty("vendor").equals("ilivalidator"));
		boolean ret = TestUtil.runJob(vendor, "../data/RTO.T02a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RTO.T02b
	 *
	 * @Designation Topics: BID
 	 *
 	 * @Description The tests must check whether the BID exists and satisfies the encoding rules
 	 *
 	 * @Test-requirement RTO.T02b.xtf
 	 *
 	 * @Expected-result Error message. Empty BID
 	 *
 	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 2.8.9 and 3.3.1</p>
 	 */
	@Test
	public void RTO_T02b() {
		boolean ret = TestUtil.runJob(vendor, "../data/RTO.T02b.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RTO.T02c
	 *
	 * @Designation Topics: BID
 	 *
 	 * @Description The tests must check whether the BID exists and satisfies the encoding rules
 	 *
 	 * @Test-requirement RTO.T02c.xtf
 	 *
 	 * @Expected-result Error message. BID must be encoded as XML-ID à la INTERLIS. The first character must be a letter or a digit or an underscore
 	 *
 	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 2.8.9 and 3.3.1</p>
 	 */
	@Test
	public void RTO_T02c() {
		boolean ret = TestUtil.runJob(vendor, "../data/RTO.T02c.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RTO.T02d
	 *
	 * @Designation Topics: BID
 	 *
 	 * @Description The tests must check whether the BID exists and satisfies the encoding rules
 	 *
 	 * @Test-requirement RTO.T02d.xtf
 	 *
 	 * @Expected-result Error message. Characters with umlauts are not allowed
 	 *
 	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 2.8.9 and 3.3.1</p>
 	 */
	@Test
	public void RTO_T02d() {
		boolean ret = TestUtil.runJob(vendor, "../data/RTO.T02d.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RTO.T03a
	 *
	 * @Designation Topics: BID and TID
 	 *
 	 * @Description The tests must check whether all BID and all TID within the transfer are unique
 	 *
 	 * @Test-requirement RTO.T03a.xtf
 	 *
 	 * @Expected-result Error message. Double BID
 	 *
 	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 3.2.6 and 3.3.7</p>
 	 */
	@Test
	public void RTO_T03a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RTO.T03a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RTO.T03b
	 *
	 * @Designation Topics: BID and TID
 	 *
 	 * @Description The tests must check whether all BID and all TID within the transfer are unique
 	 *
 	 * @Test-requirement RTO.T03b.xtf
 	 *
 	 * @Expected-result Error message. Same value in BID and in TID
 	 *
 	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 3.2.6 and 3.3.7</p>
 	 */
	@Test
	public void RTO_T03b() {
		boolean ret = TestUtil.runJob(vendor, "../data/RTO.T03b.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RTO.T04a
	 *
	 * @Designation Topics: containers and models
 	 *
 	 * @Description The tests must check containers corresponding to different models
 	 *
 	 * @Test-requirement RTO.T04a.xtf
 	 *
 	 * @Expected-result No error message
	 *
	 */
	@Test
	public void RTO_T04a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RTO.T04a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}

	/**
	 * @ID RTO.T05a
	 *
	 * @Designation Topics: empty containers
 	 *
 	 * @Description The tests must check the rules for empty containers
 	 *
 	 * @Test-requirement RTO.T05a.xtf
 	 *
 	 * @Expected-result No error message
 	 *
 	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 3.3.3, 3.3.5 and 3.3.6</p>
 	 */
	@Test
	public void RTO_T05a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RTO.T05a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}

	/**
	 * @ID RTO.T05b
	 *
	 * @Designation Topics: empty containers
 	 *
 	 * @Description The tests must check the rules for empty containers
 	 *
 	 * @Test-requirement RTO.T05b.xtf
 	 *
 	 * @Expected-result No error message
 	 *
 	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 3.3.3, 3.3.5 and 3.3.6</p>
 	 */
	@Test
	public void RTO_T05b() {
		boolean ret = TestUtil.runJob(vendor, "../data/RTO.T05b.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}

	/**
	 * @ID RTO.T06a
	 *
	 * @Designation Topics: containers and imported models
 	 *
 	 * @Description The tests must check containers that have been defined on the basis of imported models
 	 *
 	 * @Test-requirement RTO.T06a.xtf
 	 *
 	 * @Expected-result No error message
 	 *
 	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 2.5.1 and Appendix C</p>
 	 */
	@Test
	public void RTO_T06a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RTO.T06a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}

	/**
	 * @ID RTO.T06b
	 *
	 * @Designation Topics: containers and imported models
 	 *
 	 * @Description The tests must check containers that have been defined on the basis of imported models
 	 *
 	 * @Test-requirement RTO.T06b.xtf
 	 *
 	 * @Expected-result No error message
 	 *
 	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 2.5.1 and Appendix C</p>
 	 */
	@Test
	public void RTO_T06b() {
		boolean ret = TestUtil.runJob(vendor, "../data/RTO.T06b.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}

	/**
	 * @ID RTO.T06c
	 *
	 * @Designation Topics: containers and imported models
 	 *
 	 * @Description The tests must check containers that have been defined on the basis of imported models
 	 *
 	 * @Test-requirement RTO.T06c.xtf
 	 *
 	 * @Expected-result Error message. Because of ASSOCIATION, the data must be transferred in a single basket
 	 *
 	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 2.5.1 and Appendix C</p>
 	 */
	@Test
	public void RTO_T06c() {
		// Ausgesetzt falls vendor="ig/check" --> Flasche Fehlermeldung
		assumeFalse (System.getProperty("vendor").equals("ig/check"));
		boolean ret = TestUtil.runJob(vendor, "../data/RTO.T06c.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}
}
