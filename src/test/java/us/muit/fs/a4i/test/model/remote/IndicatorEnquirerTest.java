/**
 * 
 */
package us.muit.fs.a4i.test.model.remote;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Date;
import java.util.logging.Logger;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.kohsuke.github.GHRepository;

import us.muit.fs.a4i.exceptions.ReportItemException;
import us.muit.fs.a4i.model.entities.ReportI;
import us.muit.fs.a4i.model.entities.ReportItem;
import us.muit.fs.a4i.model.entities.ReportItem.ReportItemBuilder;
import us.muit.fs.a4i.model.remote.IndicatorEnquirer;

/**
 * <p>
 * Test para probar el constructor de objetos de tipo ReportItem
 * </p>
 * 
 * @author Aitor Laiseca Valencia
 *
 */
class IndicatorEnquirerTest {
private static Logger log = Logger.getLogger(IndicatorEnquirerTest.class.getName());

/**
 * @throws java.lang.Exception Se incluye por defecto al crear automáticamente
 *                             los tests con eclipse
 */
@BeforeAll
static void setUpBeforeClass() throws Exception {
// Acciones a realizar antes de ejecutar los tests de esta clase

}

/**
 * @throws java.lang.Exception Se incluye por defecto al crear automáticamente
 *                             los tests con eclipse
 */
@AfterAll
static void tearDownAfterClass() throws Exception {
// Acciones a realizar después de ejecutar todos los tests de esta clase
}

/**
 * @throws java.lang.Exception Se incluye por defecto al crear automáticamente
 *                             los tests con eclipse
 */
@BeforeEach
void setUp() throws Exception {
// Acciones a realizar antes de cada uno de los tests de esta clase
}

/**
 * @throws java.lang.Exception Se incluye por defecto al crear automáticamente
 *                             los tests con eclipse
 */
@AfterEach
void tearDown() throws Exception {
// Acciones a realizar después de cada uno de los tests de esta clase
}

/**
 * Test para el constructor Test de ReportItemBuilder:
 * {@link us.muit.fs.a4i.model.entities.ReportItem.ReportItemBuilder#ReportItemBuilder(java.lang.String, java.lang.Object)}.
 * 
 * @see org.junit.jupiter.api.Test
 */
@Test
@Tag("unidad")
@DisplayName("Prueba constructor reportItem, las clases Context y Checker ya est�n disponibles")
void testBuildReport() {


IndicatorEnquirer enquirer = new IndicatorEnquirer();

ReportI report = enquirer.buildReport("MIT-FS/Audit4Improve-API");

assertEquals(3,report.getMetricByName("num_errores"), "Hay otro número de errores");
}

}