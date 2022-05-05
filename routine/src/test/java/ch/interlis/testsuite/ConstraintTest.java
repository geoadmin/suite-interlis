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
 * Tests Data section: Constraints
 */
public class ConstraintTest {
	private final Logger logger = LoggerFactory.getLogger(ConstraintTest.class);

	static String vendor;

    @Rule
    public TestName testName = new TestName();

	@BeforeClass
	public static void init() {
		vendor = System.getProperty("vendor");
	}

	/**
	 * @ID RKo.T01a
	 *
	 * @Designation Constraints: UNIQUE
 	 *
 	 * @Description The tests must check whether the data satisfies the ConstraintDef in the INTERLIS data model
 	 *
 	 * @Test-requirement RKo.T01a.xtf
 	 *
 	 * @Expected-result No error message
 	 *
 	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 2.12, 2.13 and 2.14</p>
 	 */
	@Test
	public void RKo_T01a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RKo.T01a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}

	/**
	 * @ID RKo.T01b
	 *
	 * @Designation Constraints: UNIQUE
 	 *
 	 * @Description The tests must check whether the data satisfies the ConstraintDef in the INTERLIS data model
 	 *
 	 * @Test-requirement RKo.T01a.xtf
 	 *
 	 * @Expected-result Error message. Constraint violated
 	 *
 	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 2.12, 2.13 and 2.14</p>
 	 */
	@Test
	public void RKo_T01b() {
		boolean ret = TestUtil.runJob(vendor, "../data/RKo.T01b.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RKo.T02a
	 *
	 * @Designation Constraints: UNIQUE (LOCAL)
 	 *
 	 * @Description The tests must check whether the data satisfies the ConstraintDef in the INTERLIS data model
 	 *
 	 * @Test-requirement RKo.T02a.xtf
 	 *
 	 * @Expected-result Error message. Constraint violated
 	 *
 	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 2.12, 2.13 and 2.14</p>
 	 */
	@Test
	public void RKo_T02a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RKo.T02a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RKo.T02b
	 *
	 * @Designation Constraints: UNIQUE (LOCAL)
 	 *
 	 * @Description The tests must check whether the data satisfies the ConstraintDef in the INTERLIS data model
 	 *
 	 * @Test-requirement RKo.T02b.xtf
 	 *
 	 * @Expected-result No error message
 	 *
 	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 2.12, 2.13 and 2.14</p>
 	 */
	@Test
	public void RKo_T02b() {
		boolean ret = TestUtil.runJob(vendor, "../data/RKo.T02b.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}

	/**
	 * @ID RKo.T03a
	 *
	 * @Designation Constraints: UNIQUE WHERE
 	 *
 	 * @Description The tests must check whether the data satisfies the ConstraintDef in the INTERLIS data model
 	 *
 	 * @Test-requirement RKo.T03a.xtf
 	 *
 	 * @Expected-result No error message
 	 *
 	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 2.12, 2.13 and 2.14</p>
 	 */
	@Test
	public void RKo_T03a() {
		// Ignored if vendor="ig/check" --> PSTACK ….END_PSTACK
		assumeFalse (System.getProperty("vendor").equals("ig/check"));
		boolean ret = TestUtil.runJob(vendor, "../data/RKo.T03a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}

	/**
	 * @ID RKo.T03b
	 *
	 * @Designation Constraints: UNIQUE WHERE
 	 *
 	 * @Description The tests must check whether the data satisfies the ConstraintDef in the INTERLIS data model
 	 *
 	 * @Test-requirement RKo.T03b.xtf
 	 *
 	 * @Expected-result Error message. Constraint violated
 	 *
 	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 2.12, 2.13 and 2.14</p>
 	 */
	@Test
	public void RKo_T03b() {
		// Ignored if vendor="ig/check" --> PSTACK ….END_PSTACK
		assumeFalse (System.getProperty("vendor").equals("ig/check"));
		boolean ret = TestUtil.runJob(vendor, "../data/RKo.T03b.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RKo.T04a
	 *
	 * @Designation Constraints: EXISTENCE CONSTRAINT
 	 *
 	 * @Description The tests must check whether the data satisfies the ConstraintDef in the INTERLIS data model
 	 *
 	 * @Test-requirement RKo.T04a.xtf
 	 *
 	 * @Expected-result No error message
 	 *
 	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 2.12, 2.13 and 2.14</p>
 	 */
	@Test
	public void RKo_T04a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RKo.T04a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}

	/**
	 * @ID RKo.T04b
	 *
	 * @Designation Constraints: EXISTENCE CONSTRAINT
 	 *
 	 * @Description The tests must check whether the data satisfies the ConstraintDef in the INTERLIS data model
 	 *
 	 * @Test-requirement RKo.T04b.xtf
 	 *
 	 * @Expected-result Error message. Constraint violated
 	 *
 	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 2.12, 2.13 and 2.14</p>
 	 */
	@Test
	public void RKo_T04b() {
		boolean ret = TestUtil.runJob(vendor, "../data/RKo.T04b.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RKo.T04c
	 *
	 * @Designation Constraints: EXISTENCE CONSTRAINT
 	 *
 	 * @Description The tests must check whether the data satisfies the ConstraintDef in the INTERLIS data model
 	 *
 	 * @Test-requirement RKo.T04c.xtf
 	 *
 	 * @Expected-result No error message
 	 *
 	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 2.12, 2.13 and 2.14</p>
 	 */
	@Test
	public void RKo_T04c() {
		boolean ret = TestUtil.runJob(vendor, "../data/RKo.T04c.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}

	/**
	 * @ID RKo.T05a
	 *
	 * @Designation Constraints: MANDATORY with comparison
 	 *
 	 * @Description The tests must check whether the data satisfies the ConstraintDef in the INTERLIS data model
 	 *
 	 * @Test-requirement RKo.T05a.xtf
 	 *
 	 * @Expected-result No error message
 	 *
 	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 2.12, 2.13 and 2.14</p>
 	 */
	@Test
	public void RKo_T05a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RKo.T05a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}

	/**
	 * @ID RKo.T05b
	 *
	 * @Designation Constraints: MANDATORY with comparison
 	 *
 	 * @Description The tests must check whether the data satisfies the ConstraintDef in the INTERLIS data model
 	 *
 	 * @Test-requirement RKo.T05b.xtf
 	 *
 	 * @Expected-result Error message. Constraint violated
 	 *
 	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 2.12, 2.13 and 2.14</p>
 	 */
	@Test
	public void RKo_T05b() {
		boolean ret = TestUtil.runJob(vendor, "../data/RKo.T05b.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RKo.T06a
	 *
	 * @Designation Constraints: MANDATORY with specification of conditions
 	 *
 	 * @Description The tests must check whether the data satisfies the ConstraintDef in the INTERLIS data model
 	 *
 	 * @Test-requirement RKo.T06a.xtf
 	 *
 	 * @Expected-result No error message
 	 *
 	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 2.12, 2.13 and 2.14</p>
 	 */
	@Test
	public void RKo_T06a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RKo.T06a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}

	/**
	 * @ID RKo.T06b
	 *
	 * @Designation Constraints: MANDATORY with specification of conditions
 	 *
 	 * @Description The tests must check whether the data satisfies the ConstraintDef in the INTERLIS data model
 	 *
 	 * @Test-requirement RKo.T06b.xtf
 	 *
 	 * @Expected-result No error message
 	 *
 	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 2.12, 2.13 and 2.14</p>
 	 */
	@Test
	public void RKo_T06b() {
		boolean ret = TestUtil.runJob(vendor, "../data/RKo.T06b.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}

	/**
	 * @ID RKo.T06c
	 *
	 * @Designation Constraints: MANDATORY with specification of conditions
 	 *
 	 * @Description The tests must check whether the data satisfies the ConstraintDef in the INTERLIS data model
 	 *
 	 * @Test-requirement RKo.T06c.xtf
 	 *
 	 * @Expected-result Error message. Datum is mandatory
 	 *
 	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 2.12, 2.13 and 2.14</p>
 	 */
	@Test
	public void RKo_T06c() {
		boolean ret = TestUtil.runJob(vendor, "../data/RKo.T06c.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RKo.T06d
	 *
	 * @Designation Constraints: MANDATORY with specification of conditions
 	 *
 	 * @Description The tests must check whether the data satisfies the ConstraintDef in the INTERLIS data model
 	 *
 	 * @Test-requirement RKo.T06d.xtf
 	 *
 	 * @Expected-result No error message
 	 *
 	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 2.12, 2.13 and 2.14</p>
 	 */
	@Test
	public void RKo_T06d() {
		boolean ret = TestUtil.runJob(vendor, "../data/RKo.T06d.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}

	/**
	 * @ID RKo.T06e
	 *
	 * @Designation Constraints: MANDATORY with specification of conditions
 	 *
 	 * @Description The tests must check whether the data satisfies the ConstraintDef in the INTERLIS data model
 	 *
 	 * @Test-requirement RKo.T06e.xtf
 	 *
 	 * @Expected-result No error message
 	 *
 	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 2.12, 2.13 and 2.14</p>
 	 */
	@Test
	public void RKo_T06e() {
		boolean ret = TestUtil.runJob(vendor, "../data/RKo.T06e.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}

	/**
	 * @ID RKo.T06f
	 *
	 * @Designation Constraints: MANDATORY with specification of conditions
 	 *
 	 * @Description The tests must check whether the data satisfies the ConstraintDef in the INTERLIS data model
 	 *
 	 * @Test-requirement RKo.T06f.xtf
 	 *
 	 * @Expected-result Error message. Constraint violated
 	 *
 	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 2.12, 2.13 and 2.14</p>
 	 */
	@Test
	public void RKo_T06f() {
		boolean ret = TestUtil.runJob(vendor, "../data/RKo.T06f.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RKo.T06g
	 *
	 * @Designation Constraints: MANDATORY with specification of conditions
 	 *
 	 * @Description The tests must check whether the data satisfies the ConstraintDef in the INTERLIS data model
 	 *
 	 * @Test-requirement RKo.T06g.xtf
 	 *
 	 * @Expected-result Error message. Constraint violated
 	 *
 	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 2.12, 2.13 and 2.14</p>
 	 */
	@Test
	public void RKo_T06g() {
		boolean ret = TestUtil.runJob(vendor, "../data/RKo.T06g.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RKo.T07a
	 *
	 * @Designation Constraints: MANDATORY with function (INTERLIS.len)
 	 *
 	 * @Description The tests must check whether the data satisfies the ConstraintDef in the INTERLIS data model
 	 *
 	 * @Test-requirement RKo.T07a.xtf
 	 *
 	 * @Expected-result No error message
 	 *
 	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 2.12, 2.13 and 2.14</p>
 	 */
	@Test
	public void RKo_T07a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RKo.T07a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}

	/**
	 * @ID RKo.T07b
	 *
	 * @Designation Constraints: MANDATORY with function (INTERLIS.len)
 	 *
 	 * @Description The tests must check whether the data satisfies the ConstraintDef in the INTERLIS data model
 	 *
 	 * @Test-requirement RKo.T07b.xtf
 	 *
 	 * @Expected-result Error message. Constraint violated
 	 *
 	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 2.12, 2.13 and 2.14</p>
 	 */
	@Test
	public void RKo_T07b() {
		boolean ret = TestUtil.runJob(vendor, "../data/RKo.T07b.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RKo.T09a
	 *
	 * @Designation Constraints in embedded relationships
 	 *
 	 * @Description The tests must check whether the data satisfies the ConstraintDef in the INTERLIS data model
 	 *
 	 * @Test-requirement RKo.T09a.xtf
 	 *
 	 * @Expected-result Error message. Constraint violated
 	 *
 	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 2.12, 2.13 and 2.14</p>
 	 */
	@Test
	public void RKo_T09a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RKo.T09a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RKo.T10a
	 *
	 * @Designation Constraints in non-embedded relationships
	 *
	 * @Description The tests must check whether the data satisfies the ConstraintDef in the INTERLIS data model
	 *
	 * @Test-requirement RKo.T10a.xtf
	 *
	 * @Expected-result Error message. Constraint violated
	 *
	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 2.12, 2.13 and 2.14</p>
	 */
	@Test
	public void RKo_T10a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RKo.T10a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}
	
	/**
	 * @ID RKo.T11a
	 *
	 * @Designation Constraints: CONSTRAINTS OF
 	 *
 	 * @Description The tests must check whether the data satisfies the ConstraintDef in the INTERLIS data model
 	 *
 	 * @Test-requirement RKo.T11a.xtf
 	 *
 	 * @Expected-result No error message
 	 *
 	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 2.12, 2.13 and 2.14</p>
 	 */
	@Test
	public void RKo_T11a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RKo.T11a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}
	
	/**
	 * @ID RKo.T11b
	 *
	 * @Designation Constraints: CONSTRAINTS OF
 	 *
 	 * @Description The tests must check whether the data satisfies the ConstraintDef in the INTERLIS data model
 	 *
 	 * @Test-requirement RKo.T11b.xtf
 	 *
 	 * @Expected-result Error message. Constraint violated
 	 *
 	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 2.12, 2.13 and 2.14</p>
 	 */
	@Test
	public void RKo_T11b() {
		boolean ret = TestUtil.runJob(vendor, "../data/RKo.T11b.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

}
