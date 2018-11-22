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
 * Data section: Structure and Reference attributes
*/
public class StructureReferenceAttributeTest {
	private final Logger logger = LoggerFactory.getLogger(StructureReferenceAttributeTest.class);

	static String vendor;

    @Rule
    public TestName testName = new TestName();

	@BeforeClass
	public static void init() {
		vendor = System.getProperty("vendor");
	}

	/**
 	 * @ID RStReA.T01a
 	 *
 	 * @Designation Structure and reference attributes: StructureValue
 	 *
 	 * @Description The tests must check whether the structure attribute satisfies the definition for StructureDef in the INTERLIS data model and the corresponding encoding rules for StructureValue
 	 *
 	 * @Test-requirement RStReA.T01a.xtf
 	 *
 	 * @Expected-result No error message
 	 *
 	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 2.6.4 and 3.3.11.9</p>
 	 */
	@Test
	public void RStReA_T01a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RStReA.T01a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}

	/**
	 * @ID RStReA.T01b
	 *
	 * @Designation Structure and reference attributes: StructureValue
 	 *
 	 * @Description The tests must check whether the structure attribute satisfies the definition for StructureDef in the INTERLIS data model and the corresponding encoding rules for StructureValue
 	 *
 	 * @Test-requirement RStReA.T01b.xtf
 	 *
 	 * @Expected-result Error message. Wrong encoding of the structure
 	 *
 	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 2.6.4 and 3.3.11.9</p>
 	 */
	@Test
	public void RStReA_T01b() {
		boolean ret = TestUtil.runJob(vendor, "../data/RStReA.T01b.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RStReA.T01c
	 *
	 * @Designation Structure and reference attributes: StructureValue
 	 *
 	 * @Description The tests must check whether the structure attribute satisfies the definition for StructureDef in the INTERLIS data model and the corresponding encoding rules for StructureValue
 	 *
 	 * @Test-requirement RStReA.T01c.xtf
 	 *
 	 * @Expected-result Error message. Attribute TestSuite2.Einheiten.KantonRef.KtNummer is required
 	 *
 	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 2.6.4 and 3.3.11.9</p>
 	 */
	@Test
	public void RStReA_T01c() {
		boolean ret = TestUtil.runJob(vendor, "../data/RStReA.T01c.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertFalse(ret);
	}

	/**
	 * @ID RStReA.T02a
	 *
	 * @Designation Structure and reference attributes: ReferenceAttribute
 	 *
 	 * @Description The tests must check whether the reference attribute satisfies the definition in the INTERLIS data model and the corresponding encoding rules
 	 *
 	 * @Test-requirement RStReA.T02a.xtf
 	 *
 	 * @Expected-result No error message
 	 *
 	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 2.6.3 and 3.3.11.14</p>
 	 */
	@Test
	public void RStReA_T02a() {
		boolean ret = TestUtil.runJob(vendor, "../data/RStReA.T02a.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}

	/**
	 * @ID RStReA.T02b
	 *
	 * @Designation Structure and reference attributes: ReferenceAttribute
 	 *
 	 * @Description The tests must check whether the reference attribute satisfies the definition in the INTERLIS data model and the corresponding encoding rules
 	 *
 	 * @Test-requirement RStReA.T02b.xtf
 	 *
 	 * @Expected-result No error message
 	 *
 	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 2.6.3 and 3.3.11.14</p>
 	 */
	@Test
	public void RStReA_T02b() {
		boolean ret = TestUtil.runJob(vendor, "../data/RStReA.T02b.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}

	/**
	 * @ID RStReA.T02c
	 *
	 * @Designation Structure and reference attributes: ReferenceAttribute
 	 *
 	 * @Description The tests must check whether the reference attribute satisfies the definition in the INTERLIS data model and the corresponding encoding rules
 	 *
 	 * @Test-requirement RStReA.T02c.xtf
 	 *
 	 * @Expected-result No error message
 	 *
 	 * @Reference <p><a href="https://www.interlis.ch/download/interlis2/ili2-refman_2006-04-13_e.pdf">INTERLIS Version 2 – Reference Manual</a> Chap. 2.6.3 and 3.3.11.14</p>
 	 */
	@Test
	public void RStReA_T02c() {
		boolean ret = TestUtil.runJob(vendor, "../data/RStReA.T02c.xtf");
		logger.info(vendor + " - " + testName.getMethodName() +": " + ret);
		assertTrue(ret);
	}
}
