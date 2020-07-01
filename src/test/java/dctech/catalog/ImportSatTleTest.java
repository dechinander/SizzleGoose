package dctech.catalog;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ImportSatTleTest {

    @Autowired
    ImportSatTle importSatTle;

    @Test
    public void testImportSatTleAvailable() {
        assertNotNull(importSatTle);
        assertNotNull(importSatTle.importSat());
        assertEquals(importSatTle.importSat().toString().contains("name"), true);
    }
}
