package hooks.db;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.DBUtils;

public class HooksDB {
    @Before
    public void beforeDBScenario() {
        DBUtils.createConnection();
    }

    @After
    public void afterDBScenario() {
        DBUtils.closeConnection();
    }
}
